/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import Connect4.Connect4Menu;
import Database.Database;
import Main.MainBase;
import Main.MenuMultiTicUI;
import Stack.NavigationStack;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import static javafx.scene.layout.AnchorPane.setRightAnchor;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

/**
 *
 * @author Hassan Khamis
 */
public class MenuMultiTic extends MenuMultiTicUI {

    DataOutputStream dos;
    boolean isFriendOpen = false;
    Thread waitForIncomingReqThread;
    boolean threadFinish = false;
    int count = 0;

    public MenuMultiTic() {
        loadCustomDesign();
        //Main.showNewScene(getScene(), "/Main/main.css");
                imageView0.setImage(new Image(MainBase.class.getResource("Backward_BTN.png").toExternalForm()));
                
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "MenuMultiTic";
        nsObj.cssStyle = "/Main/main.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
//        Main.showNewScene(this);
        friendOpen_btn.setOnAction((ActionEvent event) -> {
            isFriendOpen = !isFriendOpen;
            if (isFriendOpen) {
                setLeft(anchor_friendList);
                getFriendsOnline();

            } else {
                setLeft(null);
            }
        });

        backBtn.setOnAction((ActionEvent event) -> {

            Pane myOldRoot = SharedData.nsList.get(SharedData.nsList.size() - 1).root;
            SharedData.nsList.remove(SharedData.nsList.size() - 1);
            SharedData.nsList.get(SharedData.nsList.size() - 1).isNew = false;
            Main.showNewScene(myOldRoot);
        });

        try {

            dos = new DataOutputStream(SharedData.client.getOutputStream());
        } catch (IOException ex) {
//            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            button.setOnAction((ActionEvent event) -> {
                new GameStartMultiOffline();
                                                  Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);            

            });
            button1.setOnAction((ActionEvent event) -> {
                try {
                    dos.writeUTF("tic-random");
                    if (count > 0) {
                        runThread();
                    }
                    count++;
                    //dos.close();
                    //    new OnlineWait(); // before friends
//                    Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size()-2).root);
                } catch (IOException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            runThread();
            anchorPane3.getChildren().add(friendOpen_btn);
        }

    }

    private void runThread() {
        waitForIncomingReqThread = new Thread(() -> {
            //while (true) {                
            try {
//            wait();
                DataInputStream dis = new DataInputStream(SharedData.client.getInputStream());
                String s = dis.readUTF();
//                    dis.close();
                String[] strArr = s.split("-");
                switch (strArr[0]) {
                    case "Playwith":
                        if (Integer.parseInt(strArr[1]) == SharedData.playerID) {
//                        threadFinish = true;
                            Platform.runLater(() -> {
                                new OnlineWait();
                                //  Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);            

                            });

                        } else {
                            MenuMultiTic.this.showRequestMsg(strArr[1]);
//                        threadFinish = true;

                        }
//                     wait();
                        break;
                    case "PlayRandom":
                        Platform.runLater(() -> {
                            new OnlineWait();
                            //    Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);            

                        });
                        break;

                }
            } catch (IOException ex) {
            }

            //}
        });
        waitForIncomingReqThread.start();
    }

    private void getFriendsOnline() {
        try {
            Database db = new Database();
            Connection con = db.openConnection();
            //stmt.setInt(2, SharedData.playerID);
            ResultSet rs = db.getOnlineFriends(con);
//            int count = 0;
            while (rs.next() == true) {
                String playerOnlineID = rs.getString("ID");
                String name = rs.getString("name");
//                int isOnline = rs.getInt("IsOnline");
                int isRequested = rs.getInt("IsRequest");
                String status = isRequested == 0 ? "available" : "in other game";
                FlowPane flowContainsChilds_friend = new FlowPane();
                ImageView friend_image = new ImageView();
                FlowPane flow_name_status_friend = new FlowPane();
                Label name_friendLbl = new Label();
                Label status_friendLbl = new Label();
                AnchorPane image_Friend_Anchor = new AnchorPane();
                Button btnAdd_btn = new Button();
                ImageView btnAdd_image = new ImageView();
                flowContainsChilds_friend.setId("flowContainsChilds_friend");
                flowContainsChilds_friend.setPrefHeight(82.0);
                flowContainsChilds_friend.setPrefWidth(259.0);

                friend_image.setFitHeight(51.749925000001895);
                friend_image.setFitWidth(68.99990000000253);
                friend_image.setId("friend_image");
                friend_image.setPickOnBounds(true);
                friend_image.setPreserveRatio(true);

                flow_name_status_friend.setId("flow_name_status_friend");
                flow_name_status_friend.setMinWidth(53.0);
                flow_name_status_friend.setOrientation(javafx.geometry.Orientation.VERTICAL);
                flow_name_status_friend.setPrefHeight(52.0);
                flow_name_status_friend.setPrefWidth(62.0);

                name_friendLbl.setAlignment(javafx.geometry.Pos.CENTER);
                name_friendLbl.setId("name_friendLbl");
                name_friendLbl.setPrefHeight(27.0);
                name_friendLbl.setPrefWidth(56.0);
                name_friendLbl.setText(name);
                name_friendLbl.setTextAlignment(javafx.scene.text.TextAlignment.LEFT);
                name_friendLbl.setFont(new Font("System Bold", 16.0));

                status_friendLbl.setAlignment(javafx.geometry.Pos.CENTER);
                status_friendLbl.setId("status_friendLbl");
                status_friendLbl.setPrefHeight(22.0);
                status_friendLbl.setPrefWidth(60.0);
                status_friendLbl.setText(status);
                status_friendLbl.setFont(new Font("System Italic", 14.0));

                image_Friend_Anchor.setId("image_Friend_Anchor");
                image_Friend_Anchor.setPrefHeight(52.0);
                image_Friend_Anchor.setPrefWidth(51.0);

                btnAdd_btn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);

                btnAdd_btn.setId("btnAdd_" + playerOnlineID);
                btnAdd_btn.setLayoutX(8.0);
                btnAdd_btn.setLayoutY(14.0);
                btnAdd_btn.setMinHeight(22.0);
                btnAdd_btn.setMinWidth(16.0);
                btnAdd_btn.setMnemonicParsing(false);
                btnAdd_btn.setPrefHeight(24.000099999997474);
                btnAdd_btn.setPrefWidth(35.0);
                btnAdd_btn.setText("");
                btnAdd_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
                btnAdd_btn.setFont(new Font("System Bold Italic", 16.0));
                btnAdd_btn.setOnAction((ActionEvent event) -> {
                    String[] stArr = btnAdd_btn.getId().split("_");
                    int player2ID = Integer.parseInt(stArr[1]);
                    try {
                        dos.writeUTF("tic-" + player2ID);

                    } catch (IOException ex) {
                        Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });

                btnAdd_image.setFitHeight(23.87506948241935);
                btnAdd_image.setFitWidth(24.0);
                btnAdd_image.setId("btnAdd_image");
                btnAdd_image.setLayoutX(14.0);
                btnAdd_image.setLayoutY(14.0);
                btnAdd_image.setImage(new Image(MainBase.class.getResource("addbtn.png").toExternalForm()));

                flowContainsChilds_friend.getChildren().add(friend_image);
                flow_name_status_friend.getChildren().add(name_friendLbl);
                flow_name_status_friend.getChildren().add(status_friendLbl);
                flowContainsChilds_friend.getChildren().add(flow_name_status_friend);
                image_Friend_Anchor.getChildren().add(btnAdd_image);
                image_Friend_Anchor.getChildren().add(btnAdd_btn);
                flowContainsChilds_friend.getChildren().add(image_Friend_Anchor);
                flow_parent_friendList.getChildren().add(flowContainsChilds_friend);
            }
//           friendOpen_btn.set
//            anchorPane3.getChildren().add(friendOpen_btn);
            db.closeConnection(con);

        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showRequestMsg(String playerName) {
        Platform.runLater(() -> {
            // Update UI here.
            AnchorPane requestHead_anchor = new AnchorPane();
            AnchorPane requestMsg_anchor = new AnchorPane();
            Label Msg_Lbl = new Label();
            Button okRequest_btn = new Button();
            Button noRequest_btn = new Button();
            BorderPane.setAlignment(requestHead_anchor, javafx.geometry.Pos.CENTER);
            requestHead_anchor.setId("requestHead_anchor");
            requestHead_anchor.setPrefHeight(480.0);
            requestHead_anchor.setPrefWidth(157.0);

            requestMsg_anchor.setId("requestMsg_anchor");
            requestMsg_anchor.setLayoutX(-2.0);
            requestMsg_anchor.setLayoutY(96.0);
            requestMsg_anchor.setPrefHeight(95.0);
            requestMsg_anchor.setPrefWidth(151.0);

            Msg_Lbl.setAlignment(javafx.geometry.Pos.CENTER);
            Msg_Lbl.setId("Msg_Lbl");
            Msg_Lbl.setLayoutX(-1.0);
            Msg_Lbl.setLayoutY(0.0);
            Msg_Lbl.setPrefHeight(59.0);
            Msg_Lbl.setPrefWidth(151.0);
            Msg_Lbl.setText("Player " + playerName + " wants to play with you?");
            Msg_Lbl.setFont(new Font(14.0));

            okRequest_btn.setId("okRequest_btn");
            okRequest_btn.setLayoutX(0.0);
            okRequest_btn.setLayoutY(66.0);
            okRequest_btn.setMnemonicParsing(false);
            okRequest_btn.setPrefHeight(27.0);
            okRequest_btn.setPrefWidth(46.9998779296875);
            okRequest_btn.setText("OK");
            okRequest_btn.setFont(new Font(12.0));
            okRequest_btn.setOnAction((ActionEvent event) -> {
                try {
                    MenuMultiTic.this.dos.writeUTF("OK-RequestAnswer");
                    Platform.runLater(() -> {
                        new OnlineWait();
                    });
//                        PreparedStatement stmt = SharedData.con.prepareStatement("update requests \n"
//                                + "set Status = 1,\n"
//                                + "RequestedPlayerID = 2\n"
//                                + "where PlayerID = 1;");
//                        stmt.setInt(1, 1);
//                        stmt.setInt(2, SharedData.playerID);
//                        stmt.executeUpdate();
//                        SharedData.con.close();
                } catch (IOException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            noRequest_btn.setId("noRequest_btn");
            noRequest_btn.setLayoutX(88.0);
            noRequest_btn.setLayoutY(66.0);
            noRequest_btn.setMnemonicParsing(false);
            noRequest_btn.setPrefHeight(27.0);
            noRequest_btn.setPrefWidth(56.0);
            noRequest_btn.setText("NO");
            noRequest_btn.setOnAction((ActionEvent event) -> {
                try {
                    MenuMultiTic.this.dos.writeUTF("NO-RequestAnswer");
//                        PreparedStatement stmt = SharedData.con.prepareStatement("update requests \n"
//                                + "set Status = 1,\n"
//                                + "RequestedPlayerID = 2\n"
//                                + "where PlayerID = 1;");
//                        stmt.setInt(1, 0);
//                        stmt.setInt(2, SharedData.playerID);
//                        stmt.executeUpdate();
////                        SharedData.con.close();
                } catch (IOException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            MenuMultiTic.this.setRight(requestHead_anchor);

            requestMsg_anchor.getChildren().add(Msg_Lbl);
            requestMsg_anchor.getChildren().add(okRequest_btn);
            requestMsg_anchor.getChildren().add(noRequest_btn);
            requestHead_anchor.getChildren().add(requestMsg_anchor);
        });
    }

    synchronized private void threadFn() {

    }

    private void loadCustomDesign() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                setPrefHeight(SharedData.nsList.get(0).root.getHeight());
                setPrefWidth(SharedData.nsList.get(0).root.getWidth());
                setStyle("-fx-background-color:linear-gradient(#8ad9dc, #409cc7),\n"
                        + "            linear-gradient(#d6e2f9 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #4d94e6);\n"
                        + "    -fx-background-size: 100% 100%;");
                button.setStyle("-background-color:\n"
                        + "            #ffffff,\n"
                        + "            rgba(0,0,0,0.05),\n"
                        + "             linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "/*            linear-gradient(#be8adc, #7a40c7),\n"
                        + "            linear-gradient(#e0d6f9 0%, #f4bceb 20%, #a45de6 80%, #8945e2 100%),\n"
                        + "            linear-gradient(#f6bed8, #ae4de6);*/\n"
                        + "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n"
                        + "    -fx-background-radius: 50;\n"
                        + "    -fx-padding: 15 30 15 30;\n"
                        + "    -fx-font-family: \"Helvetica Bold\";\n"
                        + "    -fx-font-size: 18px;\n"
                        + "    -fx-text-fill: #311c09;\n"
                        + "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
                button1.setStyle("-background-color:\n"
                        + "            #ffffff,\n"
                        + "            rgba(0,0,0,0.05),\n"
                        + "             linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "/*            linear-gradient(#be8adc, #7a40c7),\n"
                        + "            linear-gradient(#e0d6f9 0%, #f4bceb 20%, #a45de6 80%, #8945e2 100%),\n"
                        + "            linear-gradient(#f6bed8, #ae4de6);*/\n"
                        + "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n"
                        + "    -fx-background-radius: 50;\n"
                        + "    -fx-padding: 15 30 15 30;\n"
                        + "    -fx-font-family: \"Helvetica Bold\";\n"
                        + "    -fx-font-size: 18px;\n"
                        + "    -fx-text-fill: #311c09;\n"
                        + "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
friendOpen_btn.setStyle("-fx-background-color:transparent");
                flow_parent_friendList.setStyle("-fx-background-color:#ddd;");
backBtn.setStyle("-fx-background-color:transparent");
            }
        });
    }
}
