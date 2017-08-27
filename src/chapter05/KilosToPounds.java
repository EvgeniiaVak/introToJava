package chapter05;

public class KilosToPounds {
    public static void main(String[] args) {
        System.out.printf("%s%10s%n", "Kilograms", "Pounds");
        for (int i = 1; i < 200; i++) {
            double pound = i * 2.2;
            System.out.printf("%-3d%15.2f%n", i, pound);
        }
    }
}
