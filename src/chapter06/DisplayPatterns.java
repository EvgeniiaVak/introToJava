package chapter06;

public class DisplayPatterns {

    public static void main(String[] args) {
        displayPattern(5);
    }

    public static void displayPattern(int n) {

        // every line
        for (int i = 1; i < n + 1; i++) {

            //every spot in the line
            for (int j = n - 1; j >= 0; j--) {
                //if i is bigger than j then we can display i
                System.out.print((i > j) ? " " + i : "  ");
            }
            System.out.println();
        }
    }
}
