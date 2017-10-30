package chapter14.exercise29;

import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class BeanMachinePane extends Pane {
    int numberOfSockets;
    double size = 50;
    double w, h;

    public BeanMachinePane(int numberOfSockets) {
        this.numberOfSockets = numberOfSockets;

        w = numberOfSockets * size + 2 * size;
        h = numberOfSockets * size + 2 * size;

        setPrefHeight(h);
        setPrefWidth(w);
        setPadding(new Insets(size, size, size, size));
        drawBeanMachine();
    }

    public void drawBeanMachine() {
        //draw sockets
        for (int i = 0; i <= numberOfSockets; i++) {
            double x = size + i * size;
            double y1 =  h - 2.5 * size;
            double y2 = h - 0.5 * size;
            Line line = new Line(x, y1, x, y2);
            getChildren().add(line);
        }

        //draw nails
        //for each row from bottom up
        for (int i = 0; i <= numberOfSockets; i++) {

            //put correct number of nails
            for (int j = i; j <= numberOfSockets - i; j++) {
                Circle nail = new Circle(size + j * size, h - 2.5 * size -  size * i, 10, Color.GRAY);
                getChildren().add(nail);
            }
        }
    }
}
