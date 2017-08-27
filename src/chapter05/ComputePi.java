package chapter05;

public class ComputePi {
    public static void main(String[] args) {
//
//        System.out.println(computePi(100));
//        System.out.println(computePi(20000));
//        System.out.println(computePi(100000));

        System.out.println(computeE(1000));
        System.out.println(computeE(2000));
        System.out.println(computeE(10000));
    }

    public static double computeE (int precision) {
        double e = 1.0;
        double item = 1.0;
        for (int i = 1; i < precision; i++) {
            item /= i;
            e += item;
        }
        return e;
    }

    public static double computePi (int precision) {
        double pi = 0.0;
        double sum = 1.0;
        for (int i = 2; i < precision; i++) {
            sum += (Math.pow(-1.0, i + 1)) / (2.0 * i - 1.0);
        }
        pi = 4 * sum;
        return pi;
    }
}
