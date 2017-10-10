package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyJavaFx extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50);
        Button button = new Button("OK");
        Circle circle1 = new Circle(10);
        circle1.setStroke(new Color(Math.random(), Math.random(), Math.random(), 0.85));
        circle1.setFill(null);

        Pane pane = new StackPane(circle, button, circle1);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Button OK");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
