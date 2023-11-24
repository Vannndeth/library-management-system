package co.istad.dao;

import co.istad.connection.ConnectionDB;
import co.istad.model.Author;
import co.istad.util.Singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AuthorDaoImpl implements AuthorDao{
    private final Connection connection;
    public AuthorDaoImpl(){
        connection = ConnectionDB.getConnection();
    }
    @Override
    public Author create(Author author) {
        String query = """
                INSERT INTO authors (firstname, lastname, email)
                VALUES (?, ?, ?)
                """;
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, author.getFirstName());
            statement.setString(2, author.getLastName());
            statement.setString(3, author.getEmail());
            statement.executeUpdate();
            System.out.println("Signup successfully...!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  author;
    }

    @Override
    public List<Author> selectAll() {
        return null;
    }

    @Override
    public Author selectById(Long id) {
        return null;
    }

    @Override
    public Author updateById(Long id, Author author) {
        return null;
    }

    @Override
    public Author deleteById(Long id) {
        return null;
    }
}
