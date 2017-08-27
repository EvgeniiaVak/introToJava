package chapter05;

public class CancellationErrors {
    public static void main(String[] args) {
        double fromLeftToRight = 1.0;
        for (int i = 2; i <= 500000; i++) {
            fromLeftToRight += 1.0 / i;
        }
        System.out.println("From right to left sum is: " + fromLeftToRight);

        double fromRightToLeft = 1 + 1.0 / 500000;
        for (int i = 499999; i > 1; i--) {
            fromRightToLeft += 1.0 / i;

        }
        System.out.println("From right to left sum is: " + fromRightToLeft);
    }
}
