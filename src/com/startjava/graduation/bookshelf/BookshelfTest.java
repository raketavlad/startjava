package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static Bookshelf bookshelf = new Bookshelf();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String action = "";
        while (!action.equals("5")) {
            printBookshelf();
            if (!action.equals("")) {
                System.out.print("\nДля продолжения нажмите Enter");
                sc.nextLine();
            }
            printMenu();
            action = enterAction();
            doAction(action);

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

    private static String enterAction() {
        System.out.print("Введите номер действия: ");
        return sc.nextLine();
    }

    private static void doAction(String action) {
        switch (action) {
            case "1":
                addBook();
                break;
            case "2":
                findBook();
                break;
            case "3":
                deleteBook();
                break;
            case "4":
                bookshelf.clearBookshelf();
                System.out.println("\nВсе книги удалены!");
                break;
            case "5":
                System.out.println("\nРабота с программой завершена, до встречи!");
                break;
            default:
                System.out.println("\nВведён некорректный номер действия! Введите целое число от 1 до 5");
        }
    }

    private static void printBookshelf() {
        int count = bookshelf.getCountBooks();
        int length = bookshelf.getLength();
        if (count == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("\nВ шкафу книг - " + count + ", свободно полок - " +
                    bookshelf.getEmptyShelfsCount() + "\n");
            for (Book book : bookshelf.getAllBooks()) {
                System.out.println("|" + book + " ".repeat(length - book.getInfoLength()) + "|");
                System.out.println("|" + "-".repeat(length) + "|");
            }
            System.out.println("|" + " ".repeat(length) + "|");
        }
    }

    private static void addBook() {
        if (bookshelf.getCountBooks() >= bookshelf.getCapacity()) {
            System.out.println("\nШкаф переполнен, добавить книгу нельзя!");
            return;
        }
        System.out.print("Введите автора книги: ");
        String author = sc.nextLine();
        String title = enterTitle();
        System.out.print("Введите год публикации книги: ");
        int yearPublishing = sc.nextInt();
        sc.nextLine();
        Book book = new Book(author, title, yearPublishing);
        bookshelf.add(book);
    }

    private static void findBook() {
        Book book = bookshelf.find(enterTitle());
        System.out.println((book == null) ? "\nТакой книги нет в шкафу!" : "\n" + book);
    }

    private static void deleteBook() {
        System.out.println((bookshelf.delete(enterTitle())) ? "\nКнига удалена!" :
                "\nТакой книги нет в шкафу, нечего удалять!");
    }

    private static String enterTitle() {
        System.out.print("Введите название книги: ");
        return sc.nextLine();
    }
}