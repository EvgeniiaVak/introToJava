package chapter12;

import java.util.Arrays;

public class Listing6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.fill(array, 10);

        try {
            int a = wrongSum(array);
        } catch (Throwable e) {
            System.out.println(e + "\n");

            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] elements = e.getStackTrace();
            for (int i = 0; i < elements.length; i++) {
                System.out.print("method " + elements[i].getMethodName());
                System.out.println("(" + elements[i].getClassName() + ": " +
                                    elements[i].getLineNumber() + ")"
                );
            }
        }

    }

    public static int wrongSum(int[] array) {
        int result = 0;

        for (int i = 0; i <= array.length; i++) {
            result += array[i];
        }

        return result;
    }
}
