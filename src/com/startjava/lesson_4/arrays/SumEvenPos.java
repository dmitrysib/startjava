package com.startjava.lesson_4.arrays;

public class SumEvenPos {

    public static void main(String[] args) {
        int [] array = ArrayFill.fillArray(10, false);
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0 && array[i] % 2 == 0)
                result += array[i];
        }
        System.out.println("Result: " + result);
    }
}
