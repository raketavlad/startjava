public class Calculator {
    public static void main(String[] args) {
        // компьютер загадывает число
        int minValue = 1;
        int maxValue = 100;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));

        // число игрока
        int playerNum = 51;
        boolean isCorrectNum = false;
        // алгоритм
        while (!isCorrectNum)
            if (randomValue < playerNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum -= 3;
            } else if (randomValue > playerNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum += 2;
            } else {
                System.out.println("Вы победили!");
                isCorrectNum = true;
            }
    }
}
