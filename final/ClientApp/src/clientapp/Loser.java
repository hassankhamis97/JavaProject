/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import Loser.LoserUI;
import Stack.NavigationStack;
import Winner.WinnerUI;
import Winner.WinnerUIOld;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;

/**
 *
 * @author Hassan Khamis
 */
public class Loser extends LoserUI {

    public Loser() {
        loadCustomDesign();
//        Main.showNewScene(retScene(), "/Winner/win.css");
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "Winner";
        nsObj.cssStyle = "/Winner/win.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
//        Main.showNewScene(this);

        playAgain_Btn.setOnAction((event) -> {
            try{
            System.out.println("back ------> ");
            Pane myOldRoot = SharedData.nsList.get(SharedData.nsList.size() - 1).root;
            SharedData.nsList.remove(SharedData.nsList.size() - 1);
            SharedData.nsList.get(SharedData.nsList.size() - 1).isNew = false;
            Main.showNewScene(myOldRoot);
            DataOutputStream dos = new DataOutputStream(SharedData.client.getOutputStream());
            
                dos.writeUTF("ready");
            } catch (IOException ex) {
                Logger.getLogger(Winner.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

        mainMenu_Btn.setOnAction((event) -> {
            System.out.println("back ------> ");
            Pane myOldRoot = SharedData.nsList.get(SharedData.nsList.size() - 1).root;
            SharedData.nsList.remove(SharedData.nsList.size() - 1);
            SharedData.nsList.remove(SharedData.nsList.size() - 1);
            SharedData.nsList.remove(SharedData.nsList.size() - 1);
            SharedData.nsList.get(SharedData.nsList.size() - 1).isNew = false;
            Main.showNewScene(myOldRoot);
        });

    }

    private void loadCustomDesign() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                setPrefHeight(SharedData.nsList.get(0).root.getHeight());
                setPrefWidth(SharedData.nsList.get(0).root.getWidth());
                gifImage.setFitHeight(SharedData.nsList.get(0).root.getHeight());
                gifImage.setFitWidth(SharedData.nsList.get(0).root.getWidth());
//                setStyle("-fx-background-color:#000;");
//                setBackground(new Background(new BackgroundImage(new Image("game_over.jpg"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
//                setStyle("-fx-background-image:url(\"win.gif\");\n" +
//"    -fx-background-size: 100% 100%;");
setStyle("-fx-background-color: #111111;");

                playAgain_Btn.setStyle("-fx-background-color:\n"
                        + "            rgba(0,0,0,0.08),\n"
                        + "            linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "    -fx-background-insets: 0 ;\n"
                        + "    -fx-background-radius: 30;\n"
                        + "    -fx-text-fill: #242d35;\n"
                        + "    -fx-font-size: 16px;");
                mainMenu_Btn.setStyle("-fx-background-color:\n"
                        + "            rgba(0,0,0,0.08),\n"
                        + "            linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "    -fx-background-insets: 0 ;\n"
                        + "    -fx-background-radius: 30;\n"
                        + "    -fx-text-fill: #242d35;\n"
                        + "    -fx-font-size: 16px;");

            }
        });
    }
    ChangeListener<Number> stageSizeListener = (observable, oldValue, newValue)
            -> {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                gifImage.setFitHeight(SharedData.nsList.get(0).root.getHeight());
                gifImage.setFitWidth(SharedData.nsList.get(0).root.getWidth());

            }
        });
    };
}
