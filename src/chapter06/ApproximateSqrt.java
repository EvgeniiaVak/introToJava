package chapter06;

public class ApproximateSqrt {

    public static void main(String[] args) {
        System.out.println(sqrt(-9));
    }

    public static double sqrt(long n) {
        double lastGuess = 1;

        while (true) {
            double nextGuess = (lastGuess + n / lastGuess) / 2;
            if (Math.abs(nextGuess - lastGuess) <= 0.0001)
                return nextGuess;
            lastGuess = nextGuess;
        }
    }
}
