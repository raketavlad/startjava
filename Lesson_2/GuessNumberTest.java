import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(sc.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(sc.nextLine());
        String continuation = "yes";
        GuessNumber game = new GuessNumber(player1, player2);
        while (continuation.equals("yes")) {
            game.play();
            do {
                System.out.print("Хотите продолжить игру? ");
                continuation = sc.nextLine();
            } while (!continuation.equals("yes") && !continuation.equals("no"));
        }
    }
}