package chapter10.exercise12;

import chapter10.exercise04.MyPoint;

public class Line2D {
    MyPoint p1, p2;

    public Line2D() {
        this (new MyPoint(0, 0), new MyPoint(1, 1));
    }

    public Line2D(MyPoint p1, MyPoint p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength() {
        return p1.distance(p2);
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }
}
