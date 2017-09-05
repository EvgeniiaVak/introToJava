package chapter11.exercise04;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxInArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (finish with 0):");

        int number = scanner.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();

        while (number != 0) {
            integers.add(number);
            number = scanner.nextInt();
        }

        System.out.println("Max is: " + max(integers));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0)
            return null;

        Integer maxValue = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maxValue)
                maxValue = list.get(i);
        }

        return maxValue;
    }
}
