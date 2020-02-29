/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Pojos.Moves;
import Pojos.SavedGame;
import clientapp.SharedData;
import clientapp.Store;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

/**
 *
 * @author Hassan Khamis
 */
public class Database {

    public Connection openConnection() {
        Connection con;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/javaproject", "root", "root");
        } catch (ClassNotFoundException ex) {
            con = null;
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            con = null;
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void updatePortID(Connection con, int port) {

        try {
            PreparedStatement stmt = con.prepareStatement("update player set PortID = ? where ID = ?");
            stmt.setInt(1, port);
            stmt.setInt(2, SharedData.playerID);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet getOnlineFriends(Connection con)
    {
        ResultSet rs;
        try {
        PreparedStatement stmt = SharedData.con.prepareStatement("SELECT p.Name , p.IsRequest \n"
                    + ",case\n"
                    + "when f1.player1ID = ? then f1.player2ID\n"
                    + "when f1.player2ID = ? then f1.player1ID \n"
                    + "when f2.player1ID = ? then f2.player2ID\n"
                    + "when f2.player2ID = ? then f2.player1ID\n"
                    + "else null end as ID\n"
                    + " FROM player p\n"
                    + " left join friend f1\n"
                    + " on p.ID = f1.player1ID\n"
                    + " left join friend f2\n"
                    + " on p.ID = f2.player2ID\n"
                    + " where p.IsOnline = ? and p.ID <> ? and \n"
                    + " (f1.player1ID = ? OR f1.player2ID = ? OR f2.player1ID = ? OR f2.player2ID = ?);");
            for (int i = 1; i <= 10; i++) {
                if (i != 5) {
                    stmt.setInt(i, SharedData.playerID);
                } else {
                    stmt.setInt(i, 1);
                }
            }
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            rs = null;
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
public int getSavedGames(Connection con) {

 
        ArrayList<SavedGame> savedGamesLst = new ArrayList<>();

        int playerID = 0;
        try {
            PreparedStatement stmt = con.prepareStatement("select gm.GameID,gm.PlayerID,gm.TimeToPlay,gm.MoveType,gm.CellNo, \n"
                    + "p1.ID AS Player1ID, p1.Name AS Player1Name,p1.Photo AS Player1Photo,\n"
                    + "p2.ID AS Player2ID ,p2.Name AS Player2Name ,p2.Photo AS Player2Photo\n"
                    + "from gamemove gm\n"
                    + "inner join game g\n"
                    + "on gm.GameID = g.ID\n"
                    + "inner join player p1\n"
                    + "on p1.ID = g.Player1ID   \n"
                    + "inner join player p2\n"
                    + "on p2.ID = g.Player2ID    \n"
                    + "where p1.ID = ? or p2.ID = ?");
            stmt.setInt(1, SharedData.playerID);
            stmt.setInt(2, SharedData.playerID);
            ResultSet rs;
            rs = stmt.executeQuery();
            while (rs.next()) {

//                while(rs.getInt("ID"))
//                {
//                    playerID = rs.getInt("ID");
//                    playerID = rs.getInt("ID");
//                    
//                }


                SavedGame saveGameObj = null;
                int oldID = 0;
                int currentID = rs.getInt("gm.GameID");
                if (currentID != oldID) {
                    oldID = rs.getInt("gm.GameID");
                    saveGameObj = new SavedGame();
                    saveGameObj.id = rs.getInt("gm.GameID");
                    saveGameObj.player1ID = rs.getInt("Player1ID");
                    saveGameObj.player1Name = rs.getString("Player1Name");
                    saveGameObj.player1Image = rs.getString("Player1Photo");
                    saveGameObj.player2ID = rs.getInt("Player2ID");
                    saveGameObj.player2Name = rs.getString("Player2Name");
                    saveGameObj.player2Image = rs.getString("Player2Photo");
                    
                }
                Moves moveObj = new Moves();
                moveObj.playerID = rs.getInt("gm.PlayerID");
                moveObj.delayTimeSec = rs.getLong("gm.TimeToPlay");
                moveObj.blockNo = rs.getString("gm.CellNo");
                moveObj.moveType = rs.getString("gm.MoveType");
                saveGameObj.moveLst.add(moveObj);
                savedGamesLst.add(saveGameObj);
                

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return playerID;
    }

    public void getPlayerID(Connection con, String email, String pass) {
        try {
            PreparedStatement stmt;
            ResultSet rs;
            SharedData.playerID = 0;
            stmt = con.prepareStatement("SELECT ID FROM Player where Email = ? and Password = ?");
            stmt.setString(1, email);
            stmt.setString(2, pass);
            rs = stmt.executeQuery();
            if (rs.first() == true) {
                SharedData.playerID = rs.getInt("ID");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     public  boolean addNewEmoji(Connection con, String emojiName , int player_Id){
         boolean done = false ;
             try {     
                 
                  PreparedStatement stmt;
            ResultSet rs;
         
//create player_Emoji table in your database
            stmt = con.prepareStatement("INSERT INTO player-Emoji  (ID,emojiName) VALUES(?,?) Player where id = ?");
            stmt.setInt(1, SharedData.playerID);
            /* example override value *///
            stmt.setString(2, emojiName);
             done = true;
            stmt.executeUpdate();
           
        
            onButtonAlert("the Emoji has been added successfully to your store", done);
        } catch (SQLException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        }
             return done;
    }
     
     
       private void getCoins() {
           
              PreparedStatement stmt;
            ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver"); // stablish the connection
            SharedData.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaproject", "root", "root");
            stmt = SharedData.con.prepareStatement(" SELECT Coins FROM statistics where id = ? ");
        //    stmt.setInt(1, SharedData.playerID);
            /* example override value */ stmt.setInt(1, 13);

            rs = stmt.executeQuery();
            if (rs.next()) {
                SharedData.Coins = rs.getInt(1);
               // coinsText.setText("" + myCoins);
                System.out.println("my coins --> " +   SharedData.Coins );
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     
     
      void onButtonAlert(String context, boolean done1) {

        Alert alertConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
        alertConfirmation.setTitle("Buy Emoji");
//        alertConfirmation.setHeaderText("Confirmation Alert Header");
        alertConfirmation.setContentText(context);
        alertConfirmation.showAndWait();

        if (done1) {
            // auto back to  main sreeen 
        }

    }
      
      
   public   boolean updatePlayerCoins( boolean done) {
 PreparedStatement stmt;
            ResultSet rs;
            
        try {
            stmt = SharedData.con.prepareStatement("UPDATE PLAYER SET COINS =?  where id = ?");
            stmt.setInt(1, SharedData.Coins);
            stmt.setInt(2, SharedData.playerID);
            /* example override value *///

            stmt.executeUpdate();
            done = true;
            onButtonAlert("the Emoji has been added successfully to your store", done);
            SharedData.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        }
       return done;
    }
      
}