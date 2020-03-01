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
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

/**
 *
 * @author Hassan Khamis
 */
public class OnlineWait extends OnlineWaitUI {

    DataOutputStream dos;

    public OnlineWait() {
        Main.showNewScene(getScene(), "/OnlineWaiting/on.css");
        cancel.setOnAction((ActionEvent event) -> {
            try {
                dos = new DataOutputStream(SharedData.client.getOutputStream());
                dos.writeUTF("back-IWantToBack");
            } catch (IOException ex) {
                Logger.getLogger(OnlineWait.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
//        NavigationStack nsObj = new NavigationStack();
//        nsObj.root = this;
//        nsObj.pageName = "OnlineWait";
//        nsObj.cssStyle = "/OnlineWaiting/on.css";
//        nsObj.isNew = true;
//
//        SharedData.nsList.add(nsObj);
//        Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);

// hna 3lshan el readutf byw2fo w mbykmlsh hnak
//   Main.showNewScene(this);
//        SharedData.nsList.add(nsObj);   
        try {
            File imageFile = new File("\\\\DESKTOP-MFT4NF6\\Resources\\Lighthouse.jpg");
            imageView.setImage(new Image(imageFile.toURI().toURL().toExternalForm()));
        } catch (Exception ex) {
        }
        // Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
        // hna 3lshan el readutf byw2fo w mbykmlsh hnak
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
                        dos = new DataOutputStream(SharedData.client.getOutputStream());
                        dos.writeUTF("fdsf-startGameNow");
                        new GameStart(SharedData.client);
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
                            }
                        });
                    } else if (msg.equals("startGame-connect")) { 
//                        dos.writeUTF("startGameNow");
                        dos.writeUTF("fdsf-startGameNow");

                        //  new Connect4.ConnectFour();
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                new Connect4New.ConnectFour(SharedData.client);
                            }
                        });
                    } else if (msg.equals("startGame-GuesTheWord")) {
//                        dos.writeUTF("startGameNow");

                        new GuessTheWord(SharedData.client);
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
                            }
                        });
                    } else if (msg.equals("backNow")) {
                        Pane myOldRoot = SharedData.nsList.get(SharedData.nsList.size() - 1).root;
//                        SharedData.nsList.remove(SharedData.nsList.size() - 1);
                        SharedData.nsList.remove(SharedData.nsList.size() - 1);
                        SharedData.nsList.get(SharedData.nsList.size() - 1).isNew = false;
//                        SharedData.nsList.get(SharedData.nsList.size() - 1).
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                Main.showNewScene(myOldRoot);
                            }
                        });
                    }

                } catch (IOException ex) {
                    Logger.getLogger(OnlineWait.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        th.start();
    }
}
