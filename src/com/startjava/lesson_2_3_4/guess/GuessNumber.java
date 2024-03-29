package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void play() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        int targetNumber = generateTargetNumber();
        Scanner sc = new Scanner(System.in);
        while (true) {
            enterNumber(player1, sc);
            if (isGuessed(player1, targetNumber)) {
                break;
            }
            boolean overAttemptsPlayer1 = hasAttempts(player1);
            enterNumber(player2, sc);
            if (isGuessed(player2, targetNumber)) {
                break;
            }
            boolean overAttemptsPlayer2 = hasAttempts(player2);
            if (overAttemptsPlayer1 && overAttemptsPlayer2) {
                break;
            }
        }
        printAllAttempts(player1);
        printAllAttempts(player2);
        player1.clear();
        player2.clear();
    }

    private static int generateTargetNumber() {
        return 1 + (int) (Math.random() * 100);
    }

    private void enterNumber(Player player, Scanner scanner) {
        System.out.print(player.getName() + " введите число: ");
        int number = scanner.nextInt();
        player.addNumber(number);
    }

    private boolean isGuessed(Player player, int targetNumber) {
        int number = player.getNumber();
        if (number == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    targetNumber + " c " + player.getAttempt() + " попытки");
            return true;
        }
        if (number > targetNumber) {
            System.out.println("Число " + number + " больше того, что загадал компьютер!");
        } else {
            System.out.println("Число " + number + " меньше того, что загадал компьютер!");
        }
        return false;
    }

    private boolean hasAttempts(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void printAllAttempts(Player player) {
        System.out.print("Числа введённые " + player.getName() + ": ");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}