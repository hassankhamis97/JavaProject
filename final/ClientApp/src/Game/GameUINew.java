package Game;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.effect.Light.Distant;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
//import 0xcce0ffff;

public class GameUINew extends BorderPane {

    protected AnchorPane anchorPane;
    protected Button btnChat;
    protected ImageView chatBtn;
    protected BorderPane borderPane;
    protected AnchorPane anchorPane0;
    protected ImageView imageView;
    protected GridPane gridPane;
    protected ColumnConstraints columnConstraints;
    protected ColumnConstraints columnConstraints0;
    protected ColumnConstraints columnConstraints1;
    protected RowConstraints rowConstraints;
    protected RowConstraints rowConstraints0;
    protected RowConstraints rowConstraints1;
    protected ImageView imageBtn1;
    protected ImageView imageBtn2;
    protected ImageView imageBtn3;
    protected ImageView imageBtn4;
    protected ImageView imageBtn5;
    protected ImageView imageBtn6;
    protected ImageView imageBtn7;
    protected ImageView imageBtn8;
    protected ImageView imageBtn9;
    protected Button button1;
    protected Button button2;
    protected Button button3;
    protected Button button4;
    protected Button button5;
    protected Button button6;
    protected Button button7;
    protected Button button8;
    protected Button button9;
    protected AnchorPane anchorPane1;
    protected AnchorPane anchorPane2;
    protected AnchorPane anchorPane3;
    protected BorderPane borderPane0;
    protected FlowPane flowPane;
    protected TextField chatMsg_txt;
    protected Button btnEmoji;
    protected ImageView btnImojiImg;
    protected Button send_btn;
    protected ScrollPane scrollPane;
    protected AnchorPane chatAnch;
    protected ImageView chatOpponentImg;
    protected Label label;
    protected FlowPane imojiMenu;
    protected ImageView imageView0;
    protected ImageView imageView1;
    protected ImageView imageView2;
    protected AnchorPane anchorPane4;
    protected ImageView player1_Img;
    protected ImageView imageView3;
    protected Label coinScoreLbl;
    protected ImageView player2_Img;
    protected Label player1Score;
    protected Label player2Score;
    protected MenuButton btnMenue;
    protected MenuItem menuItem;
    protected MenuItem menuItem0;
    protected MenuItem menuItem1;
    protected ImageView imageView4;
    protected Separator separator;
    protected Lighting lighting;

