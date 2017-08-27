package chapter06;

/*
* (Game: craps) Craps is a popular dice game played in casinos. Write a program
* to play a variation of the game, as follows:
* Roll two dice. Each die has six faces representing values 1, 2, ..., and 6, respectively.
*
* Check the sum of the two dice.
* If the sum is 2, 3, or 12 (called craps), you lose;
* if the sum is 7 or 11 (called natural), you win;
* if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established.
* Continue to roll the dice until either a 7 or the same point value is rolled.
* If 7 is rolled, you lose. Otherwise, you win.
* */

import java.util.Scanner;

public class Craps {

    public static void main(String[] args) {
        int winSum = 0;
        for (int i = 0; i < 1000; i++) {
            winSum += run();
        }

        System.out.println("chance of winning is " + (double) winSum / 1000);
    }

    public static int run() {
        Scanner scanner = new Scanner(System.in);
        int point = 100;

        int a = 0, b = 0;

        //System.out.println("do you want to play?");
        do {
            //if (point != 100)
                //System.out.println("roll?");
                //scanner.next();
            a = rollDie();
            b = rollDie();
            point = checkSum(a, b, point);
            System.out.printf("You rolled %d + %d = %d%n", a, b, a + b);
            if (point == -2) {
                System.out.println("You lose!\n\n");
                return 0;
            } else if (point == -1) {
                System.out.println("You win!\n\n");
                return 1;
            } else {
                System.out.println("Point is " + point);
                a = rollDie();
                b = rollDie();

                System.out.println("\n");
            }
        } while (point > 0);

        return -1;
    }

    public static int checkSum(int a, int b, int point) {
        if (point== 0)
            return checkSumFirstTime(a, b);

        int sum = a + b;
        if (sum == 7)
            return -2;
        else if (sum == point)
            return -1;
        else
            return sum;
    }

    public static int checkSumFirstTime (int a, int b) {
        int sum = a + b;

        if (sum == 2 || sum == 3 || sum == 12) {
            return  - 2;
        } else if (sum == 7 || sum == 11) {
            return  -1;
        } else
            return sum;
    }

    public static int rollDie () {
        return (int) (1 + Math.random() * 6);
    }
}
