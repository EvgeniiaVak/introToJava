package chapter18.towers_of_hanoi;

import java.util.Stack;

import static java.util.stream.Collectors.joining;

public class Pole {
    private final Stack<Disk> disks = new Stack<>();

    public Pole() {
    }

    public Pole(Disk... disks) {
        for (Disk disk : disks) {
            this.disks.push(disk);
        }
    }

    private void accept(Disk disk) {
        if (disks.size() > 0 && disk.getSize() > disks.peek().getSize()) {
            throw new IllegalArgumentException("a disk cannot go on top of a smaller one");
        }

        disks.push(disk);
    }

    public void transferTo(Pole other) {
        if (disks.size() == 0) {
            throw new IllegalArgumentException("this pole has no disks to move");
        }
        other.accept(disks.peek());
        disks.pop();
    }

    public int getTopDiskSize() {
        if (disks.size() > 0)
         return disks.peek().getSize();

        return 0;
    }

    @Override
    public String toString() {
        return disks.stream()
                .map(Disk::toString)
                .collect(joining("", "\t\t\t---|", "|---\t\t\t"));
    }
}
