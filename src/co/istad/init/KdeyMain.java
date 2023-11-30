package co.istad.init;

import co.istad.controller.UserController;
import co.istad.storage.Storage;
import co.istad.util.Seeder;
import co.istad.util.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KdeyMain {
    private final Scanner scanner;
    private final UserController userController;
    private final Seeder seeder;
    private final Storage storage;

    public KdeyMain(){
        scanner = Singleton.scanner();
        userController = Singleton.userController();
        seeder = Singleton.getSeeder();
        seeder.roleSeeder();
        seeder.adminSeeder();
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
        List list = new ArrayList();

        new KdeyMain().initialize();
    }
}



