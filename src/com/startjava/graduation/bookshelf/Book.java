package com.startjava.graduation.bookshelf;

public class Book {
    private final int infoLength;
    private String author;
    private String title;
    private int yearPublishing;

    public Book(String author, String title, int yearPubliching) {
        this.author = author;
        this.title = title;
        this.yearPublishing = yearPubliching;
        infoLength = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getInfoLength() {
        return infoLength;
    }

    public String toString() {
        return author + ", " + title + ", " + yearPublishing;
    }
}