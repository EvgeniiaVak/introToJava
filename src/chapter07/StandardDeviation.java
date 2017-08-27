package chapter07;

import java.util.Arrays;

public class StandardDeviation {

    public static void main(String[] args) {
        double[] tenNumbers = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};

        System.out.println(Arrays.toString(tenNumbers));
        System.out.println("the mean is " + mean(tenNumbers));
        System.out.println("the deviation is " + deviation(tenNumbers));
    }

    /** Compute the deviation of double values */
    public static double deviation(double[] array) {
        double mean = mean(array);
        double sum = 0;
        for (int n = 0; n < array.length; n++) {
            sum += Math.pow(array[n] - mean, 2);
        }
        return Math.sqrt(sum / (array.length - 1));
    }

    /** Compute the mean of an array of double values */
    public static double mean(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
