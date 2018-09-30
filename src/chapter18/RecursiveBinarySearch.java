package chapter18;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 4, 5, 6, 8, 9, 10, 15, 18, 122, 399, 542, 1212, 1234};
        System.out.println(search(array, 8));
        System.out.println(search(array, 122));
        System.out.println(search(array, 13));
        System.out.println(search(array, 99));
    }

    private static int search(int[] array, int number) {
        return search(array, number, 0, array.length - 1);
    }

    private static int search(int[] array, int number, int begin, int end) {

        if (begin > end)
            return -1;

        int guessIndex = (begin + end) / 2;

        if (number == array[guessIndex])
            return guessIndex;
        else if (number > array[guessIndex])
            return search(array, number, guessIndex + 1, end);
        else
            return search(array, number, begin, guessIndex - 1);
    }
}
