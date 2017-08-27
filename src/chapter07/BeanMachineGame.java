package chapter07;

import java.util.Scanner;

public class BeanMachineGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of balls to drop:");
        int numberOfBalls = scanner.nextInt();
        System.out.println("Enter the number of slots in the bean machine:");
        int numberOfSlots = scanner.nextInt();

        int[] slots = new int[8];
        int position = 0;
        String path = "";
        for (int i = 0; i < numberOfBalls; i++) {
            position = 0;
            path = "";
            for (int j = 0; j < numberOfSlots - 1; j++) {
                if (fallsRight()){
                    position++;
                    path += "R";
                } else {
                    path += "L";
                }
            }
            slots[position]++;
            System.out.println(path);
        }

        //show the balls
        for (int i = numberOfBalls; i >= 0; i--) {
            for (int slot : slots) {
                String output = (slot > i) ? "O" : " ";
                System.out.print(output);
            }
            System.out.println();
        }

    }

    public static boolean fallsRight() {
        int random = (int) (Math.random() + 0.5);
        return random == 1;
    }
}
