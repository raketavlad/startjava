public class GuesNumber {

    public static int generateRandomNum() {
        int minValue = 1;
        int maxValue = 100;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        return randomValue;
    }

    public static void compareNums(Player player1, Player player2, String game) {
        int randomNum = generateRandomNum();
        Scanner sc = new Scanner(System.in);
        while (game.equals("yes")) {
            System.out.print(player1.getName() + " введите число: ");
            player1.setNumber(sc.nextInt());
            sc.nextLine();
            if (player1.getNumber() > randomNum) {
                System.out.println("Число " + player1.getNumber() +
                        " больше того, что загадал компьютер!");
            } else if (player1.getNumber() < randomNum) {
                System.out.println("Число " + player1.getNumber() +
                        " меньше того, что загадал компьютер!");
            } else {
                System.out.println("Игрок " + player1.getName() + " победил!");
                System.out.println();
                break;
            }

            System.out.print(player2.getName() + " введите число: ");
            player2.setNumber(sc.nextInt());
            sc.nextLine();
            if (player2.getNumber() > randomNum) {
                System.out.println("Число " + player2.getNumber() +
                        " больше того, что загадал компьютер!");
            } else if (player2.getNumber() < randomNum) {
                System.out.println("Число " + player2.getNumber() +
                        " меньше того, что загадал компьютер!");
            } else {
                System.out.println("Игрок " + player2.getName() + " победил!");
                System.out.println();
                break;
            }
        }
    }
}