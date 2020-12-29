package com.startjava.lesson_4.arrays;

public class UniqueItems {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, true);

        for (int i = 0; i < array.length; i++) {
            int f = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j)  {
                    f = 0;
                    break;
                }
            }

            if (f == 1) System.out.print(" " + array[i]);
        }
    }
}
