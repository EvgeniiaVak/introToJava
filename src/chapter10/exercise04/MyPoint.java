package chapter10.exercise04;

public class MyPoint {
    private double x, y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint otherPoint) {
        return Math.sqrt(Math.pow(otherPoint.x - x, 2) + Math.pow(otherPoint.y - y, 2));
    }

    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
