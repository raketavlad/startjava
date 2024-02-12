import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String continueCalculations = "yes";
        while (continueCalculations.equals("yes")) {
            System.out.print("Введите первое число: ");
            calc.setFirstNum(sc.nextInt());
            sc.nextLine();
            System.out.print("Введите знак математической операции: ");
            calc.setSign(sc.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setSecondNum(sc.nextInt());
            System.out.println(calc.calculate());
            sc.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? ");
                continueCalculations = sc.nextLine();
            } while (!continueCalculations.equals("yes") && !continueCalculations.equals("no"));
            System.out.println();
        }
    }
}