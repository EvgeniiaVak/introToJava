package chapter05;

public class HeadsOrTails {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < 1000000; i++) {
            int hot = (int) (Math.random() * 2);
            if (hot == 1) heads++;
            else tails++;
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
