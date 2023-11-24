package co.istad.init;

import co.istad.controller.UserController;
import co.istad.model.User;
import co.istad.storage.Storage;
import co.istad.util.Seeder;
import co.istad.util.Singleton;
import co.istad.view.LoginView;
import co.istad.view.MenuView;
import com.sun.tools.javac.Main;

import java.awt.*;
import java.util.Scanner;

public class MainApplication {
    private final Scanner scanner;
    private final UserController userController;
    private final Seeder seeder;

    private final Storage storage;
    public MainApplication(){
        scanner = Singleton.scanner();
        userController = Singleton.userController();
        seeder = Singleton.getSeeder();
        seeder.roleSeeder();
        storage = Singleton.getStorage();
    }
    public void initialize(){
        do {
            System.out.println("1. Login");
            System.out.println("2. Sign up");
            System.out.print("Choose option: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1 -> {
                    User user = new User();
                    String selected = null;
                    LoginView.login(user, scanner);
                    MenuView.Menu( selected, scanner );
//                    switch ( selected ){
//                        case "n" -> {
//                            System.out.println("N)ext Page");
//                        }
//                        case "p" -> {
//                            System.out.println("N)ext Page");
//                        }
//                        case "f" -> {
//                            System.out.println("N)ext Page");
//                        }
//                        case "l" -> {
//                            System.out.println("N)ext Page");
//                        }
//                    }
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



