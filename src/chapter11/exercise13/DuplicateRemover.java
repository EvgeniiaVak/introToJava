package chapter11.exercise13;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 10 numbers");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        removeDuplicate(list);
        System.out.println(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        if (list.size() == 0)
            return;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)))
                    list.remove(j);
            }
        }
    }
}
