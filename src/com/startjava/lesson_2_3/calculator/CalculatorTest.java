package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String continuation = "yes";
        while (continuation.equals("yes")) {
            System.out.print("Введите первое число: ");
            calc.setNum1(sc.nextInt());
            sc.nextLine();
            System.out.print("Введите знак математической операции: ");
            calc.setSign(sc.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setNum2(sc.nextInt());
            double result = calc.calculate();
            if (Double.isNaN(result)) {
                System.out.println("Введенная математическая операция не поддерживается!");
            } else {
                System.out.println("Результат вычисления равен: " + result);
            }
            sc.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? ");
                continuation = sc.nextLine();
            } while (!continuation.equals("yes") && !continuation.equals("no"));
            System.out.println();
        }
    }
}