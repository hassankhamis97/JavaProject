/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

import Game.GameUI;
import Game.GameUINew;
import Pojos.Moves;

import Stack.NavigationStack;
import clientapp.GameStart;
import clientapp.Loser;
import clientapp.Main;
import clientapp.SharedData;
import clientapp.Winner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javafx.animation.RotateTransition;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.util.Duration;

/**
 *
 * @author hassan
 */
public class PlayerVSComputerv2 extends GameUINew {

    Scene gameStartScene;
    ArrayList<GamePositionAIModel> positionLst;
    boolean isWaitAIResponse = false;
    boolean isFinished = false;
    String checkLevel;
    //Change static methods in TicTacToe and use object
    TicTacTeo gameAI;
    ArrayList<Moves> mvlst = new ArrayList<Moves>();

    public PlayerVSComputerv2(String str) {
setBottom(null);
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

        button1.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button1.setText("X");
                imageBtn1.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                button1.setDisable(true);

                checkX();

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
        button2.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button2.setText("X");
                imageBtn2.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                button2.setDisable(true);
                checkX();
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
        button3.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button3.setText("X");
                imageBtn3.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                button3.setDisable(true);
                checkX();
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
        button4.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button4.setText("X");
                imageBtn4.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                button4.setDisable(true);
                checkX();
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
        button5.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button5.setText("X");
                imageBtn5.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                button5.setDisable(true);
                checkX();
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
        button6.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button6.setText("X");
                imageBtn6.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                button6.setDisable(true);
                checkX();
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
        button7.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button7.setText("X");
                imageBtn7.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                button7.setDisable(true);
                checkX();
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
        button8.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button8.setText("X");
                imageBtn8.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                button8.setDisable(true);
                checkX();
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
        button9.setOnAction(t -> {
            if (!isWaitAIResponse) {
                this.isWaitAIResponse = true;
                button9.setText("X");
                imageBtn9.setImage(new Image(GameUI.class.getResource("/Game/x.png").toExternalForm()));
                button9.setDisable(true);
                checkX();
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

    private void checkX() {
        if (checkWinningLetter()) {
            isFinished=!isFinished;
            
            System.out.println("Winner");
            new Winner();
            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
        }

    }

    private void checkO() {
        if (checkWinningLetter()) {
            isFinished=!isFinished;
            
            System.err.println("Loser");
            new Loser();
            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);

        }

    }

    private boolean checkWinningLetter() {

        String t1 = button1.getText();
        String t2 = button2.getText();
        String t3 = button3.getText();
        String t4 = button4.getText();
        String t5 = button5.getText();
        String t6 = button6.getText();
        String t7 = button7.getText();
        String t8 = button8.getText();
        String t9 = button9.getText();

        if ( //Horizontal
                ((t1.equals(t2) && t1.equals(t3) && ((t1.equalsIgnoreCase("x") || (t1.equalsIgnoreCase("o")))) && !t1.isEmpty())
                || (t4.equals(t5) && t4.equals(t6) && ((t4.equalsIgnoreCase("x") || (t4.equalsIgnoreCase("o")))) && !t4.isEmpty())
                || (t7.equals(t8) && t7.equals(t9)) && ((t4.equalsIgnoreCase("x") || (t4.equalsIgnoreCase("o")))) && !t7.isEmpty())
                || //Vertical
                ((t1.equals(t4) && t1.equals(t7) && ((t1.equalsIgnoreCase("x") || (t1.equalsIgnoreCase("o")))) && !t1.isEmpty())
                || (t2.equals(t5) && t2.equals(t8) && ((t2.equalsIgnoreCase("x") || (t2.equalsIgnoreCase("o")))) && !t2.isEmpty())
                || (t7.equals(t8) && t7.equals(t9)) && ((t7.equalsIgnoreCase("x") || (t7.equalsIgnoreCase("o")))) && !t7.isEmpty())
                || //Diagonals
                ((t1.equals(t5) && t1.equals(t9) && ((t1.equalsIgnoreCase("x") || (t1.equalsIgnoreCase("o")))) && !t1.isEmpty())
                || (t3.equals(t5) && t3.equals(t7)) && ((t3.equalsIgnoreCase("x") || (t3.equalsIgnoreCase("o")))) && !t3.isEmpty())) {

            /*
             new Winner();
             Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
             */
            return true;
        }

        return false;

    }

    private void setPositionTxtByComputer(int computerSelectedIndex) {
        if (!isFinished) {
            
       
        switch (computerSelectedIndex) {
            case 0:
                button1.setText("O");
                imageBtn1.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                button1.setDisable(true);
                checkO();
                break;
            case 1:
                button2.setText("O");
                imageBtn2.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                button2.setDisable(true);
                checkO();
                break;
            case 2:
                button3.setText("O");
                imageBtn3.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                button3.setDisable(true);
                checkO();
                break;
            case 3:
                button4.setText("O");
                imageBtn4.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                button4.setDisable(true);
                checkO();
                break;
            case 4:
                button5.setText("O");
                imageBtn5.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                button5.setDisable(true);
                checkO();
                break;
            case 5:
                button6.setText("O");
                imageBtn6.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                button6.setDisable(true);
                checkO();
                break;
            case 6:
                button7.setText("O");
                imageBtn7.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                button7.setDisable(true);
                checkO();
                break;
            case 7:
                button8.setText("O");
                imageBtn8.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                button8.setDisable(true);
                checkO();
                break;
            case 8:
                button9.setText("O");
                imageBtn9.setImage(new Image(GameUI.class.getResource("/Game/o.png").toExternalForm()));
                button9.setDisable(true);
                checkO();
                break;
        } } else {
            
            System.out.println("You have a winner already!");
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
                button1.setStyle("-fx-background-color:transparent;");
                button2.setStyle("-fx-background-color:transparent;");
                button3.setStyle("-fx-background-color:transparent;");
                button6.setStyle("-fx-background-color:transparent;");
                button5.setStyle("-fx-background-color:transparent;");
                button4.setStyle("-fx-background-color:transparent;");
                button7.setStyle("-fx-background-color:transparent;");
                button8.setStyle("-fx-background-color:transparent;");
                button9.setStyle("-fx-background-color:transparent;");
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
