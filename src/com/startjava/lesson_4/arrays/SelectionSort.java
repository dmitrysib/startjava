package com.startjava.lesson_4.arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(20, true);

        int m = array.length;
        do {
            int max = 0;
            for (int i = 0; i < m; i++)
                if (array[max] < array[i])
                    max = i;

            int temp = array[m - 1];
            array[m - 1] = array[max];
            array[max] = temp;

            m--;
        } while(m > 0);

        System.out.print("[");
        for (int j : array) System.out.print(" " + j);
        System.out.println(" ]");
    }
}
