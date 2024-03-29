package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        String action = "";
        Scanner sc = new Scanner(System.in);
        while (!action.equals("5")) {
            // Выводится сообщение о пустом шкафе или сам шкаф
            printBookshelf(bookshelf.getAllBooks(), bookshelf.getBooksCount(), bookshelf.getEmptyShelfsCount(),
                    bookshelf.largestLength());

            // Выводится список доступных действий
            printAvailableActions();

            // Необходимо ввести цифру для работы со шкафом
            System.out.print("Введите номер действия: ");
            action = sc.nextLine();
            // Свитч или иф-элс по обработке ввода и выполнения действий
            switch (action) {
                case "1":
                    if (bookshelf.getBooksCount() >= 10) {
                        System.out.println("Шкаф переполнен, добавить книгу нельзя!");
                        break;
                    }
                    System.out.print("Введите автора книги: ");
                    String author = sc.nextLine();
                    System.out.print("Введите название книги: ");
                    String bookName = sc.nextLine();
                    System.out.print("Введите год публикации книги: ");
                    int yearPubliching = sc.nextInt();
                    sc.nextLine();
                    bookshelf.addBook(author, bookName, yearPubliching);
                    break;
                case "2":
                    System.out.print("Введите название книги, которую ищете: ");
                    bookName = sc.nextLine();
                    System.out.println(bookshelf.findBook(bookName));
                    break;
                case "3":
                    System.out.print("Введите название книги, которую хотите удалить: ");
                    bookName = sc.nextLine();
                    System.out.println(bookshelf.deleteBook(bookName));
                    break;
                case "4":
                    bookshelf.clearBookshelf();
                    break;
            }
            System.out.print("Для продолжения нажмите Enter");
            sc.nextLine();
        }
    }

    private static void printAvailableActions() {
        String availableActions = """
                \n1. Добавить книгу.
                2. Найти книгу.
                3. Удалить книгу.
                4. Убрать все книги из шкафа.
                5. Завершить работу с программой.            
                """;
        System.out.println(availableActions);
    }

    private static void printBookshelf(String[] books, int bookCount, int emptyShelfCount, int largestLength) {
        if (bookCount == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("\nВ шкафу книг - " + bookCount + ", свободно полок - " + emptyShelfCount + "\n");
            StringBuilder sb = new StringBuilder();
            for (String book : books) {
                sb.append("|" + book + " ".repeat(largestLength - book.length()) + "|");
                System.out.println(sb);
                sb.setLength(0);
                sb.append("|" + "-".repeat(largestLength) + "|");
                System.out.println(sb);
                sb.setLength(0);
            }
            sb.append("|" + " ".repeat(largestLength) + "|");
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
