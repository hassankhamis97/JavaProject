package OnlineWaiting;

import java.lang.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.*;
import javafx.scene.text.Font;

public class OnlineWaitUIConnect4 extends BorderPane {

    Scene currentScene;
    protected final AnchorPane anchorPane;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane0;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final Label label;
    protected final Label label0;
    protected final Button cancel;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;

    public OnlineWaitUIConnect4() {
        anchorPane = new AnchorPane();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        label = new Label();
        label0 = new Label();
        cancel = new Button();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        setId("pane");

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(90.0);
        anchorPane.setPrefWidth(600.0);
        setBottom(anchorPane);

        BorderPane.setAlignment(borderPane, javafx.geometry.Pos.CENTER);
        borderPane.setMaxHeight(USE_PREF_SIZE);
        borderPane.setMaxWidth(USE_PREF_SIZE);
        borderPane.setPrefHeight(260.0);
        borderPane.setPrefWidth(300.0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        imageView.setFitHeight(86.99990000000253);
        imageView.setFitWidth(102.0);
        imageView.setId("pic-user-1.png");
        imageView.setLayoutX(5.0);
        imageView.setLayoutY(7.0);
        imageView.setImage(new Image(OnlineWaitUIConnect4.class.getResource("pic-user-1.png").toExternalForm()));
        // imageView.setImage(new Image(getClass().getResource("Style/pic-user-1.png").toExternalForm()));

        imageView0.setFitHeight(86.999892370608);
        imageView0.setFitWidth(119.0);
        imageView0.setId("wait-user.png");
        imageView0.setLayoutX(184.0);
        imageView0.setLayoutY(7.0);
        imageView0.setImage(new Image(OnlineWaitUIConnect4.class.getResource("wait-user.png").toExternalForm()));
        //  imageView0.setImage(new Image(getClass().getResource("Style/wait-user.png").toExternalForm()));

        label.setLayoutX(135.0);
        label.setLayoutY(32.0);
        label.setText("VS");
        label.setFont(new Font("System Bold Italic", 33.0));

        // label0.setFont(javafx.scene.text.Font.$x1);
        label0.setFont(new Font("System Bold Italic", 33.0));
        label0.setLayoutX(0.0);
        label0.setLayoutY(132.0);
        label0.setText("Searching for player");

        cancel.setLayoutX(100.0);
        cancel.setLayoutY(207.0);
        cancel.setMnemonicParsing(false);
        cancel.setPrefHeight(27.0);
        cancel.setPrefWidth(84.0);
        cancel.setText("Cancel");
        cancel.setId("btn");
        borderPane.setCenter(anchorPane0);
        setCenter(borderPane);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(220.0);
        anchorPane1.setPrefWidth(150.0);
        setLeft(anchorPane1);

        BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
        anchorPane2.setPrefHeight(220.0);
        anchorPane2.setPrefWidth(150.0);
        setRight(anchorPane2);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setPrefHeight(52.0);
        anchorPane3.setPrefWidth(600.0);
        setTop(anchorPane3);

        anchorPane0.getChildren().add(imageView);
        anchorPane0.getChildren().add(imageView0);
        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(label0);
        anchorPane0.getChildren().add(cancel);
        currentScene = new Scene(this);
    }

    BorderPane getParentNode() {
        return this;
    }

    Scene retScene() {

        return currentScene;
    }
}
