package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    static final int NUMBER_ATTEMPTS = 10;

    private Player firstPlayer;
    private Player secondPlayer;

    GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    void start() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        Player currentPlayer = secondPlayer;

        System.out.println("У вас 10 попыток");

        do {
            currentPlayer = currentPlayer.equals(firstPlayer) ? secondPlayer : firstPlayer;

            System.out.print("\nИгрок " + currentPlayer.getName() + ", назовите свой вариант: ");
            currentPlayer.setNumber(sc.nextInt());

            if(currentPlayer.getNumber() == randomNum) {
                System.out.println("Игрок " + currentPlayer.getName() + " угадал число " + randomNum + " с " + currentPlayer.getAttempts() + " попытки");
                break;
            }

            String message = currentPlayer.getNumber() > randomNum ? "больше" : "меньше";
            System.out.println("ваше число " + message);

            if (currentPlayer.getAttempts() == NUMBER_ATTEMPTS) {
                System.out.println("\nУ " + currentPlayer.getName() + " закончились попытки");
                break;
            }
        } while(true);

        printNumbers(firstPlayer);
        printNumbers(secondPlayer);

        firstPlayer.reset();
        secondPlayer.reset();
    }

    private void printNumbers(Player player) {
        System.out.print(player.getName() + "[");
        for (int number : player.getNumbers())
            System.out.print(" " + number);
        System.out.println("]");
    }
}