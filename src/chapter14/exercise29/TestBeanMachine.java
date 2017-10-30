package chapter14.exercise29;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestBeanMachine extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BeanMachinePane pane = new BeanMachinePane(6);

        primaryStage.setTitle("Bean Machine");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }
}
