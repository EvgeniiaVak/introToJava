package chapter12.exercise09;

public class BinaryToDecimal {

    public static void main(String[] args) {
        String binary = "01012";
        int a = 0;
        try {
            a = convert(binary);
        } catch (BinaryFormatException e) {
            e.printStackTrace();
        }

        System.out.println(a);
    }

    public static int convert(String binary) throws BinaryFormatException{
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            char oneOrZero = binary.charAt(i);

            if (oneOrZero == '0') {
                decimal = decimal * 2;
            } else if (oneOrZero == '1') {
                decimal = decimal * 2 + 1;
            } else {
                throw new BinaryFormatException();
            }
        }

        return decimal;
    }
}
