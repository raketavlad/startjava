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
        int num = 51;
        String output = new String();
        if (num != 0) {
            if (num > 0) {
                output += " является положительным";
            } else {
                output += " является отрицательным";
            }
            if (num % 2 == 0) {
                output += " и четным";
            } else {
                output += " и нечетным";
            }
            System.out.println(num + output);
        } else {
            System.out.println("Число равно нулю, пока!");
        }

        // четвертая задача
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 321;
        int num5 = 123;
        int hundredsNum4 = num4 / 100;
        int hundredsNum5 = num5 / 100;
        int tensNum4 = num4 % 100 / 10;
        int tensNum5 = num5 % 100 / 10;
        int unitsNum4 = num4 % 10;
        int unitsNum5 = num5 % 10;
        if (hundredsNum4 == hundredsNum5 || tensNum4 == tensNum5 || unitsNum4 == unitsNum5) {
            System.out.println("Исходные числа: " + num4 + " и " + num5);
            if (hundredsNum4 == hundredsNum5) {
                System.out.println("Одинаковая цифра " + hundredsNum4 + " в 3-м разряде.");
            }
            if (tensNum4 == tensNum5) {
                System.out.println("Одинаковая цифра " + tensNum4 + " во 2-м разряде.");
            }
            if (unitsNum4 == unitsNum5) {
                System.out.println("Одинаковая цифра " + unitsNum4 + " в 1-м разряде.");
            }
        } else {
            System.out.println("В числах " + num4 + " и " +
                    num5 + " нет одинаковых цифр в разрядах!");
        }

        // пятая задача
        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой!");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является большой буквой!");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является маленькой буквой!");
        } else {
            System.out.println("Символ " + symbol + " является не буквой и не цифрой!");
        }

        // шестая задача
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int depositeAmount = 301000;
        float percentPerYear = 0.1f;
        if (depositeAmount > 0 && depositeAmount < 100000) {
            percentPerYear = 0.05f;
        } else if (depositeAmount >= 100000 && depositeAmount < 300000) {
            percentPerYear = 0.07f;
        }
        System.out.println("Сумма вклада: " + depositeAmount);
        float accuredAmount = depositeAmount * percentPerYear;
        System.out.println("Сумма начисленного % за год: " + accuredAmount);
        float sumTotal = depositeAmount + accuredAmount;
        System.out.println("Итоговая сумма с % за год: " + sumTotal);

        // седьмая задача
        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 5;
        if (historyPercent > 0 && historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent <= 91) {
            historyGrade = 4;
        }
        int programmingPercent = 92;
        int programmingGrade = 5;
        if (programmingPercent > 0 && programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent <= 91) {
            programmingGrade = 4;
        }
        System.out.println("Оценка по истории: " + historyGrade +
                ". Оценка по программированию: " + programmingGrade);
        float avgGrade = (historyGrade + programmingGrade) / 2f;
        System.out.println("Средний балл оценок по предметам: " + avgGrade);
        float avgPercent = (historyPercent + programmingPercent) / 2f;
        System.out.println("Средний процент по предметам: " + avgPercent);

        // восьмая задача
        System.out.println("\n8. Расчет годовой прибыли");
        int monthlyProfit = 13000;
        int rentCost = 5000;
        int productionCost = 9000;
        int annualProfit = 12 * (monthlyProfit - rentCost - productionCost);
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }
    }
}