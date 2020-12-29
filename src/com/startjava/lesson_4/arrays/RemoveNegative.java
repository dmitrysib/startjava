package com.startjava.lesson_4.arrays;

public class RemoveNegative {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(20, false);

        int i = 0, m = array.length;
        while (i < m) {
            if (array[i] < 0) {
                m -= 1;
                for (int j = i; j < m; j++)
                    array[j] = array[j + 1];
            } else
                i++;
        }

        System.out.print("[");
        for (i = 0; i < m; i++)
            System.out.print(" " + array[i]);
        System.out.print(" ]");
    }
}
