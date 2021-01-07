package com.startjava.lesson_4.calculator;

import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            try {
                System.out.println("Результат: " + calc.calculate(sc.nextLine()));
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Математическое выражение должно выглядеть как \"Целое число<пробел>знак_математической_операции<пробел>Целое число\"");
            } catch (ArithmeticException e) {
                System.out.println("Деление на 0 недопустимо");
            } catch (Exception e) {
                System.out.println("Допустимый знак математической операции: \"+ - * / ^ %\"");
            }

            answer = "";
            while(!answer.equals("да") && !answer.equals("нет")) {
                System.out.println("Хотите продолжить вычисления? [да/нет]: ");
                answer = sc.nextLine();
            }
        } while(answer.equals("да"));

        sc.close();
    }
}