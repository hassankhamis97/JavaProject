package Levels;

import java.lang.*;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.*;
import javafx.scene.text.Font;

public abstract class LevelsBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane0;
    protected final Label label;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final Button back;

    public LevelsBase() {

        anchorPane = new AnchorPane();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        label = new Label();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        back = new Button();

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
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        label.setId("level");
        label.setLayoutX(51.0);
        label.setLayoutY(-55.0);
        label.setPrefHeight(94.0);
        label.setPrefWidth(225.0);
        label.setText("Levels");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#dfdfdf"));
        label.setFont(new Font("System Bold Italic", 70.0));

        button.setLayoutX(-33.0);
        button.setLayoutY(77.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(52.0);
        button.setPrefWidth(366.0);
        button.setText("Easy");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setFont(new Font(20.0));

      //  button0.setFont(javafx.scene.text.Font.$x1);
        button0.setLayoutX(-33.0);
        button0.setLayoutY(153.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(55.0);
        button0.setPrefWidth(366.0);
        button0.setText("Medium");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button1.setDisable(false);
        button1.setFocusTraversable(true);
      //  button1.setFont(javafx.scene.text.Font.$x1);
        button1.setLayoutX(-33.0);
        button1.setLayoutY(231.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(55.0);
        button1.setPrefWidth(366.0);
        button1.setText("Hard");
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setVisible(true);
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

        back.setLayoutX(14.0);
        back.setLayoutY(38.0);
        back.setMnemonicParsing(false);
        back.setText("Back");
        back.setTextFill(javafx.scene.paint.Color.valueOf("#202020"));
        setTop(anchorPane3);

        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(button);
        anchorPane0.getChildren().add(button0);
        anchorPane0.getChildren().add(button1);
        anchorPane3.getChildren().add(back);

    }
}
