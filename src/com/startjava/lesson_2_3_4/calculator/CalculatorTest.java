package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String continuation = "yes";
        while (continuation.equals("yes") || !continuation.equals("no")) {
            if (continuation.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                calc.setParams(sc.nextLine());
                double result = calc.calculate();
                if (Double.isNaN(result)) {
                    System.out.println("Ошибка: знак " + calc.getSign() + " не поддерживается");
                } else {
                    System.out.print("Результат вычисления равен: " + calc.getNum1() + " " + calc.getSign() + " " +
                            calc.getNum2() + " = ");
                    if (result % 1 == 0) {
                        System.out.printf("%.0f\n", result);
                    } else {
                        System.out.printf("%.3f\n", result);
                    }
                }
            }
            System.out.print("Хотите продолжить вычисления? ");
            continuation = sc.nextLine();
            if (continuation.equals("no")) {
                break;
            }
        }
    }
}