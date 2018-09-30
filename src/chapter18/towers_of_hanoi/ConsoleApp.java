package chapter18.towers_of_hanoi;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

public class ConsoleApp {
    private static final Pole[] poles = new Pole[3];
    private static final Disk[] disks = {new Disk(4), new Disk(3), new Disk(2), new Disk(1)};
    private static final String MOVE_INSTRUCTIONS = "To move a disk type \"<disk size> <target pole index (zero based)>\"";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(MOVE_INSTRUCTIONS);
        System.out.println("To exit type \"exit\"\n");
        System.out.println("To see the solution type \"show\"\n");
        freshInstallDisks();

        String input;
        while (!(input = scanner.nextLine()).equals("exit")) {

            try {
                if (input.equals("show")) {
                    playAutomation();
                } else {
                    executeMoveCommands(input);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            showPoles();
        }

    }

    private static void freshInstallDisks() {
        poles[0] = new Pole(disks);
        poles[1] = new Pole();
        poles[2] = new Pole();
        showPoles();
    }

    private static void playAutomation() {
        System.out.println("------------------------------------------------solution------------------------------------------------");
        freshInstallDisks();
        moveRecursively(getDisk(4), poles[0], poles[2]);

        System.out.println("----------------------------------------------solution end----------------------------------------------\n\n");
        freshInstallDisks();
    }

    private static void moveRecursively(Disk disk, Pole from, Pole to) {
        Disk smallerDisk = getDisk(disk.getSize() - 1);
        Pole thirdPole = Arrays.stream(poles).filter(p -> !p.equals(from) && !p.equals(to)).findAny()
                .orElseThrow(() -> new IllegalArgumentException("no third pole"));

        //for the time move the smaller disk(s) to another pole
        if (from.getTopDiskSize() < disk.getSize()) {
            moveRecursively(smallerDisk, from, thirdPole);
        }

        //transfer the bottom disk
        from.transferTo(to);
        showPoles();

        //transfer back all the upper disk(s)
        if (disk.getSize() > 1) {
            moveRecursively(smallerDisk, thirdPole, to);
        }

    }

    private static Disk getDisk(int size) {
        for (Disk disk: disks) {
            if (disk.getSize() == size)
                return disk;
        }

        return null;
    }

    private static int findSourcePoleIndex(int diskSize) {
        for (int i = 0; i < poles.length; i++) {
            if (poles[i].getTopDiskSize() == diskSize)
                return i;
        }

        throw new IllegalArgumentException("cannot move disk with size " + diskSize + "\n" + MOVE_INSTRUCTIONS);
    }

    private static void executeMoveCommands(String input) {
        String[] split = input.split(" ");
        if (split.length != 2)
            throw new IllegalArgumentException(MOVE_INSTRUCTIONS);

        int[] commands = new int[2];
        try {
            commands[0] = Integer.parseInt(split[0]);
            commands[1] = Integer.parseInt(split[1]);
        } catch (Exception e) {
            throw new IllegalArgumentException(MOVE_INSTRUCTIONS);
        }

        poles[findSourcePoleIndex(commands[0])].transferTo(poles[commands[1]]);
    }

    private static void showPoles() {
        System.out.println(Arrays.stream(poles).map(Pole::toString).collect(joining()));
        System.out.println();
    }

}
