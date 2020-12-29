package com.startjava.lesson_4.arrays;

import java.util.Random;

public class MaxModulus {
    public static final int ELEMENTS = 20;
    public static final int MAXNUMBER = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[ELEMENTS];

        int i = 0;
        while (i < ELEMENTS) {
            int number = MAXNUMBER / 2 - random.nextInt(MAXNUMBER) + 1;
            boolean found = false;

            for (int j = 0; j < i; j++)
                if (ArrayFill.mod(array[j]) == ArrayFill.mod(number)) {
                    found = true;
                    break;
                }

            if (!found) {
                array[i++] = number;
            }
        }

        System.out.print("[");
        for (int j : array) System.out.print(" " + j);
        System.out.println(" ]");

        int max = 0;
        for (i = 0; i < array.length; i++)
            if (ArrayFill.mod(array[i]) > ArrayFill.mod(array[max]))
                max = i;

        System.out.println("Maximal modulus element array[" + max + "] = " + array[max]);
    }
}
