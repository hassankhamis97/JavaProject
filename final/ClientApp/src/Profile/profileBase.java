package Profile;

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

public abstract class profileBase extends BorderPane {

    Scene currentScene;
    protected final AnchorPane anchorPane;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane0;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final Label totalTime;
    protected final Label totalScore;
    protected final Label totalGames;
    protected final Label numberOfWinnings;
    protected final Label levels;
    protected final Label coins;
    protected final ImageView imageView;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final Button button;
    protected final ImageView imageView0;

    public profileBase() {

        anchorPane = new AnchorPane();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        totalTime = new Label();
        totalScore = new Label();
        totalGames = new Label();
        numberOfWinnings = new Label();
        levels = new Label();
        coins = new Label();
        imageView = new ImageView();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        button = new Button();
        imageView0 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

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
        anchorPane0.setPrefHeight(295.0);
        anchorPane0.setPrefWidth(300.0);

        label.setLayoutX(14.0);
        label.setLayoutY(39.0);
        label.setText("Total Time");
        label.setFont(new Font("System Bold Italic", 25.0));

        // label0.setFont(javafx.scene.text.Font.$x1);
        label0.setLayoutX(14.0);
        label0.setLayoutY(80.0);
        label0.setText("Total Score");

        //label1.setFont(javafx.scene.text.Font.$x1);
        label1.setLayoutX(14.0);
        label1.setLayoutY(121.0);
        label1.setText("Total Games");

        //label2.setFont(javafx.scene.text.Font.$x1);
        label2.setLayoutX(14.0);
        label2.setLayoutY(204.0);
        label2.setText("Level");

        //label3.setFont(javafx.scene.text.Font.$x1);
        label3.setLayoutX(14.0);
        label3.setLayoutY(160.0);
        label3.setText("Number of winnings");

        //label4.setFont(javafx.scene.text.Font.$x1);
        label4.setLayoutX(14.0);
        label4.setLayoutY(242.0);
        label4.setText("Coins");

        //totalTime.setFont(javafx.scene.text.Font.$x1);
        totalTime.setId("total_time");
        totalTime.setLayoutX(271.0);
        totalTime.setLayoutY(39.0);
        totalTime.setText("0");

//        totalScore.setFont(javafx.scene.text.Font.$x1);
        totalScore.setId("total_score");
        totalScore.setLayoutX(271.0);
        totalScore.setLayoutY(80.0);
        totalScore.setText("0");

//        totalGames.setFont(javafx.scene.text.Font.$x1);
        totalGames.setLayoutX(271.0);
        totalGames.setLayoutY(121.0);
        totalGames.setText("0");

//        numberOfWinnings.setFont(javafx.scene.text.Font.$x1);
        numberOfWinnings.setLayoutX(271.0);
        numberOfWinnings.setLayoutY(160.0);
        numberOfWinnings.setText("0");

//        levels.setFont(javafx.scene.text.Font.$x1);
        levels.setLayoutX(271.0);
        levels.setLayoutY(204.0);
        levels.setText("0");

//        coins.setFont(javafx.scene.text.Font.$x1);
        coins.setLayoutX(271.0);
        coins.setLayoutY(242.0);
        coins.setText("0");

        imageView.setFitHeight(63.0);
        imageView.setFitWidth(69.0);
        imageView.setId("pic-user-1.png");
        imageView.setLayoutX(120.0);
        imageView.setLayoutY(-24.0);
        imageView.setImage(new Image(getClass().getResource("Style/pic-user-1.png").toExternalForm()));
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

        AnchorPane.setLeftAnchor(button, 15.0);
        AnchorPane.setTopAnchor(button, 15.0);
        button.setMinHeight(34.0);
        button.setMinWidth(26.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(34.0);
        button.setPrefWidth(61.0);
        button.setText("Button");

        imageView0.setFitHeight(36.0);
        imageView0.setFitWidth(54.999900000002526);
        imageView0.setId("Backward_BTN.png");
        imageView0.setImage(new Image(getClass().getResource("file:/C:/Users/Marina-Sameh/Downloads/PNG/Rating/Backward_BTN.png").toExternalForm()));
        button.setGraphic(imageView0);
        setTop(anchorPane3);

        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(label0);
        anchorPane0.getChildren().add(label1);
        anchorPane0.getChildren().add(label2);
        anchorPane0.getChildren().add(label3);
        anchorPane0.getChildren().add(label4);
        anchorPane0.getChildren().add(totalTime);
        anchorPane0.getChildren().add(totalScore);
        anchorPane0.getChildren().add(totalGames);
        anchorPane0.getChildren().add(numberOfWinnings);
        anchorPane0.getChildren().add(levels);
        anchorPane0.getChildren().add(coins);
        anchorPane0.getChildren().add(imageView);
        anchorPane3.getChildren().add(button);

        currentScene = new Scene(this);
    }

    public BorderPane getParentNode() {
        return this;
    }

    protected Scene retScene() {

        return currentScene;
    }

}
