package chapter08;

public class NearestPoints {
    public static void main(String[] args) {
        double[][] points = new double[args.length / 2][2];

        int argsI = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = Double.valueOf(args[argsI]);
                if (argsI < args.length)
                    argsI++;
            }
        }

        double minDistance = getDistance(points);


        //search for smaller distance
        for (int i = 0; i < points.length - 1; i++) {

            for (int j = i + 1; j < points[i].length; j++) {
                double distance = getDistance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);
                if (distance < minDistance)
                    minDistance = distance;
            }



        }

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (i != j) {
                    double x1 = points[i][0];
                    double y1 = points[i][1];
                    double x2 = points[j][0];
                    double y2 = points[j][1];

                    if (minDistance == getDistance(x1, y1, x2, y2)) {
                        System.out.printf("The closest two points are (%.2f, %.2f) and (%.2f, %.2f)%n",
                                x1, y1, x2, y2);
                    }
                }
            }
        }

        System.out.println("Their distance is " + minDistance);
    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double getDistance(double[] pointA, double[] pointB) {
        return Math.sqrt(Math.pow(pointB[0] - pointA[0], 2) + Math.pow(pointB[1] - pointA[1], 2));
    }

    public static double getDistance(double[][] points) {
        return Math.sqrt(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2));
    }
}
