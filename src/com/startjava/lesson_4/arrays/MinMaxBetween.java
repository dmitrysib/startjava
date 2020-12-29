package com.startjava.lesson_4.arrays;

public class MinMaxBetween {

    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, true);

        int min = 0, max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min])
                min = i;

            if (array[max] < array[i])
                max = i;
        }

        int sum = 0;
        for (int i = Math.min(min, max) + 1; i < Math.max(min, max); i++)
            sum += array[i];

        System.out.println("Sum between: " + sum);
    }
}
