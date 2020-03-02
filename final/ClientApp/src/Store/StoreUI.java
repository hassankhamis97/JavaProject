package Store;

import java.lang.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.*;

public class StoreUI extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane0;
    protected final Button buy;
    protected final ImageView L11;
    protected final ImageView l12;
    protected final ImageView L13;
    protected final ImageView L21;
    protected final ImageView L22;
    protected final ImageView L23;
    protected final Separator separator;
    protected final ImageView L31;
    protected final ImageView L32;
    protected final ImageView L33;
    protected final Label label;
    protected final ImageView gold;
    protected final Label coinsText;
    protected final Label label1;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final Button back;
    protected final ImageView goBack;
    Scene currentScene;

    public StoreUI() {

        anchorPane = new AnchorPane();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        buy = new Button();
        L11 = new ImageView();
        l12 = new ImageView();
        L13 = new ImageView();
        L21 = new ImageView();
        L22 = new ImageView();
        L23 = new ImageView();
        separator = new Separator();
        L31 = new ImageView();
        L32 = new ImageView();
        L33 = new ImageView();
        label = new Label();
        gold = new ImageView();
        coinsText = new Label();
        label1 = new Label();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        back = new Button();
        goBack = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(524.0);
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
        anchorPane0.setMinHeight(29.0);
        anchorPane0.setMinWidth(40.0);
        anchorPane0.setPrefHeight(295.0);
        anchorPane0.setPrefWidth(334.0);

        buy.setLayoutX(0.0);
        buy.setLayoutY(246.0);
        buy.setMnemonicParsing(false);
        buy.setPrefHeight(26.0);
        buy.setPrefWidth(76.0);
        buy.setText("Buy");
        buy.setId("btn");

        L11.setFitHeight(97.0);
        L11.setFitWidth(104.0);
        L11.setId("giphy.gif");
        L11.setLayoutX(-28.0);
        L11.setLayoutY(-30.0);
        //   L11.setImage(new Image(StoreUI.class.getResource("giphy.gif").toExternalForm()));
        //   L11.setImage(new Image(getClass().getResource("Style/Using%20Text%20and%20Text%20Effects%20in%20JavaFX%20_%20JavaFX%202%20Tutorials%20and%20Documentation_files/giphy.gif").toExternalForm()));

        l12.setFitHeight(62.0);
        l12.setFitWidth(92.0);
        l12.setId("party_face_256_1.gif");
        l12.setLayoutX(76.0);
        l12.setLayoutY(-16.0);
        //   l12.setImage(new Image(StoreUI.class.getResource("party_face_256_1.gif").toExternalForm()));
        // l12.setImage(new Image(getClass().getResource("Style/Using%20Text%20and%20Text%20Effects%20in%20JavaFX%20_%20JavaFX%202%20Tutorials%20and%20Documentation_files/party_face_256_1.gif").toExternalForm()));

        L13.setFitHeight(76.0);
        L13.setFitWidth(104.0);
        L13.setId("01ced744ea38ab24bd06fcb916845d6d.gif");
        L13.setLayoutX(182.0);
        L13.setLayoutY(-30.0);
        //    L13.setImage(new Image(StoreUI.class.getResource("01ced744ea38ab24bd06fcb916845d6d.gif").toExternalForm()));
        //    L13.setImage(new Image(getClass().getResource("Style/Using%20Text%20and%20Text%20Effects%20in%20JavaFX%20_%20JavaFX%202%20Tutorials%20and%20Documentation_files/01ced744ea38ab24bd06fcb916845d6d.gif").toExternalForm()));

        L21.setFitHeight(74.0);
        L21.setFitWidth(66.0);
        L21.setId("7c56ac4ae590dd56095077e8c6de0642.gif");
        L21.setLayoutX(-19.0);
        L21.setLayoutY(46.0);
        //   L21.setImage(new Image(StoreUI.class.getResource("7c56ac4ae590dd56095077e8c6de0642.gif").toExternalForm()));
        //   L21.setImage(new Image(getClass().getResource("Style/Using%20Text%20and%20Text%20Effects%20in%20JavaFX%20_%20JavaFX%202%20Tutorials%20and%20Documentation_files/7c56ac4ae590dd56095077e8c6de0642.gif").toExternalForm()));

        L22.setFitHeight(76.0);
        L22.setFitWidth(88.0);
        L22.setId("3cb21150e8fe1f45c9a76b0d50303563.gif");
        L22.setLayoutX(76.0);
        L22.setLayoutY(44.0);
        //    L22.setImage(new Image(StoreUI.class.getResource("3cb21150e8fe1f45c9a76b0d50303563.gif").toExternalForm()));
        //    L22.setImage(new Image(getClass().getResource("Style/Using%20Text%20and%20Text%20Effects%20in%20JavaFX%20_%20JavaFX%202%20Tutorials%20and%20Documentation_files/3cb21150e8fe1f45c9a76b0d50303563.gif").toExternalForm()));

        L23.setFitHeight(67.0);
        L23.setFitWidth(96.0);
        L23.setId("O0Lj.gif");
        L23.setLayoutX(182.0);
        L23.setLayoutY(44.0);
        //    L23.setImage(new Image(StoreUI.class.getResource("O0Lj.gif").toExternalForm()));
        //    L23.setImage(new Image(getClass().getResource("Style/Using%20Text%20and%20Text%20Effects%20in%20JavaFX%20_%20JavaFX%202%20Tutorials%20and%20Documentation_files/O0Lj.gif").toExternalForm()));
        separator.setLayoutX(-136.0);
        separator.setLayoutY(130.0);
        separator.setPrefWidth(572.0);
        L31.setFitHeight(62.00000081786857);
        L31.setFitWidth(88.0);
        L31.setId("715vwvP5ZEL-removebg-preview.png");
        L31.setLayoutX(-30.0);
        L31.setLayoutY(133.0);
        //imageView5.setImage(new Image(StoreUI.class.getResource("715vwvP5ZEL-removebg-preview.png").toExternalForm()));
        //    L31.setImage(new Image(getClass().getResource("Style/Using%20Text%20and%20Text%20Effects%20in%20JavaFX%20_%20JavaFX%202%20Tutorials%20and%20Documentation_files/715vwvP5ZEL-removebg-preview.png").toExternalForm()));

        L32.setFitHeight(62.0);
        L32.setFitWidth(96.0);
        L32.setId("6795255_preview-removebg-preview.png");
        L32.setLayoutX(74.0);
        L32.setLayoutY(145.0);
        //    L32.setImage(new Image(StoreUI.class.getResource("6795255_preview-removebg-preview.png").toExternalForm()));
        //    L32.setImage(new Image(getClass().getResource("Style/Using%20Text%20and%20Text%20Effects%20in%20JavaFX%20_%20JavaFX%202%20Tutorials%20and%20Documentation_files/6795255_preview-removebg-preview.png").toExternalForm()));

        L33.setFitHeight(48.0);
        L33.setFitWidth(92.0);
        L33.setId("423543534-removebg-preview.png");
        L33.setLayoutX(188.0);
        L33.setLayoutY(147.0);
        // L33.setImage(new Image(StoreUI.class.getResource("423543534-removebg-preview.png").toExternalForm()));
        //    L33.setImage(new Image(getClass().getResource("Style/Using%20Text%20and%20Text%20Effects%20in%20JavaFX%20_%20JavaFX%202%20Tutorials%20and%20Documentation_files/423543534-removebg-preview.png").toExternalForm()));

        label.setLayoutX(286.0);
        label.setLayoutY(34.0);
        label.setText("15 C");
        label.setFont(new Font("System Bold Italic", 33.0));

        gold.setFitHeight(121.0);
        gold.setFitWidth(139.0);
        gold.setId("gold-coins-bag-golden-coin-wealth-big-cash-sack-vector-24251294-removebg-preview.png");
        gold.setLayoutX(217.0);
        gold.setLayoutY(212.0);
        //    gold.setImage(new Image(StoreUI.class.getResource("goBack-coins-bag-golden-coin-wealth-big-cash-sack-vector-24251294-removebg-preview.png").toExternalForm()));
        //    gold.setImage(new Image(getClass().getResource("New/StoreScene/src/storescene/gold-coins-bag-golden-coin-wealth-big-cash-sack-vector-24251294-removebg-preview.png").toExternalForm()));

        //    coinsText.setFont(javafx.scene.text.Font.$x1);
        coinsText.setFont(new Font("System Bold Italic", 33.0));
        coinsText.setLayoutX(197.0);
        coinsText.setLayoutY(238.0);
        coinsText.setText("0");

        //    label1.setFont(javafx.scene.text.Font.$x1);
        label1.setFont(new Font("System Bold Italic", 33.0));
        label1.setLayoutX(291.0);
        label1.setLayoutY(142.0);
        label1.setText("5 C");
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
        anchorPane3.setMinHeight(74.0);
        anchorPane3.setPrefHeight(74.0);
        anchorPane3.setPrefWidth(600.0);

        AnchorPane.setLeftAnchor(back, 20.0);
        AnchorPane.setTopAnchor(back, 15.0);
        back.setMnemonicParsing(false);
        back.setPrefWidth(50.0);
        back.setText("");
        back.setId("btn1");

        AnchorPane.setLeftAnchor(goBack, 20.0);
        AnchorPane.setTopAnchor(goBack, 14.0);
        goBack.setFitHeight(27.0);
        goBack.setFitWidth(49.999900000002526);
        goBack.setId("Backward_BTN.png");
        goBack.setImage(new Image(StoreUI.class.getResource("/Resources/Backward_BTN.png").toExternalForm()));
        //    goBack.setImage(new Image(getClass().getResource("Style/Backward_BTN.png").toExternalForm()));
        setTop(anchorPane3);

        anchorPane0.getChildren().add(buy);
        anchorPane0.getChildren().add(L11);
        anchorPane0.getChildren().add(l12);
        anchorPane0.getChildren().add(L13);
        anchorPane0.getChildren().add(L21);
        anchorPane0.getChildren().add(L22);
        anchorPane0.getChildren().add(L23);
        anchorPane0.getChildren().add(separator);
        anchorPane0.getChildren().add(L31);
        anchorPane0.getChildren().add(L32);
        anchorPane0.getChildren().add(L33);
        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(gold);
        anchorPane0.getChildren().add(coinsText);
        anchorPane0.getChildren().add(label1);
        anchorPane3.getChildren().add(back);
        anchorPane3.getChildren().add(goBack);

        currentScene = new Scene(this);

    }

    public BorderPane getParentNode() {
        return this;
    }

    Scene retScene() {
        return currentScene;
    }
}
