package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) throws InterruptedException {
        reverseArrayValues();
        calculateFactorial();
        removingArrayElements();
        displayAlphabet();
        fillArrayUniqueNumbers();
        displayTextTypewriterEffect();
    }

    private static void reverseArrayValues() {
        System.out.println("1. Реверс значений массива");
        int[] numbersFrom1To7 = {1, 7, 4, 5, 2, 6, 3};
        int length = numbersFrom1To7.length;
        printElements1(numbersFrom1To7, "До");
        for (int i = 0; i < length / 2; i ++) {
            int a = numbersFrom1To7[i];
            numbersFrom1To7[i] = numbersFrom1To7[length - 1 - i];
            numbersFrom1To7[length - 1 - i] = a;
        }
        printElements1(numbersFrom1To7, "После");
    }

    private static void printElements1(int[] array, String state) {
        int length = array.length;
        System.out.print(state + " реверса: [");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);
            if (i == length - 1) {
                System.out.print(array[i] + "]\n");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    private static void calculateFactorial() {
        System.out.println("\n2. Вычисление факториала");
        int[] naturalNumbers = new int[10];
        for (int i = 0; i < naturalNumbers.length; i ++) {
            naturalNumbers[i] = i;
        }
        String displayResult = new String();
        int result = 1;
        for (int i = 1; i <= 8; i ++) {
            result *= naturalNumbers[i];
            displayResult += (naturalNumbers[i] < 8) ? naturalNumbers[i] + " * " : naturalNumbers[i] + " = " + result;
        }
        System.out.println(displayResult);
    }

    private static void removingArrayElements() {
        System.out.println("\n3. Удаление элементов массива");
        Random random = new Random();
        float[] randomFloatNumbers = new float[15];
        int length = randomFloatNumbers.length;
        for (int i = 0; i < length; i ++) {
            randomFloatNumbers[i] = random.nextFloat(1);
        }
        int middleIndex = (length - 1) / 2;
        float middleNumber = randomFloatNumbers[middleIndex];

        //Вывод исходного массива
        printElements2("Исходный", randomFloatNumbers, middleIndex);

        //Проверка и обнуление значений
        int counter = 0;
        for (int i = 0; i < length; i ++) {
            if (randomFloatNumbers[i] > middleNumber) {
                randomFloatNumbers[i] = 0;
                counter++;
            }
        }

        //Вывод изменённого массива и количества обнуленных ячеек
        printElements2("Изменённый", randomFloatNumbers, middleIndex);
        System.out.println("Количество обнулённых ячеек: " + counter);
    }

    private static void printElements2(String word, float[] array, int index) {
        int length = array.length;
        System.out.println(word + " массив:");
        for (int i = 0; i < length; i ++) {
            if (i == 0) {
                System.out.printf("%s%.3f%s", "[", array[i], ", ");
            } else if (i == length - 1) {
                System.out.printf("%.3f%s", array[i], "]\n");
            } else if (i == index + 1) {
                System.out.printf("\n %.3f%s", array[i], ", ");
            } else {
                System.out.printf("%.3f%s", array[i], ", ");
            }
        }
    }

    private static void displayAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        int length = alphabet.length;
        int j = 0;
        for (int i = 65; i <= 90; i++) {
            alphabet[j++] = (char) i;
        }

        int quantityLetters = length;
        while (quantityLetters > 0) {
            for (int i = length; i > quantityLetters - 1; i--) {
                System.out.print(alphabet[i - 1]);
            }
            System.out.println();
            quantityLetters--;
        }
    }

    private static void fillArrayUniqueNumbers() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] randomIntegerNumbers = new int[30];
        int length = randomIntegerNumbers.length;
        Random random = new Random();
        boolean isUniqueNumber;
        for (int i = 0; i < length; i++) {
            isUniqueNumber = false;
            while (!isUniqueNumber) {
                int number = random.nextInt(60, 100);
                for (int num : randomIntegerNumbers) {
                    if (num == number) {
                        isUniqueNumber = false;
                        break;
                    } else {
                        isUniqueNumber = true;
                    }
                }
                if (isUniqueNumber) {
                    randomIntegerNumbers[i] = number;
                }
            }
        }

        // Сортировка массива
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (randomIntegerNumbers[j] > randomIntegerNumbers[j+1]) {
                    int max = randomIntegerNumbers[j+1];
                    randomIntegerNumbers[j+1] = randomIntegerNumbers[j];
                    randomIntegerNumbers[j] = max;
                }
            }
        }

        // Вывод массива по 10 элементов в строке
        for (int i = 0; i < length; i++) {
            System.out.print(randomIntegerNumbers[i] + " ");
            if (i == 9 || i == 19) {
                System.out.println();
            }
        }
    }

    private static void displayTextTypewriterEffect() throws InterruptedException {
        System.out.println("\n\n6. Вывод текста с эффектом пишущей машинки");
//        String text = "Чтобы написать чистый код, мы сначала пишем грязный код, " +
//                "затем рефакторим его.\n- Robert Martin";

        String text = "Java - это C++, из которого убрали все пистолеты, ножи и дубинки." +
                "\n- James Gosling";

        // Создание массива для поиска самого короткого и самого длинного слова
        String formattedText = text.replace(",", "");
        formattedText = formattedText.replace(".", "");
        formattedText = formattedText.replace("-", "");
        formattedText = formattedText.replace("\n", "");
        formattedText = formattedText.replace("  ", " ");
        String[] auxiliaryArray = formattedText.split(" ");

        // Поиск самого короткого и самого длинного слова
        String shortestWord = auxiliaryArray[0];
        String longestWord = auxiliaryArray[0];
        for (String word : auxiliaryArray) {
            if (shortestWord.length() > word.length()) {
                shortestWord = word;
            }
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }

        // Создание массива и изменение регистра в необходимом промежутке
        String[] arrayStrings = text.split(" ");
        boolean isBig = false;
        for (int i = 0; i < arrayStrings.length; i++) {
            if (!isBig && (arrayStrings[i].replace(",", "").equals(longestWord) ||
                    arrayStrings[i].equals(shortestWord))) {
                isBig = true;
                arrayStrings[i] = arrayStrings[i].toUpperCase();
                continue;
            }
            if (isBig) {
                arrayStrings[i] = arrayStrings[i].toUpperCase();
            }
            if (isBig && (arrayStrings[i].equals(longestWord.toUpperCase()) ||
                    arrayStrings[i].equals(shortestWord.toUpperCase()))) {
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
