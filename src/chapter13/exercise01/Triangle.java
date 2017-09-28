package chapter13.exercise01;

import chapter11.chapter.GeometricObject;

public class Triangle extends GeometricObject {
    private double[] sideLengths = {1.0, 1.0, 1.0};

    public Triangle() {
    }

    public Triangle(double... sideLengths) {
        if (areLegal(sideLengths))
            this.sideLengths = sideLengths;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public double getArea() {
        double s = (getPerimeter())/2;
        return Math.sqrt(s * (s - sideLengths[0]) * (s - sideLengths[1]) * (s - sideLengths[2]));
    }

    @Override
    public double getPerimeter() {
        return sideLengths[0] + sideLengths[1] + sideLengths[2];
    }

    private static boolean areLegal(double... sideLengths) {
        if (sideLengths.length == 3) {
            double a = sideLengths[0], b = sideLengths[1], c = sideLengths[2];
            return a + b > c && a + c > b && b + c > a;
        } else {
            return false;
        }
    }
}
