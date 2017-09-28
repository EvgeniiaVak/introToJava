package chapter13.exercise15;

public class TestBigRational {
    public static void main(String[] args) {
        BigRational a = new BigRational("4", "5");
        BigRational b = new BigRational("5", "5");

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));

    }
}
