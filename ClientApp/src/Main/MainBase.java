package Main;

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

public class MainBase extends BorderPane {

    protected final AnchorPane anchor_friendList;
    protected final FlowPane flow_parent_friendList;
//    protected final FlowPane flowContainsChilds_friend;
//    protected final ImageView friend_image;
//    protected final FlowPane flow_name_status_friend;
//    protected final Label name_friendLbl;
//    protected final Label status_friendLbl;
//    protected final AnchorPane image_Friend_Anchor;
//    protected final Button btnAdd_btn;
//    protected final ImageView btnAdd_image;
    protected final Button friendOpen_btn;
    protected final ImageView imageView3;
    protected final AnchorPane anchorPane;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane0;
    protected final Button twoPlayer;
    protected final Button button0;
    protected final Button savedGames;
    protected final Button onePlayer;
    protected final Button moreGames;
    protected final ImageView imageView;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final Button btnStore;
    protected final ImageView imageView0;
    protected final Button btnSetting;
    protected final ImageView imageView1;
    protected final Button btnHelp;
    protected final ImageView imageView2;
    Scene currentScene;

    public MainBase() {

        anchor_friendList = new AnchorPane();
        flow_parent_friendList = new FlowPane();
//        flowContainsChilds_friend = new FlowPane();
//        friend_image = new ImageView();
//        flow_name_status_friend = new FlowPane();
//        name_friendLbl = new Label();
//        status_friendLbl = new Label();
//        image_Friend_Anchor = new AnchorPane();
//        btnAdd_btn = new Button();
//        btnAdd_image = new ImageView();
        anchorPane = new AnchorPane();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        twoPlayer = new Button();
        button0 = new Button();
        savedGames = new Button();
        onePlayer = new Button();
        moreGames = new Button();
        imageView = new ImageView();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        btnStore = new Button();
        imageView0 = new ImageView();
        btnSetting = new Button();
        imageView1 = new ImageView();
        btnHelp = new Button();
        imageView2 = new ImageView();
        friendOpen_btn = new Button();
        imageView3 = new ImageView();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(619.0);
        setPrefWidth(714.0);
        setId("pane");
//        setStyle("-fx-background-color:linear-gradient(#8ad9dc, #409cc7),\n" +
//"            linear-gradient(#d6e2f9 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n" +
//"            linear-gradient(#c6bef6, #4d94e6);-fx-background-size: 100% 100%;");

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
        anchorPane0.setMinWidth(361.0);
        anchorPane0.setPrefHeight(434.0);
        anchorPane0.setPrefWidth(361.0);

        twoPlayer.setLayoutX(24.0);
        twoPlayer.setLayoutY(165.0);
        twoPlayer.setMnemonicParsing(false);
        twoPlayer.setPrefHeight(30.0);
        twoPlayer.setPrefWidth(300.0);
        twoPlayer.setText("Two Player");
        twoPlayer.setFont(new Font(16.0));
        twoPlayer.setId("btn");

        //    button0.setFont(javafx.scene.text.Font.$x1);
//        button0.setLayoutX(24.0);
//        button0.setLayoutY(249.0);
//        button0.setMinHeight(23.0);
//        button0.setMnemonicParsing(false);
//        button0.setPrefHeight(30.0);
//        button0.setPrefWidth(300.0);
//        button0.setText("Play Online");
//        button0.setFont(new Font(16.0));
//        button0.setId("btn");
        //    savedGames.setFont(javafx.scene.text.Font.$x1);
        savedGames.setLayoutX(24.0);
        savedGames.setLayoutY(244.0);
        savedGames.setMnemonicParsing(false);
        savedGames.setPrefHeight(30.0);
        savedGames.setPrefWidth(300.0);
        savedGames.setText("Saved Games");
        savedGames.setFont(new Font(16.0));
        savedGames.setId("btn");

        //    onePlayer.setFont(javafx.scene.text.Font.$x1);
        onePlayer.setLayoutX(24.0);
        onePlayer.setLayoutY(86.0);
        onePlayer.setMnemonicParsing(false);
        onePlayer.setPrefHeight(30.0);
        onePlayer.setPrefWidth(300.0);
        onePlayer.setText("One Player");
        onePlayer.setFont(new Font(16.0));
        onePlayer.setId("btn");

        //    moreGames.setFont(javafx.scene.text.Font.$x1);
        moreGames.setLayoutX(24.0);
        moreGames.setLayoutY(323.0);
        moreGames.setMnemonicParsing(false);
        moreGames.setPrefHeight(30.0);
        moreGames.setPrefWidth(300.0);
        moreGames.setText("More Games");
        moreGames.setFont(new Font(16.0));
        moreGames.setId("btn");

        AnchorPane.setTopAnchor(imageView, -55.0);
        imageView.setFitHeight(80.0);
        imageView.setFitWidth(420.0);
        imageView.setId("logo.png");
        imageView.setLayoutX(-36.0);
        imageView.setImage(new Image(MainBase.class.getResource("logo.png").toExternalForm()));
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
        anchorPane3.setMinWidth(728.0);
        anchorPane3.setPrefHeight(48.0);
        anchorPane3.setPrefWidth(728.0);

        BorderPane.setAlignment(anchor_friendList, javafx.geometry.Pos.CENTER);
        anchor_friendList.setId("anchor_friendList");
        anchor_friendList.setMinWidth(189.0);
        anchor_friendList.setPrefHeight(480.0);
        anchor_friendList.setPrefWidth(189.0);
//        flow_parent_friendList.setId("flow_parent_friendList");
        flow_parent_friendList.setLayoutX(0.0);
        flow_parent_friendList.setLayoutY(58.0);
        flow_parent_friendList.setPrefHeight(513.0);
        flow_parent_friendList.setPrefWidth(259.0);

//        flowContainsChilds_friend.setId("flowContainsChilds_friend");
//        flowContainsChilds_friend.setPrefHeight(82.0);
//        flowContainsChilds_friend.setPrefWidth(259.0);
//
//        friend_image.setFitHeight(51.749925000001895);
//        friend_image.setFitWidth(68.99990000000253);
//        friend_image.setId("friend_image");
//        friend_image.setPickOnBounds(true);
//        friend_image.setPreserveRatio(true);
//
//        flow_name_status_friend.setId("flow_name_status_friend");
//        flow_name_status_friend.setMinWidth(53.0);
//        flow_name_status_friend.setOrientation(javafx.geometry.Orientation.VERTICAL);
//        flow_name_status_friend.setPrefHeight(52.0);
//        flow_name_status_friend.setPrefWidth(62.0);
//
//        name_friendLbl.setAlignment(javafx.geometry.Pos.CENTER);
//        name_friendLbl.setId("name_friendLbl");
//        name_friendLbl.setPrefHeight(27.0);
//        name_friendLbl.setPrefWidth(56.0);
//        name_friendLbl.setText("Name");
//        name_friendLbl.setTextAlignment(javafx.scene.text.TextAlignment.LEFT);
//        name_friendLbl.setFont(new Font("System Bold", 16.0));
//
//        status_friendLbl.setAlignment(javafx.geometry.Pos.CENTER);
//        status_friendLbl.setId("status_friendLbl");
//        status_friendLbl.setPrefHeight(22.0);
//        status_friendLbl.setPrefWidth(60.0);
//        status_friendLbl.setText("Status");
//        status_friendLbl.setFont(new Font("System Italic", 14.0));
//
//        image_Friend_Anchor.setId("image_Friend_Anchor");
//        image_Friend_Anchor.setPrefHeight(52.0);
//        image_Friend_Anchor.setPrefWidth(51.0);
//
//        btnAdd_btn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
//        btnAdd_btn.setId("btnAdd_btn");
//        btnAdd_btn.setLayoutX(8.0);
//        btnAdd_btn.setLayoutY(14.0);
//        btnAdd_btn.setMinHeight(22.0);
//        btnAdd_btn.setMinWidth(16.0);
//        btnAdd_btn.setMnemonicParsing(false);
//        btnAdd_btn.setPrefHeight(24.000099999997474);
//        btnAdd_btn.setPrefWidth(35.0);
//        btnAdd_btn.setText("");
//        btnAdd_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
//        btnAdd_btn.setFont(new Font("System Bold Italic", 16.0));
//
//        btnAdd_image.setFitHeight(23.87506948241935);
//        btnAdd_image.setFitWidth(24.0);
//        btnAdd_image.setId("btnAdd_image");
//        btnAdd_image.setLayoutX(14.0);
//        btnAdd_image.setLayoutY(14.0);
//        btnAdd_image.setImage(new Image(MainBase.class.getResource("addbtn.png").toExternalForm()));
//        setLeft(anchor_friendList);
        AnchorPane.setLeftAnchor(btnStore, 20.0);
        AnchorPane.setTopAnchor(btnStore, 12.0);
        //    btnStore.setFont(javafx.scene.text.Font.$x1);
        btnStore.setMnemonicParsing(false);
        btnStore.setPrefHeight(39.0);
        btnStore.setPrefWidth(47.0);
        btnStore.setText("");

        AnchorPane.setLeftAnchor(imageView0, 20.0);
        AnchorPane.setTopAnchor(imageView0, 12.0);
        imageView0.setFitHeight(39.0);
        imageView0.setFitWidth(53.0);
        imageView0.setId("Shop_BTN.png");
        imageView0.setImage(new Image(MainBase.class.getResource("Shop_BTN.png").toExternalForm()));
        //imageView0.setImage(new Image(getClass().getResource("Style/Shop_BTN.png").toExternalForm()));

        AnchorPane.setRightAnchor(btnSetting, 20.0);
        //    btnSetting.setFont(javafx.scene.text.Font.$x1);
        btnSetting.setLayoutY(14.0);
        btnSetting.setMnemonicParsing(false);
        btnSetting.setPrefHeight(39.0);
        btnSetting.setPrefWidth(47.0);
        btnSetting.setText("");
        btnSetting.setVisible(false);

        AnchorPane.setRightAnchor(imageView1, 20.0);
        imageView1.setFitHeight(39.0);
        imageView1.setFitWidth(46.999900817871094);
        imageView1.setId("Settings_BTN.png");
        imageView1.setLayoutY(14.0);
        imageView1.setImage(new Image(MainBase.class.getResource("Settings_BTN.png").toExternalForm()));
        // imageView1.setImage(new Image(getClass().getResource("Style/Settings_BTN.png").toExternalForm()));

        AnchorPane.setRightAnchor(btnHelp, 75.0);
        //   btnHelp.setFont(javafx.scene.text.Font.$x1);
        btnHelp.setLayoutY(19.0);
        btnHelp.setMinHeight(21.0);
        btnHelp.setMnemonicParsing(false);
        btnHelp.setPrefHeight(30.0);
        btnHelp.setPrefWidth(45.0);
        btnHelp.setText("");
        btnHelp.setVisible(false);
        friendOpen_btn.setLayoutX(90.0);
        friendOpen_btn.setLayoutY(24.0);
        friendOpen_btn.setMnemonicParsing(false);
        friendOpen_btn.setPrefHeight(30.0);
        friendOpen_btn.setPrefWidth(47.0);
        friendOpen_btn.setText("");
//        friendOpen_btn.setId("friend_btn");

        imageView3.setFitHeight(36.00000762939453);
        imageView3.setFitWidth(53.00000762939453);
        imageView3.setId("friend_img");
        imageView3.setLayoutX(87.0);
        imageView3.setLayoutY(25.0);
        imageView3.setImage(new Image(MainBase.class.getResource("friend.png").toExternalForm()));
        AnchorPane.setRightAnchor(imageView2, 75.0);
        imageView2.setFitHeight(39.00000762939453);
        imageView2.setFitWidth(46.999977111816406);
        imageView2.setId("FAQ_BTN.png");
        imageView2.setLayoutY(15.0);
        imageView2.setImage(new Image(MainBase.class.getResource("FAQ_BTN.png").toExternalForm()));
        //imageView2.setImage(new Image(getClass().getResource("Style/FAQ_BTN.png").toExternalForm()));
        setTop(anchorPane3);

        anchorPane0.getChildren().add(twoPlayer);
        anchorPane0.getChildren().add(button0);
        anchorPane0.getChildren().add(savedGames);
        anchorPane0.getChildren().add(onePlayer);
        anchorPane0.getChildren().add(moreGames);
        anchorPane0.getChildren().add(imageView);
        anchorPane3.getChildren().add(imageView0);
        anchorPane3.getChildren().add(btnStore);

        anchorPane3.getChildren().add(btnSetting);
        anchorPane3.getChildren().add(imageView1);
        anchorPane3.getChildren().add(btnHelp);
        anchorPane3.getChildren().add(imageView2);

//        setLeft(anchor_friendList);
//        flowContainsChilds_friend.getChildren().add(friend_image);
//        flow_name_status_friend.getChildren().add(name_friendLbl);
//        flow_name_status_friend.getChildren().add(status_friendLbl);
//        flowContainsChilds_friend.getChildren().add(flow_name_status_friend);
//        image_Friend_Anchor.getChildren().add(btnAdd_btn);
//        image_Friend_Anchor.getChildren().add(btnAdd_image);
//        flowContainsChilds_friend.getChildren().add(image_Friend_Anchor);
//        flow_parent_friendList.getChildren().add(flowContainsChilds_friend);
        anchor_friendList.getChildren().add(flow_parent_friendList);
        anchorPane3.getChildren().add(imageView3);

        currentScene = new Scene(this);
    }

    BorderPane getParentNode() {
        return this;
    }

    Scene retScene() {

        return currentScene;
    }
}
