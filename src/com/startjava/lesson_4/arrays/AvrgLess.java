package com.startjava.lesson_4.arrays;

public class AvrgLess {
    public static void main(String[] args) {
        int [] array = ArrayFill.fillArray(10, true);

        float avrg = 0;
        for (int i = 0; i < array.length; i++)
            avrg += array[i];
        avrg /= array.length;

        System.out.println("Avrg is " + avrg);

        for (int i = 0; i < array.length; i++)
            if (array[i] < avrg)
                System.out.println("array[" + i + "] = " + array[i]);
    }
}
