package chapter14.exercise01;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FlagDisplay extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();

        pane.add(new ImageView("chapter14/exercise01/images/flag_1.jpg"), 0, 0);
        pane.add(new ImageView("chapter14/exercise01/images/flag_2.jpg"), 0, 1);
        pane.add(new ImageView("chapter14/exercise01/images/flag_3.png"), 1, 0);
        pane.add(new ImageView("chapter14/exercise01/images/flag_4.png"), 1, 1);

        primaryStage.setTitle("Flags");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }
}
