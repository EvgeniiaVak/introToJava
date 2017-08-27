package chapter07;

/*
* (Analyze scores) Write a program that reads an unspecified number of scores and determines
* how many scores are above or equal to the average and how many scores are below the average.
* Enter a negative number to signify the end of the input. Assume that the maximum
* number of scores is 100.
* */

import java.util.Scanner;

public class ScoresAnalyzer {
    public static void main(String[] args) {
        int[] scoresDataBase = new int[101];

        Scanner scanner = new Scanner(System.in);

        //ask for scores
        System.out.println("Enter scores: (enter negative number when done)");

        int score = 0;
        int scoreSum = 0;
        int scoreCount = 0;

        do {
            score = scanner.nextInt();

            if (score >= 0 && score <= 100) {
                scoresDataBase[score]++;
                scoreSum += score;
                scoreCount++;
            }

        } while (score >= 0);

        int scoreAverage = scoreSum / scoreCount;

        int below = 0;
        int equal = 0;
        int above = 0;
        for (int i = 0; i < scoresDataBase.length; i++) {
            if (scoresDataBase[i] > 0) {
                if (i < scoreAverage)
                    below++;
                if (i == scoreAverage)
                    equal++;
                if (i > scoreAverage)
                    above++;
            }
        }

        System.out.printf("%d scores are below average, %d equal, and %d above.%n", below, equal, above);
    }


}
