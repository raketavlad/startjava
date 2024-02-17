import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String continuationCalculations = "yes";
        while (continuationCalculations.equals("yes")) {
            System.out.print("Введите первое число: ");
            calc.setNum1(sc.nextInt());
            sc.nextLine();
            System.out.print("Введите знак математической операции: ");
            calc.setSign(sc.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setNum2(sc.nextInt());
            if (Double.isNaN(calc.calculate())) {
                System.out.println("Введенная математическая операция не поддерживается!");
            } else {
                System.out.println("Результат вычисления равен: " + calc.calculate());
            }
            sc.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? ");
                continuationCalculations = sc.nextLine();
            } while (!continuationCalculations.equals("yes") &&
                    !continuationCalculations.equals("no"));
            System.out.println();
        }
    }
}