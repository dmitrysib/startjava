package com.startjava.lesson_23.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        String answer;
        do {
            System.out.println("Введите первое число: ");
            int firstNumber = sc.nextInt();

            System.out.println("Введите знак математической операции: ");
            char operation = sc.next().charAt(0);

            System.out.println("Введите второе число: ");
            int secondNumber = sc.nextInt();

            System.out.println("Результат: " + calc.calculate(firstNumber, operation, secondNumber));

            answer = sc.nextLine();
            while(!answer.equals("да") && !answer.equals("нет")) {
                System.out.println("Хотите продолжить вычисления? [да/нет]: ");
                answer = sc.nextLine();
            }
        } while(answer.equals("да"));

        sc.close();
    }
}
