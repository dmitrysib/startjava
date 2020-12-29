package com.startjava.lesson_4.arrays;

public class MaxEvenId {
    public static void main(String[] args) {
        int [] array = ArrayFill.fillArray(10, true);
        int maxElement = 0;
        for (int i = 2; i < 10; i+=2) {
            maxElement = Math.max(maxElement, array[i]);
        }
        System.out.println("Max element is " + maxElement);
    }
}
