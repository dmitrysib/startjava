package com.startjava.lesson_4.arrays;

import java.util.Scanner;

public class SumMult {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        int arraySum = 0, arrayMult = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();

            arraySum += array[i];
            arrayMult *= array[i];
        }

        System.out.print("[");
        for (int j : array) System.out.print(" " + j);
        System.out.println(" ]");

        System.out.println("Sum: " + arraySum + ", mult: " + arrayMult);

        scanner.close();
    }
}
