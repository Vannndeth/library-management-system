package co.istad.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static String username = "postgres";
    private static String password = "root101001";
    private static Connection connection;

    public static Connection getConnection(){
        if(connection == null){
            try {
                try {
                    Class.forName("org.postgresql.Driver");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dblibrarycstad", username, password);
                System.out.println("Successfully connected");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}

