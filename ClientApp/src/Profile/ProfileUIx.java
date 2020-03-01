/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profile;

import Database.Database;
import Pojos.PlayerProfile;
import Stack.NavigationStack;
import clientapp.Main;
import clientapp.SharedData;
import java.sql.Connection;

/**
 *
 * @author Administrator
 */
public class ProfileUIx extends profileBase {

    PlayerProfile playerProfile = null;

    Database db = new Database();

    Connection con = null;

    public ProfileUIx(int playerID) {

//        Main.showNewScene(retScene(),"/Profile/pro.css");
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "Profile";
        nsObj.cssStyle = "/Profile/pro.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
        Main.showNewScene(this);
        con = db.openConnection();
        playerProfile = db.getPlayerData(con);
        db.closeConnection(con);

        totalTime.setText(Integer.toString(playerProfile.TotalTime));
        totalScore.setText(Integer.toString(playerProfile.TotalScore));
        totalGames.setText(Integer.toString(playerProfile.TotalGames));
        numberOfWinnings.setText(Integer.toString(playerProfile.NoOfWins));
        levels.setText(Integer.toString(playerProfile.LevelID));
        coins.setText(Integer.toString(playerProfile.Coins));

    }

    public ProfileUIx() {
//         Main.showNewScene(retScene(),"/Profile/pro.css");
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "Profile";
        nsObj.cssStyle = "/Profile/pro.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
        Main.showNewScene(this);

    }

}
