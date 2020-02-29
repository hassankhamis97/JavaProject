/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import clientapp.SharedData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hassan Khamis
 */
public class Database {

    public Connection openConnection() {
        Connection con;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaproject", "root", "root");
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

    int getSavedGames(Connection con) {
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
            while(rs.next())
            {
//                while(rs.getInt("ID"))
//                {
//                    playerID = rs.getInt("ID");
//                    playerID = rs.getInt("ID");
//                    
//                }
                
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return playerID;
    }
}
