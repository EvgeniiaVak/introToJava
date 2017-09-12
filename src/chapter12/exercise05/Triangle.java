package chapter12.exercise05;

import chapter11.chapter.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle() throws IllegalTriangleException {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (!areLegalSides(side1, side2, side3))
            throw new IllegalTriangleException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    @Override
    public double getArea() {
        double s = (getPerimeter())/2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    private boolean areLegalSides (double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
