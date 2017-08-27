package chapter05;

/*
* (Find the smallest n such that n^2 > 12,000) Use a while loop to find the smallest
* integer n such that n^2 is greater than 12,000.
* */

public class SmallestN {

    public static void main(String[] args) {
        int n = 1;
        while (12000 >= Math.pow(n, 2)) {
            n++;
        }
        System.out.println(n);
        System.out.println(Math.pow(n, 2));
    }

}
