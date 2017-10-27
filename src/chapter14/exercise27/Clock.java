package chapter14.exercise27;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Clock extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new HBox(new DetailedClockPane(4, 20, 45), new DetailedClockPane(22, 46, 15));

        primaryStage.setTitle("Time");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }
}
