public class Calculator {

    public int calculate(int firstNumber, char operation, int secondNumber) {
        switch(operation) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
            case '%':
                return firstNumber % secondNumber;
        }

        System.out.println("Неправильный знак математической операции");
        return 0;
    }
}
