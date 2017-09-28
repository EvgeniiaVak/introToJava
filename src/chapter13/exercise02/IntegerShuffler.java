package chapter13.exercise02;

import java.util.ArrayList;
import java.util.Random;

public class IntegerShuffler {

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        shuffle(numbers);

        System.out.println(numbers);
    }

    public static void shuffle(ArrayList<Number> list) {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            Number temp = list.get(i);
            int randomIndex = random.nextInt(list.size());
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }
}
