package com.startjava.lesson_4.arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, true);

        int max = 0;
        for (int i = 0; i < array.length; i++)
            if (array[max] < array[i]) max = i;

        System.out.println("Max element: array[" + max + "] = " + array[max]);
    }
}
