package chapter05.exercise26;

public class ComputeE {
    public static void main(String[] args) {
        System.out.println("E is: ");
        System.out.println(
                "2.71828182845904523536028747135266249775724709369995..."
        );
        System.out.println("\n");
        System.out.println(get(3));
        System.out.println(get(4));
        System.out.println(get(6));
        System.out.println(get(10));
        System.out.println(get(10000));
        System.out.println(get(10000000));
    }

    public static double get (long precision) {
        double result = 1.0;
        double item = 1.0;

        for (long i = 2; i < precision; i++) {
            result += item;
            item = item / i;
        }

        return result;
    }
}
