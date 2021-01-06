package com.startjava.lesson_4.calculator;

public class Calculator {

    public int calculate(String mathExpression) {
        String[] parts = mathExpression.split(" ");
        if (parts.length != 3) {
            return showError();
        }

        if (!isInteger(parts[0]) || !isInteger(parts[2])) {
            return showError();
        }

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);

        return switch (parts[1].charAt(0)) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> (int) Math.pow(a, b);
            case '%' -> a % b;
            default -> showError();
        };
    }

    private int showError() {
        System.out.println("Математическое выражение должно выглядеть как \"Число<пробел>знак_математической_операции<пробел>Число\"");
        System.out.println("Допустимый знак математической операции: \"+ - * / ^ %\"");
        return 0;
    }

    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str.trim());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
