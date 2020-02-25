/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

//import com.mysql.fabric.xmlrpc.Client;
import Game.GameUI;
import Stack.NavigationStack;
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

/**
 *
 * @author hassan
 */
public class GameStart extends GameUI {

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

    public GameStart() {

    }

    public GameStart(Socket player2SocketID) {
        //gameStartScene = new Scene(new BorderPane());
        // GameUI gb = new GameUI();
        loadCustomDesign();
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "GameStart";
        nsObj.cssStyle = "/Game/game.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
//        Main.showNewScene(this);
//        gameStartScene = retScene();
        try {
            dis = new DataInputStream(player2SocketID.getInputStream());
            //ps = new PrintStream(player2SocketID.getOutputStream());
            dos = new DataOutputStream(player2SocketID.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*try {
                ois = new ObjectInputStream(player2SocketID.getInputStream());
                oos = new ObjectOutputStream(player2SocketID.getOutputStream());
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }*/
 /*button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent t) {
                                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                });*/
        myPic_img.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Profile p = new Profile();
                getChildren().add(profile_anchor);
                profile_anchor.getChildren().add(p.getParentNode());
            }

        });
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    //String s = "";
                    try {
                        String data = dis.readUTF();
//                                            String data = "";
//                                            try {
//                                                data = (String) ois.readObject();
//                                            } catch (ClassNotFoundException ex) {
//                                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
//                                            }
                        String[] msg = data.split("-");
                        /*Platform.runLater(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                                button.setText(data);
                                                        }
                                                });*/

                        switch (msg[0]) {
                            case "0":
                                status = msg[1];
                                break;
                            case "1":
                                //button.setText(data);
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {

                                        if (msg[1].equals("X")) {
                                            label.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                        } else {
                                            label.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                        }
//                                        button.setDisable(true);
                                    }
                                });

                                break;
                            case "2":
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (msg[1].equals("X")) {
                                            label0.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                        } else {
                                            label0.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                        }
                                        button0.setDisable(true);
                                    }
                                });
                                break;
                            case "3":
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (msg[1].equals("X")) {
                                            label1.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                        } else {
                                            label1.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                        }
                                        button1.setDisable(true);
                                    }
                                });
                                break;
                            case "4":
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (msg[1].equals("X")) {
                                            label2.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                        } else {
                                            label2.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                        }
                                        button2.setDisable(true);
                                    }
                                });
                                break;
                            case "5":
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (msg[1].equals("X")) {
                                            label3.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                        } else {
                                            label3.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                        }
                                        button3.setDisable(true);
                                    }
                                });
                                break;
                            case "6":
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (msg[1].equals("X")) {
                                            label4.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                        } else {
                                            label4.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                        }
                                        button4.setDisable(true);
                                    }
                                });
                                break;
                            case "7":
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (msg[1].equals("X")) {
                                            label5.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                        } else {
                                            label5.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                        }
                                        button5.setDisable(true);
                                    }
                                });
                                break;
                            case "8":
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (msg[1].equals("X")) {
                                            label6.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                        } else {
                                            label6.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                        }
                                        button6.setDisable(true);
                                    }
                                });
                                break;
                            case "9":
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (msg[1].equals("X")) {
                                            label7.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                                        } else {
                                            label7.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                                        }
                                        button7.setDisable(true);
                                    }
                                });
                                break;
                            //case "wait":
                            case "10":
                                //button.setText(data);
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (msg[1].equals("loser")) {
                                            new Loser();
                                            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
                                        } else {
                                            new Winner();
                                            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
                                        }
