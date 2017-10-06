package chapter13.exercise17;

public class Complex {
    double a, b;

    public Complex() {
        a = 0;
        b = 0;
    }

    public Complex(double a) {
        this.a = a;
        b = 0;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    public Complex add(Complex other) {
        double a = this.a + other.a;
        double b = this.b + other.b;
        return new Complex(a, b);
    }

    public Complex subtract(Complex other) {
        double a = this.a - other.a;
        double b = this.b - other.b;
        return new Complex(a, b);
    }

    public Complex multiply(Complex other) {
        double a = this.a * other.a - this.b * other.b;
        double b = this.a * other.a + this.b * other.b;

        return new Complex(a, b);

    }

    public Complex divide(Complex other) {
        double divider = Math.pow(other.a, 2) + Math.pow(other.b, 2);

        double a = (this.a * other.a + this.b * other.b) / divider;
        double b = (this.b * other.a - this.a * other.b) / divider;

        return new Complex(a, b);
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    @Override
    public String toString() {
        return (b == 0) ? String.valueOf(a) : a + " + " +  b + "i";
    }
}
