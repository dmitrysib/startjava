package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            System.out.println("Результат: " + calc.calculate(sc.nextLine()));

            answer = "";
            while(!answer.equals("да") && !answer.equals("нет")) {
                System.out.println("Хотите продолжить вычисления? [да/нет]: ");
                answer = sc.nextLine();
            }
        } while(answer.equals("да"));

        sc.close();
    }
}
