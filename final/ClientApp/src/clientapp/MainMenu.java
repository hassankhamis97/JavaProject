/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import Connect4.Connect4Menu;
import Main.MainBase;
import MoreGamesMenu.MoreGamesMenu;
import Pojos.SavedGame;
import SavedGames.SavedGamePage;
import SavedGames.SavedGamesList;
import SavedGames.WatchSavedGamesUI;
import Stack.NavigationStack;
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
public class MainMenu extends MainBase {

    SavedGame sv;
    DataOutputStream dos;
//    DataInputStream dis;
    boolean isFriendOpen = false;
    Thread waitForIncomingReqThread;
    boolean threadFinish = false;

    public MainMenu() {
//        Main.showNewScene(getScene(), "/Main/main.css");
        sv = new SavedGame();
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "MainMenu";
        nsObj.cssStyle = "/Main/main.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
            anchorPane3.getChildren().remove(friendOpen_btn);
            anchorPane3.getChildren().remove(imageView3);

        btnStore.setOnAction((ActionEvent event) -> {
            new Store();
            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
        });

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                btnStore.setStyle("-fx-background-color:transparent;");
                setPrefHeight(SharedData.nsList.get(0).root.getHeight());
                setPrefWidth(SharedData.nsList.get(0).root.getWidth());
                setStyle("-fx-background-color:linear-gradient(#8ad9dc, #409cc7),\n"
                        + "            linear-gradient(#d6e2f9 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #4d94e6);\n"
                        + "    -fx-background-size: 100% 100%;");
                twoPlayer.setStyle("-background-color:\n"
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
                savedGames.setStyle("-background-color:\n"
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
                onePlayer.setStyle("-background-color:\n"
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
                moreGames.setStyle("-background-color:\n"
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
//      Main.showNewScene(SharedData.);
       

        onePlayer.setOnAction((ActionEvent event) -> {
            new Levels();
            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
        });

        twoPlayer.setOnAction((ActionEvent event) -> {

        });

        moreGames.setOnAction((ActionEvent event) -> {
            new MoreGamesMenu();
            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
        });

        savedGames.setOnAction((event) -> {
            System.out.println("save ---> ");
            new SavedGamesList();
            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
        });

        try {

            dos = new DataOutputStream(SharedData.client.getOutputStream());
            dos.writeUTF(SharedData.playerID + "-ID");

//            dis = new DataInputStream(SharedData.client.getInputStream());
        } catch (IOException ex) {
//            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//            try {
//                SharedData.client.shutdownOutput();
//            } catch (IOException ex) {
//                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
//            }
            twoPlayer.setOnAction((ActionEvent event) -> {
                new MenuMultiTic();
                Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
            });
            moreGames.setOnAction((ActionEvent event) -> {
                new MoreGamesMenu();
                Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
            });
        }
//        waitForIncomingReqThread = new Thread(() -> {
//            //while (true) {                
//            try {
////            wait();
//           DataInputStream dis = new DataInputStream(SharedData.client.getInputStream());
//            String s = dis.readUTF();
////                    dis.close();
//            String[] strArr = s.split("-");
//            switch (strArr[0]) {
//                case "Playwith": {
//                    if(Integer.parseInt(strArr[1]) == SharedData.playerID)
//                    {
//                        threadFinish = true;
//                        Platform.runLater(() -> {
//                        new OnlineWait();
//                        });
//                        
//                    }
//                    else
//                    {
//                        MainMenu.this.showRequestMsg(strArr[1]);
//                        threadFinish = true;
//                        
//                    }
////                     wait();
//                     
//                }
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//
//            //}
//        });
//        waitForIncomingReqThread.start();
    }

}
