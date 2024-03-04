package com.startjava.lesson_2_3_4.rps;

import java.util.Random;
import java.util.Scanner;

// Игра Камень-Ножницы-Бумага
public class RpsGameFormatting {

    private static final String rock = "R";
    private static final String scissors = "S";
    private static final String paper = "P";

    public static void main(String[] args) throws InterruptedException {
        String name1 = inputName();
        String name2 = inputName();

        // Ход первого игрока
        int position = generatePosition(name1);
        String sign1 = defineSign(position);
        showSigns(sign1);

        // Ход второго игрока
        position = generatePosition(name2);
        String sign2 = defineSign(position);
        showSigns(sign2);

        defineWinner(name1, sign1, name2, sign2);
    }

    private static String inputName() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        return console.nextLine();
    }

    private static int generatePosition(String name1) {
        Random r = new Random();
        System.out.println("Ход " + name1 + ": ");
        return r.nextInt(1, 100);
    }

    private static String defineSign(int position) {
        String sign = rock;
        if (position > 66) {
            sign = scissors;
        } else if (position > 33) {
            sign = paper;
        }
        return sign;
    }

    private static void showSigns(String sign) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }
        System.out.println(sign);
    }

    private static void defineWinner(String name1, String sign1, String name2, String sign2) {
        if (sign1.equals(sign2)) {
            System.out.println("\nПобедила дружба!");
            return;
        }

        boolean isName1Equal = sign1.equals(rock) && sign2.equals(scissors) ||
                sign1.equals(scissors) && sign2.equals(paper) ||
                sign1.equals(paper) && sign2.equals(rock);

        if (isName1Equal) {
            System.out.println("\nПобедил - " + name1);
        } else {
            System.out.println("\nПобедил - " + name2);
        }
    }
}