public class Calculator {
    //+, -, *, /, ^, %
    public int mathOperation(char operation, int firstNumber, int secondNumber) {
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
            default:
                System.out.println("Неправильный знак математической операции");
                return -1;
        }
    }
}
