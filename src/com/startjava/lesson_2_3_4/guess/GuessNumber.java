package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int targetNumber = generateTargetNumber();
        while (true) {
            enterNumber(player1);
            if (checkNumber(player1, targetNumber)) {
                break;
            }
            enterNumber(player2);
            if (checkNumber(player2, targetNumber)) {
                break;
            }
        }
    }

    private static int generateTargetNumber() {
        return 1 + (int) (Math.random() * 100);
    }

    private void enterNumber(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        player.setNumber(sc.nextInt());
    }

    private boolean checkNumber(Player player, int targetNumber) {
        if (player.getNumber() > targetNumber) {
            System.out.println("Число " + player.getNumber() +
                    " больше того, что загадал компьютер!");
        } else if (player.getNumber() < targetNumber) {
            System.out.println("Число " + player.getNumber() +
                    " меньше того, что загадал компьютер!");
        } else {
            System.out.println("Игрок " + player.getName() + " победил!\n");
            return true;
        }
        return false;
    }
}