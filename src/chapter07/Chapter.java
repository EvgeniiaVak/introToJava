package chapter07;

public class Chapter {
    public static void main(String[] args) {

        //System.out.println(Arrays.toString(tryOutArrayArg(new int[]{1, 2, 4, 5})));

        printArray(1, 2, 3, 4);
        printArray(new double[] {1, 2, 3, 4});
        //printArray(new int[] {1, 2, 3, 4}); - compiler error
    }

    public static int[] tryOutArrayArg (int[] array) {
        array[0] = 3;
        return array;
    }

    public static void printArray (double... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
    }
}
