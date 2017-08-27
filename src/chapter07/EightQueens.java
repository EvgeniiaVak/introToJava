package chapter07;

public class EightQueens {
    //an array that stores available positions left
    static int[] availablePositions = new  int[64];

    //an array with length 8 that stores queen positions
    // value % 8 indicates it's horizontal coordinate
    // value / 8 indicates it's vertical coordinate
    static int[] queens = new int[8];

    public static void main(String[] args) {

        update();

        //display the checkbox
        int index = 0;
        for (int i = 0; i < 64; i++) {
            if (contains(queens, i)) {
                System.out.print("|Q");
                if (index < 7) {
                    index++;
                }
            } else {
//                System.out.printf("|%2d", i);
                System.out.print("| ");
            }
            if ((i + 1) % 8 == 0) System.out.println("|");
        }


    }

    private static boolean contains(int[] positions, int i) {
        for (int position : positions) {
            if (position == i)
                return true;
        }
        return false;
    }

    private static boolean attacks(int a, int b) {
        if (a == b)
            return true;

        //check vertically
        int aColumn = a % 8;
        int bColumn = b % 8;
        if (aColumn == bColumn)
            return true;

        //check horizontally
        int aRow = a / 8;
        int bRow = b / 8;
        if (aRow == bRow)
            return true;

        //check diagonally
        int diffColumns = Math.abs(aColumn - bColumn);
        int diffRows = Math.abs(aRow - bRow);
        if (diffColumns == diffRows)
            return true;

        return false;
    }

    public static void update() {
        for (int i = 0; i < queens.length; i++) {
            queens[i] = -1;
        }

        for (int i = 0; i < availablePositions.length; i++) {
            availablePositions[i] = i;
        }

        queens[0] = 33;//randomPosition();
        dumpUnavailablePositions();

        // FIXME: 8/7/17 does not work at all with needed length
        for (int i = 1; i < 7; i++) {
            int position = findNextAvailablePosition();
            if (position < 0)
                update();
            else {
                queens[i] = position;
                dumpUnavailablePositions();
            }
        }

    }

    private static void dumpUnavailablePositions() {
//        //get rid of unavailable positions
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < availablePositions.length; j++) {
                if (availablePositions[j] >= 0 && queens[i] >= 0) {
                    if (attacks(queens[i], availablePositions[j])) {
                        availablePositions[j] = -100;
                    }
                }
            }
        }
    }

    private static int findNextAvailablePosition() {
        for (int i = 0; i < availablePositions.length; i++) {
            if (availablePositions[i] >= 0)
                return availablePositions[i];
        }
        return -100;
    }

    public static int randomPosition() {
        return (int) (Math.random() * 64);
    }
}
