package chapter14.exercise26;

import chapter14.ClockPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Clock extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new HBox(new ClockPane(4, 20, 45), new ClockPane(22, 46, 15));

        primaryStage.setTitle("Time");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }
}
