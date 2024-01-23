public class VariablesTheme {
    
    public static void main(String[] args) {
        // первая задача
        System.out.println("1. Вывод характеристик компьютера");
        byte hddMemory = 1;
        System.out.println("Память жесткого диска: " + hddMemory + " TB."); 
        short ramMemory = 16;
        System.out.println("Оперативная память: " + ramMemory + " GB.");
        int sddMemory = 128;
        System.out.println("Память твёрдотельного накопителя: " + sddMemory + " GB.");
        long videoMemory = 12;
        System.out.println("Объем видеопамяти: " + videoMemory + " GB.");
        float cpuFrequency = 2.6f;
        System.out.println("Базовая частота процессора: " + cpuFrequency + " GHz");
        double ramFrequency = 3600;
        System.out.println("Тактовая частота оперативной памяти: " + ramFrequency + " MHz");
        char coresQuantity = '4';
        System.out.println("Количество ядер процессора: " + coresQuantity);
        boolean isPower = true;
        System.out.println("Компьютер включен? " + isPower);

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
        int first = 2;
        int second = 5;
        System.out.println("Перестановка значений с помощью третьей переменной");
        System.out.println("До перестановки: первая переменная = " + first + 
                "; вторая переменная = " + second);
        int storage = first;
        first = second;
        second = storage;
        System.out.println("После перестановки: первая переменная = " + first + 
                "; вторая переменная = " + second);

        System.out.println("\nПерестановка значений с помощью арифметических операций");
        System.out.println("До перестановки: первая переменная = " + first + 
                "; вторая переменная = " + second);
        first += second;
        second = first - second;
        first -= second;
        System.out.println("После перестановки: первая переменная = " + first + 
                "; вторая переменная = " + second);

        System.out.println("\nПерестановка значений с помощью побитовой операции ^");
        System.out.println("До перестановки: первая переменная = " + first + 
                "; вторая переменная = " + second);
        second = first ^ second;
        first = first ^ second;
        second = second ^ first;
        System.out.println("После перестановки: первая переменная = " + first + 
                "; вторая переменная = " + second);

        // шестая задача
        System.out.println("\n6. Вывод символов и их кодов");
        char symbol36 = '$';
        System.out.println("Код символа: " + (int) symbol36 + ". Символ: " + symbol36);
        char symbol42 = '*';
        System.out.println("Код символа: " + (int) symbol42 + ". Символ: " + symbol42);
        char symbol64 = '@';
        System.out.println("Код символа: " + (int) symbol64 + ". Символ: " + symbol64);
        char symbol124 = '|';
        System.out.println("Код символа: " + (int) symbol124 + ". Символ: " + symbol124);
        char symbol126 = '~';
        System.out.println("Код символа: " + (int) symbol126 + ". Символ: " + symbol126);

        // седьмая задача
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char symbol40 = '(';
        char symbol41 = ')';
        char symbol47 = '/';
        char symbol92 = '\\';
        char symbol95 = '_';
        System.out.println("    " + symbol47 + symbol92);
        System.out.println("   " + symbol47 + "  " + symbol92);
        System.out.println("  " + symbol47 + symbol95 + symbol40 + " " + symbol41 + symbol92);
        System.out.println(" " + symbol47 + "      " + symbol92);
        System.out.println("" + symbol47 + symbol95 + symbol95 + symbol95 + symbol95 + symbol47 + 
                symbol92 + symbol95 + symbol95 + symbol92);

        // восьмая задача
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number123 = 123;
        int quantityHundreds = number123 / 100;
        int quantityTens = (number123 - quantityHundreds * 100) / 10;
        int quantityOnes = number123 - (quantityHundreds * 100 + quantityTens * 10);
        int sumDigits = quantityHundreds + quantityTens + quantityOnes;
        int productDigits = quantityHundreds * quantityTens * quantityOnes;
        System.out.println("Число " + number123 + " содержит:\n  сотен - " + quantityHundreds +
                "\n  десятков - " + quantityTens + "\n  единиц - " + quantityOnes +
                "\nСумма его цифр = " + sumDigits + "\nПроизведение = " + productDigits);
        
        // девятая задача
        System.out.println("\n9. Вывод времени");
        int allSeconds = 86399;
        int hours = allSeconds / 3600;
        int minutes = allSeconds % 3600 / 60;
        int seconds = allSeconds % 3600 % 60;
        System.out.println("Точное время: " + hours + ":" + seconds + ":" + seconds); 
    }
}