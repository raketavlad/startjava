package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        // первая задача
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startSegment = -10;
        int endSegment = 21;
        int sumEvenNums = 0;
        int sumOddNums = 0;
        System.out.print("В отрезке [" + startSegment + ", ");
        do {
            if (startSegment % 2 == 0) {
                sumEvenNums += startSegment;
            } else {
                sumOddNums += startSegment;
            }
            startSegment++;
        } while (startSegment <= endSegment);
        System.out.println(endSegment + "] сумма четных чисел = " + sumEvenNums +
                ", а нечетных = " + sumOddNums);

        // вторая задача
        System.out.println("\n2. Вывод чисел в порядке убывания");
        int max = 10;
        int min = 5;
        if (max < min) {
            max += min;
            min = max - min;
            max -= min;
        }
        int c = -1;
        if (c > max) {
            max = c;
        } else if (c < min) {
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        // третья задача
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр ");
        int num3 = 1234;
        int sumDigits = 0;
        System.out.print("Для числа " + num3 + " реверсивное число: ");
        while (num3 > 0) {
            int digit = num3 % 10;
            System.out.print(digit);
            sumDigits += digit;
            num3 /= 10;
        }
        System.out.println("\nСумма цифр этого числа = " + sumDigits);

        // четвертая задача
        System.out.println("\n4. Вывод чисел в несколько строк");
        int startInterval = 1;
        int endInterval = 24;
        int counter = 0;
        for (int i = startInterval; i < endInterval; i++) {
            if (counter == 5 && i < endInterval - 1) {
                System.out.println("");
                counter = 0;
            }
            if (i % 2 != 0) {
                System.out.printf("%2d ", i);
                counter++;
            }
        }
        for (int i = counter; i < 5; i++) {
            System.out.printf("%2d ", 0);
        }

        // пятая задача
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int num5 = 3242592;
        int quantityTwos = 0;
        System.out.print("В " + num5);
        while (num5 > 0) {
            if (num5 % 10 == 2) {
                quantityTwos++;
            }
            num5 /= 10;
        }
        if (quantityTwos % 2 == 0) {
            System.out.println(" четное количество двоек - " + quantityTwos);
        } else {
            System.out.println(" нечетное количество двоек - " + quantityTwos);
        }

        // шестая задача
        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 5; i != 0; i--) {
            for (int j = 10; j != 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // вторая фигура
        int side1 = 5;
        int side2 = 5;
        while (side1 != 0) {
            while (side2 != 0) {
                System.out.print("#");
                side2--;
            }
            side1--;
            side2 = side1;
            System.out.println();
        }
        System.out.println();

        // третья фигура
        int maxHeight = 3;
        int counter2 = 2;
        side1 = 5;
        do {
            do {
                System.out.print("$");
                maxHeight--;
            } while (maxHeight > counter2);
            System.out.println();
            maxHeight = 3;
            if (side1 > 3) {
                counter2--;
            } else {
                counter2++;
            }
            side1--;
        } while(side1 > 0);

        // седьмая задача
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%-10s%-12s%s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 15; i < '0'; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d%11c            %-1s%n", i, i, Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d%11c            %-1s%n", i, i, Character.getName(i));
            }
        }

        // восьмая задача
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num8 = 1234321;
        int reverseNum = 0;
        int copyNum8 = num8;
        for (int i = 7; i > 0; i--) {
            int digit = copyNum8 % 10;
            int placeDigit = 1;
            int degree = i - 1;
            while (degree > 0) {
                placeDigit *= 10;
                degree--;
            }
            reverseNum += digit * placeDigit;
            copyNum8 /= 10;
        }
        if (num8 == reverseNum) {
            System.out.println("Число " + num8 + " является палиндромом!");
        } else {
            System.out.println("Число " + num8 + " не является палиндромом!");
        }

        // девятая задача
        System.out.println("\n9. Проверка, является ли число счастливым");
        int num9 = 123219;
        int firstThreeDigit = num9 / 1000;
        int lastThreeDigit = num9 % 1000;
        int sumFirstThreeDigit = 0;
        int sumLastThreeDigit = 0;
        for (int i = 100; i > 0; i /= 10) {
            sumFirstThreeDigit += firstThreeDigit / i % 10;
            sumLastThreeDigit += lastThreeDigit / i % 10;
        }
        String numHappy = "";
        if (sumFirstThreeDigit != sumLastThreeDigit) {
            numHappy = " не";
        }
        System.out.println("Число " + num9 + numHappy + " является счастливым\n" +
                    "Сумма цифр " + firstThreeDigit + " = " + sumFirstThreeDigit +
                    ", а сумма " + lastThreeDigit + " = " + sumLastThreeDigit);

        // десятая задача
        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.println("       ТАБЛИЦА ПИФАГОРА");
        for (int i = 1; i < 10; i ++) {
            for (int j = 1; j < 10; j ++) {
                int product = i * j;
                if (product == 1) {
                    System.out.print("   |");
                    continue;
                }
                System.out.printf("%3d", product);
                if (j == 1) {
                    System.out.print("|");
                }
            }
            if (i == 1) {
                System.out.println("\n ---------------------------");
            } else {
                System.out.println();
            }
        }
    }
}