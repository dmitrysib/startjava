package com.startjava.lesson_4.arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(11, true);

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.print("[");
        for (int j : array) System.out.print(" " + j);
        System.out.println(" ]");
    }
}
