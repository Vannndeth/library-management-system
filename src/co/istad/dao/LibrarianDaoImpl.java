package co.istad.dao;

import co.istad.model.Author;
import co.istad.model.Book;
import co.istad.model.Category;
import co.istad.model.User;

import java.util.List;
import java.util.Optional;

public class LibrarianDaoImpl implements LibrarianDao{
    @Override
    public Category createCategory(Category category) {
        return null;
    }

    @Override
    public Category updateCategoryById(Long id, Category category) {
        return null;
    }

    @Override
    public Book createBook(Book book) {
        return null;
    }

    @Override
    public Book updateBookById(Long id, Book book) {
        return null;
    }

    @Override
    public Boolean confirmBorrow(User user, Book book) {
        return null;
    }

    @Override
    public Boolean returnBook(User user, Book book) {
        return null;
    }

    @Override
    public List<Book> bookReport() {
        return null;
    }

    @Override
    public List<User> userReport() {
        return null;
    }

    @Override
    public Author createAuthor(Author author) {
        return null;
    }

    @Override
    public List<Author> getAll() {
        return null;
    }

    @Override
    public Author searchAuthorById(Long id) {
        return null;
    }

    @Override
    public Author updateAuthorById(Long id, Author author) {
        return null;
    }

    @Override
    public Author deleteById(Long id) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
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
}
