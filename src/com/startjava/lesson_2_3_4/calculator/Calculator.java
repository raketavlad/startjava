package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[2]);
        char sign = elements[1].charAt(0);
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
}