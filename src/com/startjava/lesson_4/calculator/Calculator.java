package com.startjava.lesson_4.calculator;

public class Calculator {

    public int usage() {
        System.out.println("Математическое выражение должно выглядеть как \"Число<пробел>знак_математической_операции<пробел>Число\"");
        System.out.println("Допустимый знак математической операции: \"+ - * / ^ %\"");
        return 0;
    }

    public int calculate(String mathString) {
        String[] parts = mathString.split(" ");
        if (parts.length != 3) {
            return usage();
        }

        int a, b;
        try {
            a = Integer.parseInt(parts[0].trim());
        }
        catch (NumberFormatException nfe) {
            return usage();
        }
        try {
            b = Integer.parseInt(parts[2].trim());
        }
        catch (NumberFormatException nfe) {
            return usage();
        }

        return switch (parts[1].charAt(0)) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> (int) Math.pow(a, b);
            case '%' -> a % b;
            default -> usage();
        };
    }
}
