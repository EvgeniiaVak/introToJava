package chapter11.exercise07;

import java.util.ArrayList;
import java.util.Random;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(i);
        }
        System.out.println(integers);
        shuffle(integers);
        System.out.println(integers);

    }

    public static void shuffle(ArrayList<Integer> list) {
        Random random = new Random();
        int halfList = list.size() / 2;

        for (int i = 0; i < halfList; i++) {
            int randomIndex = random.nextInt(halfList) + halfList;
            int temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }
}
