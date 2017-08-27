package chapter08;

import java.io.BufferedReader;
import java.io.FileReader;

public class DailyTemperatureAndHumidity {
    public static void main(String[] args) {
        double[][][] data = readDataFromFile();

        for (int day = 0; day < data.length; day++) {
            double averageTemperature = 0.0;
            double averageHumidity = 0.0;

            int hours = data[day].length;
            double sumTemp = 0;
            double sumHumid = 0;

            for (int hour = 0; hour < hours; hour++) {
                sumTemp += data[day][hour][0];
                sumHumid += data[day][hour][1];
            }

            averageTemperature = sumTemp / hours;
            averageHumidity = sumHumid / hours;

            System.out.printf("Day %d average temperature is %.1f%n", day + 1, averageTemperature);
            System.out.printf("Day %d average humidity is %d%%%n", day + 1, (int)(Math.round(averageHumidity*100)));
        }
    }

    private static double[][][] readDataFromFile() {
        double[][][] data = new double[10][24][2];

        try {

            BufferedReader reader = new BufferedReader(new FileReader("src/chapter08/weather.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split("\\s");
                int dayIndex = Integer.valueOf(split[0]) - 1;
                int hourIndex = Integer.valueOf(split[1]) - 1;
                //temperature
                data[dayIndex][hourIndex][0] = Double.valueOf(split[2]);
                //humidity
                data[dayIndex][hourIndex][1] = Double.valueOf(split[3]);
            }
        } catch (java.io.IOException e) {
            System.out.println("Couldn't read file");
            e.printStackTrace();
        }

        return data;
    }
}
