package co.istad.util;

import co.istad.controller.UserController;
import co.istad.dao.AuthorDao;
import co.istad.dao.AuthorDaoImpl;
import co.istad.dao.UserDaoImpl;
import co.istad.service.AuthorService;
import co.istad.service.AuthorServiceImpl;
import co.istad.service.UserServiceImpl;
import co.istad.storage.Storage;

import java.util.Scanner;

public class Singleton {
    private static Scanner scanner;
    private static UserDaoImpl userDao;
    private static UserServiceImpl userService;
    private static UserController userController;
    private static AuthorDaoImpl authorDao;
    private static AuthorServiceImpl authorService;
    private static Seeder seeder;
    private static Storage storage;

    public static Scanner scanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
    public static UserDaoImpl   userDaoImpl(){
        if(userDao == null){
            userDao = new UserDaoImpl();
        }
        return userDao;
    }
    public static UserServiceImpl userServiceImpl(){
        if(userService == null){
            userService = new UserServiceImpl();
        }
        return userService;
    }
    public static UserController userController(){
        if(userController == null){
            userController = new UserController();
        }
        return userController;
    }

    public static AuthorDaoImpl getAuthorDao(){
        if (authorDao == null){
            authorDao = new AuthorDaoImpl();
        }
        return authorDao;
    }
    public static AuthorServiceImpl getAuthorService(){
        if (authorService == null){
            authorService = new AuthorServiceImpl();
        }
        return authorService;
    }

    public static Seeder getSeeder(){
        if(seeder == null){
            seeder = new Seeder();
        }
        return seeder;
    }

    public static Storage getStorage(){
        if( storage == null ) storage = new Storage();
        return storage;
    }


}
