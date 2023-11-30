package co.istad.dao;

import co.istad.model.Book;
import co.istad.model.Borrow;
import co.istad.model.Return;
import co.istad.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao extends UserFeatureDao{

    public User login(User user);
    public List<User> getALl();
    public User getById(Long id);
    public Book getByTitle(String title);
    public User update(Long id, User user);
    public List<User> deleteAll();
    public User deleteById(Long id);
}
