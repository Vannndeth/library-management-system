package co.istad.dao;

import co.istad.model.Author;
import co.istad.model.Category;

import java.util.List;

public interface CategoryDao {
    public Author create(Category category);
    public List<Category> selectAll();
    public Author selectById(Long id);
    public Author selectByName(String name);
    public Author updateById(Long id, Author author);
    public Author deleteById(Long id);
}
