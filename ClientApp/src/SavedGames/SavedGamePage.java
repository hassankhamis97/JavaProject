/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SavedGames;

//import com.mysql.fabric.xmlrpc.Client;
import Game.GameUI;
import Stack.NavigationStack;
import clientapp.Loser;
import clientapp.Main;
import clientapp.SharedData;
import clientapp.Winner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import Pojos.SavedGame;

/**
 *
 * @author hassan
 */
public class SavedGamePage extends GameUI {

    Scene gameStartScene;
    PrintStream ps;
    DataInputStream dis;
    //ObjectInputStream ois;
    DataOutputStream dos;
    //Socket client;
    String status;
    Alert alert;
    boolean isChatOpen = false;
    int chatTxtPosY = 21;

    public SavedGamePage(SavedGame saveGameObj) {
        loadCustomDesign();
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "SavedGame";
        nsObj.cssStyle = "/Game/game.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < saveGameObj.moveLst.size(); i++) {
                    switch (saveGameObj.moveLst.get(i).blockNo) {
                        case "1": {
                            final String moveType = saveGameObj.moveLst.get(i).getMoveType();
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {

                                    if (moveType.equals("X")) {
                                        label.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                    } else {
                                        label.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                    }
                                }
                            });
                        }
                        break;

                        case "2": {
                            final String moveType = saveGameObj.moveLst.get(i).getMoveType();
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (moveType.equals("X")) {
                                        label0.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                    } else {
                                        label0.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                    }
                                }
                            });
                        }
                        break;

                        case "3": {
                            final String moveType = saveGameObj.moveLst.get(i).getMoveType();
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (moveType.equals("X")) {
                                        label1.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                    } else {
                                        label1.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                    }
                                }
                            });
                        }
                        break;

                        case "4": {
                            final String moveType = saveGameObj.moveLst.get(i).getMoveType();
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (moveType.equals("X")) {
                                        label2.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                    } else {
                                        label2.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                    }
                                }
                            });
                        }
                        break;

                        case "5": {
                            final String moveType = saveGameObj.moveLst.get(i).getMoveType();
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (moveType.equals("X")) {
                                        label3.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                    } else {
                                        label3.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                    }
                                }
                            });
                        }
                        break;
                        case "6": {
                            final String moveType = saveGameObj.moveLst.get(i).getMoveType();
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (moveType.equals("X")) {
                                        label4.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                    } else {
                                        label4.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                    }
                                }
                            });
                        }
                        break;
                        case "7": {
                            final String moveType = saveGameObj.moveLst.get(i).getMoveType();
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (moveType.equals("X")) {
                                        label5.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                    } else {
                                        label5.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                    }
                                }
                            });
                        }
                        break;
                        case "8": {
                            final String moveType = saveGameObj.moveLst.get(i).getMoveType();
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (moveType.equals("X")) {
                                        label6.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                    } else {
                                        label6.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                    }
                                }
                            });
                        }
                        break;
                        case "9": {
                            final String moveType = saveGameObj.moveLst.get(i).getMoveType();
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (moveType.equals("X")) {
                                        label7.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                    } else {
                                        label7.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                    }
                                }
                            });
                        }
                        break;

                    }

                }
            }
        });
        th.start();

    }

    private void loadCustomDesign() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                setPrefHeight(SharedData.nsList.get(0).root.getHeight());
                setPrefWidth(SharedData.nsList.get(0).root.getWidth());
                setStyle("-fx-background-color:linear-gradient(#8ad9dc, #409cc7),\n"
                        + "            linear-gradient(#d6e2f9 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #4d94e6);\n"
                        + "    -fx-background-size: 100% 100%;");
                button.setStyle("-fx-background-color:transparent;");
                button0.setStyle("-fx-background-color:transparent;");
                button1.setStyle("-fx-background-color:transparent;");
                button2.setStyle("-fx-background-color:transparent;");
                button3.setStyle("-fx-background-color:transparent;");
                button4.setStyle("-fx-background-color:transparent;");
                button5.setStyle("-fx-background-color:transparent;");
                button6.setStyle("-fx-background-color:transparent;");
                button7.setStyle("-fx-background-color:transparent;");
                chatBtn.setStyle("-fx-background-color:transparent;");
                chatAnch.setStyle(" -fx-background-color:#ddd;");

            }
        });
    }

}
