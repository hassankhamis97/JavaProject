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
    protected final Button playAgainBtn;
    protected final ImageView imageView;
    protected final Button mainMenuBtn;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;

    public WinnerUIOld() {

        anchorPane = new AnchorPane();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        playAgainBtn = new Button();
        imageView = new ImageView();
        mainMenuBtn = new Button();
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

        playAgainBtn.setLayoutX(39.0);
        playAgainBtn.setLayoutY(246.0);
        playAgainBtn.setMnemonicParsing(false);
        playAgainBtn.setPrefHeight(31.0);
        playAgainBtn.setPrefWidth(114.0);
        playAgainBtn.setText("Play Again");
        playAgainBtn.setFont(new Font(16.0));
        playAgainBtn.setId("btn");

        imageView.setFitHeight(64.0);
        imageView.setFitWidth(407.0);
        imageView.setId("Header.png");
        imageView.setLayoutX(0.0);
        imageView.setLayoutY(113.0);
        imageView.setImage(new Image(WinnerUIOld.class.getResource("Header.png").toExternalForm()));
        //  imageView.setImage(new Image(getClass().getResource("file:/C:/Users/Marina-Sameh/Downloads/PNG/You_Win/Header.png").toExternalForm()));

        //    mainMenuBtn.setFont(javafx.scene.text.Font.$x1);
        mainMenuBtn.setFont(new Font(16.0));
        mainMenuBtn.setLayoutX(279.0);
        mainMenuBtn.setLayoutY(245.0);
        mainMenuBtn.setMnemonicParsing(false);
        mainMenuBtn.setPrefHeight(31.0001220703125);
        mainMenuBtn.setPrefWidth(114.0);
        mainMenuBtn.setText("Main Menu");
        mainMenuBtn.setId("btn");
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

        anchorPane0.getChildren().add(playAgainBtn);
        anchorPane0.getChildren().add(imageView);
        anchorPane0.getChildren().add(mainMenuBtn);
        currentScene = new Scene(this);
    }

    BorderPane getParentNode() {
        return this;
    }

    protected Scene retScene() {
        return currentScene;
    }
}
