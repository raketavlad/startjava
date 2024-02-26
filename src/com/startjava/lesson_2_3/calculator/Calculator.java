package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        if (num1 > 0) {
            this.num1 = num1;
        } else {
            System.out.println("Калькулятор принимает только целые положительные числа!");
        }
    }

    public void setNum2(int num2) {
        if (num2 > 0) {
            this.num2 = num2;
        } else {
            System.out.println("Калькулятор принимает только целые положительные числа!");
        }
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double calculate() {
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                int result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return num1 % num2;
            default:
                return Double.NaN;
        }
    }
}