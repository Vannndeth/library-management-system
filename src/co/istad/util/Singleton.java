package co.istad.util;

import co.istad.controller.UserController;
import co.istad.dao.UserDaoImpl;
import co.istad.service.UserServiceImpl;
import co.istad.storage.Storage;

import java.util.Scanner;

public class Singleton {
    private static Scanner scanner;
    private static UserDaoImpl userDao;
    private static UserServiceImpl userService;
    private static UserController userController;
    private static Seeder seeder;
    private static Storage storage;

    public static Scanner scanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
    public static UserDaoImpl userDaoImpl(){
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
