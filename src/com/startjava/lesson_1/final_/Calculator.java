package com.startjava.lesson_1.final_;

public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        char sign = '^';
        int result = 1;
        if (a > 0 && b > 0) {
            if (sign == '+') {
                result = a + b;
            } else if (sign == '-') {
                result = a - b;
            } else if (sign == '*') {
                result = a * b;
            } else if (sign == '/') {
                result = a / b;
            } else if (sign == '^') {
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
            } else if (sign == '%') {
                result = a % b;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else {
            System.out.println("Калькулятор принимает только целые положительные числа!");
        }
    }
}