package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        String action = "";
        Scanner sc = new Scanner(System.in);
        while (!action.equals("5")) {
            printBookshelf(bookshelf);
            printMenu();
            System.out.print("Введите номер действия: ");
            action = sc.nextLine();
            switch (action) {
                case "1":
                    addBook(bookshelf, sc);
                    break;
                case "2":
                    findBook(bookshelf, sc);
                    break;
                case "3":
                    deleteBook(bookshelf, sc);
                    break;
                case "4":
                    bookshelf.clearBookshelf();
                    break;
            }
            System.out.print("Для продолжения нажмите Enter");
            sc.nextLine();
        }
    }

    private static void printMenu() {
        System.out.println("""
                \n1. Добавить книгу.
                2. Найти книгу.
                3. Удалить книгу.
                4. Убрать все книги из шкафа.
                5. Завершить работу с программой.            
                """);
    }

    private static void printBookshelf(Bookshelf bookshelf) {
        int count = bookshelf.getCountBooks();
        int length = bookshelf.getLength();
        if (count == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("\nВ шкафу книг - " + count + ", свободно полок - " +
                    bookshelf.getEmptyShelfsCount() + "\n");
            for (int i = 0; i < count; i++) {
                Book book = bookshelf.getAllBooks()[i];
                System.out.print("|" + bookshelf.getAllBooks()[i].toString() +
                        " ".repeat(length - book.getInfoLength()) + "|\n");
                System.out.println("|" + "-".repeat(length) + "|");
            }
            System.out.println("|" + " ".repeat(length) + "|");
        }
    }

    private static void addBook(Bookshelf bookshelf, Scanner sc) {
        if (bookshelf.getCountBooks() >= 10) {
            System.out.println("Шкаф переполнен, добавить книгу нельзя!");
            return;
        }
        System.out.print("Введите автора книги: ");
        String author = sc.nextLine();
        System.out.print("Введите название книги: ");
        String title = sc.nextLine();
        System.out.print("Введите год публикации книги: ");
        int yearPublishing = sc.nextInt();
        sc.nextLine();
        Book book = new Book(author, title, yearPublishing);
        bookshelf.addBook(book);
    }

    private static void findBook(Bookshelf bookshelf, Scanner sc) {
        System.out.print("Введите название книги, которую ищете: ");
        String title = sc.nextLine();
        Book book = bookshelf.findBook(title);
        if (book == null) {
            System.out.println("Такой книги нет в шкафу!");
        } else {
            System.out.println("Книга " + book + " есть в шкафу");
        }
    }

    private static void deleteBook(Bookshelf bookshelf, Scanner sc) {
        System.out.print("Введите название книги, которую хотите удалить: ");
        String title = sc.nextLine();
        if (bookshelf.deleteBook(title)) {
            System.out.println("Книга удалена!");
        } else {
            System.out.println("Такой книги нет в шкафу, нечего удалять!");
        }
    }
}