package chapter09.exercise_07;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("balance: " + account.getBalance());
        System.out.println("monthly interest: " + account.getMonthlyInterest());
        System.out.println("was created at: " + account.getDateCreated().toString());
    }
}
