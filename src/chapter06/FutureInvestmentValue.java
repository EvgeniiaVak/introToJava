package chapter06;

import java.util.Scanner;

public class FutureInvestmentValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The amount invested: ");
        double investmentAmount = scanner.nextDouble();
        System.out.println("Annual interest rate: (e.g. 9)");
        double monthlyInterestRate = scanner.nextDouble() / 1200;

        System.out.println("Years             Future value");
        for (int i = 1; i < 31; i++) {
            double value = futureInvestmentValue(investmentAmount, monthlyInterestRate, i);
            System.out.println(i + "            " + value);
        }
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
    }
}
