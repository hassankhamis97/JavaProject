package guesstheword;

import java.lang.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.text.*;
import javafx.scene.text.Font;

class GuessTheWordMenuUI extends BorderPane {

    Scene currentScene;
    protected final AnchorPane anchorPane;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane0;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final ImageView imageView;

    public GuessTheWordMenuUI() {

        anchorPane = new AnchorPane();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        imageView = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(554.0);
        setPrefWidth(600.0);
        setId("pane");

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(90.00009999999747);
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

        button.setLayoutX(0.0);
        button.setLayoutY(130.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(30.0);
        button.setPrefWidth(300.0);
        button.setText("Two Player");
        button.setFont(new Font(16.0));
        button.setId("btn");

        //    button0.setFont(javafx.scene.text.Font.$x1);
        button0.setFont(new Font(16.0));
        button0.setLayoutX(0.0);
        button0.setLayoutY(231.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(30.0);
        button0.setPrefWidth(300.0);
        button0.setText("Play Online");
        button0.setId("btn");

        //    button1.setFont(javafx.scene.text.Font.$x1);
        button1.setFont(new Font(16.0));
        button1.setLayoutX(0.0);
        button1.setLayoutY(29.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(30.0);
        button1.setPrefWidth(300.0);
        button1.setText("One Player");
        button1.setId("btn");
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

        AnchorPane.setBottomAnchor(imageView, -53.0);
        AnchorPane.setLeftAnchor(imageView, 633.0);
        AnchorPane.setRightAnchor(imageView, 617.0);
        imageView.setFitHeight(91.0);
        imageView.setFitWidth(362.0);
//        imageView.setId("connect-4-png-6.png");
//        imageView.setImage(new Image(GuessTheWordMenuUI.class.getResource("connect-4-png-6.png").toExternalForm()));
        //    imageView.setImage(new Image(getClass().getResource("Style/Using%20Text%20and%20Text%20Effects%20in%20JavaFX%20_%20JavaFX%202%20Tutorials%20and%20Documentation_files/connect-4-png-6.png").toExternalForm()));
        setTop(anchorPane3);

        anchorPane0.getChildren().add(button);
        anchorPane0.getChildren().add(button0);
        anchorPane0.getChildren().add(button1);
        anchorPane3.getChildren().add(imageView);
        currentScene = new Scene(this);
    }

    BorderPane getParentNode() {
        return this;
    }

    protected Scene retScene() {

        return currentScene;
    }
}
