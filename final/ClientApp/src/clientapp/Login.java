/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import Database.Database;
import Main.MainBase;
import SignIn.LoginUI;
import SignUp.SignUpUI;
import Stack.NavigationStack;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

/**
 *
 * @author hassan
 */
public class Login extends LoginUI {
    //Connection con;

    Database db;
    Connection con;
    Label errorLabel;
    static MediaPlayer mediaplayer;
     static String path = "src//clientapp//f2.mp3";
                static Media m = new Media(new File(path).toURI().toString());
    /*FlowPane flow;
        Button login_btn;
        TextField email_txt;
        TextField pass_txt;
        Scene loginScene;
        Label label;*/
    public Login() {
        mediaplayer = new MediaPlayer(m);
                mediaplayer.setVolume(1);
                mediaplayer.play();
        db = new Database();
        errorLabel = new Label();
        errorLabel.setLayoutX(110.0);
        errorLabel.setLayoutY(310.0);
        errorLabel.setText("");
        errorLabel.setTextFill(Color.RED);
        anchorPane0.getChildren().add(errorLabel);
        //LoginUI lui = new LoginUI();

        //label.
//                Glow g = new Glow();
//                g.setLevel(2);
//                label.setEffect(g);
//                flow = new FlowPane();
//                flow.setOrientation(Orientation.VERTICAL);
//                login_btn = new Button("Login");
//                email_txt = new TextField();
//                pass_txt = new PasswordField();
//                flow.getChildren().addAll(email_txt,pass_txt,login_btn,label);
//                loginScene = new Scene(flow);
        btnReg.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new SignUp();
                Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
            }
        });
        login_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                boolean emailValid = true;
                boolean passValid = true;
              //  Media musicFile = new Media("/Resources/f1.mp3");
//                static String path = "src//clientapp//f2.mp3";
//                static Media m = new Media(new File(path).toURI().toString());
                
//                email_txt.setText("mahmoud93@gmail.com");
////              '
//
        email_txt.setText("hassankhamis97@hotmail.com");
//                pass_txt.setText("asd123M@");
//                email_txt.setText("ccc@ccc.com");
//                email_txt.setText("bbb@bbb.com");
//                email_txt.setText("aaa@aaa.com");

                               //email_txt.setText("hassankhamis97@hotmail.com");

                pass_txt.setText("123456aA&");

                if (!email_txt.getText().isEmpty() && !pass_txt.getText().isEmpty()) {
                    if (!Pattern.matches("^[a-z0-9]+(_{1}|.{1})+[a-z0-9]{1,}@{1}[a-z]{2,}[.][a-z]{2,5}$", email_txt.getText())) {
                        emailValid = false;
                        errorLabel.setText("Please Enter valid email ex: java@java.com");

                    }
                    if (!Pattern.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*_-])[a-zA-Z0-9!@#$%^&*_-]{6,12}$", pass_txt.getText())) {
                        passValid = false;
                        if (pass_txt.getText().length() < 6 && pass_txt.getText().length() > 20) {
                            errorLabel.setText("password length must be between 6-20 char");
                           
                        } else {
                            errorLabel.setText("password must contains at least one capital and small letters and special characters");
                        }
                    }
                    if (emailValid && passValid) {

                        con = db.openConnection();
                        db.getPlayerID(con, email_txt.getText(), pass_txt.getText());
                        db.closeConnection(con);
                        if (SharedData.playerID > 0) {
                            connectTOServer();
                            new MainMenu();
                            Main.showNewScene(SharedData.nsList.get(SharedData.nsList.size() - 2).root);
                        } else {
                             errorLabel.setText("email or password donot match any thing in database");
                            //System.out.println("email or password donot match any thing in database");
                        }

                    }
                } else {
                    if (email_txt.getText().isEmpty()) {
                        errorLabel.setText("email is required");
                       // System.out.println("email is required");
                    }
                    if (pass_txt.getText().isEmpty()) {
                        errorLabel.setText("password is required");
                      //  System.out.println("password is required");
                    }
                }
                
                
                
            }

        });

//                Main.showNewScene(getScene(),"/SignIn/login.css");
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "Login";
        nsObj.cssStyle = "/SignIn/login.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
        Main.showNewScene(this, "/SignIn/login.css");
        //showPage();
        /*stage.setScene(scene);
                stage.show();*/
    }

    void connectTOServer() {
        try {
            int port;
//            SharedData.client = new Socket("192.168.1.10", 5000);
//SharedData.client = new Socket("172.16.4.147", 5000);
SharedData.client = new Socket("172.16.6.110", 5000);

            con = db.openConnection();
            port = SharedData.client.getLocalPort();

            db.updatePortID(con, port);
            db.closeConnection(con);

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
                launch(args);
        }*/

 /*public Scene showPage() {
                return loginScene;
        }*/
}
