package com.startjava.lesson_4.arrays;

public class MostFrequent {
    public static void main(String[] args) {
        int[] array = ArrayFill.fillArray(20, true);

        int number = array[0], maxFrequent = 1;
        for (int i = 0, frequent = 1; i < array.length - 1; i++) {
            for (int k = i + 1; k < array.length; k++)
                if (array[i] == array[k]) frequent+= 1;

            if (frequent > maxFrequent) {
                maxFrequent = frequent;
                number = array[i];
            }
        }

        if (maxFrequent > 1)
            System.out.println("Max frequent " + maxFrequent + " / " + number);
    }
}
