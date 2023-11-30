package co.istad.controller;

import co.istad.model.Author;
import co.istad.service.AuthorService;
import co.istad.util.Singleton;
import co.istad.view.AuthorView;

import java.util.Scanner;

public class AuthorController {
    private Scanner scanner;
    private AuthorService authorService;
    public AuthorController(){
        scanner = Singleton.scanner();
        authorService = Singleton.getAuthorService();
    }

    public void create(){
        Author author = new Author();
        AuthorView.create( author, scanner );
        System.out.println( author );
    }

}
