package co.istad.dao;

import co.istad.connection.ConnectionDB;
import co.istad.model.Book;
import co.istad.model.Role;
import co.istad.model.User;
import co.istad.util.PasswordEncoder;
import co.istad.util.RoleName;
import co.istad.view.HelperView;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
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
    public Optional<Book> searchBookById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> searchBookByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> searchBookByAuthor(String author) {
        return Optional.empty();
    }

    @Override
    public List<Book> searchBookByCategory(String category) {
        return null;
    }

    @Override
    public List<Book> getAllBook() {
        return null;
    }

    @Override
    public Optional<User> searchUserById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> searchUserByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public User login(User user) {
        String query = """
                    SELECT u.*, r.name as role_name FROM users u
                        INNER JOIN roles r
                        ON r.id = u.role_id
                        WHERE (username = ? OR email = ?) AND password = ?
                """;
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword() );
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                Role role = new Role();
                user.setEmail(rs.getString("username"));
                user.setId(rs.getLong("id"));
                role.setRoleName( RoleName.valueOf( rs.getString("role_name") ) );
                role.setId( rs.getLong("role_id") );
                user.setRole( role );
                HelperView.message("Login successfully...!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
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
    public User deleteById(Long id){
        return null;
    }


}
