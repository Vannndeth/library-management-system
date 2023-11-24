package co.istad.view;

import java.util.Scanner;

public class MenuView {

    public static void Menu(String selected, Scanner scanner){
        System.out.println("N)ext Page");
        System.out.println("P)revious Page");
        System.out.println("F)irst Page");
        System.out.println("L)ast Page");
        System.out.println("S)earch");
        System.out.print("Choose option: ");
        selected = scanner.nextLine().toLowerCase();
    }

}
