/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SavedGames;

import Database.Database;
import Pojos.SavedGame;
import Stack.NavigationStack;
import clientapp.SharedData;
import java.sql.Connection;
import java.util.ArrayList;
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
    }

    private void loadData() {
        ArrayList<SavedGame> saveGameLst = new ArrayList<>();
        Database db = new Database();
        Connection con = db.openConnection();
        db.getSavedGames(con);
        db.closeConnection(con);
            
        for (int i = 0; i < saveGameLst.size(); i++) {
            MainItem_anchor = new AnchorPane();
            opponentName_Lbl = new Label();
            time_Lbl = new Label();
        Date_Lbl = new Label();
        watch_btn = new Button();
        MainItem_anchor.setLayoutX(0.0);
        MainItem_anchor.setLayoutY(14.0);
        MainItem_anchor.setMinHeight(71.0);
        MainItem_anchor.setPrefHeight(71.0);
        MainItem_anchor.setPrefWidth(308.0);
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
        watch_btn.setMnemonicParsing(false);
        watch_btn.setPrefHeight(31.0);
        watch_btn.setPrefWidth(88.0);
        watch_btn.setText("Watch");
        MainItem_anchor.getChildren().add(time_Lbl);
        MainItem_anchor.getChildren().add(Date_Lbl);
        MainItem_anchor.getChildren().add(watch_btn);
//            opponentName_Lbl.setText("Opponent Player");
        MainItem_anchor.getChildren().add(opponentName_Lbl);

//            opponentName_Lbl.setText(saveGameLst.get(i).player2Name);

//            MainItem_anchor.
//            ListContainer_anchor.
        }
    }

}
