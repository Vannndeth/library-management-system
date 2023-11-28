package co.istad.view;

import co.istad.model.Author;

import java.util.Scanner;

public class AuthorView {
    public static void create(Author author, Scanner scanner){
        System.out.print("Enter the author firstname : ");
        author.setFirstName( scanner.nextLine() );
        System.out.print("Enter the author lastname : ");
        author.setLastName( scanner.nextLine() );
        System.out.print("Enter the author email : ");
        author.setEmail( scanner.nextLine() );
    }
}
