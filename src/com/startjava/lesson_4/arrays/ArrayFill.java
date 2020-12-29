package com.startjava.lesson_4.arrays;

import java.util.Random;

public class ArrayFill {
    public static final int MAXNUMBER = 100;

    public static int [] fillArray(int elements, boolean positive) {
        if (elements <= 0)
            return null;

        int [] array = new int[elements];
        Random random = new Random();
        System.out.print("[");
        for (int i = 0; i < elements; i++) {
            array[i] = positive ? random.nextInt(MAXNUMBER) + 1 : MAXNUMBER / 2 - random.nextInt(MAXNUMBER) + 1;
            System.out.print(" " + array[i]);
        }
        System.out.println(" ]");
        return array;
    }

    public static int[] removeTheElement(int[] array, int index) {
        if (array == null || index < 0 || index >= array.length)
            return array;

        int[] anotherArray = new int[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index)
                continue;

            anotherArray[k++] = array[i];
        }
        return anotherArray;
    }

    public static int mod(int value) {
        return value < 0 ? value * -1 : value;
    }
}
