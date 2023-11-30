package co.istad.model;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private Long id;
    private String title;
    private Integer quantity;
    private String description;
    private LocalDate createdDate;
    private Author authorId;
    private User userId;

    public Book() {
    }

    public Book(Long id, String title, Integer quantity, String description, LocalDate createdDate, Author authorId, User userId) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
        this.description = description;
        this.createdDate = createdDate;
        this.authorId = authorId;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Author getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Author authorId) {
        this.authorId = authorId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getId().equals(book.getId()) && getTitle().equals(book.getTitle()) && getQuantity().equals(book.getQuantity()) && getDescription().equals(book.getDescription()) && getCreatedDate().equals(book.getCreatedDate()) && getAuthorId().equals(book.getAuthorId()) && getUserId().equals(book.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getQuantity(), getDescription(), getCreatedDate(), getAuthorId(), getUserId());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", authorId=" + authorId +
                ", userId=" + userId +
                '}';
    }
}
