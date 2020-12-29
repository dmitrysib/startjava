package com.startjava.lesson_4.arrays;

public class MultipleClass {
    public static void main(String[] args) {
        int[] multiple = new int[8];

        for (int i = 0; i < 8; i++) {
            int num = i + 2;
            int result = 0;

            for (int j = 2; j < 100; j++) {
                if (j % num == 0)
                    result++;
            }
            multiple[i] = result;
        }

        System.out.print("[");
        for (int j : multiple) System.out.print(" " + j);
        System.out.println(" ]");
    }
}
