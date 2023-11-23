package co.istad.dao;

import co.istad.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    public User create(User user);
    public User login(User user);
    public List<User> getALl();
    public User getById(Long id);
    public User update(Long id, User user);
    public List<User> deleteAll();
    public User deleteById(Long id);
}
