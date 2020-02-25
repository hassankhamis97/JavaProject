/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import Loser.LoserUI;
import Stack.NavigationStack;
import javafx.application.Platform;

/**
 *
 * @author Hassan Khamis
 */
public class Loser extends LoserUI {

    public Loser() {
        loadCustomDesign();
        //Main.showNewScene(retScene(),"/Loser/lose.css");
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "Loser";
//        nsObj.cssStyle = "/Loser/lose.css";
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
                setStyle("-fx-background-image:url(\"game_over.jpg\");\n"
                        + "    -fx-background-size: 100% 100%;");

//SharedData.nsList.get(SharedData.nsList.size()-2).root.setStyle("-fx-background-image:url(\"//Game//LoveEmoji.png\");\n" +
//"    -fx-background-size: 100% 100%;");
                button.setStyle("-fx-background-color:\n"
                        + "            rgba(0,0,0,0.08),\n"
                        + "            linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "    -fx-background-insets: 0 ;\n"
                        + "    -fx-background-radius: 30;\n"
                        + "    -fx-text-fill: #242d35;\n"
                        + "    -fx-font-size: 16px;");
                button0.setStyle("-fx-background-color:\n"
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

}
