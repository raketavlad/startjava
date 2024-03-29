package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int bookCount = 0;
    private String[] books = new String[10];
    private Book book;

    public void addBook(String author, String bookName, int yearPubliching) {
        book = new Book(author, bookName, yearPubliching);
        String book1 = book.toString();
        books[bookCount] = book1;
        bookCount++;
    }

    public String findBook(String bookName) {
        Integer shelfNumber = findShelfNumber(bookName);
        if (shelfNumber == null) {
            return "Такой книги нет в шкафу!";
        }
        return books[shelfNumber] + " лежит на " + shelfNumber + " полке!";
    }

    public String deleteBook(String bookName) {
        Integer shelfNumber = findShelfNumber(bookName);
        if (shelfNumber == null) {
            return "Такой книги нет в шкафу!";
        }
        System.arraycopy(books, shelfNumber + 1 , books, shelfNumber, bookCount - shelfNumber - 1);
        books[--bookCount] = null;
        return "Книга удалена!";
    }

    public void clearBookshelf() {
        Arrays.fill(books, 0, bookCount, null);
        bookCount = 0;
    }

    public String[] getAllBooks() {
        String[] bookshelf = new String[bookCount];
        for (int i = 0; i < bookCount; i++) {
            bookshelf[i] = books[i];
        }
        return bookshelf;
    }

    public int getBooksCount() {
        return bookCount;
    }

    public int getEmptyShelfsCount() {
        return books.length - bookCount;
    }

    public int largestLength() {
        int largestLength = 0;
        if (bookCount > 0) {
            int bookInfoLength = book.getBookInfoLength();
            for (int i = 0; i < bookCount; i++) {
                if (bookInfoLength > largestLength) {
                    largestLength = bookInfoLength;
                }
            }
        }
        return largestLength;
    }

    private Integer findShelfNumber(String bookName) {
        for (int i = 0; i < bookCount; i++) {
            String[] onlyWords = books[i].split(", ");
            if (onlyWords[1].equals(bookName)) {
                return i;
            }
        }
        return null;
    }
}
