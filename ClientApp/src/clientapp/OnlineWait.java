/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import OnlineWaiting.OnlineWaitUI;
import Stack.NavigationStack;
import guesstheword.GuessTheWord;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;

/**
 *
 * @author Hassan Khamis
 */
public class OnlineWait extends OnlineWaitUI {

    public OnlineWait() {
        //Main.showNewScene(getScene(),"/OnlineWaiting/on.css");
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "OnlineWait";
        nsObj.cssStyle = "/OnlineWaiting/on.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
        Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root); // hna 3lshan el readutf byw2fo w mbykmlsh hnak
//        Main.showNewScene(this);
//        try {
//        
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    DataInputStream dis = new DataInputStream(SharedData.client.getInputStream());
                    String msg = dis.readUTF();
                    if (msg.equals("startGame-tic")) {
                        new GameStart(SharedData.client);
                    } else if (msg.equals("startGame-connect")) {
                        new Connect4.ConnectFour(SharedData.client);
                    }
                    else if (msg.equals("startGame-GuesTheWord")) {
                        new GuessTheWord(SharedData.client);
                    }
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
                        }
                    });

                } catch (IOException ex) {
                    Logger.getLogger(OnlineWait.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        th.start();
    }
}
