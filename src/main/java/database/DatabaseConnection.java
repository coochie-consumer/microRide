package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//this is to connect the database to the jva program

public class DatabaseConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/microride";

    private static final String USER = "postgres";

    private static final String PASSWORD =
            "MAMAmoose@#123";

    private DatabaseConnection() {
    }

    public static Connection getConnection()
            throws SQLException {

        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }

}