package chapter05;

/*
* (Financial application: compute future tuition) Suppose that the tuition for a university
* is $10,000 this year and increases 5% every year. In one year, the tuition will be $10,500.
* Write a program that computes the tuition in ten years and the total cost of four years’
* worth of tuition after the tenth year.
* */

public class FutureTuition {
    public static void main(String[] args) {
        int tuition = 10000;
        for (int i = 0; i < 10; i++) {
            tuition += tuition / 100 * 5;
        }
        System.out.println("After 10 years tuition will be " + tuition);

        int tuitionSum = 0;
        for (int i = 0; i < 4; i++) {
            tuitionSum += tuition;
            tuition += tuition / 100 * 5;
        }
        System.out.println("After 10 years sum tuition for 4 years will be " + tuitionSum);
    }
}
