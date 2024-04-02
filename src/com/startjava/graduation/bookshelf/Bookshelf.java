package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import static java.util.Arrays.copyOf;

public class Bookshelf {
    private static final int booksArrayLength = 10;
    private Book[] books = new Book[booksArrayLength];
    private int countBooks;
    private int length;

    public int getCountBooks() {
        return countBooks;
    }

    public int getLength() {
        return length;
    }

    public Book[] getAllBooks() {
        return copyOf(books, countBooks);
    }

    public int getEmptyShelfsCount() {
        return books.length - countBooks;
    }

    public void addBook(Book book) {
        books[countBooks++] = book;
        updateLength();
    }

    public Book findBook(String title) {
        int shelfNumber = findShelfNumber(title);
        if (shelfNumber != -1) {
            return books[shelfNumber];
        }
        return null;
    }

    public boolean deleteBook(String title) {
        int shelfNumber = findShelfNumber(title);
        if (shelfNumber == -1) {
            return false;
        }
        System.arraycopy(books, shelfNumber + 1 , books, shelfNumber, countBooks - shelfNumber - 1);
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