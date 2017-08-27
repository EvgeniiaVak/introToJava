package chapter05;

/*
* (Display pyramid) Write a program that prompts the user to enter an integer
* from 1 to 15 and displays a pyramid, as shown in the following sample run:
*
* for every line int i
*   for every letter in line j
*
*           print white spaces in count of (max - i) * 2 (for each space where j is greater than i)
*           print i, then print i -1... till 2,
*
*           print 1
*
*           print (with another loop) 2, 3... till i
*           print white spaces  till
*
*
*
* */

import java.util.Scanner;

public class DisplayPyramid {

    public static void main(String[] args) {
        powersOf2(8);
    }

    private static void powersOf2 (int n) {
        for (int line = n; line >= 0; line--) {
            //in each line:
            System.out.print(line);
            //left side of the pyramid, there are 8 slots
            //each slot should be either empty or
            //if it's the first line, 7 empty slots and one with 1,
            //if it's second line 6 empty slots and one with 1, next with 2
            //if it's third line 5 empty slots and 3: 1  2  4
            for (int place = 0; place < n; place++) {
                int power = place - line;
                int digit = (int) Math.pow(2, power);
                String output = (place >= line) ? String.format(" %3d ", digit) : "     ";
                System.out.print(output);
            }

            //right side, here are n - 1 slots
            for (int place = n - 2; place >= 0; place--) {
                int power = place - line;
                int digit = (int) Math.pow(2, power);
                String output = (place >= line) ? String.format(" %3d ", digit) : "     ";
                System.out.print(output);
            }

            //line break
            System.out.println();
            
        }
    }

    private static void diffSizePyramid () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer from 1 to 15");
        int input = scanner.nextInt();

        if (input > 15 || input < 0) {
            System.out.println("Incorrect input");
            System.exit(0);
        }


        input = input + 1;
        // for each line
        for (int i = 0; i < input; i++) {
            //first part of the pyramid
            for (int j = input; j > 0; j--) {
                String print = (j > i) ? "    " : String.format(" %2d ", j);
                System.out.print(print);
            }

            //second part of the pyramid
            for (int j = 2; j < input; j++) {
                String print = (j > i) ? "    " : String.format(" %2d ", j);
                System.out.print(print);
            }

            //line break
            System.out.println();
        }
    }
}
