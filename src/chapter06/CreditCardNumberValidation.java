package chapter06;

public class CreditCardNumberValidation {

    public static void main(String[] args) {
        //test getSize(long d)
        //System.out.println(getSize(123456789));

        //test getDigit
        //System.out.println(getDigit(18));

        //test getPrefix
        //System.out.println(getPrefix(4388576018410707L, 1));

        //test prefixMatched
        //System.out.println(prefixMatched(4388576018410707L, 4));

        //test sumOfOddPlace
        //System.out.println(sumOfOddPlace(123456));

        //test sumOfDoubleEvenPlace
        //System.out.println(sumOfDoubleEvenPlace(121212));

        //test isValid
        System.out.println(isValid(4388576018402626L));
        System.out.println(isValid(4388576018410707L));

    }

    /** Return true if the card number is valid
     * If the result from Step 4 is divisible by 10, the card number is valid;
     * otherwise, it is invalid. */
    public static boolean isValid(long number) {
        int sum = sumOfOddPlace(number) + sumOfDoubleEvenPlace(number);
        //check for the sum of sums to be divisible by ten
        boolean divisible = (sum % 10) == 0;
        //check for length of the number
        boolean sizeCorrect = getSize(number) >= 13 && getSize(number) <= 16;
        //it should start with 4, 5, 37, 6
        boolean rightPrefix =   prefixMatched(number, 4) ||
                                prefixMatched(number, 5) ||
                                prefixMatched(number, 37) ||
                                prefixMatched(number, 6);

        return divisible && sizeCorrect && rightPrefix;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        while (number > 0) {
            int digit = (int) ((number % 100) / 10);
            int doubledDigit = getDigit(2 * digit);
            sum += doubledDigit;
            number /= 100;
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number){
        if (number < 10)
            return number;
        else {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
    }

    /** Return sum of odd-place (from right to left) digits in number */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        while (number > 0) {
            //at every step we take a digit from %10
            sum += number % 10;
            // then divide the number by 100 to skip the odd places
            number /= 100;
        }
        return sum;
    }
    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        return d == getPrefix(number, getSize(d));
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        int size = 0;
        while (d > 0) {
            size++;
            d /= 10;
        }
        return size;
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        if (getSize(number) <= k) {
            return number;
        } else {
            long prefix = 0;


            for (int i = 0; i < k; i++) {

                //in every step we divide the number by 10...0 to get the first digit
                long divider = (long) Math.pow(10, getSize(number) - 1);
                long digit = number / divider;

                //then put the digit in the prefix
                prefix = prefix * 10 + digit;

                //prepare number for extracting next digit
                number %= divider;
                divider /= 10;
            }

            return prefix;
        }
    }
}
