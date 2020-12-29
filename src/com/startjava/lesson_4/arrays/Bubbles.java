package com.startjava.lesson_4.arrays;

public class Bubbles {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(20, true);

        int m = array.length;
        do {
            for (int i = 0; i < m - 1; i++)
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            m--;
        } while (m > 0);

        System.out.print("[");
        for (int j : array) System.out.print(" " + j);
        System.out.println(" ]");
    }
}
