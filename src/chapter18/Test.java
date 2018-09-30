package chapter18;

public class Test {
    public static void main(String[] args) {
        xMethod(1234567);
        System.out.println();
        yMethod(5);
        System.out.println();
        zMethod(5);
    }
    public static void xMethod(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            xMethod(n / 10);
        }
    }

    public static void yMethod(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            yMethod(n - 1);
        }
    }

    public static void zMethod(int n) {
        if (n > 0) {
            zMethod(n - 1);
            System.out.print(n + " ");
        }
    }
}
