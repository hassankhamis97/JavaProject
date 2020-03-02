/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import Computer.PlayerVSComputer;
import Computer.PlayerVSComputerv2;
import Levels.LevelsUI;
import Stack.NavigationStack;
import javafx.application.Platform;
import javafx.scene.layout.Pane;

/**
 *
 * @author Kasper
 */
public class Levels extends LevelsUI {

    public Levels() {
        loadCustomDesign();
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "Levels";
        nsObj.cssStyle = "/Levels/level.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);

        back.setOnAction((event) -> {
            System.out.println("back ------> ");
            Pane myOldRoot = SharedData.nsList.get(SharedData.nsList.size() - 1).root;
            SharedData.nsList.remove(SharedData.nsList.size() - 1);
            SharedData.nsList.get(SharedData.nsList.size() - 1).isNew = false;
            Main.showNewScene(myOldRoot);
        });

        easyBtn.setOnAction((event) -> {
            new PlayerVSComputerv2("easy");
            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
        });

        mediumBtn.setOnAction((event) -> {
            new PlayerVSComputerv2("medium");
            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
        });
        hardBtn.setOnAction((event) -> {
            new PlayerVSComputerv2("hard");
            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
        });

    }

    public void loadCustomDesign() {

        Platform.runLater(new Runnable() {
            @Override
            public void run() {

                setPrefHeight(SharedData.nsList.get(0).root.getHeight());
                setPrefWidth(SharedData.nsList.get(0).root.getWidth());
                setStyle(" -fx-background-color:linear-gradient(#8ad9dc, #409cc7),\n"
                        + "            linear-gradient(#d6e2f9 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #4d94e6);\n"
                        + "    -fx-background-size: 100% 100%;");
                mediumBtn.setStyle("-fx-background-color:\n"
                        + "            #ffffff,\n"
                        + "            rgba(0,0,0,0.05),\n"
                        + "             linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "/*            linear-gradient(#be8adc, #7a40c7),\n"
                        + "            linear-gradient(#e0d6f9 0%, #f4bceb 20%, #a45de6 80%, #8945e2 100%),\n"
                        + "            linear-gradient(#f6bed8, #ae4de6);*/\n"
                        + "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n"
                        + "    -fx-background-radius: 50;\n"
                        + "    -fx-padding: 15 30 15 30;\n"
                        + "    -fx-font-family: \"Helvetica Bold\";\n"
                        + "    -fx-font-size: 24px;\n"
                        + "    -fx-text-fill: #311c09;\n"
                        + "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
                easyBtn.setStyle("-fx-background-color:\n"
                        + "            #ffffff,\n"
                        + "            rgba(0,0,0,0.05),\n"
                        + "             linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "/*            linear-gradient(#be8adc, #7a40c7),\n"
                        + "            linear-gradient(#e0d6f9 0%, #f4bceb 20%, #a45de6 80%, #8945e2 100%),\n"
                        + "            linear-gradient(#f6bed8, #ae4de6);*/\n"
                        + "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n"
                        + "    -fx-background-radius: 50;\n"
                        + "    -fx-padding: 15 30 15 30;\n"
                        + "    -fx-font-family: \"Helvetica Bold\";\n"
                        + "    -fx-font-size: 24px;\n"
                        + "    -fx-text-fill: #311c09;\n"
                        + "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
                hardBtn.setStyle("-fx-background-color:\n"
                        + "            #ffffff,\n"
                        + "            rgba(0,0,0,0.05),\n"
                        + "             linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "/*            linear-gradient(#be8adc, #7a40c7),\n"
                        + "            linear-gradient(#e0d6f9 0%, #f4bceb 20%, #a45de6 80%, #8945e2 100%),\n"
                        + "            linear-gradient(#f6bed8, #ae4de6);*/\n"
                        + "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n"
                        + "    -fx-background-radius: 50;\n"
                        + "    -fx-padding: 15 30 15 30;\n"
                        + "    -fx-font-family: \"Helvetica Bold\";\n"
                        + "    -fx-font-size: 24px;\n"
                        + "    -fx-text-fill: #311c09;\n"
                        + "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
                easyBtn.setStyle("-fx-background-color:\n"
                        + "            #ffffff,\n"
                        + "            rgba(0,0,0,0.05),\n"
                        + "             linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "/*            linear-gradient(#be8adc, #7a40c7),\n"
                        + "            linear-gradient(#e0d6f9 0%, #f4bceb 20%, #a45de6 80%, #8945e2 100%),\n"
                        + "            linear-gradient(#f6bed8, #ae4de6);*/\n"
                        + "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n"
                        + "    -fx-background-radius: 50;\n"
                        + "    -fx-padding: 15 30 15 30;\n"
                        + "    -fx-font-family: \"Helvetica Bold\";\n"
                        + "    -fx-font-size: 24px;\n"
                        + "    -fx-text-fill: #311c09;\n"
                        + "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");
                back.setStyle("-fx-background-color:\n"
                        + "            #ffffff,\n"
                        + "            rgba(0,0,0,0.05),\n"
                        + "             linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "/*            linear-gradient(#be8adc, #7a40c7),\n"
                        + "            linear-gradient(#e0d6f9 0%, #f4bceb 20%, #a45de6 80%, #8945e2 100%),\n"
                        + "            linear-gradient(#f6bed8, #ae4de6);*/\n"
                        + "    -fx-background-insets: 0,9 9 8 9,9,10,11;\n"
                        + "    -fx-background-radius: 50;\n"
                        + "    -fx-padding: 15 30 15 30;\n"
                        + "    -fx-font-family: \"Helvetica Bold\";\n"
                        + "    -fx-font-size: 24px;\n"
                        + "    -fx-text-fill: #311c09;\n"
                        + "    -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.1) , 2, 0.0 , 0 , 1);");

            }
        });

    }

}
