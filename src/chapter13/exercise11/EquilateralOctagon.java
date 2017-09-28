package chapter13.exercise11;

import chapter13.exercise05.GeometricObject;

public class EquilateralOctagon extends GeometricObject implements Cloneable{
    private double side;

    public EquilateralOctagon(double side) {
        this.side = side;
    }

    public EquilateralOctagon() {
        this(1.0);
    }

    @Override
    public double getArea() {
        return (2.0 + 4.0 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }
}
