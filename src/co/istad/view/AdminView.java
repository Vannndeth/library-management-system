package co.istad.view;

import java.util.Scanner;

public class AdminView {

    public static void menu(int id, Scanner scanner){
            outer: while ( true ){
                try{
                    System.out.println("1. Management Admin");
                    System.out.println("2. Management Librarian");
                    System.out.println("3. Management User");
                    System.out.println("4. Logout");
                    System.out.print("\tEnter your option -> ");
                    id = Integer.parseInt( scanner.nextLine() );
                    break outer;
                }catch ( NumberFormatException e ){
                    System.err.println("Only number required!");
                }
            }
    }

}
