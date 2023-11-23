package co.istad.model;

import java.time.LocalDate;
import java.util.Objects;

public class Borrow {
    private Long id;
    private Integer quantity;
    private LocalDate borrowDate;
    private LocalDate deadline;
    private boolean status;
    private User userId;
    private Book bookId;

    public Borrow() {
    }

    public Borrow(Long id, Integer quantity, LocalDate borrowDate, LocalDate deadline, boolean status, User userId, Book bookId) {
        this.id = id;
        this.quantity = quantity;
        this.borrowDate = borrowDate;
        this.deadline = deadline;
        this.status = status;
        this.userId = userId;
        this.bookId = bookId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Borrow borrow)) return false;
        return isStatus() == borrow.isStatus() && getId().equals(borrow.getId()) && getQuantity().equals(borrow.getQuantity()) && getBorrowDate().equals(borrow.getBorrowDate()) && getDeadline().equals(borrow.getDeadline()) && getUserId().equals(borrow.getUserId()) && getBookId().equals(borrow.getBookId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getQuantity(), getBorrowDate(), getDeadline(), isStatus(), getUserId(), getBookId());
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", borrowDate=" + borrowDate +
                ", deadline=" + deadline +
                ", status=" + status +
                ", userId=" + userId +
                ", bookId=" + bookId +
                '}';
    }
}
