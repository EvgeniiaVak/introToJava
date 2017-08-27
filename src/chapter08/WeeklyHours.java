package chapter08;

import utility.ArrayKeeper;
import utility.InputReader;

import java.util.Arrays;

public class WeeklyHours {
    public static void main(String[] args) {
        int[][] hours = InputReader.getIntArray8to7FromFile("src/chapter08/workinghours.txt");

        //count sums of hours for every employee

        //the array will store employee's
        // index in hours array (sumsOfHours[employee][index])
        // and the sum of ours for the week (sumsOfHours[employee][sum])
        int[][] sumsOfHours = new int[8][2];
        for (int employee = 0; employee < hours.length; employee++) {
            sumsOfHours[employee][0] = employee;
            sumsOfHours[employee][1] = ArrayKeeper.getSumOfIntElements(hours[employee]);
        }
        ArrayKeeper.sortTwoDimensionalArray(sumsOfHours, 1);

        //display employees and their total hours in decreasing order of the total hours
        for (int employee = sumsOfHours.length - 1; employee > 0; employee--) {
            System.out.printf("Employee %d worked for %d hours this week%n",
                    sumsOfHours[employee][0],
                    sumsOfHours[employee][1]);
        }
    }
}
