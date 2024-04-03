package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        printBookshelf(bookshelf);
        String action = "";
        Scanner sc = new Scanner(System.in);
        while (!action.equals("5")) {
            printMenu();
            action = enterAction(sc);
            identifyAction(action, bookshelf, sc);
            System.out.print("\nДля продолжения нажмите Enter");
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

    private static String enterAction(Scanner sc) {
        System.out.print("Введите номер действия: ");
        return sc.nextLine();
    }

    private static void identifyAction(String action, Bookshelf bookshelf, Scanner sc) {
        switch (action) {
            case "1":
                addBook(bookshelf, sc);
                printBookshelf(bookshelf);
                break;
            case "2":
                findBook(bookshelf, sc);
                printBookshelf(bookshelf);
                break;
            case "3":
                deleteBook(bookshelf, sc);
                printBookshelf(bookshelf);
                break;
            case "4":
                bookshelf.clearBookshelf();
                System.out.println("\nВсе книги удалены!");
                printBookshelf(bookshelf);
                break;
            case "5":
                System.out.println("\nРабота с программой завершена, до встречи!");
                break;
            default:
                System.out.println("\nВы ввели не тот символ, попробуйте снова!");
        }
    }

    private static void printBookshelf(Bookshelf bookshelf) {
        int count = bookshelf.getCountBooks();
        int length = bookshelf.getLength();
        if (count == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("\nВ шкафу книг - " + count + ", свободно полок - " +
                    bookshelf.getEmptyShelfsCount() + "\n");
            for (Book book : bookshelf.getAllBooks()) {
                System.out.print("|" + book + " ".repeat(length - book.getInfoLength()) + "|\n");
                System.out.println("|" + "-".repeat(length) + "|");
            }
            System.out.println("|" + " ".repeat(length) + "|");
        }
    }

    private static void addBook(Bookshelf bookshelf, Scanner sc) {
        if (bookshelf.getCountBooks() >= 10) {
            System.out.println("\nШкаф переполнен, добавить книгу нельзя!");
            return;
        }
        System.out.print("Введите автора книги: ");
        String author = sc.nextLine();
        String title = enterTitle(sc);
        System.out.print("Введите год публикации книги: ");
        int yearPublishing = sc.nextInt();
        sc.nextLine();
        Book book = new Book(author, title, yearPublishing);
        bookshelf.add(book);
    }

    private static void findBook(Bookshelf bookshelf, Scanner sc) {
        Book book = bookshelf.find(enterTitle(sc));
        if (book == null) {
            System.out.println("\nТакой книги нет в шкафу!");
        } else {
            System.out.println("\nКнига " + book + " есть в шкафу");
        }
    }

    private static void deleteBook(Bookshelf bookshelf, Scanner sc) {
        if (bookshelf.delete(enterTitle(sc))) {
            System.out.println("\nКнига удалена!");
        } else {
            System.out.println("\nТакой книги нет в шкафу, нечего удалять!");
        }
    }

    private static String enterTitle(Scanner sc) {
        System.out.print("Введите название книги: ");
        return sc.nextLine();
    }
}