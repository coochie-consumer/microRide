import database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Driver {

    static int nextid = 1000;


    private int driverId;
    private String name;
    private boolean active;
    private String sex;
    private Car car;
    private double rating;

    Driver(String name,boolean active,String sex,Car car,double rating){
//        this.driverId = nextid++;


        this.name = name;
        this.active = active;
        this.sex = sex;
        this.car = car;
        this.rating = rating;
    }
//nested car class


     void becomeActive(){
         System.out.println("Driver is now active");
        active = true;
     }

    void becomeInactive(){
        System.out.println("Driver is now inactive");
        active = false;
    }

     boolean isActive(){
        return active;
     }

     void vehicleInfo(){
         car.carInfo();
     };

     void driverInfo(){
         System.out.println(name);
         System.out.println(driverId);
         vehicleInfo();
     }

     public void CreateNewDriver() throws SQLException {
         String sql = """
                 INSERT INTO driver(fullname,active,sex,car,rating)
                 values(?, ?, ?, ?, ?)
                 RETURNING driverid;
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
             statement.setString(4, this.car.toString());
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





//the driver class currently contains the method needed for
//creating a new driver...these fields will be sent into the postgresql db