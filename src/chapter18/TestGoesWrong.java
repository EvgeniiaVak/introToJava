package chapter18;

public class TestGoesWrong {
    public static void main(String[] args) {
//        xMethod(1234567);
        System.out.println(new SomeTest());
    }

    public static void xMethod(double n) {
        if (n != 0) {
            System.out.println(n);
            xMethod(n / 10);
        }
    }

    static class SomeTest {

        public SomeTest() {
            SomeTest test = new SomeTest();
        }
    }
}
