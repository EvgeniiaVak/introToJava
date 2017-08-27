package chapter07;

public class ExclusiveRandom {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50};
        for (int i = 0; i < 100; i++) {
            System.out.println(getRandom(numbers));
        }
    }

    public static int getRandom(int... numbers) {
        int number = (int) (Math.random() * 54 + 1);
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i])
                return getRandom(numbers);
        }
        return number;
    }
}