package chapter14.exercise02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

import java.util.Random;

public class TicTacToeBoard extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = createGrid(3);
        fillGrid(new Random(1), gridPane);

        primaryStage.setTitle("Random Tic Tac Toe");
        primaryStage.setScene(new Scene(gridPane));
        primaryStage.show();
    }

    public static void fillGrid(Random random, GridPane grid) {
        for (int i = 0; i < grid.getRowConstraints().size(); i++) {
            for (int j = 0; j < grid.getColumnConstraints().size(); j++) {
                int k = random.nextInt(3);

                if (k == 0) {
                    grid.add(new ImageView("chapter14/exercise02/images/o.gif"), j, i);
                }

                if (k == 1) {
                    grid.add(new ImageView("chapter14/exercise02/images/x.gif"), j, i);
                }
            }
        }
    }

    public static GridPane createGrid(int size) {
        GridPane gridPane = new GridPane();

        for (int i = 0; i < size; i++) {
            ColumnConstraints cc = new ColumnConstraints();
            cc.setFillWidth(true);
            cc.setHgrow(Priority.ALWAYS);

            RowConstraints rc = new RowConstraints();
            rc.setFillHeight(true);
            rc.setVgrow(Priority.ALWAYS);

            gridPane.getColumnConstraints().add(cc);
            gridPane.getRowConstraints().add(rc);
        }

        return gridPane;
    }
}