package org.example;

public class Book {

    private int BookId;
    private String BookName;
    private String BookAuthor;
    private int BookCost;
    private String BookCount;

    public int getBookId() {
        return BookId;
    }

    public String getBookCount() {
        return BookCount;
    }

    public void setBookCount(String bookCount) {
        BookCount = bookCount;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public int getBookCost() {
        return BookCost;
    }

    public void setBookCost(int bookCost) {
        BookCost = bookCost;
    }
}
