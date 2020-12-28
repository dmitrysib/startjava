package com.startjava.lesson_1.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = sc.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = sc.nextInt();

        System.out.println("Enter operation (+, -, *, /, ^, %):");
        char operation = sc.next().charAt(0);

        float result = -1;
        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            result = firstNumber / secondNumber;
        } else if (operation == '%') {
            result = firstNumber % secondNumber;
        } else if (operation == '^') {
            result = firstNumber;
            for (int i = 1; i < secondNumber; i++) {
                result *= firstNumber;
            }
        }

        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
    }
}
