package co.istad.model;

import java.time.LocalDate;
import java.util.Objects;

public class BookDetail {
    private Long id;
    private LocalDate createdDate;
    private Book bookId;
    private Category categoryId;

    public BookDetail() {
    }

    public BookDetail(Long id, LocalDate createdDate, Book bookId, Category categoryId) {
        this.id = id;
        this.createdDate = createdDate;
        this.bookId = bookId;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookDetail that)) return false;
        return getId().equals(that.getId()) && getCreatedDate().equals(that.getCreatedDate()) && getBookId().equals(that.getBookId()) && getCategoryId().equals(that.getCategoryId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreatedDate(), getBookId(), getCategoryId());
    }

    @Override
    public String toString() {
        return "BookDetail{" +
                "id=" + id +
                ", createdDate=" + createdDate +
                ", bookId=" + bookId +
                ", categoryId=" + categoryId +
                '}';
    }
}
