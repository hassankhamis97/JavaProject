/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import Database.Database;
import Main.MainBase;
import Stack.NavigationStack;
import Store.StoreUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author Kasper
 */
public class Store extends StoreUI {

    protected ArrayList<String> myImages;
    int myCoins = 0;
    boolean highPrice = false;
    boolean done = false;

    Database db;

    public Store() {
        db = new Database();
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                setPrefHeight(SharedData.nsList.get(0).root.getHeight());
                setPrefWidth(SharedData.nsList.get(0).root.getWidth());
                setStyle(" -fx-background-color:linear-gradient(#8ad9dc, #409cc7),\n"
                        + "            linear-gradient(#d6e2f9 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #4d94e6);\n"
                        + "    -fx-background-size: 100% 100%;");
                back.setStyle("-fx-background-color:\n"
                        + "            rgba(0,0,0,0.08),\n"
                        + "            linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "    -fx-background-insets: 0 ;\n"
                        + "    -fx-background-radius: 30;\n"
                        + "    -fx-text-fill: #242d35;\n"
                        + "    -fx-font-size: 16px;");

                back.setStyle("-fx-background-color: transparent;");

                // update coins 
                coinsText.setText("" + SharedData.Coins);

            }
        });
        Connection con = db.openConnection();
        db.getCoins(con);
        db.closeConnection(con);
        //******************************//
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "Store";
        nsObj.cssStyle = "/Store/store.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);

        loadStore();

        //  Main.showNewScene(getScene(), "/Store/store.css");
    }

    void loadStore() {

        myImages = new ArrayList<String>();
        myImages.add("/Resources/superdap.gif");
        myImages.add("/Resources/super.gif");
        myImages.add("/Resources/checken.gif");
        myImages.add("/Resources/glass.gif");
        myImages.add("/Resources/g3.gif");
        myImages.add("/Resources/smile.gif");
        myImages.add("/Resources/g7.gif");
        myImages.add("/Resources/tenor.gif");
        myImages.add("/Resources/gold.png");
        myImages.add("/Resources/logo.png");
        myImages.add("/Resources/user.png");
        myImages.add("/Resources/pass.png");
        myImages.add("/Resources/shy.png");
        buy.setOnAction((ActionEvent event) -> {

            //    Main.showNewScene(getScene(), "/SignUp/reg.css", new LoginUI().getParent(), new SignUpUI().getParent(), new SignUpUI().getParentNode2());
        });

        new Thread(() -> {
            L11.setImage(new Image(getClass().getResource("/Resources/pic1.gif").toExternalForm()));

        }).start();

        L11.setOnMouseClicked((MouseEvent event) -> {

            buyEmoji(true, "/Resources/pic1.gif");
        });

        ///////////////////////
        new Thread(() -> {
            l12.setImage(new Image(getClass().getResource("/Resources/pic2.gif").toExternalForm()));

        }).start();
        l12.setOnMouseClicked((MouseEvent event) -> {
            buyEmoji(true, "/Resources/pic2.gif");
        });

        new Thread(() -> {
            L13.setImage(new Image(getClass().getResource("/Resources/pic3.gif").toExternalForm()));

        }).start();
        L13.setOnMouseClicked((MouseEvent event) -> {
            buyEmoji(true, "/Resources/pic3.gif");
        });
        new Thread(() -> {
            L21.setImage(new Image(getClass().getResource("/Resources/pic4.gif").toExternalForm()));

        }).start();

        L21.setOnMouseClicked((MouseEvent event) -> {
            buyEmoji(true, "/Resources/pic4.gif");
        });

        //////////////////////////
        new Thread(() -> {
            L22.setImage(new Image(getClass().getResource("/Resources/pic5.gif").toExternalForm()));

        }).start();

        L22.setOnMouseClicked((MouseEvent event) -> {
            buyEmoji(true, "/Resources/pic5.gif");
        });

        new Thread(() -> {
            L23.setImage(new Image(getClass().getResource("/Resources/pic6.gif").toExternalForm()));

        }).start();

        L23.setOnMouseClicked((MouseEvent event) -> {
            buyEmoji(true, "/Resources/pic6.gif");
        });

        L31.setImage(new Image(getClass().getResource("/Resources/pic7.png").toExternalForm()));

        L31.setOnMouseClicked((MouseEvent event) -> {
            buyEmoji(false, "/Resources/pic7.png");
        });

        L32.setImage(new Image(getClass().getResource("/Resources/pic8.png").toExternalForm()));

        L32.setOnMouseClicked((MouseEvent event) -> {
            buyEmoji(false, "/Resources/pic8.png");
        });

        L33.setImage(new Image(getClass().getResource("/Resources/pic9.png").toExternalForm()));

        L33.setOnMouseClicked((MouseEvent event) -> {
            buyEmoji(false, "/Resources/pic9.png");
        });

        gold.setImage(new Image(getClass().getResource(myImages.get(8)).toExternalForm()));

        goBack.setOnMouseClicked((MouseEvent event) -> {
            System.out.println("back ------> ");
            Pane myOldRoot = SharedData.nsList.get(SharedData.nsList.size() - 1).root;
            SharedData.nsList.remove(SharedData.nsList.size() - 1);
            SharedData.nsList.get(SharedData.nsList.size() - 1).isNew = false;
            Main.showNewScene(myOldRoot);
        });

    }//end

    
    private void buyEmoji(boolean high_price, String emojiName) {
        Connection con = db.openConnection();
        if (high_price && SharedData.Coins >= 15) {
            

            boolean st = db.addNewEmoji(con, emojiName);
            if(st){
                SharedData.Coins -= 15;
                db.updatePlayerCoins(con, done);
            db.onButtonAlert(" Operation done Successfully ^_^", done);
            }
            ///  updatePlayerCoins();
            

//           try {
//               stmt = SharedData.con.prepareStatement("INSERT INTO statistics (ID,COINS) VALUES(?,?) Player where id = ?");
//               stmt.setInt(1, SharedData.playerID);
//               /* example override value */// stmt.setInt(1, 13);
//               
//                  stmt.executeUpdate();
//                  done=true;
//                  onButtonAlert("the Emoji has been added successfully to your store",done);
//              
//           } catch (SQLException ex) {
//               Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
//           }
        } else if (!(high_price) && SharedData.Coins >= 5) {
            
            boolean st = db.addNewEmoji(con, emojiName);
            if(st){
                SharedData.Coins -= 5;
                db.updatePlayerCoins(con, done);
            }
            
//           try {
//               stmt = SharedData.con.prepareStatement("INSERT INTO statistics (ID,COINS) VALUES(?,?) Player where id = ?");
//               stmt.setInt(1, SharedData.playerID);
//               /* example override value */// stmt.setInt(1, 13);
//               
//               stmt.executeUpdate();
//               done=true;
//               onButtonAlert("the Emoji has been added successfully to your store",done);
//           } catch (SQLException ex) {
//               Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
//           }

        } else {

            done = false;
            db.onButtonAlert("Sorry you dont have enough Coins", done);
        }

        db.closeConnection(con);

    }//end of function

    /*  void addNewEmoji(String emojiName) {
        try {                                           //create player_Emoji table in your database
            stmt = SharedData.con.prepareStatement("INSERT INTO player-Emoji  (ID,emojiName) VALUES(?,?) Player where id = ?");
            stmt.setInt(1, SharedData.playerID);
         
            stmt.setString(2, emojiName);
 done = true;
            stmt.executeUpdate();
           
            SharedData.con.close();
            onButtonAlert("the Emoji has been added successfully to your store", done);
        } catch (SQLException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
 /*  void updatePlayerCoins() {

        try {
            stmt = SharedData.con.prepareStatement("UPDATE PLAYER SET COINS =?  where id = ?");
            stmt.setInt(1, myCoins);
            stmt.setInt(2, SharedData.playerID);
            /* example override value *///
