package chapter14;

import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.List;

public class Test extends Application {

    public Test() {
        System.out.println("Test constructor is invoked");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start method is invoked");
    }

    public static void main(String[] args) {
        System.out.println("launch application");
        launch(args);

        List<String> fontFamilies = Font.getFamilies();

        for (String fontFamily : fontFamilies) {
            System.out.println(fontFamily);
        }
    }
}