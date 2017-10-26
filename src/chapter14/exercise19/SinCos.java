package chapter14.exercise19;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class SinCos extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        pane.setPrefSize(400, 200);

        Line xLine = new Line(10, 100, 390, 100);
        Line yLine = new Line(100, 10, 100, 190);

        Polyline sin = new Polyline();
        ObservableList<Double> sinPoints = sin.getPoints();
        double scaleFactor = 45;

        for (int x = -170; x <= 170; x++) {
            sinPoints.add(x + 200.0);
            sinPoints.add(100 - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI));
        }

        Polyline cos = new Polyline();
        ObservableList<Double> cosPoints = cos.getPoints();

        for (int x = -170; x <= 170; x++) {
            cosPoints.add(x + 200.0);
            cosPoints.add(100 - scaleFactor * Math.cos((x / 100.0) * 2 * Math.PI));
        }

        pane.getChildren().addAll(xLine, yLine, sin, cos);
        primaryStage.setTitle("Sine and Cosine");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }
}
