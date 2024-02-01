public class CyclesTheme {
    public static void main(String[] args) {
        // первая задача
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startSegment = -10;
        int endSegment = 21;
        int sumEvenNums = 0;
        int sumOddNums = 0;
        do {
            if (startSegment % 2 == 0) {
                sumEvenNums += startSegment;
            } else {
                sumOddNums += startSegment;
            }
            startSegment++;
        } while (startSegment <= endSegment);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + sumEvenNums +
                ", а нечетных = " + sumOddNums);

        // вторая задача
        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int max = 0;
        int min = 0;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
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
        while (num3 >= 1) {
            int digit = num3 % 10;
            System.out.print(digit);
            sumDigits += digit;
            num3 /= 10;
        }
        System.out.println("\nСумма цифр этого числа = " + sumDigits);

        // четветрая задача
        System.out.println("\n4. Вывод чисел в несколько строк");
        int startInterval = 1;
        int endInterval = 24;
        int counter4 = 0;
        for (int i = startInterval; i < endInterval; i++) {
            if (counter4 == 5 && i < endInterval - 1) {
                System.out.println("");
                counter4 = 0;
            }
            if (i % 2 != 0) {
                System.out.printf("%2d ", i);
                counter4++;
            }
        }
        for (int i = counter4; i < 5; i++) {
            System.out.printf("%2d ", 0);
        }

        // пятая задача
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int num5 = 3242592;
        int quantityTwos = 0;
        System.out.print("В " + num5);
        while (num5 > 0) {
            int reducerNum5 = num5 % 10;
            if (reducerNum5 == 2) {
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
        int sideRectangle1 = 10;
        int sideRectangel2 = 5;
        for (int i = sideRectangel2; i != 0; i--) {
            for (int j = sideRectangle1; j != 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        // вторая фигура
        int sideTriangle1 = 5;
        int sideTriangle2 = 5;
        while (sideTriangle1 != 0) {
            while (sideTriangle2 != 0) {
                System.out.print("#");
                sideTriangle2--;
            }
            sideTriangle1--;
            sideTriangle2 = sideTriangle1;
            System.out.println("");
        }
        System.out.println("");

        // третья фигура
        int lengthTriangle = 5;
        int heightTrinagle = 3;
        String dollar = "";
        do {
            dollar += "$";
            System.out.println(dollar);
            heightTrinagle--;
            lengthTriangle--;
        } while (heightTrinagle > 0);
        do {
            System.out.print("$");
            if (lengthTriangle == 1) {
                System.out.printf("%n%s%n", "$");
            }
            lengthTriangle--;
        } while (lengthTriangle > 0);

        // седьмая задача
        System.out.println("\n7. Отображение ASCII-символов");
        int ascii15 = 15;
        for (int i = ascii15; (char) i < '0'; i++) {
            if (i == 15) {
                System.out.printf("%-10s%-12s%s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
            }
            if (i % 2 != 0) {
                System.out.printf("%4d%11s            %-1s%n", i, (char) i, Character.getName(i));

            }
        }
        int ascii97 = 97;
        int ascii122 = 122;
        for (int i = ascii97; i <= ascii122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d%11s            %-1s%n", i, (char) i, Character.getName(i));
            }
        }

        // восьмая задача
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num8 = 1234321;
        String palindrome1 = "";
        int copyNum8 = num8;
        for (int i = 0; i < 7; i++) {
            int lastDigitCopyNum8 = copyNum8 % 10;
            palindrome1 += lastDigitCopyNum8;
            copyNum8 /= 10;
        }
        int palindrome2 = Integer.parseInt(palindrome1);
        if (num8 == palindrome2) {
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
                System.out.println("");
            }
        }
    }
}