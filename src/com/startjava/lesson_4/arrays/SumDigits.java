package com.startjava.lesson_4.arrays;

public class SumDigits {

    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(3, true);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        System.out.println("Final result: " + sum);
    }
}
