package chapter10.exercise08;

public class TestTax {
    public static void main(String[] args) {
        for (int status = 0; status < 4; status++) {
            System.out.println("for status " + status);
            System.out.println();
            System.out.println("for 2001");
            printTable(status, TaxData.BRACKETS_2001, TaxData.RATES_2001);
            System.out.println("for 2009");
            printTable(status, TaxData.BRACKETS_2009, TaxData.RATES_2009);

            System.out.println();
        }
    }

    private static void printTable(int status, int[][] brackets, double[] rates) {
        Tax tax = new Tax(status, brackets, rates, 50000);
        System.out.println("Income -------------- Tax");
        for (int income = 8000; income <= 200000; income += 10000) {
            tax.setTaxableIncome(income);
            System.out.printf("%d           %f%n", income, tax.getTax());
        }
    }
}
