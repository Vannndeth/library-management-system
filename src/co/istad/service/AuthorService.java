package co.istad.service;

import co.istad.model.Author;

import java.util.List;

public interface AuthorService {
    public Author create(Author author);
    public List<Author> selectAll();
    public Author selectById(Long id);
    public Author updateById(Long id, Author author);
    public Author deleteById(Long id);
}
