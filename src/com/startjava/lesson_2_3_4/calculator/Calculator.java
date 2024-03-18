package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private String sign;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getSign() {
        return sign;
    }

    public void setParams(String parameters) {
        String[] userExpression = parameters.split(" ");
        num1 = Integer.parseInt(userExpression[0]);
        num2 = Integer.parseInt(userExpression[2]);
        sign = userExpression[1];
    }

    public double calculate() {
        switch (sign) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return (double) num1 / (double) num2;
            case "^":
                return Math.pow(num1, num2);
            case "%":
                return num1 % num2;
            default:
                return Double.NaN;
        }
    }
}