package com.startjava.lesson_4.calculator;

class Calculator {

    int calculate(String mathExpression) {
        String[] parts = mathExpression.split(" ");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);

        return switch (parts[1].charAt(0)) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> (int) Math.pow(a, b);
            case '%' -> a % b;
            default -> throw new ArithmeticException();
        };
    }
}