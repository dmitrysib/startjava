package com.startjava.lesson_4.calculator;

public class Calculator {

    public int calculate(String mathExpression) {
        String[] parts = mathExpression.split(" ");
        if (parts.length != 3)
            return wrongMathExpression();

        if (NonInteger(parts[0]) || NonInteger(parts[2]))
            return wrongMathExpression();

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);

        return switch (parts[1].charAt(0)) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> (int) Math.pow(a, b);
            case '%' -> a % b;
            default -> wrongMathExpression();
        };
    }

    private int wrongMathExpression() {
        System.out.println("Математическое выражение должно выглядеть как \"Число<пробел>знак_математической_операции<пробел>Число\"");
        System.out.println("Допустимый знак математической операции: \"+ - * / ^ %\"");
        return 0;
    }

    private boolean NonInteger(String str) {
        try {
            Integer.parseInt(str.trim());
        } catch (NumberFormatException nfe) {
            return true;
        }
        return false;
    }
}
