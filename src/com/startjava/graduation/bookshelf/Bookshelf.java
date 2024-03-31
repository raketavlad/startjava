package com.startjava.graduation.bookshelf;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Bookshelf {
    private static final Book[] books = new Book[10];
    private int countBooks;
    private int largestLength;

    public int getCountBooks() {
        return countBooks;
    }

    public int getLargestLength() {
        return largestLength;
    }

    public Book[] getAllBooks() {
        Book[] booksInShelf = copyOf(books, countBooks);
        return booksInShelf;
    }

    public int getEmptyShelfsCount() {
        return books.length - countBooks;
    }

    public void addBook(Book book) {
        books[countBooks] = book;
        countBooks++;
        largestLength();
    }

    public Book findBook(String title) {
        Integer shelfNumber = findShelfNumber(title);
        if (shelfNumber != null) {
            return books[shelfNumber];
        }
        return null;
    }

    public String deleteBook(String title) {
        Integer shelfNumber = findShelfNumber(title);
        if (shelfNumber == null) {
            return "Такой книги нет в шкафу!";
        }
        System.arraycopy(books, shelfNumber + 1 , books, shelfNumber, countBooks - shelfNumber - 1);
        books[--countBooks] = null;
        largestLength();
        return "Книга удалена!";
    }

    public void clearBookshelf() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }

    private void largestLength() {
        largestLength = 0;
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getInfoLength() > largestLength) {
                largestLength = books[i].getInfoLength();
            }
        }
    }

    private Integer findShelfNumber(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return null;
    }
}
