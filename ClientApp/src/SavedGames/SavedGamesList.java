/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SavedGames;

import Database.Database;
import MoreGamesMenu.MoreGamesMenu;
import Pojos.SavedGame;
import Stack.NavigationStack;
import clientapp.Main;
import clientapp.SharedData;
import java.sql.Connection;
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

/**
 *
 * @author Hassan Khamis
 */
public class SavedGamesList extends WatchSavedGamesUI {

    AnchorPane MainItem_anchor;
    Label opponentName_Lbl;
    Label time_Lbl;
    Label Date_Lbl;
    Button watch_btn;

    public SavedGamesList() {
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "SavedGamesList";
        nsObj.cssStyle = "/SavedGames/watch.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
        loadData();
        loadCustomDesign();

    }

    private void loadData() {
//        final ArrayList<SavedGame> saveGameLst = new ArrayList<>();
        Database db = new Database();
        Connection con = db.openConnection();
        final ArrayList<SavedGame> saveGameLst = db.getSavedGames(con);
        db.closeConnection(con);

        for (int i = 0; i < saveGameLst.size(); i++) {
            MainItem_anchor = new AnchorPane();
            opponentName_Lbl = new Label();
            time_Lbl = new Label();
            Date_Lbl = new Label();
            watch_btn = new Button();
            double height = 71.0;
            MainItem_anchor.setLayoutX(0.0);
            MainItem_anchor.setLayoutY(14.0);
            MainItem_anchor.setMinHeight(height);
            MainItem_anchor.setPrefHeight(height);
            MainItem_anchor.setPrefWidth(308.0);
            height += 71.0;
            opponentName_Lbl.setLayoutX(20.0);
            opponentName_Lbl.setLayoutY(17.0);
            opponentName_Lbl.setText(saveGameLst.get(i).player2Name);
            time_Lbl.setLayoutX(104.0);
            time_Lbl.setLayoutY(36.0);
            time_Lbl.setPrefWidth(40.0);
            time_Lbl.setText("Time");
            time_Lbl.setFont(new Font(14.0));

//        Date_Lbl.setFont(javafx.scene.text.Font.$x1);
            Date_Lbl.setLayoutX(48.0);
            Date_Lbl.setLayoutY(36.0);
            Date_Lbl.setPrefWidth(40.0);
            Date_Lbl.setText("Date");

            watch_btn.setLayoutX(220.0);
            watch_btn.setLayoutY(10.0);
            watch_btn.setId("btnAdd_" + i);
            watch_btn.setMnemonicParsing(false);
            watch_btn.setPrefHeight(31.0);
            watch_btn.setPrefWidth(88.0);
            watch_btn.setText("Watch");
            watch_btn.setOnAction((ActionEvent event) -> {
                String[] stArr = watch_btn.getId().split("_");
                int index = Integer.parseInt(stArr[1]);
                
                new SavedGamePage(saveGameLst.get(index));
                Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
            });
            MainItem_anchor.getChildren().add(time_Lbl);
            MainItem_anchor.getChildren().add(Date_Lbl);
            MainItem_anchor.getChildren().add(watch_btn);
//            opponentName_Lbl.setText("Opponent Player");
            MainItem_anchor.getChildren().add(opponentName_Lbl);

//            opponentName_Lbl.setText(saveGameLst.get(i).player2Name);
//            MainItem_anchor.
            ListContainer_anchor.getChildren().add(MainItem_anchor);
        }
    }

    private void loadCustomDesign() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                setPrefHeight(SharedData.nsList.get(0).root.getHeight());
                setPrefWidth(SharedData.nsList.get(0).root.getWidth());
                setStyle("-fx-background-color:linear-gradient(#8ad9dc, #409cc7),\n"
                        + "        linear-gradient(#d6e2f9 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "        linear-gradient(#c6bef6, #4d94e6);\n"
                        + "    -fx-background-size: 100% 100%;");
//                #btn.setStyle("-background-color:\n"
//                        + "            #ffffff,\n"
//                        + "            rgba(0,0,0,0.05),\n"
//                        + "             linear-gradient(#13e0e7, #409cc7),\n"
//                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
//                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
//                        + "/*            linear-gradient(#be8adc, #7a40c7),\n"
//                        + "            linear-gradient(#e0d6f9 0%, #f4bceb 20%, #a45de6 80%, #8945e2 100%),\n"
//                        + "            linear-gradient(#f6bed8, #ae4de6);*/\n"
//                        + "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n"
//                        + "    -fx-background-radius: 50;\n"
//                        + "    -fx-padding: 15 30 15 30;\n"
//                        + "    -fx-font-family: \"Helvetica Bold\";\n"
//                        + "    -fx-font-size: 18px;\n"
//                        + "    -fx-text-fill: #311c09;\n"
//                        + "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
//                checkTheWorldBtn.setStyle("-background-color:\n"
//                        + "            #ffffff,\n"
//                        + "            rgba(0,0,0,0.05),\n"
//                        + "             linear-gradient(#13e0e7, #409cc7),\n"
//                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
//                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
//                        + "/*            linear-gradient(#be8adc, #7a40c7),\n"
//                        + "            linear-gradient(#e0d6f9 0%, #f4bceb 20%, #a45de6 80%, #8945e2 100%),\n"
//                        + "            linear-gradient(#f6bed8, #ae4de6);*/\n"
//                        + "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n"
//                        + "    -fx-background-radius: 50;\n"
//                        + "    -fx-padding: 15 30 15 30;\n"
//                        + "    -fx-font-family: \"Helvetica Bold\";\n"
//                        + "    -fx-font-size: 18px;\n"
//                        + "    -fx-text-fill: #311c09;\n"
//                        + "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
//
//                flow_parent_friendList.setStyle("-fx-background-color:#ddd;");

            }
        });
    }

}
