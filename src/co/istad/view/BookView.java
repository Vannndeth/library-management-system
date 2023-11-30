package co.istad.view;

import java.util.Scanner;

public class BookView {
    public static String searchByTitle(Scanner scanner){
        String title;
        System.out.print("Enter title to search: ");
        title = scanner.nextLine();
        return title;
    }
}
