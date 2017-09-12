package chapter12.exercise06;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    private static int hexToDecimal(String hexString) {
        int decimal = 0;

        for (int i = 0; i < hexString.length(); i++) {
            char hexChar = hexString.charAt(i);
            if (!isHexSymbol(hexChar))
                throw new NumberFormatException();

            decimal = decimal * 16 + hexCharToDecimal(hexChar);
        }

        return decimal;
    }

    private static int hexCharToDecimal(char hexChar) {
        if (hexChar >= 'A' && hexChar <= 'F')
            return 10 + hexChar - 'A';
        else
            return hexChar - '0';
    }

    private static boolean isHexSymbol(char symbol) {
        symbol = Character.toUpperCase(symbol);
        return (symbol >= 'A' && symbol <= 'F') || (symbol >= '0' && symbol <= '9');
    }
}
