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
            } else if (player1.getAttempt() == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }
            enterNumber(player2, sc);
            if (isGuessed(player2, targetNumber)) {
                break;
            } else if (player1.getAttempt() == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
                System.out.println("Игра закончена, победителей нет!");
                break;
            }
        }
        showPlayerNumbersAndClear(player1);
        showPlayerNumbersAndClear(player2);
    }

    private static int generateTargetNumber() {
        return 1 + (int) (Math.random() * 100);
    }

    private void enterNumber(Player player, Scanner scanner) {
        System.out.print(player.getName() + " введите число: ");
        int playerNumber = scanner.nextInt();
        player.addNumber(playerNumber);
    }

    private boolean isGuessed(Player player, int targetNumber) {
        int number = player.getNumber();
        if (number == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    targetNumber + " c " + player.getAttempt() + " попытки");
            return true;
        } else if (number > targetNumber) {
            System.out.println("Число " + number + " больше того, что загадал компьютер!");
        } else {
            System.out.println("Число " + number + " меньше того, что загадал компьютер!");
        }
        return false;
    }

    private void showPlayerNumbersAndClear(Player player) {
        System.out.print("Числа введённые " + player.getName() + ": ");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
        player.clear();
    }
}