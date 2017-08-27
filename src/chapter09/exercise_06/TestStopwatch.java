package chapter09.exercise_06;

import chapter07.SelectionSort;

import java.util.Random;

public class TestStopwatch {
    public static void main(String[] args) {
        Random random = new Random(300);
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        Stopwatch stopwatch = new Stopwatch();
        SelectionSort.sortArrayAscendingFromEnd(array);
        stopwatch.stop();

        System.out.println(stopwatch.getElapsedTime());
    }
}
