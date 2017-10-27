package chapter14.exercise27;

import chapter14.ClockPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class DetailedClockPane extends ClockPane {

    public DetailedClockPane() {
    }

    public DetailedClockPane(int hour, int minute, int second) {
        super(hour, minute, second);
    }

    @Override
    protected void paintClock() {
        super.paintClock();

        //add details
        double radius = getW() / 2;
        double center = getW() / 2;

        double angle = 2 * Math.PI / 60;

        for (int i = 0; i < 60; i++) {
            double lineLength = (i % 5 == 0) ? 10 : 5;

            double xInner = center + (radius - lineLength) * Math.sin(i * angle);
            double yInner = center - (radius - lineLength) * Math.cos(i * angle);

            double xEdge = center + radius * Math.sin(i * angle);
            double yEdge = center - radius * Math.cos(i * angle);

            Line line = new Line(xInner, yInner, xEdge, yEdge);
            line.setStroke(Color.BLACK);

            getChildren().add(line);
        }
    }
}
