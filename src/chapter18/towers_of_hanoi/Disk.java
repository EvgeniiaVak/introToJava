package chapter18.towers_of_hanoi;

public class Disk implements Comparable<Disk>{

    private final int size;

    public Disk(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "(" + size + ")";
    }

    @Override
    public int compareTo(Disk o) {
        return Integer.compare(size, o.size);
    }
}
