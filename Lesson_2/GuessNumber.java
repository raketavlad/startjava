import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public static int generateRandomNum() {
        return 1 + (int) (Math.random() * 100);
    }

    public void play(String game) {
        int randomNum = generateRandomNum();
        Scanner sc = new Scanner(System.in);
        while (true) {
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