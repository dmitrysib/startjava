package com.startjava.lesson_4.arrays;

import java.util.Scanner;

public class ZipZero {

    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, true);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Удаляемый диапазон");
        System.out.print("нижняя граница: ");
        int l = scanner.nextInt();
        System.out.print("верхняя граница: ");
        int h = scanner.nextInt();

        int i = 0, m = array.length;

        while (i < m) {
            if (array[i] >= l && array[i] <= h) {
                array = ArrayFill.removeTheElement(array, i);
                m -= 1;
            } else
                i++;
        }

        if (array.length < 10) {
            int[] anotherArray = new int[10];
            for (i = 0; i < 10; i++)
                anotherArray[i] = i < array.length? array[i] : 0;
            array = anotherArray;
        }

        System.out.print("[");
        for (i = 0; i < array.length; i++)
            System.out.print(" " + array[i]);
        System.out.println("]");
    }
}
