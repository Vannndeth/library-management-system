package co.istad.service;

import co.istad.exception.InputInvalidException;
import co.istad.model.Author;
import co.istad.util.Singleton;

import java.util.List;

public class AuthorServiceImpl implements AuthorService{
    private final AuthorService authorService;
    public AuthorServiceImpl(){
        authorService = Singleton.getAuthorService();
    }
    @Override
    public Author create(Author author) {
        try {
            if( author.getFirstName().isEmpty() ){
                throw new InputInvalidException("The firstname field's required!q");
            }
        }catch (InputInvalidException e){
            System.out.println(e.getMessage());
        }
        return authorService.create(author);
    }

    @Override
    public List<Author> selectAll() {
        return null;
    }

    @Override
    public Author selectById(Long id) {
        return null;
    }

    @Override
    public Author updateById(Long id, Author author) {
        return null;
    }

    @Override
    public Author deleteById(Long id) {
        return null;
    }
}
