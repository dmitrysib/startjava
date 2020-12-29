package com.startjava.lesson_4.arrays;

public class EvenArray {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, true);

        int m = 0;
        int[] indexes = new int[array.length];

        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0) indexes[m++] = i;

        for (int i = 0; i < m; i++)
            System.out.print(" " + indexes[i]);
    }
}
