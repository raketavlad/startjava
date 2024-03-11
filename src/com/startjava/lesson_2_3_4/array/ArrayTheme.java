package com.startjava.lesson_2_3_4.array;

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
        int[] naturalNumbers = new int[10];
        int length = naturalNumbers.length;
        for (int i = 0; i < length; i++) {
            naturalNumbers[i] = i;
        }
        int result = 1;
        int factorial = 1;
        while (factorial <= naturalNumbers[8]) {
            result *= naturalNumbers[factorial];
            String displayResult = "" + naturalNumbers[factorial];
            displayResult += (factorial != naturalNumbers[8]) ? " * " : " = " + result + "\n";
            System.out.print(displayResult);
            factorial++;
        }
    }

    private static void deleteArrayElements() {
        System.out.println("\n3. Удаление элементов массива");
        Random random = new Random();
        float[] randomFloatNumbers = new float[15];
        int length = randomFloatNumbers.length;
        for (int i = 0; i < length; i++) {
            randomFloatNumbers[i] = random.nextFloat(1);
        }
        int middleIndex = (length - 1) / 2;
        float middleNumber = randomFloatNumbers[middleIndex];

        //Вывод исходного массива
        printElements("Исходный", randomFloatNumbers, middleIndex);

        //Проверка и обнуление значений
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (randomFloatNumbers[i] > middleNumber) {
                randomFloatNumbers[i] = 0;
                counter++;
            }
        }

        //Вывод изменённого массива и количества обнуленных ячеек
        printElements("Изменённый", randomFloatNumbers, middleIndex);
        System.out.println("Количество обнулённых ячеек: " + counter);
    }

    private static void printElements(String word, float[] array, int index) {
        int length = array.length;
        System.out.print(word + " массив:\n[");
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                System.out.printf("%.3f%s", array[i], "]\n");
                break;
            } else if (i == index + 1) {
                System.out.printf("\n%s", " ");
            }
            System.out.printf("%.3f%s", array[i], ", ");
        }
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
        String auxiliaryText = "";
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
