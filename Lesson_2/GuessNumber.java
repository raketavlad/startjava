import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public static int generateRandomNumber() {
        return 1 + (int) (Math.random() * 100);
    }

    public void play() {
        int randomNumber = generateRandomNumber();
        while (true) {
            if (enterAndCheckNumber(player1, randomNumber)) {
                break;
            }
            if (enterAndCheckNumber(player2, randomNumber)) {
                break;
            }
        }
    }

    public boolean enterAndCheckNumber(Player player, int randomNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.print(player.getName() + " введите число: ");
        player.setNumber(sc.nextInt());
        sc.nextLine();
        if (player.getNumber() > randomNumber) {
            System.out.println("Число " + player.getNumber() +
                    " больше того, что загадал компьютер!");
        } else if (player.getNumber() < randomNumber) {
            System.out.println("Число " + player.getNumber() +
                    " меньше того, что загадал компьютер!");
        } else {
            System.out.println("Игрок " + player.getName() + " победил!");
            System.out.println();
            return true;
        }
        return false;
    }
}