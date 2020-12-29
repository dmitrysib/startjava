package com.startjava.lesson_4.arrays;

import java.util.Objects;

public class MinMax {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, true);

        int min = 0, max = 0;
        for (int i = 0; i < Objects.requireNonNull(array).length; i++) {
            if (array[min] > array[i]) min = i;
            if (array[max] < array[i]) max = i;
        }

        System.out.println("Change " + min + " to " + max);

        int temp = array[max];
        array[max] = array[min];
        array[min] = temp;

        System.out.print("[");
        for (int j : array) System.out.print(" " + j);
        System.out.println(" ]");
    }
}
