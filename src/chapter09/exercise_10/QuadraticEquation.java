package chapter09.exercise_10;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return ( - b + Math.sqrt(getDiscriminant()) / 2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return ( - b - Math.sqrt(getDiscriminant()) / 2 * a);
        } else {
            return 0;
        }
    }
}
