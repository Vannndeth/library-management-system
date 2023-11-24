package co.istad.util;

import co.istad.connection.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Seeder {
    private final Connection connection;
    public Seeder(){
        connection = ConnectionDB.getConnection();
    }
    public void roleSeeder(){
        String query = """
                    INSERT INTO roles (id, name) 
                    VALUES (1, 'ADMIN'), 
                    (2, 'LIBRARIAN'), 
                    (3, 'USER')
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.executeUpdate();
        } catch (SQLException e) {}
    }

}
