package chapter05;

/*
* (Financial application: compare loans with various interest rates) Write a program
* that lets the user enter the loan amount and loan period in number of years and displays
* the monthly and total payments for each interest rate starting from 5% to 8%, with an
* increment of 1/8.
* */

public class CompareLoans {

    public static void main(String[] args) {
        int amount = 10000;
        int numberOfYears = 5;

        System.out.printf("%-20s%-20s%-20s%n", "Interest Rate", "Monthly Payment", "Total Payment");
        for (int i = 5000; i < 8000; i += 125) {
            double interestRate = (double) i / 1000;
            double monthlyInterestRate = interestRate / 1200;
            double monthlyPayment = getMonthlyPayment(amount, monthlyInterestRate, numberOfYears);
            double totalPayment = monthlyPayment * 12 * numberOfYears;

            System.out.printf("%-5.3f%%              %-20.3f%-20.3f%n",
                    interestRate,
                    monthlyPayment,
                    totalPayment);
        }
    }

    public static double getMonthlyPayment (double amount, double monthlyInterestRate, int numberOfYears) {
        return amount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    }
}
