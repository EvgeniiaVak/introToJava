package chapter11.exercise15;

import chapter10.exercise04.MyPoint;

import java.util.ArrayList;

public class Polygon {
    private ArrayList<MyPoint> points = new ArrayList<>();

    public Polygon(ArrayList<MyPoint> points) {
        this.points = points;
    }

    public double getArea() {
        double determinant = 0;
        for (int i = 0; i < points.size(); i++) {
            int indexOfSecondPoint = (i == points.size() - 1) ? 0 : i + 1;

            double x1 = points.get(i).getX(),
                    y1 = points.get(i).getY(),
                    x2 = points.get(indexOfSecondPoint).getX(),
                    y2 = points.get(indexOfSecondPoint).getY();

            //(x1 * y2 − y1 * x2) + (x2 * y3 − y2 * x3) + ..... + (xn * y1 − yn * x1)
            determinant += x1 * y2 - y1 * x2;
        }

        return Math.abs(determinant / 2);
    }
}
