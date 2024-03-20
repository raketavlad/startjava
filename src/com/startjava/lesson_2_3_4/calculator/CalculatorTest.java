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
                double result = calc.calculate(sc.nextLine());
                calc.printResult(result);
            }
            System.out.print("Хотите продолжить вычисления? ");
            continuation = sc.nextLine();
        }
    }
}