    public GameUINew() {

        anchorPane = new AnchorPane();
        btnChat = new Button();
        chatBtn = new ImageView();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        imageView = new ImageView();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        imageBtn1 = new ImageView();
        imageBtn2 = new ImageView();
        imageBtn3 = new ImageView();
        imageBtn4 = new ImageView();
        imageBtn5 = new ImageView();
        imageBtn6 = new ImageView();
        imageBtn7 = new ImageView();
        imageBtn8 = new ImageView();
        imageBtn9 = new ImageView();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        button8 = new Button();
        button9 = new Button();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        borderPane0 = new BorderPane();
        flowPane = new FlowPane();
        chatMsg_txt = new TextField();
        btnEmoji = new Button();
        btnImojiImg = new ImageView();
        send_btn = new Button();
        scrollPane = new ScrollPane();
        chatAnch = new AnchorPane();
        chatOpponentImg = new ImageView();
        label = new Label();
        imojiMenu = new FlowPane();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        anchorPane4 = new AnchorPane();
        player1_Img = new ImageView();
        imageView3 = new ImageView();
        coinScoreLbl = new Label();
        player2_Img = new ImageView();
        player1Score = new Label();
        player2Score = new Label();
        btnMenue = new MenuButton();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        menuItem1 = new MenuItem();
        imageView4 = new ImageView();
        separator = new Separator();
        lighting = new Lighting();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(526.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(90.0);
        anchorPane.setPrefWidth(600.0);

        AnchorPane.setBottomAnchor(btnChat, 7.0);
        AnchorPane.setRightAnchor(btnChat, 284.0);
        AnchorPane.setTopAnchor(btnChat, 56.0);
        btnChat.setId("openChat");
        btnChat.setMnemonicParsing(false);
        btnChat.setPrefHeight(27.0);
        btnChat.setPrefWidth(32.0);
        btnChat.setText("");
        btnChat.setVisible(true);

        AnchorPane.setBottomAnchor(chatBtn, 6.0);
        AnchorPane.setRightAnchor(chatBtn, 284.0);
        AnchorPane.setTopAnchor(chatBtn, 56.0);
        chatBtn.setFitHeight(28.0);
        chatBtn.setFitWidth(32.00004495849862);
        chatBtn.setId("Notifications_BTN.png");
        chatBtn.setImage(new Image(GameUINew.class.getResource("Notifications_BTN.png").toExternalForm()));


        setBottom(anchorPane);

        BorderPane.setAlignment(borderPane, javafx.geometry.Pos.CENTER);
        borderPane.setMaxHeight(USE_PREF_SIZE);
        borderPane.setMaxWidth(USE_PREF_SIZE);
        borderPane.setPrefHeight(260.0);
        borderPane.setPrefWidth(478.0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setMinWidth(373.0);
        anchorPane0.setPrefHeight(260.0);
        anchorPane0.setPrefWidth(396.0);

        imageView.setFitHeight(493.0);
        imageView.setFitWidth(445.0);
        imageView.setId("SU2wI.png");
        imageView.setLayoutX(-10.0);
        imageView.setLayoutY(-17.0);
        imageView.setImage(new Image(GameUINew.class.getResource("SU2wI.png").toExternalForm()));

        gridPane.setFocusTraversable(false);
        gridPane.setGridLinesVisible(false);
        gridPane.setLayoutY(20.0);
        gridPane.setPickOnBounds(false);
        gridPane.setPrefHeight(390.0);
        gridPane.setPrefWidth(405.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(140.0);
        columnConstraints.setMinWidth(140.0);
        columnConstraints.setPrefWidth(140.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(140.0);
        columnConstraints0.setMinWidth(140.0);
        columnConstraints0.setPrefWidth(140.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(140.0);
        columnConstraints1.setMinWidth(140.0);
        columnConstraints1.setPrefWidth(140.0);

        rowConstraints.setMaxHeight(140.0);
        rowConstraints.setMinHeight(140.0);
        rowConstraints.setPrefHeight(140.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(140.0);
        rowConstraints0.setMinHeight(140.0);
        rowConstraints0.setPrefHeight(140.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(140.0);
        rowConstraints1.setMinHeight(140.0);
        rowConstraints1.setPercentHeight(0.0);
        rowConstraints1.setPrefHeight(140.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        imageBtn1.setFitHeight(140.0);
        imageBtn1.setFitWidth(140.0);
        imageBtn1.setId("imageBtn1");
        imageBtn1.setPickOnBounds(true);
        imageBtn1.setPreserveRatio(true);

        GridPane.setColumnIndex(imageBtn2, 1);
        imageBtn2.setFitHeight(140.0);
        imageBtn2.setFitWidth(140.0);
        imageBtn2.setId("imageBtn2");
        imageBtn2.setPickOnBounds(true);
        imageBtn2.setPreserveRatio(true);

        GridPane.setColumnIndex(imageBtn3, 2);
        imageBtn3.setFitHeight(140.0);
        imageBtn3.setFitWidth(140.0);
        imageBtn3.setId("imageBtn3");
        imageBtn3.setPickOnBounds(true);
        imageBtn3.setPreserveRatio(true);

        GridPane.setRowIndex(imageBtn4, 1);
        imageBtn4.setFitHeight(140.0);
        imageBtn4.setFitWidth(140.0);
        imageBtn4.setId("imageBtn4");
        imageBtn4.setPickOnBounds(true);
        imageBtn4.setPreserveRatio(true);

        GridPane.setColumnIndex(imageBtn5, 1);
        GridPane.setRowIndex(imageBtn5, 1);
        imageBtn5.setFitHeight(140.0);
        imageBtn5.setFitWidth(140.0);
        imageBtn5.setId("imageBtn5");
        imageBtn5.setPickOnBounds(true);
        imageBtn5.setPreserveRatio(true);

        GridPane.setColumnIndex(imageBtn6, 2);
        GridPane.setRowIndex(imageBtn6, 1);
        imageBtn6.setFitHeight(140.0);
        imageBtn6.setFitWidth(140.0);
        imageBtn6.setId("imageBtn6");
        imageBtn6.setPickOnBounds(true);
        imageBtn6.setPreserveRatio(true);

        GridPane.setRowIndex(imageBtn7, 2);
        imageBtn7.setFitHeight(140.0);
        imageBtn7.setFitWidth(140.0);
        imageBtn7.setId("imageBtn7");
        imageBtn7.setPickOnBounds(true);
        imageBtn7.setPreserveRatio(true);

        GridPane.setColumnIndex(imageBtn8, 1);
        GridPane.setRowIndex(imageBtn8, 2);
        imageBtn8.setFitHeight(140.0);
        imageBtn8.setFitWidth(140.0);
        imageBtn8.setId("imageBtn8");
        imageBtn8.setPickOnBounds(true);
        imageBtn8.setPreserveRatio(true);

        GridPane.setColumnIndex(imageBtn9, 2);
        GridPane.setRowIndex(imageBtn9, 2);
        imageBtn9.setFitHeight(140.0);
        imageBtn9.setFitWidth(140.0);
        imageBtn9.setId("imageBtn9");
        imageBtn9.setPickOnBounds(true);
        imageBtn9.setPreserveRatio(true);

        button1.setId("button1");
        button1.setMinHeight(140.0);
        button1.setMinWidth(140.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(140.0);
        button1.setPrefWidth(140.0);
        button1.setText("");

        GridPane.setColumnIndex(button2, 1);
        button2.setId("button2");
        button2.setMinHeight(140.0);
        button2.setMinWidth(140.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(140.0);
        button2.setPrefWidth(140.0);
        button2.setText("");

        GridPane.setColumnIndex(button3, 2);
        button3.setId("button3");
        button3.setMinHeight(140.0);
        button3.setMinWidth(140.0);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(140.0);
        button3.setPrefWidth(140.0);
        button3.setText("");

        GridPane.setRowIndex(button4, 1);
        button4.setId("button4");
        button4.setMinHeight(140.0);
        button4.setMinWidth(140.0);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(140.0);
        button4.setPrefWidth(140.0);
        button4.setText("");

        GridPane.setColumnIndex(button5, 1);
        GridPane.setRowIndex(button5, 1);
        button5.setId("button5");
        button5.setMinHeight(140.0);
        button5.setMinWidth(140.0);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(140.0);
        button5.setPrefWidth(140.0);
        button5.setText("");

        GridPane.setColumnIndex(button6, 2);
        GridPane.setRowIndex(button6, 1);
        button6.setId("button6");
        button6.setMinHeight(140.0);
        button6.setMinWidth(140.0);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(140.0);
        button6.setPrefWidth(140.0);
        button6.setText("");

        GridPane.setRowIndex(button7, 2);
        button7.setId("button7");
        button7.setMinHeight(140.0);
        button7.setMinWidth(140.0);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(140.0);
        button7.setPrefWidth(140.0);
        button7.setText("");

        GridPane.setColumnIndex(button8, 1);
        GridPane.setRowIndex(button8, 2);
        button8.setId("button8");
        button8.setMinHeight(140.0);
        button8.setMinWidth(140.0);
        button8.setMnemonicParsing(false);
        button8.setPrefHeight(140.0);
        button8.setPrefWidth(140.0);
        button8.setText("");

        GridPane.setColumnIndex(button9, 2);
        GridPane.setRowIndex(button9, 2);
        button9.setMinHeight(140.0);
        button9.setMinWidth(140.0);
        button9.setMnemonicParsing(false);
        button9.setPrefHeight(140.0);
        button9.setPrefWidth(140.0);
        button9.setText("");
        borderPane.setCenter(anchorPane0);
        setCenter(borderPane);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(220.0);
        anchorPane1.setPrefWidth(150.0);
        setLeft(anchorPane1);

        BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
        anchorPane2.setPrefHeight(220.0);
        anchorPane2.setPrefWidth(150.0);

        AnchorPane.setBottomAnchor(anchorPane3, -100.0);
        AnchorPane.setTopAnchor(anchorPane3, -79.0);
        anchorPane3.setLayoutX(-120.0);
        anchorPane3.setPrefHeight(526.0);
        anchorPane3.setPrefWidth(270.0);

        AnchorPane.setBottomAnchor(borderPane0, 11.0);
        AnchorPane.setRightAnchor(borderPane0, 0.0);
        AnchorPane.setTopAnchor(borderPane0, -2.0);
        borderPane0.setMinWidth(90.00009155273438);
        borderPane0.setPrefHeight(526.0000999999975);
        borderPane0.setPrefWidth(269.0);

        flowPane.setHgap(15.0);
        flowPane.setPrefHeight(36.0);
        flowPane.setPrefWidth(291.0);
        flowPane.setVgap(0.0);

        chatMsg_txt.setPrefHeight(33.0);
        chatMsg_txt.setPrefWidth(138.0);

        btnEmoji.setId("sticker");
        btnEmoji.setMnemonicParsing(false);
        btnEmoji.setPrefHeight(33.0);
        btnEmoji.setPrefWidth(43.000099999997474);
        btnEmoji.setText("");
        btnEmoji.setVisible(true);

        btnImojiImg.setFitHeight(27.0);
        btnImojiImg.setFitWidth(23.0);
        btnImojiImg.setId("emoji.png");
        btnImojiImg.setX(1.0);
        btnImojiImg.setY(0.0);
        btnImojiImg.setImage(new Image(GameUINew.class.getResource("emoji.png").toExternalForm()));

        btnEmoji.setGraphic(btnImojiImg);

        send_btn.setDefaultButton(true);
        send_btn.setId("benSend");
        send_btn.setMnemonicParsing(false);
        send_btn.setPrefHeight(33.0);
        send_btn.setPrefWidth(49.999900000002526);
        send_btn.setText("Send");
        borderPane0.setBottom(flowPane);

        scrollPane.setPrefHeight(495.0);
        scrollPane.setPrefWidth(269.0);

        chatAnch.setId("chat");
        chatAnch.setMinWidth(4.0);
        chatAnch.setPrefHeight(481.0);
        chatAnch.setPrefWidth(269.0);

        chatOpponentImg.setFitHeight(50.0);
        chatOpponentImg.setFitWidth(50.0);
        chatOpponentImg.setId("pic");
        chatOpponentImg.setLayoutX(11.0);
        chatOpponentImg.setLayoutY(14.0);
        chatOpponentImg.setPickOnBounds(true);
        chatOpponentImg.setPreserveRatio(true);

        label.setLayoutX(64.0);
        label.setLayoutY(21.0);
        label.setPrefHeight(36.0);
        label.setPrefWidth(169.0);

        AnchorPane.setBottomAnchor(imojiMenu, 14.0);
        imojiMenu.setLayoutX(7.0);
        imojiMenu.setPrefHeight(200.0);
        imojiMenu.setPrefWidth(200.0);

        imageView0.setFitHeight(35.999900000002526);
        imageView0.setFitWidth(57.9998779296875);
        imageView0.setId("smile.png");
        imageView0.setImage(new Image(GameUINew.class.getResource("smile.png").toExternalForm()));

        imageView1.setFitHeight(35.999900817871094);
        imageView1.setFitWidth(57.9998779296875);
        imageView1.setId("love.png");
        imageView1.setImage(new Image(GameUINew.class.getResource("love.png").toExternalForm()));

        imageView2.setFitHeight(35.999900817871094);
        imageView2.setFitWidth(57.9998779296875);
        imageView2.setId("LoveEmoji.png");
        imageView2.setImage(new Image(GameUINew.class.getResource("LoveEmoji.png").toExternalForm()));
        scrollPane.setContent(chatAnch);
        borderPane0.setLeft(scrollPane);
//        setRight(anchorPane2);

        BorderPane.setAlignment(anchorPane4, javafx.geometry.Pos.CENTER);
        anchorPane4.setMinHeight(79.0);
        anchorPane4.setPrefHeight(79.0);
        anchorPane4.setPrefWidth(600.0);

        AnchorPane.setLeftAnchor(player1_Img, 160.0);
        AnchorPane.setTopAnchor(player1_Img, 7.0);
        player1_Img.setFitHeight(56.99999237060547);
        player1_Img.setFitWidth(72.000244140625);
        player1_Img.setId("pic-user-1.png");
        player1_Img.setImage(new Image(GameUINew.class.getResource("pic-user-1.png").toExternalForm()));

        AnchorPane.setLeftAnchor(imageView3, 14.0);
        AnchorPane.setTopAnchor(imageView3, 0.0);
        imageView3.setFitHeight(67.0);
        imageView3.setFitWidth(90.0000991821289);
        imageView3.setId("coins.png");
        imageView3.setImage(new Image(GameUINew.class.getResource("coins.png").toExternalForm()));

        AnchorPane.setBottomAnchor(coinScoreLbl, -5.0);
        AnchorPane.setLeftAnchor(coinScoreLbl, 47.0);
        coinScoreLbl.setId("coinScore");
        coinScoreLbl.setText("0");
        coinScoreLbl.setTextFill(javafx.scene.paint.Color.WHITE);
        coinScoreLbl.setFont(new Font("System Bold Italic", 20.0));

        AnchorPane.setRightAnchor(player2_Img, 160.0);
        AnchorPane.setTopAnchor(player2_Img, 7.0);
        player2_Img.setFitHeight(56.99999237060547);
        player2_Img.setFitWidth(72.000244140625);
        player2_Img.setId("pic-user-1.png");
        player2_Img.setImage(new Image(GameUINew.class.getResource("pic-user-1.png").toExternalForm()));

        AnchorPane.setLeftAnchor(player1Score, 190.0);
        AnchorPane.setTopAnchor(player1Score, 50.0);
//        player1Score.setFont(javafx.scene.text.Font.$x1);
        player1Score.setPrefHeight(33.0);
        player1Score.setText("0");
        player1Score.setTextFill(javafx.scene.paint.Color.WHITE);

        AnchorPane.setRightAnchor(player2Score, 190.0);
        AnchorPane.setTopAnchor(player2Score, 50.0);
//        player2Score.setFont(javafx.scene.text.Font.$x1);
        player2Score.setPrefHeight(33.0);
        player2Score.setText("0");
        player2Score.setTextFill(javafx.scene.paint.Color.WHITE);

        AnchorPane.setRightAnchor(btnMenue, 14.0);
        AnchorPane.setTopAnchor(btnMenue, 27.0);
        btnMenue.setFocusTraversable(true);
        btnMenue.setId("settings");
        btnMenue.setMnemonicParsing(false);
        btnMenue.setOpacity(1.0);
        btnMenue.setPrefHeight(33.0);
        btnMenue.setPrefWidth(75.0);
        btnMenue.setText("");
        btnMenue.setVisible(true);

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Main Menu");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Reset");

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("Save Game");

        AnchorPane.setRightAnchor(imageView4, 32.0);
        AnchorPane.setTopAnchor(imageView4, 26.0);
        imageView4.setFitHeight(36.0);
        imageView4.setFitWidth(58.0);
        imageView4.setId("Menu_BTN.png");
        imageView4.setImage(new Image(GameUINew.class.getResource("Menu_BTN.png").toExternalForm()));

        AnchorPane.setLeftAnchor(separator, 289.0);
        AnchorPane.setRightAnchor(separator, 288.0);
        AnchorPane.setTopAnchor(separator, 19.0);
        separator.setFocusTraversable(true);
        separator.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator.setPrefHeight(50.0);
        separator.setPrefWidth(23.0);

        separator.setEffect(lighting);
        setTop(anchorPane4);

        anchorPane.getChildren().add(chatBtn);
        anchorPane.getChildren().add(btnChat);
        anchorPane0.getChildren().add(imageView);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(imageBtn1);
        gridPane.getChildren().add(imageBtn2);
        gridPane.getChildren().add(imageBtn3);
        gridPane.getChildren().add(imageBtn4);
        gridPane.getChildren().add(imageBtn5);
        gridPane.getChildren().add(imageBtn6);
        gridPane.getChildren().add(imageBtn7);
        gridPane.getChildren().add(imageBtn8);
        gridPane.getChildren().add(imageBtn9);
        gridPane.getChildren().add(button1);
        gridPane.getChildren().add(button2);
        gridPane.getChildren().add(button3);
        gridPane.getChildren().add(button4);
        gridPane.getChildren().add(button5);
        gridPane.getChildren().add(button6);
        gridPane.getChildren().add(button7);
        gridPane.getChildren().add(button8);
        gridPane.getChildren().add(button9);
        anchorPane0.getChildren().add(gridPane);
        flowPane.getChildren().add(chatMsg_txt);
        flowPane.getChildren().add(btnEmoji);
        flowPane.getChildren().add(send_btn);
        chatAnch.getChildren().add(chatOpponentImg);
        chatAnch.getChildren().add(label);
        imojiMenu.getChildren().add(imageView0);
        imojiMenu.getChildren().add(imageView1);
        imojiMenu.getChildren().add(imageView2);
        chatAnch.getChildren().add(imojiMenu);
        anchorPane3.getChildren().add(borderPane0);
        anchorPane2.getChildren().add(anchorPane3);
        anchorPane4.getChildren().add(player1_Img);
        anchorPane4.getChildren().add(imageView3);
        anchorPane4.getChildren().add(coinScoreLbl);
        anchorPane4.getChildren().add(player2_Img);
        anchorPane4.getChildren().add(player1Score);
        anchorPane4.getChildren().add(player2Score);
        btnMenue.getItems().add(menuItem);
        btnMenue.getItems().add(menuItem0);
        btnMenue.getItems().add(menuItem1);
        anchorPane4.getChildren().add(btnMenue);
        anchorPane4.getChildren().add(imageView4);
        anchorPane4.getChildren().add(separator);

    }

    BorderPane getParentNode() {
        return this;
    }
}
