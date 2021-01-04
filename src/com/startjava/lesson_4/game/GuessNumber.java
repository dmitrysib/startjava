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

        do {
            current = current.equals(firstPlayer) ? secondPlayer : firstPlayer;
            System.out.print("\nИгрок " + current.getName() + ", назовите свой вариант: ");
            current.setNumber(sc.nextInt());

            if(current.getNumber() == randomNum) {
                System.out.println("Игрок " + current.getName() + " угадал число " + randomNum + " с " + current.getAttempts() + " попытки");
                break;
            }

            String message = current.getNumber() > randomNum ? "больше" : "меньше";
            System.out.println("ваше число " + message);

        } while(current.getAttempts() < attemptsNumber);

        if (current.getAttempts() == attemptsNumber) {
            System.out.println("\nУ " + current.getName() + " закончились попытки");
        }

        firstPlayer.printNumbers();
        secondPlayer.printNumbers();
    }
}
