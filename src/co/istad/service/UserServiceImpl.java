package co.istad.service;

import co.istad.dao.UserDao;
import co.istad.model.User;
import co.istad.util.Singleton;

import java.util.List;

public class UserServiceImpl implements UserService{
    private final UserDao userDao;
    public UserServiceImpl(){
        userDao = Singleton.userDaoImpl();
    }
    @Override
    public User create(User user) {
        if(!user.getConfirmPassword().equals(user.getPassword())){
            System.out.println("Password not matching...!");
        } else {
            return userDao.create(user);
        }
        return user;
    }

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public List<User> getALl() {
        return userDao.getALl();
    }

    @Override
    public User getById(Long id) {
        return null;
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
