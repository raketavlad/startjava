package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public double calculate(String parameters) {
        String[] elements = parameters.split(" ");
        num1 = Integer.parseInt(elements[0]);
        num2 = Integer.parseInt(elements[2]);
        sign = elements[1].charAt(0);
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / num2;
            case '^':
                return Math.pow(num1, num2);
            case '%':
                return num1 % num2;
            default:
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                return Double.NaN;
        }
    }

    public void printResult(double result) {
        String expression = "Результат вычисления равен: " + num1 + " " + sign + " " + num2 + " = ";
        if (Double.isNaN(result)) {
        } else if (result % 1 == 0) {
            System.out.printf("%s%.0f\n", expression, result);
        } else {
            System.out.printf("%s%.3f\n", expression, result);
        }
    }
}