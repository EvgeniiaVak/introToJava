package chapter07;

/*
* (Count single digits) Write a program that generates 100 random integers
* between 0 and 9 and displays the count for each number.
* (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
* */

public class SingleDigitCounter {
    public static void main(String[] args) {
        int[] digitsCounter = new int[10];

        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 10);
            digitsCounter[number]++;
        };

        for (int i = 0; i < digitsCounter.length; i++) {
            System.out.printf("there are %3d of number %d%n", digitsCounter[i], i);
        }
    }
}
