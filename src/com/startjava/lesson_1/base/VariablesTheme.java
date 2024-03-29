package com.startjava.lesson_1.base;

public class VariablesTheme {
    
    public static void main(String[] args) {
        // первая задача
        System.out.println("1. Вывод характеристик компьютера");
        byte hddSize = 1;
        System.out.println("Память жесткого диска: " + hddSize + " TB."); 
        short ramVolume = 16;
        System.out.println("Оперативная память: " + ramVolume + " GB.");
        int sddSize = 128;
        System.out.println("Память твёрдотельного накопителя: " + sddSize + " GB.");
        long vramVolume = 12;
        System.out.println("Объем видеопамяти: " + vramVolume + " GB.");
        float cpuFrequency = 2.6f;
        System.out.println("Базовая частота процессора: " + cpuFrequency + " GHz");
        double ramFrequency = 3600;
        System.out.println("Тактовая частота оперативной памяти: " + ramFrequency + " MHz");
        char coresQuantity = '4';
        System.out.println("Количество ядер процессора: " + coresQuantity);
        boolean isOn = true;
        System.out.println("Компьютер включен? " + isOn);

        // вторая задача
        System.out.println("\n2. Расчёт стоимости товара со скидкой");
        int penCost = 100;
        int bookCost = 200;
        int discount = 11;
        int totalCost = penCost + bookCost;
        int discountAmount = totalCost * discount / 100;
        int discountCost = totalCost - discountAmount;
        System.out.println("Общая стоимость товаров без скидки: " + totalCost + " рублей.");
        System.out.println("Суммка скидки: " + discountAmount + " рубля.");
        System.out.println("Общая стоииость товаров со скидкой: " + discountCost + " рублей.\n");

        // третья задача
        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n");

        // четвертая задача
        System.out.println("4. Вывод min и max значений целых числовых типов");
        System.out.println("Вывод для типа Byte:");
        byte maxByte = 127;
        System.out.println("Первоначальное значение: " + maxByte);
        System.out.println("Значение после инкремента на единицу: " + ++maxByte);
        System.out.println("Значение после декремента на единицу: " + --maxByte);

        System.out.println("\nВывод для типа Short");
        short maxShort = 32767;
        System.out.println("Первоначальное значение: " + maxShort);
        System.out.println("Значение после инкремента на единицу: " + ++maxShort);
        System.out.println("Значение после декремента на единицу: " + --maxShort);

        System.out.println("\nВывод для типа Int");
        int maxInt = 2147483647;
        System.out.println("Первоначальное значение: " + maxInt);
        System.out.println("Значение после инкремента на единицу: " + ++maxInt);
        System.out.println("Значение после декремента на единицу: " + --maxInt);

        System.out.println("\nВывод для типа Long");
        long maxLong = 9223372036854775807L;
        System.out.println("Первоначальное значение: " + maxLong);
        System.out.println("Значение после инкремента на единицу: " + ++maxLong);
        System.out.println("Значение после декремента на единицу: " + --maxLong);

        // пятая задача
        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("Перестановка значений с помощью третьей переменной");
        System.out.println("До перестановки: первая переменная = " + a + 
                "; вторая переменная = " + b);
        int swap = a;
        a = b;
        b = swap;
        System.out.println("После перестановки: первая переменная = " + a + 
                "; вторая переменная = " + b);

        System.out.println("\nПерестановка значений с помощью арифметических операций");
        System.out.println("До перестановки: первая переменная = " + a + 
                "; вторая переменная = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("После перестановки: первая переменная = " + a + 
                "; вторая переменная = " + b);

        System.out.println("\nПерестановка значений с помощью побитовой операции ^");
        System.out.println("До перестановки: первая переменная = " + a + 
                "; вторая переменная = " + b);
        b ^= a;
        a ^= b;
        b ^= a;
        System.out.println("После перестановки: первая переменная = " + a + 
                "; вторая переменная = " + b);

        // шестая задача
        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        System.out.println("Код символа: " + (int) dollar + ". Символ: " + dollar);
        char asterisk = '*';
        System.out.println("Код символа: " + (int) asterisk + ". Символ: " + asterisk);
        char atSign = '@';
        System.out.println("Код символа: " + (int) atSign + ". Символ: " + atSign);
        char verticalBar = '|';
        System.out.println("Код символа: " + (int) verticalBar + ". Символ: " + verticalBar);
        char tilde = '~';
        System.out.println("Код символа: " + (int) tilde + ". Символ: " + tilde);

        // седьмая задача
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis +
                backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + 
                backslash + underscore + underscore + backslash);

        // восьмая задача
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int originNumber = 123;
        int quantityHundreds = originNumber / 100;
        int quantityTens = originNumber % 100 / 10;
        int quantityOnes = originNumber % 10;
        int sumDigits = quantityHundreds + quantityTens + quantityOnes;
        int productDigits = quantityHundreds * quantityTens * quantityOnes;
        System.out.println("Число " + originNumber + " содержит:\n  сотен - " + quantityHundreds +
                "\n  десятков - " + quantityTens + "\n  единиц - " + quantityOnes +
                "\nСумма его цифр = " + sumDigits + "\nПроизведение = " + productDigits);
        
        // девятая задача
        System.out.println("\n9. Вывод времени");
        int allSeconds = 86399;
        int hours = allSeconds / 3600;
        int minutes = allSeconds % 3600 / 60;
        int seconds = allSeconds % 60;
        System.out.println("Точное время: " + hours + ":" + seconds + ":" + seconds); 
    }
}