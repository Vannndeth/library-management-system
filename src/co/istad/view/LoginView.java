package co.istad.view;

import co.istad.model.User;
import co.istad.util.Singleton;

import java.util.Scanner;

public class LoginView {
    public static void login(User user, Scanner scanner){
        System.out.print("Please enter username: ");
        user.setUsername(scanner.nextLine());
        System.out.print("Please enter password: ");
        user.setPassword(scanner.nextLine());
    }
}
