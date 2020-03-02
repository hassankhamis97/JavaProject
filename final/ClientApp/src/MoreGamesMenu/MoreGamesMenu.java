/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreGamesMenu;

import Connect4.Connect4Menu;
import Main.MainBase;
import Main.MenuMultiTicUI;
import Main.MoreGamesMenuUI;
import Stack.NavigationStack;
import clientapp.GameStartMultiOffline;
import clientapp.Main;
import clientapp.OnlineWait;
import clientapp.SharedData;
import guesstheword.GuessTheWord;
import guesstheword.GuessTheWordMenu;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
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
import javafx.scene.layout.AnchorPane;
import static javafx.scene.layout.AnchorPane.setRightAnchor;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;

/**
 *
 * @author Hassan Khamis
 */
public class MoreGamesMenu extends MoreGamesMenuUI {

    DataOutputStream dos;
    boolean isFriendOpen = false;
    Thread waitForIncomingReqThread;
    boolean threadFinish = false;

    public MoreGamesMenu() {
        loadCustomDesign();
        //Main.showNewScene(getScene(), "/Main/main.css");
//        
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "MoreGamesMenu";
        nsObj.cssStyle = "/Main/main.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
//        Main.showNewScene(this);

        try {

            dos = new DataOutputStream(SharedData.client.getOutputStream());
        } catch (IOException ex) {
//            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnFourBtn.setOnAction((ActionEvent event) -> {
                new Connect4New.Connect4Menu();
                Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
            });
            checkTheWorldBtn.setOnAction((ActionEvent event) -> {

                new GuessTheWordMenu();
                Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);

            });

            anchorPane3.getChildren().add(friendOpen_btn);
        }
//        waitForIncomingReqThread = new Thread(() -> {
//            //while (true) {                
//            try {
////            wait();
//                DataInputStream dis = new DataInputStream(SharedData.client.getInputStream());
//                String s = dis.readUTF();
////                    dis.close();
//                String[] strArr = s.split("-");
//                switch (strArr[0]) {
//                    case "Playwith":
//                        if (Integer.parseInt(strArr[1]) == SharedData.playerID) {
////                        threadFinish = true;
//                            Platform.runLater(() -> {
//                                new OnlineWait();
//                            });
//
//                        } else {
//                            MoreGamesMenu.this.showRequestMsg(strArr[1]);
////                        threadFinish = true;
//
//                        }
////                     wait();
//                        break;
//                    case "PlayRandom":
//                        Platform.runLater(() -> {
//                            new OnlineWait();
//                        });
//                        break;
//
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(MoreGamesMenu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            //}
//        });
//        waitForIncomingReqThread.start();
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
                ConnFourBtn.setStyle("-background-color:\n"
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
                checkTheWorldBtn.setStyle("-background-color:\n"
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

                flow_parent_friendList.setStyle("-fx-background-color:#ddd;");

            }
        });
    }
}
