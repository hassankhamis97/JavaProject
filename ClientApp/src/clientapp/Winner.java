/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import Stack.NavigationStack;
import Winner.WinnerUI;
import Winner.WinnerUIOld;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

/**
 *
 * @author Hassan Khamis
 */
public class Winner extends WinnerUI {

    public Winner() {
        loadCustomDesign();
//        Main.showNewScene(retScene(), "/Winner/win.css");
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "Winner";
        nsObj.cssStyle = "/Winner/win.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
//        Main.showNewScene(this);
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
