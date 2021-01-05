package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    public static final int ATTEMPTS_NUMBER = 10;

    private Player firstPlayer;
    private Player secondPlayer;

    GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    void start() {
        firstPlayer.reset();
        secondPlayer.reset();

        printNumbers(firstPlayer);

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        Player current = secondPlayer;

        System.out.println("У вас 10 попыток");

        do {
            current = current.equals(firstPlayer) ? secondPlayer : firstPlayer;

            if (current.getAttempts() == ATTEMPTS_NUMBER) {
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

        printNumbers(firstPlayer);
        printNumbers(secondPlayer);
    }

    private void printNumbers(Player player) {
        System.out.print(player.getName() + "[");
        for (int j : Arrays.copyOf(player.getNumbers(), player.getAttempts()))
            System.out.print(" " + j);
        System.out.println("]");
    }
}
