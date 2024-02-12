public class Calculator {

    private int firstNum;
    private int secondNum;
    private char sign;

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        if (firstNum > 0) {
            this.firstNum = firstNum;
        } else {
            System.out.println("Калькулятор принимает только целые положительные числа!");
        }
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        if (secondNum > 0) {
            this.secondNum = secondNum;
        } else {
            System.out.println("Калькулятор принимает только целые положительные числа!");
        }
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public String calculate() {
        int result = 1;
        switch (sign) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            case '^':
                for (int i = 0; i < secondNum; i++) {
                    result *= firstNum;
                }
                break;
            case '%':
                result = firstNum % secondNum;
                break;
            default:
                return "Введенная математическая операция не поддерживается!";
        }
        return "Результат вычисления равен: " + result;
    }
}