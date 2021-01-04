package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    public static final int attemptsNumber = 10;

    private final Player firstPlayer;
    private final Player secondPlayer;

    GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    void start() {

        firstPlayer.reset();
        secondPlayer.reset();

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        Player current = secondPlayer;

        System.out.println("У вас 10 попыток");

        do {
            current = current.equals(firstPlayer) ? secondPlayer : firstPlayer;

            if (current.getAttempts() == attemptsNumber) {
                System.out.println("\nУ " + current.getName() + " закончились попытки");
                break;
            }

            System.out.print("\nИгрок " + current.getName() + ", назовите свой вариант: ");
            current.setNumber(sc.nextInt());

            if(current.getNumber() == randomNum) {
                System.out.println("Игрок " + current.getName() + " угадал число " + randomNum + " с " + current.getAttempts() + " попытки");
                break;
            }

            String message = current.getNumber() > randomNum ? "больше" : "меньше";
            System.out.println("ваше число " + message);

        } while(true);

        firstPlayer.printNumbers();
        secondPlayer.printNumbers();
    }
}