//                                        alert = new Alert(Alert.AlertType.CONFIRMATION);
//                                        alert.setTitle(msg[1]);
//                                        alert.setContentText("game again?");
//                                        ButtonType okButton = new ButtonType("yes", ButtonBar.ButtonData.YES);
//                                        ButtonType noButton = new ButtonType("NO", ButtonBar.ButtonData.NO);
//                                        alert.getButtonTypes().setAll(okButton, noButton);
//                                        alert.showAndWait().ifPresent(type -> {
//                                            if (type.getButtonData() == ButtonBar.ButtonData.YES) {
//                                                try {
//                                                    dos.writeUTF("ready");
//                                                } catch (IOException ex) {
//                                                    Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
//                                                }
//                                            } else if (type.getButtonData() == ButtonBar.ButtonData.NO) {
//                                                try {
//                                                    dos.writeUTF("refused");
//
//                                                } catch (IOException ex) {
//                                                    Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
//                                                }
//
//                                            }
//                                        });
                                    }
                                });

                                break;
                            case "11": {
                                System.out.println("Another Player Closed");
                                if (alert != null) {
                                    alert.close();
                                }

                            }
                            break;
                            case "msg":
                                //button.setText(data);
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (msg[1].equals("own")) {
                                            TextField txtChat1 = new TextField();
                                            txtChat1.setLayoutX(100.0);
                                            chatTxtPosY += 40;
                                            txtChat1.setLayoutY(chatTxtPosY);
                                            txtChat1.setPrefHeight(36.0);
                                            txtChat1.setPrefWidth(169.0);
                                            txtChat1.setText(msg[2]);
                                            txtChat1.setStyle("-fx-background-color:#4267b2;-fx-text-fill:#fff;");
                                            txtChat1.setEditable(false);
                                            chatAnch.getChildren().add(txtChat1);

                                        } else {
                                            TextField txtChat1 = new TextField();
                                            txtChat1.setLayoutX(64.0);
                                            chatTxtPosY += 40;
                                            txtChat1.setLayoutY(chatTxtPosY);
                                            txtChat1.setPrefHeight(36.0);
                                            txtChat1.setPrefWidth(169.0);
                                            txtChat1.setText(msg[2]);
                                            chatAnch.getChildren().add(txtChat1);
                                            txtChat1.setEditable(false);
                                            txtChat1.setStyle("-fx-background-color:#f0f8ff;");
                                        }
                                        /////////////////////////////////// HERE CHAAAAAAAAAAAAAAAAAAAT
                                        //textArea.appendText(msg[1] + ": ");
                                        //textArea.appendText(msg[2] + "\n");
                                        textField.setText("");
                                        //button.setDisable(true);
                                    }
                                });

                                break;
                        }

                    } catch (IOException ex) {
                        Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            /*public void stop() 
                        {
                                
                        }*/

        });
        th.start();
        button.setOnAction(t -> {
            try {
                if (status.equals("start")) {
                    dos.writeUTF("1-" + SharedData.playerID);
                }
                //ps.println("1-"+SharedData.playerID);
                //oos.writeObject("1-"+SharedData.playerID);
                //dos.writeUTF("1-"+SharedData.playerID);
                //dos.writeUTF("1");

                //button.setText("X");
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        button0.setOnAction(t -> {
            try {
                if (status.equals("start")) {
                    dos.writeUTF("2-" + SharedData.playerID);
                }
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        button1.setOnAction(t -> {
            try {
                if (status.equals("start")) {
                    dos.writeUTF("3-" + SharedData.playerID);
                }
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        button2.setOnAction(t -> {
            try {
                if (status.equals("start")) {
                    dos.writeUTF("4-" + SharedData.playerID);
                }
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        button3.setOnAction(t -> {
            try {
                if (status.equals("start")) {
                    dos.writeUTF("5-" + SharedData.playerID);
                }
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        button4.setOnAction(t -> {
            try {
                if (status.equals("start")) {
                    dos.writeUTF("6-" + SharedData.playerID);
                }
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        button5.setOnAction(t -> {
            try {
                if (status.equals("start")) {
                    dos.writeUTF("7-" + SharedData.playerID);
                }
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        button6.setOnAction(t -> {
            try {
                if (status.equals("start")) {
                    dos.writeUTF("8-" + SharedData.playerID);
                }
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        button7.setOnAction(t -> {
            try {
                if (status.equals("start")) {
                    dos.writeUTF("9-" + SharedData.playerID);
                }
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        send_btn.setOnAction(t -> {
            try {
                if (!textField.getText().isEmpty()) {
                    dos.writeUTF("msg-" + textField.getText());
                }
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        chatBtn.setOnAction((ActionEvent event) -> {
            isChatOpen = !isChatOpen;
            if (isChatOpen) {
                setRightAnchor(chatBtn, 300.0);
                setRightAnchor(chatImage, 301.0);
                setRightAnchor(chatNotificationTxt, 320.0);
                getChildren().add(borderPane);
            } else {
                setRightAnchor(chatBtn, 20.0);
                setRightAnchor(chatImage, 20.0);
                setRightAnchor(chatNotificationTxt, 40.0);
                getChildren().remove(borderPane);
            }
        });
        //gameStartScene = new Scene();

    }
    private void loadCustomDesign() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                setPrefHeight(SharedData.nsList.get(0).root.getHeight());
                setPrefWidth(SharedData.nsList.get(0).root.getWidth());
                setStyle("-fx-background-color:linear-gradient(#8ad9dc, #409cc7),\n" +
"            linear-gradient(#d6e2f9 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n" +
"            linear-gradient(#c6bef6, #4d94e6);\n" +
"    -fx-background-size: 100% 100%;");
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