//            stmt.executeUpdate();
//            done = true;
//            onButtonAlert("the Emoji has been added successfully to your store", done);
//            SharedData.con.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
//        }
    // }

    /*  void onButtonAlert(String context, boolean done1) {

        Alert alertConfirmation = new Alert(AlertType.CONFIRMATION);
        alertConfirmation.setTitle("Buy Emoji");
//        alertConfirmation.setHeaderText("Confirmation Alert Header");
        alertConfirmation.setContentText(context);
        alertConfirmation.showAndWait();

        if (done) {
            // auto back to  main sreeen 
        }

    }*/
    void showRejectedAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Unfortuantly");
        alert.setHeaderText("sorry you don't have Enough Coins ...");
//alert.setContentText("sorry!");

        alert.showAndWait();
    }

    /*  private void getCoins() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // stablish the connection
            SharedData.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaproject", "root", "root");
            stmt = SharedData.con.prepareStatement(" SELECT Coins FROM statistics where id = ? ");
        //    stmt.setInt(1, SharedData.playerID);
            /* example override value *//* stmt.setInt(1, 13);

            rs = stmt.executeQuery();
            if (rs.next()) {
                myCoins = rs.getInt(1);
               // coinsText.setText("" + myCoins);
                System.out.println("my coins --> " + myCoins );
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        }

    }*/

}
