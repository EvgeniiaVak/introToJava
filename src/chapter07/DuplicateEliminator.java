package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateEliminator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[10];

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        System.out.println("The distinct numbers are: " + Arrays.toString(eliminateDuplicates(input)));

    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] uncut = new int[list.length];
        int newArrayLength = 0;

        //check every number in the list
        for (int i = 0; i < list.length; i++) {

            //if it is already in the new uncut array
            boolean unique = true;
            for (int j = 0; j < newArrayLength; j++) {
                if (list[i] == uncut[j])
                    unique = false;
            }

            //if it was not there
            if (unique) {
                //put it there
                uncut[newArrayLength] = list[i];
                //and don't forget to enlarge the new array
                newArrayLength++;
            }
        }

        return Arrays.copyOf(uncut, newArrayLength);
    }
}
