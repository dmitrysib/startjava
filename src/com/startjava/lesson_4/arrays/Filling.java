package com.startjava.lesson_4.arrays;

import java.util.Scanner;

public class Filling {
    public static void main(String[] args) {
        int[] randomArray = ArrayFill.fillArray(10, true);
        Scanner scanner = new Scanner(System.in);

        int[] fillingArray = new int[10];
        int[] userArray = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("userArray[" + i + "] = ");
            userArray[i] = scanner.nextInt();
            fillingArray[i] = userArray[i] + randomArray[i];
        }

        System.out.print("Random array: [");
        for (int j : randomArray) System.out.print(" " + j);
        System.out.println(" ]");

        System.out.print("User array: [");
        for (int j : userArray) System.out.print(" " + j);
        System.out.println(" ]");

        System.out.print("Filling array: [");
        for (int j : fillingArray) System.out.print(" " + j);
        System.out.println(" ]");

        scanner.close();
    }
}
