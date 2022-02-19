package UGAHackathon7.SkipNSit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class SkipNSitApp extends Application {

    VBox root;
    Label label1;
    Label label2;
    public void init () {
        root = new VBox (10);
        label1 = new Label ("Label 1");
         label2 = new Label ("Label 2");
        root.getChildren().addAll(label1, label2);

    }

    public void start (Stage stage) {

        Scene scene = new Scene(root);
        stage.setMaxWidth(900);
        stage.setMaxHeight(700);
        stage.setScene(scene);
        stage.setTitle("Skip'N Sit");
        stage.show();
    }

}
