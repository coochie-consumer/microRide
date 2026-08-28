import database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Driver {

    private int driverId;
    private String name;
    private boolean active;
    private String sex;
    private Car car;
    private double rating;

    public Driver(
            String name,
            boolean active,
            String sex,
            Car car,
            double rating
    ) {
        this.name = name;
        this.active = active;
        this.sex = sex;
        this.car = car;
        this.rating = rating;
    }

    void becomeActive() {
        System.out.println("Driver is now active");
        active = true;
    }

    void becomeInactive() {
        System.out.println("Driver is now inactive");
        active = false;
    }

    boolean isActive() {
        return active;
    }

    void vehicleInfo() {
        car.carInfo();
    }

    void driverInfo() {
        System.out.println(name);
        System.out.println(driverId);
        vehicleInfo();
    }

    public void createNewDriver() {

        String sql = """
                INSERT INTO driver (fullname, active, sex, car, rating)
                VALUES (?, ?, ?, ?, ?)
                RETURNING driver_id
                """;

        try (
                Connection connection =
                        DatabaseConnection.getConnection();

                PreparedStatement statement =
                        connection.prepareStatement(sql)
        ) {
            statement.setString(1, this.name);
            statement.setBoolean(2, this.active);
            statement.setString(3, this.sex);
            statement.setString(4, this.car.carInfo());
            statement.setDouble(5, this.rating);

            try (ResultSet result = statement.executeQuery()) {
                if (result.next()) {
                    this.driverId =
                            result.getInt("driver_id");
                }
            }

            System.out.println(
                    "Driver inserted with ID: " + driverId
            );

        } catch (SQLException e) {
            System.out.println("Could not insert driver:");
            System.out.println(e.getMessage());
        }
    }
}