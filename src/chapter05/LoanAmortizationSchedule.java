package chapter05;

public class LoanAmortizationSchedule {
    public static void main(String[] args) {
        int amount = 10000;
        int numberOfYears = 1;
        int annualInterestRate = 7;

        double monthlyInterestRate = (double) annualInterestRate / 1200;
        double balance = amount;
        double monthlyPayment = CompareLoans.getMonthlyPayment(amount, monthlyInterestRate, numberOfYears);
        for (int i = 1; i <= numberOfYears * 12; i++) {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + interest
                + "\t\t" + principal + "\t\t" + balance);
        }
    }
}
