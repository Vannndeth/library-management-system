package co.istad.dao;

import co.istad.model.Book;
import co.istad.model.User;

import java.util.List;
import java.util.Optional;

public interface UserFeatureDao {
    public User create(User user);
    public Optional<Book> searchBookById (Long id);
    public Optional<Book> searchBookByTitle (String title);
    public Optional<Book> searchBookByAuthor (String author);
    public List<Book> searchBookByCategory (String category);
    public List<Book> getAllBook();
    public Optional<User> searchUserById(Long id);
    public Optional<User> searchUserByUsername(String username);


}
