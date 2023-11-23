package co.istad.view;

import co.istad.model.User;

import java.time.LocalDate;
import java.util.Scanner;

public class SignupView {
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
}
