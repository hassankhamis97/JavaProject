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
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
public class GameStartMultiOffline extends GameUI {

    Scene gameStartScene;
//    String status;
    Alert alert;
    boolean isX = false;
    boolean isFinish = false;
    List<Moves> mvlst = new ArrayList<>();

    public GameStartMultiOffline() {
        //gameStartScene = new Scene(new BorderPane());
        // GameUI gb = new GameUI();
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "GameStartMultiOffline";
        nsObj.cssStyle = "/Game/game.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
        loadCustomDesign();
        getChildren().remove(chatBtn);
        getChildren().remove(chatImage);
        getChildren().remove(chatNotificationTxt);
        
//        Main.showNewScene(this);
//        gameStartScene = retScene();
        oppPic_img.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
        myPic_img.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
        myPic_img.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Profile p = new Profile();
                getChildren().add(profile_anchor);
                profile_anchor.getChildren().add(p.getParentNode());
            }

        });
        button.setOnAction(t -> {
            if (!isFinish) {
                isX = !isX;
                if (isX) {
                    label.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                    Moves mv = new Moves("1", "x", "1");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(1);
                    }

                } else {
                    label.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                    Moves mv = new Moves("2", "o", "1");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(2);
                    }
                }
                button.setDisable(true);

            }

        });
        button0.setOnAction(t -> {
            if (!isFinish) {
                isX = !isX;
                if (isX) {
                    label0.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                    Moves mv = new Moves("1", "x", "2");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(1);
                    }

                } else {
                    label0.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                    Moves mv = new Moves("2", "o", "2");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(2);
                    }
                }
                button0.setDisable(true);
            }
        });
        button1.setOnAction(t -> {
            if (!isFinish) {
                isX = !isX;
                if (isX) {
                    label1.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                    Moves mv = new Moves("1", "x", "3");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(1);
                    }

                } else {
                    label1.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                    Moves mv = new Moves("2", "o", "3");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(2);
                    }
                }
                button1.setDisable(true);
            }
        });
        button2.setOnAction(t -> {
            if (!isFinish) {
                isX = !isX;
                if (isX) {
                    label2.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                    Moves mv = new Moves("1", "x", "4");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(1);
                    }

                } else {
                    label2.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                    Moves mv = new Moves("2", "o", "4");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(2);
                    }
                }
                button2.setDisable(true);
            }
        });
        button3.setOnAction(t -> {
            if (!isFinish) {
                isX = !isX;
                if (isX) {
                    label3.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                    Moves mv = new Moves("1", "x", "5");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(1);
                    }

                } else {
                    label3.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                    Moves mv = new Moves("2", "o", "5");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(2);
                    }
                }
                button3.setDisable(true);
            }
        });
        button4.setOnAction(t -> {
            if (!isFinish) {
                isX = !isX;
                if (isX) {
                    label4.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                    Moves mv = new Moves("1", "x", "6");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(1);
                    }

                } else {
                    label4.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                    Moves mv = new Moves("2", "o", "6");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(2);
                    }
                }
                button4.setDisable(true);
            }
        });
        button5.setOnAction(t -> {
            if (!isFinish) {
                isX = !isX;
                if (isX) {
                    label5.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                    Moves mv = new Moves("1", "x", "7");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(1);
                    }

                } else {
                    label5.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                    Moves mv = new Moves("2", "o", "7");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(2);
                    }
                }
                button5.setDisable(true);
            }
        });
        button6.setOnAction(t -> {
            if (!isFinish) {
                isX = !isX;
                if (isX) {
                    label6.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                    Moves mv = new Moves("1", "x", "8");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(1);
                    }

                } else {
                    label6.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                    Moves mv = new Moves("2", "o", "8");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(2);
                    }
                }
                button6.setDisable(true);
            }
        });
        button7.setOnAction(t -> {
            if (!isFinish) {
                isX = !isX;
                if (isX) {
                    label7.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                    Moves mv = new Moves("1", "x", "9");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(1);
                    }

                } else {
                    label7.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                    Moves mv = new Moves("2", "o", "9");
                    mvlst.add(mv);
                    if (mvlst.size() >= 5) {
                        checkWinner(2);
                    }
                }
                button7.setDisable(true);
            }
        });
        //gameStartScene = new Scene();

    }

    private void checkWinner(int playerNo) {
        /*for (int i = 0; i < mvlst.size(); i++) {
                        if(mv)
                }*/
        String filterType = playerNo == 1 ? "x" : "o";

        String result = mvlst.stream().filter(s -> s.getMoveType().equals(filterType)).map(f -> f.getBlockNumber()).collect(Collectors.toList()).toString();
        //List<String> result = mvlst.stream().filter(s-> s.getMoveType().equals("X")).toList();
//                    mvlst.stream().filter((s) -> s.equals("X"))
//                        .forEach(w-> System.out.println(w.));
        //.forEach(System.out::println);

        if (result.contains("1") && result.contains("2") && result.contains("3")
                || result.contains("1") && result.contains("4") && result.contains("7")
                || result.contains("1") && result.contains("5") && result.contains("9")
                || result.contains("2") && result.contains("5") && result.contains("8")
                || result.contains("3") && result.contains("6") && result.contains("9")
                || result.contains("3") && result.contains("6") && result.contains("9")
                || result.contains("3") && result.contains("5") && result.contains("7")
                || result.contains("4") && result.contains("5") && result.contains("6")
                || result.contains("7") && result.contains("8") && result.contains("9")) {
            if (isX) {

                System.out.println("Player 1 win");
            } else {
                System.out.println("Player 2 win");
            }
            isFinish = true;

        } else {
            if (mvlst.size() == 10) {
                System.out.println("draw");
                isFinish = true;
            }
        }

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
                button0.setStyle("-fx-background-color:transparent;");
                button1.setStyle("-fx-background-color:transparent;");
                button1.setStyle("-fx-background-color:transparent;");
                button2.setStyle("-fx-background-color:transparent;");
                button3.setStyle("-fx-background-color:transparent;");
                button4.setStyle("-fx-background-color:transparent;");
                button5.setStyle("-fx-background-color:transparent;");
                button6.setStyle("-fx-background-color:transparent;");
                button7.setStyle("-fx-background-color:transparent;");
                chatAnch.setStyle(" -fx-background-color:#ddd;");

            }
        });
    }
}
