package Game;

import java.lang.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.*;
import javafx.scene.effect.Light.Distant;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.Shadow;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.*;

public class GameUI extends AnchorPane {

    Scene currentScene;
    protected final GridPane table;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final ImageView label;
    protected final ImageView label0;
    protected final ImageView label1;
    protected final ImageView label2;
    protected final ImageView label3;
    protected final ImageView label4;
    protected final ImageView label5;
    protected final ImageView label6;
    protected final ImageView label7;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Separator separator;
    protected final Lighting lighting;
    protected final ImageView oppPic_img;
    protected final Label label8;
    protected final ImageView myPic_img;
    protected final Label label9;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Label label10;
    protected final MenuButton menuButton;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;
    protected final MenuItem menuItem1;
    protected final BorderPane borderPane;
    protected final FlowPane flowPane;
    protected final TextField textField;
    protected final Button sticker;
    protected final ImageView imageView3;
    protected final Button send_btn;
    protected final AnchorPane chatAnch;
    protected final ImageView pic;
    protected final TextField txtChat;
    protected final FlowPane flowPane0;
    protected final ImageView imageView4;
    protected final ImageView imageView5;
    protected final ImageView imageView6;
    protected final Button chatBtn;
    protected final ImageView chatImage;
    protected final TextField chatNotificationTxt;
    protected final AnchorPane profile_anchor;

