package com.startjava.lesson_2_3_4.array;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) throws InterruptedException {
        reverseArrayValues();
        calculateFactorial();
        deleteArrayElements();
        printAlphabet();
        fillArrayUniqueNumbers();
        displayTextTypewriterEffect();
    }

    private static void reverseArrayValues() {
        System.out.println("1. Реверс значений массива");
        int[] naturalNumbers = {1, 7, 4, 5, 2, 6, 3};
        int length = naturalNumbers.length;
        printElements(naturalNumbers, "До");
        for (int i = 0; i <= length / 2; i++) {
            int swap = naturalNumbers[i];
            naturalNumbers[i] = naturalNumbers[--length];
            naturalNumbers[length] = swap;
        }
        printElements(naturalNumbers, "После");
    }

    private static void printElements(int[] array, String state) {
        int length = array.length;
        System.out.print(state + " реверса: [");
        for (int i = 0; i < length; i++) {
            String indexControl = (i == length - 1) ? "]\n" : ", ";
            System.out.print(array[i] + indexControl);
        }
    }

    private static void calculateFactorial() {
        System.out.println("\n2. Вычисление факториала");
        int[] multipliersFactorial = new int[10];
        int length = multipliersFactorial.length;
        for (int i = 0; i < length; i++) {
            multipliersFactorial[i] = i;
        }
        int result = 1;
        int multiplierFactorial = length - 2;
        for (int i = 1; i <= multiplierFactorial; i ++) {
            result *= multipliersFactorial[i];
            String displayResult = "" + multipliersFactorial[i];
            displayResult += (multipliersFactorial[i] < multiplierFactorial) ? " * " : " = " + result + "\n";
            System.out.print(displayResult);
        }
    }

    private static void deleteArrayElements() {
        System.out.println("\n3. Удаление элементов массива");
        Random random = new Random();
        float[] randomNumbers = new float[15];
        int length = randomNumbers.length;
        for (int i = 0; i < length; i++) {
            randomNumbers[i] = random.nextFloat(1);
        }
        int middleIndex = (length - 1) / 2;
        float middleNumber = randomNumbers[middleIndex];

        //Вывод исходного массива
        printElements("Исходный", randomNumbers, middleIndex);

        //Проверка и обнуление значений
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (randomNumbers[i] > middleNumber) {
                randomNumbers[i] = 0;
                counter++;
            }
        }

        //Вывод изменённого массива и количества обнуленных ячеек
        printElements("Изменённый", randomNumbers, middleIndex);
        System.out.println("Количество обнулённых ячеек: " + counter);
    }

    private static void printElements(String word, float[] array, int index) {
        int length = array.length;
        System.out.print(word + " массив:\n[");
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f", array[i]);
            if (i != index && i != length - 1) {
                System.out.print(", ");
            } else if (i == index) {
                System.out.printf("\n%s", " ");
            }
        }
        System.out.println("]");
    }

    private static void printAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        int length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
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
        int[] uniqueNumbers = new int[30];
        int length = uniqueNumbers.length;
        Random random = new Random();
        boolean isUniqueNumber;
        for (int i = 0; i < length; i++) {
            isUniqueNumber = false;
            while (!isUniqueNumber) {
                int number = random.nextInt(60, 100);
                for (int value : uniqueNumbers) {
                    if (value == number) {
                        isUniqueNumber = false;
                        break;
                    }
                    isUniqueNumber = true;
                }
                if (isUniqueNumber) {
                    uniqueNumbers[i] = number;
                }
            }
        }

        // Сортировка массива
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (uniqueNumbers[j] > uniqueNumbers[j + 1]) {
                    int maximum = uniqueNumbers[j + 1];
                    uniqueNumbers[j + 1] = uniqueNumbers[j];
                    uniqueNumbers[j] = maximum;
                }
            }
        }

        // Вывод массива по 10 элементов в строке
        for (int i = 0; i < length; i++) {
            System.out.print(uniqueNumbers[i] + " ");
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
        String formattedText = text.replaceAll("[-.,\n]", "");
        formattedText = formattedText.replaceAll("\\s+", " ");
        String[] onlyWords = formattedText.split(" ");

        // Поиск самого короткого и самого длинного слова
        String shortestWord = onlyWords[0];
        String longestWord = onlyWords[0];
        for (String word : onlyWords) {
            if (shortestWord.length() > word.length()) {
                shortestWord = word;
            }
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }

        // Создание массива и изменение регистра в необходимом промежутке
        String[] wordsAndSymbols = text.split(" ");
        boolean isBig = false;
        for (int i = 0; i < wordsAndSymbols.length; i++) {
            if (wordsAndSymbols[i].replace(",", "").equals(longestWord) ||
                    wordsAndSymbols[i].equals(shortestWord)) {
                isBig = !isBig;
            }
            if (isBig || (wordsAndSymbols[i].replace(",", "").equals(longestWord) ||
                    wordsAndSymbols[i].equals(shortestWord))) {
                wordsAndSymbols[i] = wordsAndSymbols[i].toUpperCase();
            }
        }

        // Создание строки из массива
        String auxiliaryText = "";
        for (String word : wordsAndSymbols) {
            word += " ";
            auxiliaryText += word;
        }

        // Создание массива для каждого символа
        char[] textByCharacters = new char[auxiliaryText.length()];
        for (int i = 0; i < auxiliaryText.length(); i++) {
            textByCharacters[i] = auxiliaryText.charAt(i);
        }

        // Вывод текста по символам
        for (char symbol : textByCharacters) {
            System.out.print(symbol);
            Thread.sleep(100);
        }
    }
}