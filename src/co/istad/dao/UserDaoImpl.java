package co.istad.dao;

import co.istad.connection.ConnectionDB;
import co.istad.model.Book;
import co.istad.model.User;

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
                    INSERT INTO users (username, email, password, confirm_password, created_at, role_id)
                    VALUES(?, ?, ?, ?, ?, ?)
                """;
        try(PreparedStatement statement = this.connection.prepareStatement(query)) {

            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getConfirmPassword());
            statement.setDate(5, new Date(System.currentTimeMillis()));
            statement.setLong(6, user.getRole().getId());
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
                    WHERE username = ? OR email = ? AND password = ?
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                user.setEmail(rs.getString("username"));
                System.out.println("Login successfully...!");
                return user;
            }
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
