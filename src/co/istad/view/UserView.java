package co.istad.view;

import co.istad.model.User;

import java.util.Scanner;

public class UserView {
    public static void login(User user, Scanner scanner){
        System.out.print("Please enter username: ");
        user.setUsername(scanner.nextLine());
        System.out.print("Please enter password: ");
        user.setPassword(scanner.nextLine());
    }
    public static void signup(User user, Scanner scanner){
        System.out.print("Enter username: ");
        user.setUsername(scanner.nextLine());
        System.out.print("Enter email: ");
        user.setEmail(scanner.nextLine());
        System.out.print("Enter password: ");
        user.setPassword(scanner.nextLine());
        System.out.print("Enter confirm password: ");
        user.setConfirmPassword(scanner.nextLine());
    }
    public static void userView () {
        try{
            System.out.println("1. Search Book");
            System.out.println("2. Borrow");
            System.out.println("3. Return");
            System.out.println("4. View");
            System.out.println("5. Preview");
            System.out.println("6. Book Information");
            System.out.println("7. History");
            System.out.println("8. Logout");

        }catch ( NumberFormatException e ){
            System.err.println("Only number required!");
        }
    }
}
