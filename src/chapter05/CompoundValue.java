package chapter05;

/*
* Write a program that prompts the user to enter an amount (e.g., 100),
* the annual interest rate (e.g., 5), and the number of months (e.g., 6)
* and displays the amount in the savings account after the given month.
* */

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter an amount (e.g., 100)");
        int amount = scanner.nextInt();
        System.out.println("enter the annual interest rate (e.g., 5)");
        int interestRateAnnual = scanner.nextInt();
        System.out.println("enter the number of months (e.g., 6)");
        int numberOfMonth = scanner.nextInt();

        double interestRateMonthly = interestRateAnnual / 1200.0;
        double savings = 0.0;
        for (int i = 0; i < numberOfMonth; i++) {
            savings = (amount + savings) * (1.0 + interestRateMonthly);
        }
        System.out.println("The amount of the saving account is " + savings);
    }
}
