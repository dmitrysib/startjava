package com.startjava.lesson_4.game;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;
    private int attempts = 0;

    public Player(String name) {
        this.name = name;
        numbers = new int[GuessNumber.attemptsNumber];
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        numbers[attempts++] = number;
    }

    public int getNumber() {
        return numbers[attempts - 1];
    }

    public int getAttempts() {
        return attempts;
    }

    public void reset() {
        Arrays.fill(numbers, 0);
        attempts = 0;
    }

    public void printNumbers() {
        System.out.print(name + "[");
        for (int j : Arrays.copyOf(numbers, attempts))
            System.out.print(" " + j);
        System.out.println("]");
    }
}
