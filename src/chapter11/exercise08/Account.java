package chapter11.exercise08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        long time = dateCreated.getTime();
        return new Date(time);
    }

    public static double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount, String description) {
        if (amount <= balance)
            balance -= amount;
        transactions.add(new Transaction('W', amount, balance, description));
    }

    public void deposit(double amount, String description) {
        if (amount > 0)
            balance += amount;
        transactions.add(new Transaction('D', amount, balance, description));
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" +
                "interest rate: " + annualInterestRate + "\n" +
                "balance: " + balance + "\n " +
                "transactions: " + transactions;
    }
}
