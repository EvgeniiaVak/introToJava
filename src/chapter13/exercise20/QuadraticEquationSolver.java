package chapter13.exercise20;

import chapter13.exercise17.Complex;

import javax.swing.*;

/**
 * Created by evgeniyavakarina on 7/19/17.
 */
public class QuadraticEquationSolver {
    public static void main(String[] args) {
        while (true) promptForRunning();
    }

    private static void solve() {
        double a = getDoubleInput("a");
        double b = getDoubleInput("b");
        double c = getDoubleInput("c");

        double discriminant = (Math.pow(b, 2)) - 4 * a * c;

        String toShow = "";
        if (discriminant < 0) {
            toShow = "The equation has no real roots\n";
            discriminant = - discriminant;

            Complex root1 = new Complex(- b / (2 * a), Math.sqrt(discriminant) / (2 * a));
            Complex root2 = new Complex(- b / (2 * a), - Math.sqrt(discriminant) / (2 * a));

            toShow += String.format("The roots are %s and %s%n", root1, root2);
        } else if (discriminant == 0) {
            double result = (- b) / (2 * a);
            toShow = String.format("The root is %f%n", result);
        } else {
            double root1 = (( - b) + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (( - b) - Math.sqrt(discriminant)) / (2 * a);
            toShow = String.format("The roots are %f and %f%n", root1, root2);
        }

        JOptionPane.showMessageDialog(null, toShow);
    }

    private static void promptForRunning () {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to proceed? ");
        switch (option) {
            case 0:
                solve();
                break;
            case 1:
            case 2:
                System.exit(0);
                break;
            default:
                System.exit(1);
        }
    }

    private static double getDoubleInput(String variable) {
        double result = 0.0;
        String question = String.format("Please enter number for variable %s", variable);
        String resultString = JOptionPane.showInputDialog(question);
        result = Double.parseDouble(resultString);
        return result;
    }
}
