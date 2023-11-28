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

    public void adminSeeder(){
        try{
            String query = """
                    INSERT INTO users (id,
                                       username,
                                       email,
                                       password,
                                       role_id,
                                       salt
                                        ) 
                    VALUES (1, 'admin', 'admin@gmail.com', 'admin', 1, ? )  
                """;
            PreparedStatement statement = connection.prepareStatement( query );
            statement.setBytes(1, PasswordEncoder.generateSalt());
            statement.executeUpdate();
        }catch (SQLException e){
        }
    }

}
