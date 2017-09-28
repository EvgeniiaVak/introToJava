package chapter13.exercise11;

public class EquilateralOctagonTest {
    public static void main(String[] args) {
        EquilateralOctagon octagon = new EquilateralOctagon(5);

        EquilateralOctagon copy = (EquilateralOctagon) octagon.clone();

        System.out.println(octagon.compareTo(copy));
    }
}
