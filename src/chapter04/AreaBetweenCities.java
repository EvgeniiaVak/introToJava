package chapter04;

/*
* (Geography: estimate areas) Find the GPS locations for
* Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina
* from www.gps-data-team.com/map/ and compute the estimated area enclosed by these four cities.
* (Hint: Use the formula in Programming Exercise 4.2 to compute the distance between two cities.
* Divide the polygon into two triangles and use the formula in Programming Exercise 2.19
* to compute the area of a triangle.)
* */

import chapter02.AreaOfTriangle;

public class AreaBetweenCities {
    public final static double ATLANTA_LAT = 55.7522222;
    public final static double ATLANTA_LON = 37.61555559999999;
    public final static double ORLANDO_LAT = 28.5383355;
    public final static double ORLANDO_LON = -81.37923649999999;
    public final static double SAVANNAH_LAT = 32.0835407;
    public final static double SAVANNAH_LON = -81.09983419999998;
    public final static double CHARLOTTE_LAT = 35.2270869;
    public final static double CHARLOTTE_LON = -80.84312669999997;



    public static void main(String[] args) {
        //get the 5 sides
        double sideAO = GreatCircleDistance.getGreatCircleDistance(
                true,
                ATLANTA_LAT, ATLANTA_LON,
                ORLANDO_LAT, ORLANDO_LON
                );

        double sideOS = GreatCircleDistance.getGreatCircleDistance(
                true,
                ORLANDO_LAT, ORLANDO_LON,
                SAVANNAH_LAT, SAVANNAH_LON
        );

        double sideSC = GreatCircleDistance.getGreatCircleDistance(
                true,
                SAVANNAH_LAT, SAVANNAH_LON,
                CHARLOTTE_LAT, CHARLOTTE_LON
        );

        double sideCA = GreatCircleDistance.getGreatCircleDistance(
                true,
                CHARLOTTE_LAT, CHARLOTTE_LON,
                ATLANTA_LAT, ATLANTA_LON
        );

        double sideAS = GreatCircleDistance.getGreatCircleDistance(
                true,
                ATLANTA_LAT, ATLANTA_LON,
                SAVANNAH_LAT, SAVANNAH_LON
        );

        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        double areaOfTriangleAOS = areaOfTriangle.getAreaOfTriangle(sideAO, sideOS, sideAS);
        double areaOfTriangleSCA = areaOfTriangle.getAreaOfTriangle(sideSC, sideCA, sideAS);

        System.out.println("The Area between Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina is");
        System.out.println(areaOfTriangleAOS + areaOfTriangleSCA);


    }


}
