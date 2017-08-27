package chapter05;

/*
* (Find the largest n such that n^3 < 12,000) Use a while loop to find
* the largest integer n such that n3 is less than 12,000.
* */

public class LargestN {
    public static void main(String[] args) {
        int n = 1;
        while (Math.pow(n + 1, 3) < 12000) {
            n++;
        }
        System.out.println("n = " + n);

        System.out.println(Math.pow(n, 3));
        System.out.println(Math.pow(n-1, 3));
        System.out.println(Math.pow(n+1, 3));
    }
}
