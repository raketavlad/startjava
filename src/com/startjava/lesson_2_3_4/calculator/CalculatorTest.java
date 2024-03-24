package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String continuation = "yes";
        while (!continuation.equals("no")) {
            if (continuation.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = sc.nextLine();
                printResult(calc.calculate(mathExpression), mathExpression);
            }
            System.out.print("Хотите продолжить вычисления? ");
            continuation = sc.nextLine();
        }
    }

    private static void printResult(double result, String mathematicalExpression) {
        if (!Double.isNaN(result)) {
            System.out.print("Результат вычисления: " + mathematicalExpression + " = ");
            if (result % 1 == 0) {
                System.out.printf("%.0f\n", result);
            } else {
                System.out.printf("%.3f\n", result);
            }
        }
    }
}