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
                String mathematicalExpression = sc.nextLine();
                printResult(calc.calculate(mathematicalExpression), mathematicalExpression);
            }
            System.out.print("Хотите продолжить вычисления? ");
            continuation = sc.nextLine();
        }
    }

    private static void printResult(double resultCalculation, String mathematicalExpression) {
        if (!Double.isNaN(resultCalculation)) {
            System.out.print("Результат вычисления: " + mathematicalExpression + " = ");
            if (resultCalculation % 1 == 0 && !Double.isNaN(resultCalculation)) {
                System.out.printf("%.0f\n", resultCalculation);
            } else {
                System.out.printf("%.3f\n", resultCalculation);
            }
        }
    }
}