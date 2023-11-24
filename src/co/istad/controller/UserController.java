package co.istad.controller;

import co.istad.model.Role;
import co.istad.model.User;
import co.istad.service.UserService;
import co.istad.util.Singleton;
import co.istad.view.LoginView;
import co.istad.view.SearchBook;
import co.istad.view.SignupView;

import java.util.Scanner;

public class UserController {
    private final Scanner scanner;
    public UserController(){
        scanner = Singleton.scanner();
        userService = Singleton.userServiceImpl();
    }
    private final UserService userService;
    public void signup(){
        User user = new User();
        user.setRole(new Role());
        user.getRole().setId(3L);
        SignupView.signup(user, scanner);
        user = userService.create(user);
        System.out.println(user);
    }
    public void login(){
        User user = new User();
        LoginView.login(user, scanner);
        userService.login(user);
    }
    public void getByTitle(){
        String title;
        title = SearchBook.searchByTitle(scanner);
        userService.getByTitle(title);
    }
    public void getAllUser(){

    }
}
