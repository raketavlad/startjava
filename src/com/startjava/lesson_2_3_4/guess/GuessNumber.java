package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(String name1, String name2) {
        Player player1 = new Player(name1);
        this.player1 = player1;
        Player player2 = new Player(name2);
        this.player2 = player2;
    }

    public void play() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        player1.setAttempt(0);
        player2.setAttempt(0);
        int targetNumber = generateTargetNumber();
        while (true) {
            enterNumber(player1);
            if (checkNumber(player1, targetNumber)) {
                break;
            } else if (player1.getAttempt() == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }
            enterNumber(player2);
            if (checkNumber(player2, targetNumber)) {
                break;
            } else if (player1.getAttempt() == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
                System.out.println("Игра закончено, победителей нет!");
                break;
            }
        }
        showPlayerNumbers(player1);
        showPlayerNumbers(player2);
    }

    private static int generateTargetNumber() {
        return 1 + (int) (Math.random() * 100);
    }

    private void enterNumber(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        player.setNumber(sc.nextInt());
        player.addNumber(player.getNumber());
    }

    private boolean checkNumber(Player player, int targetNumber) {
        if (player.getNumber() > targetNumber) {
            System.out.println("Число " + player.getNumber() +
                    " больше того, что загадал компьютер!");
        } else if (player.getNumber() < targetNumber) {
            System.out.println("Число " + player.getNumber() +
                    " меньше того, что загадал компьютер!");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    targetNumber + " c " + player.getAttempt() + " попытки");
            return true;
        }
        return false;
    }

    private void showPlayerNumbers(Player player) {
        int[] enteredNumbers = Arrays.copyOf(player.getNumbers(), player.getAttempt());
        System.out.print("Числа введённые " + player.getName() + ": ");
        for (int i = 0; i < enteredNumbers.length; i++) {
            System.out.print(enteredNumbers[i] + " ");
        }
        System.out.println();
    }
}