package chapter05;

public class SalesIncome {

    public static void main(String[] args) {

        //finds the minimum sales you have to generate in order to make $30,000 a year.
        double monthlyIncome = 0;

        double salesAmount = 0;
        while (monthlyIncome * 12 < 30000) {
            monthlyIncome = getMonthlyIncome(0, salesAmount);
            salesAmount++;
        }
        System.out.println("You need to sell " + salesAmount + "$ a month to earn at least 30000 a year");
        System.out.println(monthlyIncome * 12);

    }

    public static double getMonthlyIncome (double baseIncome, double salesAmount) {
        double income = baseIncome;

        //first 5000 with 8 interest
        if (salesAmount <= 5000) {
            income += salesAmount * 0.08;
        }

        //second 5000 with 10 interest
        else if (salesAmount > 5000 && salesAmount <= 10000) {
            income += 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        }

        //the rest with 12 interest
        else {
            income += 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
        }

        return income;
    }
}
