import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(sc.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(sc.nextLine());
        String game = "yes";

        do {
            GuesNumber.compareNums(player1, player2, game);
            System.out.print("Хотите продолжить игру? ");
            game = sc.nextLine();
        } while (game.equals("yes") || !game.equals("no"));
    }
}