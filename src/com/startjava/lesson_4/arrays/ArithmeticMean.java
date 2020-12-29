package com.startjava.lesson_4.arrays;

public class ArithmeticMean {

    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, false);

        int arithmeticMean = 0, count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > 0) {
                arithmeticMean += array[i];
                count++;
            }

        System.out.println("Arithmetic mean is " + arithmeticMean/count);
    }
}
