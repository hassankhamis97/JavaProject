/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

import Game.GameUI;
import Pojos.Moves;

import Stack.NavigationStack;
import clientapp.SharedData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javafx.application.Platform;
import javafx.scene.Scene;

/**
 *
 * @author hassan
 */
public class PlayerVSComputer extends GameUI {

    Scene gameStartScene;
    ArrayList<GamePositionAIModel> positionLst;
    boolean isWaitAIResponse = false;

    String checkLevel;
    //Change static methods in TicTacToe and use object
    TicTacTeo gameAI;
    ArrayList<Moves> mvlst = new ArrayList<Moves>();

    public PlayerVSComputer(String str) {

        gameAI = new TicTacTeo();
        checkLevel = str;
        positionLst = new ArrayList<>();
//          GameBase gb = new GameBase();
        gameStartScene = getScene();
        loadCustomDesign();
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "PlayerVSComputer";
        nsObj.cssStyle = "/Computer/game.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
        for (int i = 0; i < 9; i++) {
            GamePositionAIModel positionAIObj = new GamePositionAIModel();
            positionAIObj.setPositionIndex(i);
            positionLst.add(positionAIObj);
        }

        button.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button.setText("X");
                button.setDisable(true);

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == 0) {
                        item.PositionTxt = "X";
                        break;
                    }
                }
                int computerSelectedIndex = this.prepareGamePositionToSendToAI();

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == computerSelectedIndex) {
                        item.PositionTxt = "O";
                        this.setPositionTxtByComputer(computerSelectedIndex);
                        this.isWaitAIResponse = false;
                        break;
                    }
                }
            }

        });
        button0.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button0.setText("X");
                button0.setDisable(true);

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == 1) {
                        item.PositionTxt = "X";
                        break;
                    }
                }
                int computerSelectedIndex = this.prepareGamePositionToSendToAI();

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == computerSelectedIndex) {
                        item.PositionTxt = "O";
                        this.setPositionTxtByComputer(computerSelectedIndex);
                        this.isWaitAIResponse = false;
                        break;
                    }
                }
            }
        });
        button1.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button1.setText("X");
                button1.setDisable(true);

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == 2) {
                        item.PositionTxt = "X";
                        break;
                    }
                }
                int computerSelectedIndex = this.prepareGamePositionToSendToAI();

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == computerSelectedIndex) {
                        item.PositionTxt = "O";
                        this.setPositionTxtByComputer(computerSelectedIndex);
                        this.isWaitAIResponse = false;
                        break;
                    }
                }
            }

        });
        button2.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button2.setText("X");
                button2.setDisable(true);

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == 3) {
                        item.PositionTxt = "X";
                        break;
                    }
                }
                int computerSelectedIndex = this.prepareGamePositionToSendToAI();

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == computerSelectedIndex) {
                        item.PositionTxt = "O";
                        this.setPositionTxtByComputer(computerSelectedIndex);
                        this.isWaitAIResponse = false;
                        break;
                    }
                }
            }
        });
        button3.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button3.setText("X");
                button3.setDisable(true);

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == 4) {
                        item.PositionTxt = "X";
                        break;
                    }
                }
                int computerSelectedIndex = this.prepareGamePositionToSendToAI();

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == computerSelectedIndex) {
                        item.PositionTxt = "O";
                        this.setPositionTxtByComputer(computerSelectedIndex);
                        this.isWaitAIResponse = false;
                        break;
                    }
                }
            }
        });
        button4.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button4.setText("X");
                button4.setDisable(true);

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == 5) {
                        item.PositionTxt = "X";
                        break;
                    }
                }
                int computerSelectedIndex = this.prepareGamePositionToSendToAI();

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == computerSelectedIndex) {
                        item.PositionTxt = "O";
                        this.setPositionTxtByComputer(computerSelectedIndex);
                        this.isWaitAIResponse = false;
                        break;
                    }
                }
            }
        });
        button5.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button5.setText("X");
                button5.setDisable(true);

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == 6) {
                        item.PositionTxt = "X";
                        break;
                    }
                }
                int computerSelectedIndex = this.prepareGamePositionToSendToAI();

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == computerSelectedIndex) {
                        item.PositionTxt = "O";
                        this.setPositionTxtByComputer(computerSelectedIndex);
                        this.isWaitAIResponse = false;
                        break;
                    }
                }
            }
        });
        button6.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button6.setText("X");
                button6.setDisable(true);

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == 7) {
                        item.PositionTxt = "X";
                        break;
                    }
                }
                int computerSelectedIndex = this.prepareGamePositionToSendToAI();

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == computerSelectedIndex) {
                        item.PositionTxt = "O";
                        this.setPositionTxtByComputer(computerSelectedIndex);
                        this.isWaitAIResponse = false;
                        break;
                    }
                }
            }
        });
        button7.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button7.setText("X");
                button7.setDisable(true);

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == 8) {
                        item.PositionTxt = "X";
                        break;
                    }
                }
                int computerSelectedIndex = this.prepareGamePositionToSendToAI();

                for (GamePositionAIModel item : positionLst) {

                    if (item.PositionIndex == computerSelectedIndex) {
                        item.PositionTxt = "O";
                        this.setPositionTxtByComputer(computerSelectedIndex);
                        this.isWaitAIResponse = false;
                        break;
                    }
                }
            }
        });
    }

    private int prepareGamePositionToSendToAI() {
        int index = -1;
        /// call AI Method   

        GamePositionAIModel toCalcIndex = new GamePositionAIModel();

        if (checkLevel.equalsIgnoreCase("easy")) {

            toCalcIndex = TicTacTeo.findRandomMove(positionLst);

            index = toCalcIndex.PositionIndex;

        } else {

            if (checkLevel.equalsIgnoreCase("hard")) {

                toCalcIndex = TicTacTeo.findBestMove(positionLst);

                index = toCalcIndex.PositionIndex;

            }

        }

        return index;
    }

    private void setPositionTxtByComputer(int computerSelectedIndex) {
        switch (computerSelectedIndex) {
            case 0:
                button.setText("O");
                button.setDisable(true);
                break;
            case 1:
                button0.setText("O");
                button0.setDisable(true);
                break;
            case 2:
                button1.setText("O");
                button1.setDisable(true);
                break;
            case 3:
                button2.setText("O");
                button2.setDisable(true);
                break;
            case 4:
                button3.setText("O");
                button3.setDisable(true);
                break;
            case 5:
                button4.setText("O");
                button4.setDisable(true);
                break;
            case 6:
                button5.setText("O");
                button5.setDisable(true);
                break;
            case 7:
                button6.setText("O");
                button6.setDisable(true);
                break;
            case 8:
                button7.setText("O");
                button7.setDisable(true);
                break;
        }
    }

    private void loadCustomDesign() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                setPrefHeight(SharedData.nsList.get(0).root.getHeight());
                setPrefWidth(SharedData.nsList.get(0).root.getWidth());
                setStyle("-fx-background-color:linear-gradient(#8ad9dc, #409cc7),\n"
                        + "  linear-gradient(#d6e2f9 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "   linear-gradient(#c6bef6, #4d94e6);\n"
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

    private void checkWinner(int playerNo) {
        /*for (int i = 0; i < mvlst.size(); i++) {
                        if(mv)
                }*/
        String filterType = playerNo == 1 ? "X" : "O";

        String result = mvlst.stream().filter(s -> s.getMoveType().equals(filterType)).map(f -> f.blockNo).collect(Collectors.toList()).toString();
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
//            try {
            if (playerNo == 1) {
                System.out.println("Player 1 win");
//                    GameResult gresult = new GameResult();
//                    gresult.player1ID = player1ID;
//                    gresult.player2ID = player2ID;
//                    gresult.WinnerID = player1ID;
//                    gresult.GameLevelID = 1;
//                    gresult.IsCompleted = 1;
//                    saveGameAndMoves(gresult, mvlst);
            } else {
//                    dos2.writeUTF("10-winner");
//                    dos1.writeUTF("10-loser");
                System.out.println("Player 2 win");
            }
//                player1Ready = PlayerStatus.NotDecided;
//                player2Ready = PlayerStatus.NotDecided;
//            } catch (IOException ex) {
//                Logger.getLogger(ServerGameHandler.class.getName()).log(Level.SEVERE, null, ex);
//            }
        } else {
            if (mvlst.size() == 10) {
//                try {
//                    dos1.writeUTF("10-draw");
//                    dos2.writeUTF("10-draw");
                System.out.println("draw");
//                    player1Ready = PlayerStatus.NotDecided;
//                    player2Ready = PlayerStatus.NotDecided;
            }
//            catch (IOException ex) {
//                    Logger.getLogger(ServerGameHandler.class.getName()).log(Level.SEVERE, null, ex);
//                }
        }
    }

}
