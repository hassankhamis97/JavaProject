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
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Hassan Khamis
 */
public class SavedGamesList extends WatchSavedGamesUI {

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
            opponentName_Lbl.setText(saveGameLst.get(i).player2Name);
            opponentName_Lbl.setText(saveGameLst.get(i).player2Name);
            
//            MainItem_anchor.
            
//            ListContainer_anchor.
        }
    }
    

}
