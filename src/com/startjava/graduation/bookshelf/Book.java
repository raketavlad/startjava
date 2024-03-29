package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String bookName;
    private int yearPubliching;
    private int bookInformationLength;

    public Book(String author, String bookName, int yearPubliching) {
        this.author = author;
        this.bookName = bookName;
        this.yearPubliching = yearPubliching;
    }

    public String toString() {
        return author + ", " + bookName + ", " + yearPubliching;
    }

    public int getBookInfoLength() {
        bookInformationLength = toString().length();
        return bookInformationLength;
    }
}
