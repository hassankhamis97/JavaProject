package Winner;

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

public class WinnerUIOld extends BorderPane {

    Scene currentScene;
    protected final AnchorPane anchorPane;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane0;
    protected final Button button;
    protected final ImageView imageView;
    protected final Button button0;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;

    public WinnerUIOld() {

        anchorPane = new AnchorPane();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        button = new Button();
        imageView = new ImageView();
        button0 = new Button();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
//        setId("pane");
//setBackground(new Background(new BackgroundImage(new Image("game_over.jpg"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));

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

        button.setLayoutX(39.0);
        button.setLayoutY(246.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(114.0);
        button.setText("Play Again");
        button.setFont(new Font(16.0));
        button.setId("btn");

        imageView.setFitHeight(64.0);
        imageView.setFitWidth(407.0);
        imageView.setId("Header.png");
        imageView.setLayoutX(0.0);
        imageView.setLayoutY(113.0);
        imageView.setImage(new Image(WinnerUIOld.class.getResource("Header.png").toExternalForm()));
        //  imageView.setImage(new Image(getClass().getResource("file:/C:/Users/Marina-Sameh/Downloads/PNG/You_Win/Header.png").toExternalForm()));

        //    button0.setFont(javafx.scene.text.Font.$x1);
        button0.setFont(new Font(16.0));
        button0.setLayoutX(279.0);
        button0.setLayoutY(245.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0001220703125);
        button0.setPrefWidth(114.0);
        button0.setText("Main Menu");
        button0.setId("btn");
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

        anchorPane0.getChildren().add(button);
        anchorPane0.getChildren().add(imageView);
        anchorPane0.getChildren().add(button0);
        currentScene = new Scene(this);
    }

    BorderPane getParentNode() {
        return this;
    }

    protected Scene retScene() {
        return currentScene;
    }
}
