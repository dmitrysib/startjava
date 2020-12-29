package com.startjava.lesson_4.arrays;

import java.util.Scanner;

public class ShiftArray {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, true);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите направление и число шагов смещения: ");
        int shift  = scanner.nextInt();

        while (shift != 0) {
            if (shift > 0) {
                for (int i = array.length - 1; i > 0; i--)
                    array[i] = array[i - 1];
                array[0] = 0;
                shift--;
            } else {
                for (int i = 0; i < array.length - 1; i++)
                    array[i] = array[i + 1];
                array[array.length - 1] = 0;
                shift++;
            }

            System.out.print("[");
            for (int j : array) System.out.print(" " + j);
            System.out.println(" ]");
        }
    }
}
