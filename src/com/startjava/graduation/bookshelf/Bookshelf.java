package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int CAPACITY = 10;
    private Book[] books = new Book[CAPACITY];
    private int countBooks;
    private int length;

    public int getCapacity() {
        return CAPACITY;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getLength() {
        return length;
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getEmptyShelfsCount() {
        return CAPACITY - countBooks;
    }

    public void add(Book book) {
        books[countBooks++] = book;
        updateLength();
    }

    public Book find(String title) {
        int shelfNumber = findShelfNumber(title);
        if (shelfNumber != -1) {
            return books[shelfNumber];
        }
        return null;
    }

    public boolean delete(String title) {
        int shelfNumber = findShelfNumber(title);
        if (shelfNumber == -1) {
            return false;
        }
        System.arraycopy(books, shelfNumber + 1, books, shelfNumber, countBooks - shelfNumber - 1);
        books[--countBooks] = null;
        updateLength();
        return true;
    }

    public void clearBookshelf() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }

    private void updateLength() {
        length = 0;
        for (int i = 0; i < countBooks; i++) {
            length = Math.max(books[i].getInfoLength(), length);
        }
    }

    private int findShelfNumber(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }
}