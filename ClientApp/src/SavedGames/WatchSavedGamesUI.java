package SavedGames;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class WatchSavedGamesUI extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final BorderPane borderPane;
    protected final AnchorPane ListContainer_anchor;
//    protected final AnchorPane MainItem_anchor;
//    protected final Label time_Lbl;
//    protected final Label Date_Lbl;
//    protected final Button watch_btn;
//    protected final Label opponentName_Lbl;
    protected final ImageView imageView;
    protected final AnchorPane anchorPane0;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final Button backBtn;
    protected final ImageView imageView0;

    public WatchSavedGamesUI() {

        anchorPane = new AnchorPane();
        borderPane = new BorderPane();
        ListContainer_anchor = new AnchorPane();
//        MainItem_anchor = new AnchorPane();
//        time_Lbl = new Label();
//        Date_Lbl = new Label();
//        watch_btn = new Button();
//        opponentName_Lbl = new Label();
        imageView = new ImageView();
        anchorPane0 = new AnchorPane();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        backBtn = new Button();
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
        borderPane.setPrefHeight(255.0);
        borderPane.setPrefWidth(338.0);

        BorderPane.setAlignment(ListContainer_anchor, javafx.geometry.Pos.CENTER);
        ListContainer_anchor.setPrefHeight(254.0);
        ListContainer_anchor.setPrefWidth(337.0);

//        MainItem_anchor.setLayoutX(0.0);
//        MainItem_anchor.setLayoutY(14.0);
//        MainItem_anchor.setMinHeight(71.0);
//        MainItem_anchor.setPrefHeight(71.0);
//        MainItem_anchor.setPrefWidth(308.0);

//        time_Lbl.setLayoutX(104.0);
//        time_Lbl.setLayoutY(36.0);
//        time_Lbl.setPrefWidth(40.0);
//        time_Lbl.setText("Time");
//        time_Lbl.setFont(new Font(14.0));
//
////        Date_Lbl.setFont(javafx.scene.text.Font.$x1);
//        Date_Lbl.setLayoutX(48.0);
//        Date_Lbl.setLayoutY(36.0);
//        Date_Lbl.setPrefWidth(40.0);
//        Date_Lbl.setText("Date");
//
//        watch_btn.setLayoutX(220.0);
//        watch_btn.setLayoutY(10.0);
//        watch_btn.setMnemonicParsing(false);
//        watch_btn.setPrefHeight(31.0);
//        watch_btn.setPrefWidth(88.0);
//        watch_btn.setText("Watch");

//        opponentName_Lbl.setFont(javafx.scene.text.Font.$x1);
//        opponentName_Lbl.setLayoutX(20.0);
//        opponentName_Lbl.setLayoutY(17.0);
//        opponentName_Lbl.setText("Opponent Player");

        AnchorPane.setTopAnchor(imageView, -60.0);
        imageView.setFitHeight(48.0);
        imageView.setFitWidth(76.0);
        imageView.setId("Play_BTN.png");
        imageView.setLayoutX(112.0);
        imageView.setImage(new Image(WatchSavedGamesUI.class.getResource("Play_BTN.png").toExternalForm()));
        BorderPane.setMargin(ListContainer_anchor, new Insets(0.0));
        borderPane.setCenter(ListContainer_anchor);
        BorderPane.setMargin(borderPane, new Insets(0.0));
        setCenter(borderPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(220.0);
        anchorPane0.setPrefWidth(150.0);
        setLeft(anchorPane0);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(257.9999000000025);
        anchorPane1.setPrefWidth(150.0001220703125);
        setRight(anchorPane1);

        BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
        anchorPane2.setMinHeight(60.0);
        anchorPane2.setPrefHeight(71.0);
        anchorPane2.setPrefWidth(600.0);

        AnchorPane.setLeftAnchor(backBtn, 15.0);
        AnchorPane.setTopAnchor(backBtn, 15.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(31.0);
        backBtn.setPrefWidth(54.999908447265625);
        backBtn.setText("");

        AnchorPane.setLeftAnchor(imageView0, 15.0);
        AnchorPane.setTopAnchor(imageView0, 15.0);
        imageView0.setFitHeight(36.0);
        imageView0.setFitWidth(54.999900000002526);
        imageView0.setId("Backward_BTN.png");
        imageView0.setImage(new Image(WatchSavedGamesUI.class.getResource("Backward_BTN.png").toExternalForm()));
        setTop(anchorPane2);

//        MainItem_anchor.getChildren().add(time_Lbl);
//        MainItem_anchor.getChildren().add(Date_Lbl);
//        MainItem_anchor.getChildren().add(watch_btn);
//        MainItem_anchor.getChildren().add(opponentName_Lbl);
//        ListContainer_anchor.getChildren().add(MainItem_anchor);
        ListContainer_anchor.getChildren().add(imageView);
        anchorPane2.getChildren().add(backBtn);
        anchorPane2.getChildren().add(imageView0);

    }

    BorderPane getParentNode() {
        return this;
    }
}
