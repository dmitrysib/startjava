package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;
    private int attempts;

    public Player(String name) {
        this.name = name;
        numbers = new int[GuessNumber.ATTEMPTS_NUMBER];
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

    public int[] getNumbers() {
        return numbers;
    }

    public void reset() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}