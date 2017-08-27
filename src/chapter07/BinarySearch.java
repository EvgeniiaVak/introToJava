package chapter07;

public class BinarySearch {
    public static void main(String[] args) {

        System.out.println(getKeyIndex(5, 1, 2, 3, 4, 6, 7, 8));

    }

    public static int getKeyIndex(double key, double... array) {
        if (array.length == 0)
            return -1;

        int index = -1;
        int low = 0;
        int high = array.length - 1;
        do {
            index = (high + low) / 2;

            if (key == array[index])
                return index;
            if (key < array[index]) {
                high = index - 1;
            } else {
                low = index + 1;
            }
        } while (high > low);
        return - low - 1;
    }
}
