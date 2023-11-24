package co.istad.init;

import co.istad.controller.UserController;
import co.istad.model.User;
import co.istad.util.Seeder;
import co.istad.util.Singleton;
import co.istad.view.LoginView;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class MainApplication {
    private final Scanner scanner;
    private final UserController userController;
    private final Seeder seeder;
    public MainApplication(){
        scanner = Singleton.scanner();
        userController = Singleton.userController();
        seeder = Singleton.getSeeder();
        seeder.roleSeeder();
    }
    public void initialize(){
        do {
            System.out.println("1. Login");
            System.out.println("2. Sign up");
            System.out.print("Choose option: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1 -> {
                    userController.login();
                    System.out.println("1. Search by id");
                    System.out.println("2. Search by title");
                    System.out.println("3. Search by author");
                    System.out.println("4. Search by category");
                    System.out.print("Choose option: ");
                    int search = Integer.parseInt(scanner.nextLine());
                    switch (search){
                        case 1 -> {
                            System.out.println("id");
                        }case 2 -> {
                            System.out.println("title");
                        }case 3 -> {
                            System.out.println("author");
                        }case 4 -> {
                            System.out.println("category");
                        }
                    }
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



