package chapter09.exercise_09;

public class RegularPolygon {
    private int n = 3;
    private double sideLength = 1;
    private double x = 0, y = 0;

    public RegularPolygon() {
    }

    public RegularPolygon(int n, double sideLength) {
        this.n = n;
        this.sideLength = sideLength;
    }

    public RegularPolygon(int n, double sideLength, double x, double y) {
        this.n = n;
        this.sideLength = sideLength;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n >= 3)
            this.n = n;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        if (sideLength > 0)
            this.sideLength = sideLength;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return sideLength * n;
    }

    public double getArea() {
        return (n * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public double getArea2() {
        double a = sideLength / (2 * Math.tan((Math.PI) / n));
        return a * getPerimeter() / 2;
    }
}