    public GameUI() {

        table = new GridPane();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        label = new ImageView();
        label0 = new ImageView();
        label1 = new ImageView();
        label2 = new ImageView();
        label3 = new ImageView();
        label4 = new ImageView();
        label5 = new ImageView();
        label6 = new ImageView();
        label7 = new ImageView();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        separator = new Separator();
        lighting = new Lighting();
        oppPic_img = new ImageView();
        label8 = new Label();
        myPic_img = new ImageView();
        label9 = new Label();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        label10 = new Label();
        menuButton = new MenuButton();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        menuItem1 = new MenuItem();
        borderPane = new BorderPane();
        flowPane = new FlowPane();
        textField = new TextField();
        sticker = new Button();
        imageView3 = new ImageView();
        send_btn = new Button();
        chatAnch = new AnchorPane();
        pic = new ImageView();
        txtChat = new TextField();
        flowPane0 = new FlowPane();
        imageView4 = new ImageView();
        imageView5 = new ImageView();
        imageView6 = new ImageView();
        chatBtn = new Button();
        chatImage = new ImageView();
        chatNotificationTxt = new TextField();
        profile_anchor = new AnchorPane();
        setId("AnchorPane");
        setPrefHeight(502.0);
        setPrefWidth(583.0);
        profile_anchor.setId("profile_anchor");
        profile_anchor.setLayoutX(29.0);
        profile_anchor.setLayoutY(90.0);
        profile_anchor.setPrefHeight(326.0);
        profile_anchor.setPrefWidth(508.0);
        AnchorPane.setBottomAnchor(table, 69.5);
        AnchorPane.setLeftAnchor(table, 105.5);
        AnchorPane.setRightAnchor(table, 104.5);
        AnchorPane.setTopAnchor(table, 115.5);
        table.setGridLinesVisible(true);
        table.setPrefHeight(317.0);
        table.setPrefWidth(373.0);
        table.setId("tab");

//        GridPane.setColumnIndex(button, 0);
//        GridPane.setRowIndex(button, 0);
//        button.setId("btn");
        button.setMaxHeight(Double.MAX_VALUE);
        button.setMaxWidth(Double.MAX_VALUE);
        button.setMnemonicParsing(false);
        button.setPrefHeight(59.0);
        button.setPrefWidth(105.0);
        button.setText("");
        button.setVisible(true);

//        GridPane.setColumnIndex(button0, 2);
//        GridPane.setRowIndex(button0, 2);
        GridPane.setColumnIndex(button0, 1);
        button0.setId("btn");
        button0.setMaxHeight(Double.MAX_VALUE);
        button0.setMaxWidth(Double.MAX_VALUE);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(59.0);
        button0.setPrefWidth(105.0);
        button0.setText("");
        button0.setVisible(true);

//        GridPane.setColumnIndex(button1, 1);
//        GridPane.setRowIndex(button1, 2);
        GridPane.setColumnIndex(button1, 2);
        button1.setId("btn");
        button1.setMaxHeight(Double.MAX_VALUE);
        button1.setMaxWidth(Double.MAX_VALUE);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(59.0);
        button1.setPrefWidth(105.0);
        button1.setText("");
        button1.setVisible(true);

//        GridPane.setRowIndex(button2, 2);
        GridPane.setRowIndex(button2, 1);
        button2.setId("btn");
        button2.setMaxHeight(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(59.0);
        button2.setPrefWidth(105.0);
        button2.setText("");
        button2.setVisible(true);

//        GridPane.setColumnIndex(button3, 2);
        GridPane.setColumnIndex(button3, 1);
        GridPane.setRowIndex(button3, 1);
        button3.setId("btn");
        button3.setMaxHeight(Double.MAX_VALUE);
        button3.setMaxWidth(Double.MAX_VALUE);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(59.0);
        button3.setPrefWidth(105.0);
        button3.setText("");
        button3.setVisible(true);

//        GridPane.setColumnIndex(button4, 1);
        GridPane.setColumnIndex(button4, 2);
        GridPane.setRowIndex(button4, 1);
        button4.setId("btn");
        button4.setMaxHeight(Double.MAX_VALUE);
        button4.setMaxWidth(Double.MAX_VALUE);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(59.0);
        button4.setPrefWidth(105.0);
        button4.setText("");
        button4.setVisible(true);

//        GridPane.setRowIndex(button5, 1);
        GridPane.setRowIndex(button5, 2);
        button5.setId("btn");
        button5.setMaxHeight(Double.MAX_VALUE);
        button5.setMaxWidth(Double.MAX_VALUE);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(59.0);
        button5.setPrefWidth(105.0);
        button5.setText("");
        button5.setVisible(true);

//        GridPane.setColumnIndex(button6, 2);
        GridPane.setColumnIndex(button6, 1);
        GridPane.setRowIndex(button6, 2);
        button6.setId("btn");
        button6.setMaxHeight(Double.MAX_VALUE);
        button6.setMaxWidth(Double.MAX_VALUE);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(59.0);
        button6.setPrefWidth(105.0);
        button6.setText("");
        button6.setVisible(true);

//        GridPane.setColumnIndex(button7, 1);
        GridPane.setColumnIndex(button7, 2);
        GridPane.setRowIndex(button7, 2);
        button7.setId("btn");
        button7.setMaxHeight(Double.MAX_VALUE);
        button7.setMaxWidth(Double.MAX_VALUE);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(59.0);
        button7.setPrefWidth(105.0);
        button7.setText("");
        button7.setVisible(true);

        label.setFitHeight(106.0);
        label.setFitWidth(115.0);
        label.setPickOnBounds(true);
        label.setPreserveRatio(true);
        label.setId("lab");

        GridPane.setColumnIndex(label0, 1);
        label0.setFitHeight(94.0);
        label0.setFitWidth(125.0);
        label0.setPreserveRatio(true);

        GridPane.setColumnIndex(label1, 2);
        label1.setFitHeight(94.0);
        label1.setFitWidth(125.0);
        label1.setPreserveRatio(true);

        //GridPane.setColumnIndex(label2, 0);
        GridPane.setRowIndex(label2, 1);
        label2.setFitHeight(94.0);
        label2.setFitWidth(125.0);
        label2.setPreserveRatio(true);

        GridPane.setColumnIndex(label3, 1);
        GridPane.setRowIndex(label3, 1);
        label3.setFitHeight(94.0);
        label3.setFitWidth(125.0);
        label3.setPreserveRatio(true);

        GridPane.setColumnIndex(label4, 2);
        GridPane.setRowIndex(label4, 1);
        label4.setFitHeight(94.0);
        label4.setFitWidth(125.0);
        label4.setPreserveRatio(true);

        //GridPane.setColumnIndex(label5, 0);
        GridPane.setRowIndex(label5, 2);
        label5.setFitHeight(94.0);
        label5.setFitWidth(125.0);
        label5.setPreserveRatio(true);

        GridPane.setColumnIndex(label6, 1);
        GridPane.setRowIndex(label6, 2);
        label6.setFitHeight(94.0);
        label6.setFitWidth(125.0);
        label6.setPreserveRatio(true);

        GridPane.setColumnIndex(label7, 2);
        GridPane.setRowIndex(label7, 2);
        label7.setFitHeight(94.0);
        label7.setFitWidth(125.0);
        label7.setPreserveRatio(true);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        AnchorPane.setLeftAnchor(separator, 280.0);
        AnchorPane.setRightAnchor(separator, 280.0);
        separator.setFocusTraversable(true);
        separator.setLayoutY(18.0);
        separator.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator.setPrefHeight(50.0);

        separator.setEffect(lighting);

        AnchorPane.setRightAnchor(oppPic_img, 196.0);
        AnchorPane.setTopAnchor(oppPic_img, 11.0);
        oppPic_img.setFitHeight(56.99999237060547);
        oppPic_img.setFitWidth(72.0001220703125);
        oppPic_img.setId("pic-user-1.png");
//        oppPic_img.setImage(new Image(GameUI.class.getResource("pic-user-1.png").toExternalForm()));
        //   oppPic_img.setImage(new Image(getClass().getResource("file:/D:/ITI%20COURSES/Java%20Project/Style/pic-user-1.png").toExternalForm()));

        AnchorPane.setLeftAnchor(label8, 224.0);
        AnchorPane.setTopAnchor(label8, 61.0);
        label8.setPrefHeight(33.0);
        label8.setText("0");
        label8.setTextFill(javafx.scene.paint.Color.WHITE);
        label8.setFont(new Font("System Bold Italic", 20.0));

        AnchorPane.setLeftAnchor(myPic_img, 198.0);
        AnchorPane.setTopAnchor(myPic_img, 11.0);
        myPic_img.setFitHeight(56.99999237060547);
        myPic_img.setFitWidth(72.000244140625);
        myPic_img.setId("pic-user-1.png");
//        myPic_img.setImage(new Image(GameUI.class.getResource("pic-user-1.png").toExternalForm()));
        //  myPic_img.setImage(new Image(getClass().getResource("Style/pic-user-1.png").toExternalForm()));

        AnchorPane.setRightAnchor(label9, 224.0);
        AnchorPane.setTopAnchor(label9, 64.0);
        //    label9.setFont(javafx.scene.text.Font.$x1);
        label9.setFont(new Font("System Bold Italic", 20.0));
        label9.setText("0");
        label9.setTextFill(javafx.scene.paint.Color.WHITE);

        AnchorPane.setLeftAnchor(imageView1, 5.0);
        AnchorPane.setTopAnchor(imageView1, 3.0);
        imageView1.setFitHeight(67.0);
        imageView1.setFitWidth(90.0000991821289);
        imageView1.setId("coins.png");
        imageView1.setImage(new Image(GameUI.class.getResource("coins.png").toExternalForm()));
        //   imageView1.setImage(new Image(getClass().getResource("Style/Using%20Text%20and%20Text%20Effects%20in%20JavaFX%20_%20JavaFX%202%20Tutorials%20and%20Documentation_files/coins.png").toExternalForm()));

        AnchorPane.setRightAnchor(imageView2, 61.0);
        AnchorPane.setTopAnchor(imageView2, 22.0);
        imageView2.setFitHeight(36.0);
        imageView2.setFitWidth(58.0);
        imageView2.setId("Menu_BTN.png");
        imageView2.setImage(new Image(GameUI.class.getResource("Menu_BTN.png").toExternalForm()));
        //   imageView2.setImage(new Image(getClass().getResource("file:/C:/Users/Marina-Sameh/Downloads/PNG/Buttons/BTNs/Menu_BTN.png").toExternalForm()));

        //   label10.setFont(javafx.scene.text.Font.$x1);
        label10.setLayoutX(43.0);
        label10.setLayoutY(58.0);
        label10.setText("0");
        label10.setTextFill(javafx.scene.paint.Color.WHITE);

        AnchorPane.setRightAnchor(menuButton, 44.0);
        AnchorPane.setTopAnchor(menuButton, 22.0);
        menuButton.setId("settings");
        menuButton.setMnemonicParsing(false);
        menuButton.setOpacity(0.09);
        menuButton.setPrefHeight(33.0);
        menuButton.setPrefWidth(75.0);
        menuButton.setText("");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Main Menu");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Reset");

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("Save Game");

        AnchorPane.setBottomAnchor(borderPane, 0.0);
        AnchorPane.setRightAnchor(borderPane, 0.0);
        AnchorPane.setTopAnchor(borderPane, 3.0);
        borderPane.setMinWidth(98.0);
        borderPane.setPrefHeight(499.0);
        borderPane.setPrefWidth(280.0);

        flowPane.setHgap(15.0);
        flowPane.setPrefHeight(36.0);
        flowPane.setPrefWidth(291.0);
        flowPane.setVgap(0.0);

        textField.setPrefHeight(33.0);
        textField.setPrefWidth(138.0);

        sticker.setMnemonicParsing(false);
        sticker.setPrefHeight(33.0);
        sticker.setPrefWidth(43.000099999997474);
        sticker.setText("");
        sticker.setVisible(true);

        imageView3.setFitHeight(27.0);
        imageView3.setFitWidth(23.0);
        imageView3.setId("emoji.png");
        imageView3.setX(1.0);
        imageView3.setY(0.0);
        imageView3.setImage(new Image(GameUI.class.getResource("emoji.png").toExternalForm()));
        // imageView3.setImage(new Image(getClass().getResource("Style/emoji.png").toExternalForm()));
        sticker.setGraphic(imageView3);

        send_btn.setDefaultButton(true);
        send_btn.setId("benSend");
        send_btn.setMnemonicParsing(false);
        send_btn.setPrefHeight(33.0);
        send_btn.setPrefWidth(49.999900000002526);
        send_btn.setText("Send");
        borderPane.setBottom(flowPane);

        chatAnch.setId("chat");
        chatAnch.setPrefHeight(494.0);
        chatAnch.setPrefWidth(269.0);

        pic.setFitHeight(50.0);
        pic.setFitWidth(50.0);
        pic.setLayoutX(-11.0);
        pic.setLayoutY(14.0);
        pic.setPickOnBounds(true);
        pic.setPreserveRatio(true);

        txtChat.setLayoutX(64.0);
        txtChat.setLayoutY(21.0);
        txtChat.setPrefHeight(36.0);
        txtChat.setPrefWidth(169.0);

        AnchorPane.setBottomAnchor(flowPane0, 14.0);
        flowPane0.setLayoutX(7.0);
        flowPane0.setPrefHeight(200.0);
        flowPane0.setPrefWidth(200.0);

        imageView4.setFitHeight(35.999900000002526);
        imageView4.setFitWidth(57.9998779296875);
        imageView4.setId("smile.png");
        imageView4.setImage(new Image(GameUI.class.getResource("smile.png").toExternalForm()));
        //   imageView4.setImage(new Image(getClass().getResource("Style/smile.png").toExternalForm()));

        imageView5.setFitHeight(35.999900817871094);
        imageView5.setFitWidth(57.9998779296875);
        imageView5.setId("love.png");
        imageView5.setImage(new Image(GameUI.class.getResource("love.png").toExternalForm()));
        //    imageView5.setImage(new Image(getClass().getResource("Style/love.png").toExternalForm()));

        imageView6.setFitHeight(35.999900817871094);
        imageView6.setFitWidth(57.9998779296875);
        imageView6.setId("LoveEmoji.png");
        imageView6.setImage(new Image(GameUI.class.getResource("LoveEmoji.png").toExternalForm()));
        //   imageView6.setImage(new Image(getClass().getResource("Style/LoveEmoji.png").toExternalForm()));
        borderPane.setCenter(chatAnch);

        AnchorPane.setBottomAnchor(chatBtn, 20.0);
        //AnchorPane.setRightAnchor(chatBtn, 300.0);
        AnchorPane.setRightAnchor(chatBtn, 20.0);
        chatBtn.setId("openChat");
        chatBtn.setMnemonicParsing(false);
        chatBtn.setPrefHeight(27.0);
        chatBtn.setPrefWidth(32.0);
        chatBtn.setText("Button");
        //chatBtn.setVisible(true);
        //setId("chatShowBtn");

        AnchorPane.setBottomAnchor(chatImage, 20.0);
//        AnchorPane.setRightAnchor(chatImage, 301.0);
        AnchorPane.setRightAnchor(chatImage, 20.0);
        chatImage.setFitHeight(28.0);
        chatImage.setFitWidth(32.00004495849862);
        chatImage.setId("Notifications_BTN.png");
        chatImage.setImage(new Image(GameUI.class.getResource("Notifications_BTN.png").toExternalForm()));
        //    chatImage.setImage(new Image(getClass().getResource("file:/C:/Users/Marina-Sameh/Downloads/PNG/Buttons/BTNs/Notifications_BTN.png").toExternalForm()));

        AnchorPane.setBottomAnchor(chatNotificationTxt, 36.0);
//        AnchorPane.setRightAnchor(chatNotificationTxt, 320.0);
        AnchorPane.setRightAnchor(chatNotificationTxt, 40.0);
        chatNotificationTxt.setId("notificationChat");
        chatNotificationTxt.setPrefHeight(21.0);
        chatNotificationTxt.setPrefWidth(23.0);

        table.getChildren().add(label);
        table.getChildren().add(label0);
        table.getChildren().add(label1);
        table.getChildren().add(label2);
        table.getChildren().add(label3);
        table.getChildren().add(label4);
        table.getChildren().add(label5);
        table.getChildren().add(label6);
        table.getChildren().add(label7);
        table.getChildren().add(button);
        table.getChildren().add(button0);
        table.getChildren().add(button1);
        table.getChildren().add(button2);
        table.getChildren().add(button3);
        table.getChildren().add(button4);
        table.getChildren().add(button5);
        table.getChildren().add(button6);
        table.getChildren().add(button7);
        table.getColumnConstraints().add(columnConstraints);
        table.getColumnConstraints().add(columnConstraints0);
        table.getColumnConstraints().add(columnConstraints1);
        table.getRowConstraints().add(rowConstraints);
        table.getRowConstraints().add(rowConstraints0);
        table.getRowConstraints().add(rowConstraints1);
        getChildren().add(table);
        getChildren().add(separator);
        getChildren().add(oppPic_img);
        getChildren().add(label8);
        getChildren().add(myPic_img);
        getChildren().add(label9);
        getChildren().add(imageView1);
        getChildren().add(imageView2);
        getChildren().add(label10);
        menuButton.getItems().add(menuItem);
        menuButton.getItems().add(menuItem0);
        menuButton.getItems().add(menuItem1);
        getChildren().add(menuButton);
        flowPane.getChildren().add(textField);
        flowPane.getChildren().add(sticker);
        flowPane.getChildren().add(send_btn);
        chatAnch.getChildren().add(pic);
        chatAnch.getChildren().add(txtChat);
        flowPane0.getChildren().add(imageView4);
        flowPane0.getChildren().add(imageView5);
        flowPane0.getChildren().add(imageView6);
        chatAnch.getChildren().add(flowPane0);
        //getChildren().add(borderPane);
        getChildren().add(chatImage);
        getChildren().add(chatBtn);
        getChildren().add(chatNotificationTxt);
        currentScene = new Scene(this);
    }

    protected Scene retScene() {

        return currentScene;
    }
}
