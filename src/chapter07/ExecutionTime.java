package chapter07;

import java.util.Arrays;

public class ExecutionTime {

    public static void main(String[] args) {
        //an array of integers filled with random numbers
        int[] numbers = new int[10000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }
        Arrays.sort(numbers);

        //this we will try to find
        int key = (int) (Math.random() * 100000);

        System.out.println(key);

        for (int i = 0; i < 10; i++) {
            long startTime = System.currentTimeMillis();
            linearSearch(key, numbers);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("linear search took " + executionTime + " ms to finish");

            startTime = System.currentTimeMillis();
            binarySearch(key, numbers);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("linear search took " + executionTime + " ms to finish");

            System.out.println("\n");
        }


    }

    private static int binarySearch(int key, int... array) {
        int lowIndex = 0;
        int highIndex = array.length - 1;
        int guessIndex = -1;

        while (lowIndex < highIndex) {
            guessIndex = (highIndex + lowIndex) / 2;
            if (array[guessIndex] == key)
                return guessIndex;
            else if (array[guessIndex] > key)
                highIndex = guessIndex - 1;
            else
                lowIndex = guessIndex + 1;
        }
        return - guessIndex - 1;
    }

    private static int linearSearch(int key, int... array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }
}
