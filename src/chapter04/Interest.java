package chapter04;

public class Interest {

    public static void main(String[] args) {
        Interest interest = new Interest();
        double sber = interest.countOverPaying(75000.0, 180.0, 50.0, .189);
        System.out.printf("Sberbank overpay 18.9%% with 50 days without overpaying with 75000r loan is %f%n", sber);

        double alfa = interest.countOverPaying(75000.0, 180.0, 100.0, .30);
        System.out.printf("Alfa overpay 24%% with 100 days without overpaying with 75000r loan is %f%n", alfa);

        double alfaCash = interest.countOverPaying(75000.0, 180.0, 0.0, .15);
        System.out.printf("Alfa cash overpay 15%% with 0 days without overpaying with 75000r loan is %f%n", alfaCash);
    }

    public double countOverPaying (double creditAmount, double days, double gracePeriodDays, double yearInterestRate) {
        double dailyInterestRate = yearInterestRate / 365;
        double chargedDays = days - gracePeriodDays;

        return creditAmount * dailyInterestRate * chargedDays;
    }
}
