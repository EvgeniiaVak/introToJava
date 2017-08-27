package chapter06;

/*
* A password must have at least eight characters.
■ A password consists of only letters and digits.
■ A password must contain at least two digits.
* */

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        String output = (isValid(password)) ? "Valid Password" : "Invalid Password";
        System.out.println(output);
    }


    public static boolean isValid (String password) {
        //A password must have at least eight characters
        if (password.length() >= 8) {
            int numberOfDigits = 0;
            for (int i = 0; i < password.length(); i++) {
                char currentChar = password.charAt(i);

                //A password consists of only letters and digits.
                if (Character.isLetterOrDigit(currentChar)) {

                    if (Character.isDigit(currentChar)) {
                        numberOfDigits ++;
                    }

                } else {
                    return false;
                }
            }

            //A password must contain at least two digits.
            if (numberOfDigits >= 2) {
                return true;
            }
        }

        return false;
    }

}
