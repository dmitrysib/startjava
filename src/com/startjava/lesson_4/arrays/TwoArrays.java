package com.startjava.lesson_4.arrays;

public class TwoArrays {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, false);

        int[] arrayPos = new int[array.length];
        int[] arrayNeg = new int[array.length];

        int pi = 0, ni = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > 0) arrayPos[pi++] = array[i];
            else if (array[i] < 0) arrayNeg[ni++] = array[i];

        System.out.print("[");
        for (int i = 0; i < pi; i++)
            System.out.print(" " + arrayPos[i]);
        System.out.println(" ]");

        System.out.print("[");
        for (int i = 0; i < ni; i++)
            System.out.print(" " + arrayNeg[i]);
        System.out.print(" ]");
    }
}
