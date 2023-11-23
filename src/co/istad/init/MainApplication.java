package co.istad.init;

import co.istad.controller.UserController;
import co.istad.model.User;
import co.istad.util.Singleton;
import co.istad.view.LoginView;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class MainApplication {
    private final Scanner scanner;
    private final UserController userController;
    public MainApplication(){
        scanner = Singleton.scanner();
        userController = Singleton.userController();
    }
    public void initialize(){
        do {
            System.out.println("1. Login");
            System.out.println("2. Sign up");
            System.out.print("Choose option: ");
            int op = Integer.parseInt(scanner.nextLine());
            switch (op){
                case 1 -> {
                    userController.login();
                }
                case 2 -> {
                    userController.signup();
                }
                default -> {
                    System.exit(0);
                }
            }
        }while (true);
    }


    public static void main(String[] args) {
       new MainApplication().initialize();
    }
}



