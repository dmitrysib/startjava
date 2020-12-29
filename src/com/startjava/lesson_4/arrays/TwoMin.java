package com.startjava.lesson_4.arrays;

public class TwoMin {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, true);

        int min1 = 0, min2 = 1;
        if (array[0] > array[1])
            min1 = 1; min2 = 0;

        for (int i = 2; i < array.length; i++)
            if (array[i] < array[min1]) {
                int buff = min1;
                min1 = i;
                if (array[buff] < array[min2])
                    min2 = buff;
            } else {
                if (array[i] < array[min2])
                    min2 = i;
            }

        System.out.println("Minimal elements " + array[min1] + " and " + array[min2]);
    }
}
