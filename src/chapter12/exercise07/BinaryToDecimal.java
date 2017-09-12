package chapter12.exercise07;

public class BinaryToDecimal {

    public static void main(String[] args) {
        String binary = "01012";
        int a = convert(binary);

        System.out.println(a);
    }

    public static int convert(String binary) {
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            char oneOrZero = binary.charAt(i);

            if (oneOrZero == '0') {
                decimal = decimal * 2;
            } else if (oneOrZero == '1') {
                decimal = decimal * 2 + 1;
            } else {
                throw new NumberFormatException("Binary number should only consist on 0s and 1s");
            }
        }

        return decimal;
    }
}
