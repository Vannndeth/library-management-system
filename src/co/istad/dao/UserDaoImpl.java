package co.istad.dao;

import co.istad.connection.ConnectionDB;
import co.istad.model.Book;
import co.istad.model.User;
import co.istad.storage.Storage;
import co.istad.util.PasswordEncoder;
import co.istad.util.Singleton;

import java.sql.*;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private final Connection connection;
    public UserDaoImpl(){
        connection = ConnectionDB.getConnection();

    }
    @Override
    public User create(User user) {
        String query = """
                    INSERT INTO users (username, email, password, created_at, role_id, salt)
                    VALUES(?, ?, ?, ?, ?, ?)
                """;
        try(PreparedStatement statement = this.connection.prepareStatement(query)) {
            byte[] salt = PasswordEncoder.generateSalt();
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setDate(4, new Date(System.currentTimeMillis()));
            statement.setLong(5, user.getRole().getId());
            statement.setBytes(6, salt);
            int affectedRow = statement.executeUpdate();
            System.out.println("Signup successfully...!");
            System.out.println(affectedRow);
        } catch (SQLException e) {
            System.out.println("Username already exist. " + e.getMessage());
        }
        return user;
    }

    @Override
    public User login(User user) {
        String query = """
                    SELECT * FROM users
                    WHERE (username = ? OR email = ?) AND password = ?
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword() );
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                user.setEmail(rs.getString("username"));
                user.setId(rs.getLong("id"));
                System.out.println("Login successfully...!");
                return user;
            }
            System.out.println("Something wrong!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<User> getALl() {

        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public Book getByTitle(String title) {
        Book book = null;
        String query = """
                    SELECT * FROM books
                    WHERE title = ?
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, title);
            book = new Book();
            if(book.getTitle().equals(title)){
                ResultSet rs = statement.executeQuery();
                System.out.println("Search successfully...!");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return book;
    }

    @Override
    public User update(Long id, User user) {
        return null;
    }

    @Override
    public List<User> deleteAll() {
        return null;
    }

    @Override
    public User deleteById(Long id) {
        return null;
    }
}
