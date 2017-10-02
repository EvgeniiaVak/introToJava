package chapter13.exercise15;

import java.math.BigInteger;

// BigRational.java: Define a rational number and its associated
// operations such as add, subtract, multiply, and divide
public class BigRational extends Number implements Comparable<BigRational> {
    // Data fields for numerator and denominator
    private BigInteger[] r = new BigInteger[2];

    /** Default constructor */
    public BigRational() {
        this("0", "1");
    }

    /** Construct a rational with specified numerator and denominator,
     * throws IllegalArgumentException if denominator is zero
     * or if there are less or more than 1 or 2 numbers*/
    public BigRational(String... numbers) {
        String numerator, denominator;

        if (numbers.length == 1) {
            numerator = numbers[0];
            denominator = "1";
        } else if (numbers.length == 2) {
            numerator = numbers[0];
            denominator = numbers[1];
        } else {
            throw new IllegalArgumentException();
        }
        if (denominator.equals("0")) throw new IllegalArgumentException();

        BigInteger gcd = new BigInteger(numerator).gcd(new BigInteger(denominator));

        BigInteger n = new BigInteger(numerator);
        BigInteger d = new BigInteger(denominator);
        if (denominator.startsWith("-"))
            n = n.multiply(new BigInteger("-1"));

        r[0] = n.divide(gcd);
        r[1] = d.divide(gcd).abs();
    }

    /** Return numerator */
    public BigInteger getNumerator() {
        return r[0];
    }

    /** Return denominator */
    public BigInteger getDenominator() {
        return r[1];
    }

    /** Add a rational number to this rational */
    public BigRational add(BigRational secondBigRational) {
        BigInteger n = (r[0].multiply(secondBigRational.getDenominator()))
                                .add(
                        r[1].multiply(secondBigRational.getNumerator()));
        BigInteger d = r[1].multiply(secondBigRational.getDenominator());

        return new BigRational(n.toString(), d.toString());
    }

    /** Subtract a rational number from this rational */
    public BigRational subtract(BigRational secondBigRational) {
        BigInteger n = (r[0].multiply(secondBigRational.getDenominator()))
                .subtract(
                        (r[1].multiply(secondBigRational.getNumerator())));
        BigInteger d = r[1].multiply(secondBigRational.getDenominator());
        return new BigRational(n.toString(), d.toString());
    }

    /** Multiply a rational number to this rational */
    public BigRational multiply(BigRational secondBigRational) {
        BigInteger n = r[0].multiply(secondBigRational.getNumerator());
        BigInteger d = r[1].multiply(secondBigRational.getDenominator());
        return new BigRational(n.toString(), d.toString());
    }

    /** Divide a rational number from this rational */
    public BigRational divide(BigRational secondBigRational) {
        BigInteger n = r[0].multiply(secondBigRational.getDenominator());
        BigInteger d = r[1].multiply(secondBigRational.r[0]);
        return new BigRational(n.toString(), d.toString());
    }

    @Override
    public String toString() {
        if (r[1].compareTo(BigInteger.ONE) == 0)
            return r[0].toString();
        else
            return r[0] + "/" + r[1];
    }

    /** Override the equals method in the Object class */
    public boolean equals(Object parm1) {
        return parm1 instanceof BigRational &&
                (this.subtract((BigRational)(parm1))).getNumerator().compareTo(BigInteger.ZERO) == 0;
    }

    /** Override the hashCode method in the Object class */
    public int hashCode() {
        return new Double(this.doubleValue()).hashCode();
    }

    /** Override the abstract intValue method in java.lang.Number */
    public int intValue() {
        return (int)doubleValue();
    }

    /** Override the abstract floatValue method in java.lang.Number */
    public float floatValue() {
        return (float)doubleValue();
    }

    /** Override the doubleValue method in java.lang.Number */
    public double doubleValue() {
        return r[0].doubleValue() / r[1].doubleValue();
    }

    /** Override the abstract longValue method in java.lang.Number */
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public int compareTo(BigRational o) {
        return (this.subtract((BigRational)o)).getNumerator().compareTo(BigInteger.ZERO);
    }
}
