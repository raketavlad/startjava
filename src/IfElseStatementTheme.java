public class IfElseStatementTheme {
    public static void main(String[] args) {
        // первая задача
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean male = true;
        if (!male) {
            System.out.println("Добрый день, подруга!");
        } else {
            System.out.println("Добрый день, друг!");
        }

        int age = 19;
        if (age > 18) {
            System.out.println("Ты можешь войти в бар, добро пожаловать!");
        } else {
            System.out.println("Тебе нельзя здесь находиться, проваливай!");
        }

        float height = 1.77f;
        if (height < 1.8) {
            System.out.println("Ты не можешь кататься, уходи!");
        } else {
            System.out.println("Вперёд, ты можешь скатиться с горки!");
        }

        char firstLetterName = "Vladimir".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква вашего имени: М.");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква вашего имени: I.");
        } else {
            System.out.println("У вас интересное имя!");
        }

        // вторая задача
        System.out.println("\n2. Поиск большего числа");
        int num1 = 12;
        int num2 = 13;
        if (num1 > num2) {
            System.out.println("Число " + num1 + " больше числа " + num2 + "!");
        } else if (num1 < num2) {
            System.out.println("Число " + num2 + " больше числа " + num1 + "!");
        } else {
            System.out.println("Сравниваемые числа равны!");
        }

        // третья задача
        System.out.println("\n3. Проверка числа");
        int num3 = -51;
        if (num3 == 0) {
            System.out.println("Число равно нулю!");
        } else {
            if (num3 < 0) {
                if (num3 % 2 == 0) {
                    System.out.println(num3 + " является отрицательным и четным");
                } else {
                    System.out.println(num3 + " является отрицательным и нечетным");
                }
            } else {
                if (num3 % 2 == 0) {
                    System.out.println(num3 + " является положительным и четным");
                } else {
                    System.out.println(num3 + " является положительным и нечетным");
                }
            }
        }

        // четвертая задача
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 345;
        int num5 = 543;
        if (num4 / 100 == num5 / 100 | num4 % 100 / 10 == num5 % 100 / 10 |
                num4 % 10 == num5 % 10) {
            System.out.println("Исходные числа: " + num4 + " и " + num5);
            if (num4 / 100 == num5 / 100) {
                int i = num4 / 100;
                System.out.println("Одинаковая цифра " + i + " в 3-м разряде.");
            }
            if (num4 % 100 / 10 == num5 % 100 / 10) {
                int i = num4 % 100 / 10;
                System.out.println("Одинаковая цифра " + i + " во 2-м разряде.");
            }
            if (num4 % 10 == num5 % 10) {
                int i = num4 % 10;
                System.out.println("Одинаковая цифра " + i + " в 1-м разряде.");
            }
        } else {
            System.out.println("В числах " + num4 + " и " + num5 +
                    " нет одинаковых цифр в разрядах!");
        }

        // пятая задача
        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if ((int) symbol >= 48 & (int) symbol <= 57) {
            System.out.println("Символ " + symbol + " является цифрой!");
        } else if ((int) symbol >= 65 & (int) symbol <= 90) {
            System.out.println("Символ " + symbol + " является большой буквой!");
        } else if ((int) symbol >= 97 & (int) symbol <= 122) {
            System.out.println("Символ " + symbol + " является маленькой буквой!");
        } else {
            System.out.println("Символ " + symbol + " является не буквой и не цифрой!");
        }

        // шестая задача
        System.out.println("\n6. Подсчет суммы вклада и начисленнных бакном %");
        int depositeAmount = 301000;
        System.out.println("Сумма вклада: " + depositeAmount);
        if (depositeAmount > 0 & depositeAmount < 100000) {
            float accuredAmount = depositeAmount * 0.05f;
            System.out.println("Сумма начисленного % за год: " + accuredAmount);
                float sumTotal = (float) depositeAmount + accuredAmount;
            System.out.println("Итоговая сумма с % за год: " + sumTotal);
        } else if (depositeAmount >= 100000 & depositeAmount < 300000) {
            float accuredAmount = depositeAmount * 0.07f;
            System.out.println("Сумма начисленного % за год: " + accuredAmount);
                float sumTotal = (float) depositeAmount + accuredAmount;
            System.out.println("Итоговая сумма с % за год: " + sumTotal);
        } else {
            float accuredAmount = depositeAmount * 0.1f;
            System.out.println("Сумма начисленного % за год: " + accuredAmount);
                float sumTotal = (float) depositeAmount + accuredAmount;
            System.out.println("Итоговая сумма с % за год: " + sumTotal);
        }

        // седьмая задача
        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 92;
        int historyGrade = 0;
        if (historyPercent > 0 & historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent <= 100) {
            historyGrade = 5;
        }
        int programmingGrade = 0;
        if (programmingPercent > 0 & programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent <= 100) {
            programmingGrade = 5;
        }
        System.out.println("Оценка по истории: " + historyGrade + ". Оценка по программированию: "
                + programmingGrade);
        float avgGrade = ((float) historyGrade + programmingGrade) / 2;
        System.out.println("Средний балл оценок по предметам: " + avgGrade);
        float avgPercent = ((float) historyPercent + programmingPercent) / 2;
        System.out.println("Средний процент по предметам: " + avgPercent);

        // восьмая задача
        System.out.println("\n8. Расчет годовой прибыли");
        int monthlyProfit = 13000;
        int rentCost = 5000;
        int productionCost = 9000;
        int annualProfit = 12 * (monthlyProfit - rentCost - productionCost);
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else if (annualProfit < 0) {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }
    }
}