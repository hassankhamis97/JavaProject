/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import Stack.NavigationStack;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 *
 * @author hassan
 */
public class Main extends Application {

    Connection con;
    ResultSet rs;
    PreparedStatement stmt;
    static Stage myStage;
    static Pane newRoot;
    static Pane oldRoot;

    @Override
    public void start(Stage stage) throws Exception {
        /*
                ///// Check for The DB Jar File Included
                ClassLoader cl = ClassLoader.getSystemClassLoader();
                URL[] urls = ((URLClassLoader) cl).getURLs();
                String urlStr = "";
                for (int i=0; i < urls.length; i++) {
                   urlStr += urls[i].getFile() + "\n";
                }
                System.out.println("Classpath:\n" + urlStr);
                //// end of Check for The DB Jar File Included
                Class.forName("com.mysql.jdbc.Driver"); // stablish the connection
                con = DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7320143", "sql7320143", "LS4CgdqGST");
                
                
                //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql7320143", "root", "root"); // local
                
                stmt = con.prepareStatement("SELECT ID,Name,Email,Password FROM Player");
                
                rs = stmt.executeQuery();
                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                
         */
        //Login log = ;
        myStage = stage;
        //Scene scene = new Login().showPage();
        //showNewScene(scene);
        new Login();

//       new MainMenu();
    }

    public static void showNewScene(Scene scene, String cssFile) {
//            getCSS(scene);
        //scene.getStylesheets().addAll(getClass().getResource("reg.css").toExternalForm());

        scene.getStylesheets().addAll(Main.class.getResource(cssFile).toExternalForm());
       
        


         myStage.setScene(scene);
        myStage.show();
    }
    public static void showNewScene(Pane myOldRoot) {

        NavigationStack ns = SharedData.nsList.get(SharedData.nsList.size() - 1);

        Pane root = SharedData.nsList.stream().filter(f -> f.pageName == ns.pageName).map(m -> m.root).findFirst().get();
        if (root instanceof BorderPane) {
            newRoot = (BorderPane) root;
        } else if (root instanceof StackPane) {
            newRoot = (StackPane) root;
        } else if (root instanceof AnchorPane) {
            newRoot = (AnchorPane) root;
        }
        if (myOldRoot instanceof BorderPane) {
            oldRoot = (BorderPane) myOldRoot;
        } //        else if (myOldRoot instanceof StackPane) {
        //            oldRoot = (StackPane) root;
        //        } 
        else if (myOldRoot instanceof AnchorPane) {
            oldRoot = (AnchorPane) myOldRoot;
        }
//         newRoot.getScene().getStylesheets().removeIf(style -> style.equals("/SignIn/login.css"));
//if(ns.pageName.equals("Winner"))
//{
//         newRoot.getScene().getStylesheets().addAll(Main.class.getResource(ns.cssStyle).toExternalForm());
//    
//}
        if (ns.isNew) {
            newRoot.translateYProperty().set(-1 * SharedData.nsList.get(0).root.getWidth());
        } else {
            newRoot.translateYProperty().set(1 * SharedData.nsList.get(0).root.getWidth());
        }

        //Login l=new Login("fd");
        if (!ns.pageName.equals("Login")) {
                SharedData.nsList.get(0).root.getChildren().add(newRoot);
        }
        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(newRoot.translateYProperty(), 0, Interpolator.EASE_OUT);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {

            SharedData.nsList.get(0).root.getChildren().remove(oldRoot);

        });
        timeline.play();

        //  Scene scene1 = new Scene(newRoot);
        ChangeListener<Number> stageSizeListener = (observable, oldValue, newValue)
                -> {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
////                setPrefHeight(SharedData.nsList.get(0).root.getHeight());
////                setPrefWidth(SharedData.nsList.get(0).root.getWidth());
                    SharedData.nsList.get(SharedData.nsList.size() - 1).root.setPrefHeight(SharedData.nsList.get(0).root.getHeight());
                    SharedData.nsList.get(SharedData.nsList.size() - 1).root.setPrefWidth(SharedData.nsList.get(0).root.getWidth());
//                    if(SharedData.nsList.get(SharedData.nsList.size() - 1).pageName.equals("Winner"))
//                    {
//                        SharedData.nsList.get(SharedData.nsList.size() - 1).root.gifImage.setFitHeight(SharedData.nsList.get(0).root.getHeight());
//                    }
                }
            });

//            
//            System.out.println("Height: " + myStage.getHeight() + " Width: " + myStage.getWidth());
        };

        myStage.widthProperty().addListener(stageSizeListener);
        myStage.heightProperty().addListener(stageSizeListener);

        myStage.setScene(ns.root.getScene());
        myStage.setTitle("X O");
        myStage.show();

    }

    public static void showNewScene(StackPane myOldRoot, String cssFile) {
        myOldRoot.getScene().getStylesheets().addAll(Main.class.getResource(cssFile).toExternalForm());
        myStage.setScene(myOldRoot.getScene());
        myStage.setTitle("X O");
        myStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void stop() {

        try {
            SharedData.client.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
