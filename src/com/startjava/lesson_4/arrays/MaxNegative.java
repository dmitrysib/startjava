package com.startjava.lesson_4.arrays;

public class MaxNegative {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(20, false);

        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min == 0 && array[i] < 0) min = i;
            if (array[i] < 0 && array[min] < array[i]) min = i;
        }

        System.out.println("Max negative element: array[" + min + "] = " + array[min]);
    }
}
