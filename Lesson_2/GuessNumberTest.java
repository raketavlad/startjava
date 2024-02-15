import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(sc.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(sc.nextLine());
        String game = "yes";
        while (game.equals("yes")) {
            int randomNum = GuesNumber.generateRandomNum();
            while (player1.getNumber() != randomNum && player2.getNumber() != randomNum) {
                System.out.print(player1.getName() + " введите число: ");
                player1.setNumber(sc.nextInt());
                sc.nextLine();
                GuesNumber.compareNums(player1, randomNum);
                if (player1.getNumber() == randomNum) {
                    break;
                }
                System.out.print(player2.getName() + " введите число: ");
                player2.setNumber(sc.nextInt());
                sc.nextLine();
                GuesNumber.compareNums(player2, randomNum);
                if (player2.getNumber() == randomNum) {
                    break;
                }
            }
            do {
                System.out.print("Хотите продолжить игру? ");
                game = sc.nextLine();
            } while (!game.equals("yes") && !game.equals("no"));
        }
    }
}