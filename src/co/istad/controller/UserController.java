package co.istad.controller;

import co.istad.model.Role;
import co.istad.model.User;
import co.istad.service.UserService;
import co.istad.storage.Storage;
import co.istad.util.Helper;
import co.istad.util.RoleName;
import co.istad.util.Singleton;
import co.istad.view.AdminView;
import co.istad.view.BookView;
import co.istad.view.HelperView;
import co.istad.view.UserView;

import java.util.Scanner;

public class UserController {
    private final Scanner scanner;
    private Storage storage;
    public UserController(){
        scanner = Singleton.scanner();
        userService = Singleton.userServiceImpl();
        storage = Singleton.getStorage();
    }
    private final UserService userService;
    public void signup(){
        User user = new User();
        user.setRole(new Role());
        user.getRole().setId(3L);
        UserView.signup(user, scanner);
        user = userService.create(user);
        System.out.println(user);
    }
    public void login(){
        User user = new User();
        UserView.login(user, scanner);
        while (true) {
            if( storage.getId() == null ){
                userService.login(user);
            }else
                switch (RoleName.valueOf(storage.getRole().getRoleName().name())) {
                    case ADMIN -> {
                        HelperView.welcome("Welcome to admin dashboard");
                        int opt = 0;
                        admin_inner:
                        while (true) {
                            AdminView.menu(opt, scanner);
                            System.out.println("Opion : " + opt );
                            switch (opt) {
                                case 1:
                                    System.out.println("mana admin");
                                    break;
                                case 2 :
                                    System.out.println("mana librarian");
                                    break;
                                case 3 :
                                    System.out.println("mana user");
                                    break;
                                case 4 :
                                    storage = null;
                                    break admin_inner;
                                default :
                                    System.err.println("please select one of menu list");
                            }
                        }
                    }
                    case USER -> {
                        HelperView.welcome("Welcome to user dashboard");
                    }
                    case LIBRARIAN -> {
                        HelperView.welcome("Welcome to librarian dashboard");
                    }
                }
        }
    }
    public void getByTitle(){
        String title;
        title = BookView.searchByTitle(scanner);
        userService.getByTitle(title);
    }
    public void getAllUser(){

    }
}
