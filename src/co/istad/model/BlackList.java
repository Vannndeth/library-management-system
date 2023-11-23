package co.istad.model;

import java.time.LocalDate;
import java.util.Objects;

public class BlackList {
    private Long id;
    private Integer quantity;
    private String message;
    private boolean status;
    private LocalDate date;
    private User userId;
    private Book bookId;

    public BlackList() {
    }

    public BlackList(Long id, Integer quantity, String message, boolean status, LocalDate date, User userId, Book bookId) {
        this.id = id;
        this.quantity = quantity;
        this.message = message;
        this.status = status;
        this.date = date;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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
        if (!(o instanceof BlackList blackList)) return false;
        return isStatus() == blackList.isStatus() && getId().equals(blackList.getId()) && getQuantity().equals(blackList.getQuantity()) && getMessage().equals(blackList.getMessage()) && getDate().equals(blackList.getDate()) && getUserId().equals(blackList.getUserId()) && getBookId().equals(blackList.getBookId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getQuantity(), getMessage(), isStatus(), getDate(), getUserId(), getBookId());
    }

    @Override
    public String toString() {
        return "BlackList{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", message='" + message + '\'' +
                ", status=" + status +
                ", date=" + date +
                ", userId=" + userId +
                ", bookId=" + bookId +
                '}';
    }
}
