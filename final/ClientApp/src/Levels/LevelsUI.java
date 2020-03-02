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

public class LevelsUI extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane0;
    protected final Label label;
    protected final Button easyBtn;
    protected final Button mediumBtn;
    protected final Button hardBtn;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final Button back;

    public LevelsUI() {

        anchorPane = new AnchorPane();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        label = new Label();
        easyBtn = new Button();
        mediumBtn = new Button();
        hardBtn = new Button();
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

        easyBtn.setLayoutX(-33.0);
        easyBtn.setLayoutY(77.0);
        easyBtn.setMnemonicParsing(false);
        easyBtn.setPrefHeight(52.0);
        easyBtn.setPrefWidth(366.0);
        easyBtn.setText("Easy");
        easyBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        easyBtn.setFont(new Font(20.0));
        easyBtn.setId("btn");

        //  mediumBtn.setFont(javafx.scene.text.Font.$x1);
        mediumBtn.setLayoutX(-33.0);
        mediumBtn.setLayoutY(153.0);
        mediumBtn.setMnemonicParsing(false);
        mediumBtn.setPrefHeight(55.0);
        mediumBtn.setPrefWidth(366.0);
        mediumBtn.setText("Medium");
        mediumBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        mediumBtn.setId("btn");
        hardBtn.setDisable(false);
        hardBtn.setFocusTraversable(true);
        //  hardBtn.setFont(javafx.scene.text.Font.$x1);
        hardBtn.setLayoutX(-33.0);
        hardBtn.setLayoutY(231.0);
        hardBtn.setMnemonicParsing(false);
        hardBtn.setPrefHeight(55.0);
        hardBtn.setPrefWidth(366.0);
        hardBtn.setText("Hard");
        hardBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        hardBtn.setVisible(true);
        hardBtn.setId("btn");
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
        anchorPane0.getChildren().add(easyBtn);
        anchorPane0.getChildren().add(mediumBtn);
        anchorPane0.getChildren().add(hardBtn);
        anchorPane3.getChildren().add(back);

    }
}
