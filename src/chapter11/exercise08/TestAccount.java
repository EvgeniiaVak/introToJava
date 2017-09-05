package chapter11.exercise08;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("George", 1122, 1000);
        Account.setAnnualInterestRate(1.5);

        account.deposit(30, "salary");
        account.deposit(40, "salary");
        account.deposit(50, "extra work");

        account.withdraw(5, "food");
        account.withdraw(4,"books");
        account.withdraw(2,"movies");

        System.out.println(account);
    }
}
