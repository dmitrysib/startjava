package com.startjava.lesson_4.arrays;

import java.util.Scanner;

public class ArrayInsert {
    public static final int ELEMENTS = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[ELEMENTS];
        for (int i = 0; i < ELEMENTS - 1; i++) {
            System.out.print("Введите значение для индекса " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Введите значение: ");
        int value = scanner.nextInt();
        System.out.print("и позицию: ");
        int pos = scanner.nextInt();

        for (int i = array.length - 1; i > pos; i--)
            array[i] = array[i - 1];
        array[pos] = value;

        System.out.print("[");
        for (int j : array) System.out.print(" " + j);
        System.out.println(" ]");

        scanner.close();
    }
}
