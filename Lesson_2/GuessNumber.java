public class GuesNumber {

    public static void compareNums(Player player, int randomNum) {
        if (player.getNumber() > randomNum) {
            System.out.println("Число " + player.getNumber() +
                    " больше того, что загадал компьютер!");
        } else if (player.getNumber() < randomNum) {
            System.out.println("Число " + player.getNumber() +
                    " меньше того, что загадал компьютер!");
        } else {
            System.out.println("Игрок " + player.getName() + " победил!");
            System.out.println();
        }
    }

    public static int generateRandomNum() {
        int minValue = 1;
        int maxValue = 100;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        return randomValue;
    }
}