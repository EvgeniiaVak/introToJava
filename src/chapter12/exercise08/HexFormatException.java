package chapter12.exercise08;

public class HexFormatException extends Exception {
    public HexFormatException() {
        super("hex number can only contain characters 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, F");
    }
}
