package chapter11.exercise08;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance; //after the transaction
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return date.toString() +
                ((type == 'D') ? " deposit " : " withdraw ") +
                amount +
                ", new balance: " +
                balance +
                ", with description: " +
                description;
    }
}
