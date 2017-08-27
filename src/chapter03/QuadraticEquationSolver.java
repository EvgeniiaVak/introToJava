package chapter03;

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

        if (discriminant < 0) {
            showAnswer();
        } else if (discriminant == 0) {
            showAnswer((- b) / (2 * a));
        } else {
            double[] args = new double[2];
            args[0] = (( - b) + Math.pow(discriminant, 0.5)) / (2 * a);
            args[1] = (( - b) - Math.pow(discriminant, 0.5)) / (2 * a);
            showAnswer(args);
        }
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

    private static void showAnswer(double... args) {
        String toShow = "";
        switch (args.length) {
            case 0:
                toShow = "The equation has no real roots";
                break;
            case 1:
                toShow = String.format("The root is %f%n", args[0]);
                break;
            case 2:
                toShow = String.format("The roots are %f and %f%n", args[0], args[1]);
                break;
            default:
                toShow = "Something went wrong";
        }
        JOptionPane.showMessageDialog(null, toShow);
    }

    private static double getDoubleInput(String variable) {
        double result = 0.0;
        String question = String.format("Please enter number for variable %s", variable);
        String resultString = JOptionPane.showInputDialog(question);
        result = Double.parseDouble(resultString);
        return result;
    }
}
