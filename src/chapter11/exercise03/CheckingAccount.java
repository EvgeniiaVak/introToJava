package chapter11.exercise03;

import chapter09.exercise_07.Account;

//A checking account has an overdraft limit
public class CheckingAccount extends Account {
    private double overDraftLimit;

    public CheckingAccount() {
        this.overDraftLimit = 20000.0;
    }

    public CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overDraftLimit)
            setBalance(getBalance() - amount);
    }
}