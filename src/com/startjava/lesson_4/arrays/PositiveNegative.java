package com.startjava.lesson_4.arrays;

import java.util.Random;

public class PositiveNegative {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        int zeroCount = 0, posCount = 0, negCount = 0;
        for (int i = 0; i < 20; i++) {
            array[i] = 4 - random.nextInt(10);

            if (array[i] > 0) posCount++;
            else if (array[i] < 0) negCount++;
            else zeroCount++;
        }

        System.out.print("[");
        for (int j : array) System.out.print(" " + j);
        System.out.println(" ]");

        System.out.println("Zero: " + zeroCount + ", positives: " + posCount + ", negatives: " + negCount);
    }
}
