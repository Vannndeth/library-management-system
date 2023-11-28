package co.istad.service;

import co.istad.dao.UserDao;
import co.istad.model.Book;
import co.istad.model.User;
import co.istad.storage.Storage;
import co.istad.util.Singleton;

import java.util.List;

public class UserServiceImpl implements UserService{
    private final UserDao userDao;
    private final Storage storage;
    public UserServiceImpl(){
        userDao = Singleton.userDaoImpl();
        storage = Singleton.getStorage();
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
        User res = userDao.login(user);
        if( res.getId() != null ){
            storage.setId( res.getId() );
            storage.setUsername( res.getUsername() );
            storage.setRole( res.getRole() );
        }
        return res;
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
    public Book getByTitle(String title) {
        return userDao.getByTitle(title);
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
