package com.startjava.lesson_4.arrays;

import java.util.Random;

public class AbsMax {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 0;
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(30) - 15;
            if (max < array[i]) max = array[i];
        }

        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (ArrayFill.mod(array[i]) > max) count++;

        System.out.println("max element: " + max + ", elements count: " + count);

        System.out.print("[");
        for (int j : array) System.out.print(" " + j);
        System.out.println(" ]");
    }
}
