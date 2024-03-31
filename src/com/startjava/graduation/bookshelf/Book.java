package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int yearPublishing;
    private int infoLength;

    public Book(String author, String title, int yearPubliching) {
        this.author = author;
        this.title = title;
        this.yearPublishing = yearPubliching;
    }

    public String getTitle() {
        return title;
    }

    public int getInfoLength() {
        return toString().length();
    }

    public String toString() {
        return author + ", " + title + ", " + yearPublishing;
    }
}
