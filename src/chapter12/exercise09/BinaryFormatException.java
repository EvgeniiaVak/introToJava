package chapter12.exercise09;

public class BinaryFormatException extends Exception {
    public BinaryFormatException() {
        super("Binary number should only consist on 0s and 1s");
    }
}
