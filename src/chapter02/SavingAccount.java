package chapter02;

import javax.swing.*;

/**
 * Created by evgeniyavakarina on 7/17/17.
 */
public class SavingAccount {
    public static final double INTEREST_FACTOR = 1.00417;

    public static void main(String[] args) {
        String amountString = JOptionPane.showInputDialog(
                null,
                "Enter the monthly saving amount:"
        );
        String monthsString = JOptionPane.showInputDialog(
                null,
                "Enter the number of months:"
        );


        double amount = Double.parseDouble(amountString);
        int months = Integer.parseInt(monthsString);

        double result = 0.00;

        for (int i = 0; i < months; i++) {
            result = (result + amount) * INTEREST_FACTOR;
        }


        String outputString = String.format(
                "After the sixth month, the account value is $%.2f",
                result
        );

        JOptionPane.showMessageDialog(null, outputString);
    }
}
