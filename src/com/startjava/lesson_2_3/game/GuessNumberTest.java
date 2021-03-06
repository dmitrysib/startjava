package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of first player: ");
        Player firstPlayer = new Player(sc.nextLine());

        System.out.print("Enter name of second player: ");
        Player secondPlayer = new Player(sc.nextLine());

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

        String answer;
        do {
            game.start();

            answer = "";
            while(!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Continue game? [yes/no]:");
                answer = sc.nextLine();
            }
        } while(answer.equals("yes"));

        sc.close();
    }
}
