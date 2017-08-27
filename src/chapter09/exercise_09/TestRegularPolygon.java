package chapter09.exercise_09;

public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon[] polygons = new RegularPolygon[3];
        polygons[0] = new RegularPolygon();
        polygons[1] = new RegularPolygon(6, 4);
        polygons[2] = new RegularPolygon(10, 4, 5.6, 7.8);

        for (int i = 0; i < polygons.length; i++) {
            System.out.println("perimeter: " + polygons[i].getPerimeter());
            System.out.println("area: " + polygons[i].getArea());
            System.out.println("area2: " + polygons[i].getArea2());
        }
    }
}
