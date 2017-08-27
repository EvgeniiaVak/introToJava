package chapter05;

import java.util.Scanner;

public class MeanAndStandardDeviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double mean = 0;
        double deviation;

        double sum = 0;
        double sumOfQuadrads = 0;
        int numberOfNumbers = 10;
        for (int i = 0; i < numberOfNumbers; i++) {
            double currentInput = scanner.nextDouble();

            sum += currentInput;
            sumOfQuadrads += Math.pow(currentInput, 2);
        }
        mean = sum / numberOfNumbers;

        double halfQuadSum = Math.pow(sum, 2) / numberOfNumbers;

        deviation = Math.sqrt((sumOfQuadrads - halfQuadSum) / (numberOfNumbers - 1));

        System.out.println(mean);
        System.out.println(deviation);

    }
}
