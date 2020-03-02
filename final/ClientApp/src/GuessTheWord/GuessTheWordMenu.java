/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesstheword;

import Stack.NavigationStack;
import clientapp.Main;
import clientapp.MainMenu;
import clientapp.OnlineWait;
import clientapp.SharedData;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Hassan Khamis
 */
public class GuessTheWordMenu extends GuessTheWordMenuUI {

    public GuessTheWordMenu() {
//        Main.showNewScene(retScene(), "/Connect4/main.css");
        NavigationStack nsObj = new NavigationStack();
//        nsObj.root = this;
        nsObj.pageName = "GuessTheWordMenu";
        nsObj.cssStyle = "/Connect4/main.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
//        Main.showNewScene(this);
        button0.setOnAction((ActionEvent event) -> {
//            new ConnectFour();
            try {
                DataOutputStream dos;
                dos = new DataOutputStream(SharedData.client.getOutputStream());
                dos.writeUTF("GuesTheWord-random");
                // dos.close();
                new OnlineWait();
//                Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
            } catch (IOException ex) {
                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }

}
