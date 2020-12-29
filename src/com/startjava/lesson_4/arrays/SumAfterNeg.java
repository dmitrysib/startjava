package com.startjava.lesson_4.arrays;

public class SumAfterNeg {

    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(10, false);

        int sum = 0;
        boolean neg = false;
        for (int i = 0; i < array.length; i++) {
            if (neg == false && array[i] < 0) {
                neg = true;
                continue;
            }

            if (neg)
                sum += array[i] < 0 ? array[i] * -1 : array[i];
        }

        System.out.println("Summ after first negative: " + sum);
    }
}
