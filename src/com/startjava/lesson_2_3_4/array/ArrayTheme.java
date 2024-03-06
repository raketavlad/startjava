package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) throws InterruptedException {
        //Первая задача
        runExcercise1();

        //Вторая задача
        runExcercise2(8);

        //Третья задача
        runExcercise3();

        //Четвертая задача
        runExcercise4();

        //Пятая задача
        runExcercise5();

        //Шестая задача
        runExcercise6();
    }

    // Методы
    private static void runExcercise1() {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        displayArray1(numbers, "До");
        for (int i = 0; i < numbers.length / 2; i ++) {
            int a = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = a;
        }
        displayArray1(numbers, "После");
    }

    private static void displayArray1(int[] array, String state) {
        System.out.print(state + " реверса: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length - 1) {
                System.out.print(array[i] + "]\n");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    private static void runExcercise2(int number) {
        System.out.println("\n2. Вычисление факториала");
        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i ++) {
            numbers2[i] = i;
        }
        String displayResult = new String();
        int count = 1;
        for (int i = 1; i <= number; i ++) {
            count *= numbers2[i];
            displayResult += (numbers2[i] < number) ? numbers2[i] + " * " : numbers2[i] + " = " + count;
        }
        System.out.println(displayResult);
    }

    private static void runExcercise3() {
        System.out.println("\n3. Удаление элементов массива");
        Random r3 = new Random();
        float[] numbers3 = new float[15];
        for (int i = 0; i < numbers3.length; i ++) {
            numbers3[i] = r3.nextFloat(1);
        }
        int middleIndex = (numbers3.length - 1) / 2;
        float middleNumber = numbers3[middleIndex];

        //Вывод исходного массива
        displayArray3("Исходный", numbers3, middleIndex);

        //Проверка и обнуление значений
        int counter = 0;
        for (int i = 0; i < numbers3.length; i ++) {
            if (numbers3[i] > middleNumber) {
                numbers3[i] = 0;
                counter++;
            }
        }

        //Вывод изменённого массива и количества обнуленных ячеек
        displayArray3("Изменённый", numbers3, middleIndex);
        System.out.println("Количество обнулённых ячеек: " + counter);
    }

    private static void displayArray3(String word, float[] array, int index) {
        System.out.println(word + " массив:");
        for (int i = 0; i < array.length; i ++) {
            if (i == 0) {
                System.out.printf("%s%.3f%s", "[", array[i], ", ");
            } else if (i == array.length - 1) {
                System.out.printf("%.3f%s", array[i], "]\n");
            } else if (i == index + 1) {
                System.out.printf("\n %.3f%s", array[i], ", ");
            } else {
                System.out.printf("%.3f%s", array[i], ", ");
            }
        }
    }

    private static void runExcercise4() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        int j = 0;
        for (int i = 65; i <= 90; i++) {
            alphabet[j++] = (char) i;
        }

        int quantityLetters = alphabet.length;
        while (quantityLetters > 0) {
            for (int i = alphabet.length; i > quantityLetters - 1; i--) {
                System.out.print(alphabet[i - 1]);
            }
            System.out.println();
            quantityLetters--;
        }
    }

    private static void runExcercise5() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] array5 = new int[30];
        Random r5 = new Random();
        boolean isUniqueNumber;
        for (int i = 0; i < array5.length; i++) {
            isUniqueNumber = false;
            while (!isUniqueNumber) {
                int number = r5.nextInt(60, 100);
                for (int num : array5) {
                    if (num == number) {
                        isUniqueNumber = false;
                        break;
                    } else {
                        isUniqueNumber = true;
                    }
                }
                if (isUniqueNumber) {
                    array5[i] = number;
                }
            }
        }

        // Сортировка массива
        for (int i = array5.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array5[j] > array5[j+1]) {
                    int max = array5[j+1];
                    array5[j+1] = array5[j];
                    array5[j] = max;
                }
            }
        }

        // Вывод массива по 10 элементов в строке
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i] + " ");
            if (i == 9 || i == 19) {
                System.out.println();
            }
        }
    }

    private static void runExcercise6() throws InterruptedException {
        System.out.println("\n\n6. Вывод текста с эффектом пишущей машинки");
//        String text = "Чтобы написать чистый код, мы сначала пишем грязный код, " +
//                "затем рефакторим его.\n- Robert Martin";

        String text = "Java - это C++, из которого убрали все пистолеты, ножи и дубинки." +
                "\n- James Gosling";

        // Создание массива для поиска самого короткого и самого длинного слова
        String formtatText = text.replace(",", "");
        formtatText = formtatText.replace(".", "");
        formtatText = formtatText.replace("-", "");
        formtatText = formtatText.replace("\n", "");
        formtatText = formtatText.replace("  ", " ");
        String[] auxiliaryArray = formtatText.split(" ");

        // Поиск самого короткого и самого длинного слова
        String minWord = auxiliaryArray[0];
        String maxWord = auxiliaryArray[0];
        for (String word : auxiliaryArray) {
            if (minWord.length() > word.length()) {
                minWord = word;
            }
            if (maxWord.length() < word.length()) {
                maxWord = word;
            }
        }

        // Создание массива и изменение регистра в необходимом промежутке
        String[] arrayStrings = text.split(" ");
        boolean isBig = false;
        for (int i = 0; i < arrayStrings.length; i++) {
            if (!isBig && (arrayStrings[i].replace(",", "").equals(maxWord) ||
                    arrayStrings[i].equals(minWord))) {
                isBig = true;
                arrayStrings[i] = arrayStrings[i].toUpperCase();
                continue;
            }
            if (isBig) {
                arrayStrings[i] = arrayStrings[i].toUpperCase();
            }
            if (isBig && (arrayStrings[i].equals(maxWord.toUpperCase()) ||
                    arrayStrings[i].equals(minWord.toUpperCase()))) {
                isBig = false;
            }
        }

        // Создание строки из массива
        String auxiliaryText = new String();
        for (String word : arrayStrings) {
            word += " ";
            auxiliaryText += word;
        }

        // Создание массива для каждого символа
        String[] arrayCharacter = new String[auxiliaryText.length()];
        for (int i = 0; i < auxiliaryText.length(); i++) {
            arrayCharacter[i] = String.valueOf(auxiliaryText.charAt(i));
        }

        // Вывод текста по символам
        for (String symbol : arrayCharacter) {
            System.out.print(symbol);
            Thread.sleep(100);
        }
    }
}
