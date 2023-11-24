package co.istad.service;

import co.istad.model.Book;
import co.istad.model.User;

import java.util.List;

public interface UserService {
    public User create(User user);
    public User login(User user);
    public List<User> getALl();
    public User getById(Long id);
    public Book getByTitle(String title);
    public User update(Long id, User user);
    public List<User> deleteAll();
    public User deleteById(Long id);
}
