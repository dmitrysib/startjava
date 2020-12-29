package com.startjava.lesson_4.arrays;

public class AbsMin {

    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, false);

        int absMinIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (ArrayFill.mod(array[i]) < ArrayFill.mod(array[absMinIndex]))
                absMinIndex = i;
        }
        System.out.println("Minimal mod index: " + absMinIndex);
    }
}
