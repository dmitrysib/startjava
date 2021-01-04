package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Имя первого игрока: ");
        Player firstPlayer = new Player(sc.nextLine());

        System.out.print("Имя второго игрока: ");
        Player secondPlayer = new Player(sc.nextLine());

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

        String answer;
        do {
            game.start();

            answer = "";
            while(!answer.equals("да") && !answer.equals("нет")) {
                System.out.println("Стартовать новую игру? [да/нет]:");
                answer = sc.nextLine();
            }
        } while(answer.equals("да"));

        sc.close();
    }
}
