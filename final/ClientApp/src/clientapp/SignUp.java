/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import SignIn.LoginUI;
import SignUp.SignUpUI;
import Stack.NavigationStack;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import Database.Database;
import javafx.scene.control.Label;

/**
 *
 * @author Hassan Khamis
 */
public class SignUp extends SignUpUI {

    boolean flage = false;
    ResultSet rs;
    PreparedStatement stmt;
    File file;
    protected Label errorLabel;

    SignUp() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                setPrefHeight(SharedData.nsList.get(0).root.getHeight());
                setPrefWidth(SharedData.nsList.get(0).root.getWidth());
                setStyle("-fx-background-color:linear-gradient(#8ad9dc, #409cc7),\n"
                        + "            linear-gradient(#d6e2f9 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #4d94e6);\n"
                        + "    -fx-background-size: 100% 100%;");
                goToLogin_btn.setStyle("-fx-background-color:\n"
                        + "            rgba(0,0,0,0.08),\n"
                        + "            linear-gradient(#13e0e7, #409cc7),\n"
                        + "            linear-gradient(#7caaff 0%, #bcc0f4 20%, #5d91e6 80%, #457ce2 100%),\n"
                        + "            linear-gradient(#c6bef6, #e4e9ee);\n"
                        + "    -fx-background-insets: 0 ;\n"
                        + "    -fx-background-radius: 30;\n"
                        + "    -fx-text-fill: #242d35;\n"
                        + "    -fx-font-size: 16px;");
                signUp_btn.setStyle("-fx-background-color:\n"
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
        System.out.println("ftvygbhun");
        goToLogin_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Pane myOldRoot = SharedData.nsList.get(SharedData.nsList.size() - 1).root;
                SharedData.nsList.remove(SharedData.nsList.size() - 1);
                SharedData.nsList.get(SharedData.nsList.size() - 1).isNew = false;
                Main.showNewScene(myOldRoot);
                //Main.showNewScene(loginScene,"/SignIn/login.css");
//                System.out.println("rbrrhhr");
                // Main.showNewScene(loginScene,"/SignIn/login.css",new Login("Sfsdsg").getParentNode());
            }
        });
        ///////////////////////////////
        signUp_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String uname = userName.getText();
                String mail = email.getText();
                String pass = password.getText();
                String repass = repassword.getText();
                pass = "123456789aA&";
                repass = "123456789aA&";
                String email_regex = "^[a-z0-9]+(_{1}|.{1})+[a-z0-9]{1,}@{1}[a-z]{2,}[.][a-z]{2,5}$";
                String pass_regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*_-])[a-zA-Z0-9!@#$%^&*_-]{6,12}$";

                Pattern email_pattern = Pattern.compile(email_regex);
                Pattern pass_pattern = Pattern.compile(pass_regex);
                if (!uname.isEmpty() && !mail.isEmpty() && !pass.isEmpty() && !repass.isEmpty() && pass.equals(repass)) {
                    /// if all records filled 
                    System.out.println(" email : " + Pattern.matches(email_regex, mail) + " pass - " + Pattern.matches(pass_regex, pass));

                    if (Pattern.matches(email_regex, mail) == false) {
                        showAlert("please insert valid email");
                    }

                    if (Pattern.matches(pass_regex, pass) == false) {
                        showAlert("please insert valid password");
                    }

                    /*validation*/ if (Pattern.matches(email_regex, mail) && Pattern.matches(pass_regex, pass)) {

                       
                            /////////
                            errorLabel = new Label();
                            errorLabel.setLayoutX(110.0);
                            errorLabel.setLayoutY(310.0);
                            errorLabel.setText("");
                            Connection con = Database.openConnection();
                            int x = Database.insertPlayer(con, uname, mail, pass, file,errorLabel);
                            Database.closeConnection(con);
                            anchorPane0.getChildren().add(errorLabel);

                            if (file != null) {
                                transferImageToServer(file);
                            }
                            if(x != 0){
                                showAlert(" YOUR ACCOUNT HAS BEEN CREATED SUCCESSFULLY ... ");
                            }
                            //Main.showNewScene(loginScene,"/SignIn/login.css");
                        //end of validation
                       

                    }

                } else {
                    showAlert("Please fill all records correctly...");

                }
            }
        });

        imageView0.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                FileChooser fileChooser = new FileChooser();

                file = fileChooser.showOpenDialog(null);

                if (file != null) {
                    try {
                        imageView.setImage(new Image(file.toURI().toURL().toExternalForm()));
                    } catch (Exception ex) {
                    }
                }
                event.consume();
            }
        });

        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "SignUp";
        nsObj.cssStyle = "/SignUp/reg.css";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);

        //////////////////////////
//        Main.showNewScene(getScene(),"/SignUp/reg.css");
    }

    private void showAlert(String content) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("XO Inforamtion");

        alert.setResizable(true);
        alert.setContentText(content);

        Optional<ButtonType> result = alert.showAndWait();
        ButtonType button = result.orElse(ButtonType.CANCEL);

        if (button == ButtonType.OK) {
            System.out.println("Ok pressed");
        } else {
            System.out.println("canceled");
        }
    }

    private void transferImageToServer(File file) {
        try {
            Files.copy(file.toPath(),
                    (new File("\\\\DESKTOP-MFT4NF6\\Resources\\", file.getName())).toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            showAlert("An error occured");
        }
    }
}
