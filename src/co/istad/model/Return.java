package co.istad.model;

import java.time.LocalDate;
import java.util.Objects;

public class Return {
    private Long id;
    private String message;
    private LocalDate returnDate;
    private Borrow borrowId;

    public Return() {
    }

    public Return(Long id, String message, LocalDate returnDate, Borrow borrowId) {
        this.id = id;
        this.message = message;
        this.returnDate = returnDate;
        this.borrowId = borrowId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Borrow getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Borrow borrowId) {
        this.borrowId = borrowId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Return aReturn)) return false;
        return getId().equals(aReturn.getId()) && getMessage().equals(aReturn.getMessage()) && getReturnDate().equals(aReturn.getReturnDate()) && getBorrowId().equals(aReturn.getBorrowId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMessage(), getReturnDate(), getBorrowId());
    }

    @Override
    public String toString() {
        return "Return{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", returnDate=" + returnDate +
                ", borrowId=" + borrowId +
                '}';
    }
}
