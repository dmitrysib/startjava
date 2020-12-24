import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator cl = new Calculator();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Введите первое число: ");
            int firstNumber = sc.nextInt();

            System.out.println("Введите знак математической операции: ");
            char operation = sc.next().charAt(0);

            System.out.println("Введите второе число: ");
            int secondNumber = sc.nextInt();

            System.out.println("Результат: " + cl.mathOperation(operation, firstNumber, secondNumber));

            if(prompt(sc) == false) {
                break;
            }
        }
    }

    public static boolean prompt(Scanner sc) {
        sc.nextLine();

        while(true) {
            System.out.println("Хотите продолжить вычисления? [да/нет]: ");
            String answer = sc.nextLine();

            if(answer.equals("да")) {
                return true;
            } else if(answer.equals("нет")) {
                return false;
            }
        }
    }
}
