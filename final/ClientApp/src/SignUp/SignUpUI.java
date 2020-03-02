package SignUp;

import java.lang.*;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.paint.*;
import javafx.scene.text.*;

public class SignUpUI extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane0;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    
    protected final TextField userName;
    protected final TextField email;
    protected final PasswordField password;
    protected final PasswordField repassword;
    protected final Button signUp_btn;
    protected final Button goToLogin_btn;
    protected final ImageView imageView;
    protected final Button button1;
    protected final ImageView imageView0;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final ImageView imageView1;

    public SignUpUI() {

        anchorPane = new AnchorPane();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        userName = new TextField();
        email = new TextField();
        password = new PasswordField();
        repassword = new PasswordField();
        signUp_btn = new Button();
        goToLogin_btn = new Button();
        imageView = new ImageView();
        button1 = new Button();
        imageView0 = new ImageView();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        imageView1 = new ImageView();
        
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
//        setId("");

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(90.0);
        anchorPane.setPrefWidth(600.0);
        setBottom(anchorPane);

        BorderPane.setAlignment(borderPane, javafx.geometry.Pos.CENTER);
        borderPane.setMaxHeight(USE_PREF_SIZE);
        borderPane.setMaxWidth(USE_PREF_SIZE);
        borderPane.setPrefHeight(260.0);
        borderPane.setPrefWidth(300.0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(220.0);
        anchorPane0.setPrefWidth(322.0);

        label.setLayoutX(0.0);
        label.setLayoutY(97.0);
        label.setText("Username");
        label.setTextFill(javafx.scene.paint.Color.BLACK);
        label.setFont(new Font("System Bold Italic", 16.0));

        //    label0.setFont(javafx.scene.text.Font.$x1);
        label0.setLayoutX(0.0);
        label0.setLayoutY(127.0);
        label0.setText("Password");
        label0.setFont(new Font("System Bold Italic", 16.0));
        label0.setTextFill(javafx.scene.paint.Color.BLACK);

        //    label1.setFont(javafx.scene.text.Font.$x1);
        label1.setFont(new Font("System Bold Italic", 16.0));
        label1.setLayoutX(0.0);
        label1.setLayoutY(163.0);
        label1.setPrefWidth(118.9998779296875);
        label1.setText("Confirm Pass.");
        label1.setTextFill(javafx.scene.paint.Color.BLACK);

        //    label2.setFont(javafx.scene.text.Font.$x1);
        label2.setFont(new Font("System Bold Italic", 16.0));
        label2.setLayoutX(0.0);
        label2.setLayoutY(198.0);
        label2.setText("E-mail");
        label2.setTextFill(javafx.scene.paint.Color.BLACK);

        userName.setLayoutX(118.0);
        userName.setLayoutY(97.0);

        email.setLayoutX(119.0);
        email.setLayoutY(198.0);

        password.setLayoutX(118.0);
        password.setLayoutY(127.0);

        repassword.setLayoutX(118.0);
        repassword.setLayoutY(163.0);

//        signUp_btn.setId("Sub");
        signUp_btn.setLayoutX(72.0);
        signUp_btn.setLayoutY(249.0);
        signUp_btn.setMnemonicParsing(false);
        signUp_btn.setPrefWidth(91.0);
        signUp_btn.setText("Submit");
        
        
        
        goToLogin_btn.setLayoutX(200.0);
        goToLogin_btn.setLayoutY(249.0);
        goToLogin_btn.setMnemonicParsing(false);
        goToLogin_btn.setPrefWidth(76.0);
        goToLogin_btn.setText("Login");
//        goToLogin_btn.setId("Log");

        imageView.setFitHeight(55.999999536050325);
        imageView.setFitWidth(74.66666412353516);
        imageView.setLayoutX(113.0);
        imageView.setLayoutY(23.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);

        button1.setLayoutX(200.0);
        button1.setLayoutY(60.0);
        button1.setMinHeight(7.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(20.0);
        button1.setPrefWidth(38.0);
        button1.setText("");
        button1.setVisible(false);

        imageView0.setFitHeight(29.0);
        imageView0.setFitWidth(38.0);
        imageView0.setId("camera.png");
        imageView0.setLayoutX(200.0);
        imageView0.setLayoutY(57.0);
        imageView0.setImage(new Image(SignUpUI.class.getResource("camera.png").toExternalForm()));
        // imageView0.setImage(new Image(getClass().getResource("Style/camera.png").toExternalForm()));
        borderPane.setCenter(anchorPane0);
        setCenter(borderPane);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(220.0);
        anchorPane1.setPrefWidth(150.0);
        setLeft(anchorPane1);

        BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
        anchorPane2.setPrefHeight(220.0);
        anchorPane2.setPrefWidth(150.0);
        setRight(anchorPane2);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setPrefHeight(90.0);
        anchorPane3.setPrefWidth(600.0);

        AnchorPane.setBottomAnchor(imageView1, 0.0);
        AnchorPane.setLeftAnchor(imageView1, 650.0);
        AnchorPane.setRightAnchor(imageView1, 600.0);
        imageView1.setFitHeight(96.0);
        imageView1.setFitWidth(420.0);
        imageView1.setId("logo.png");
        imageView1.setImage(new Image(SignUpUI.class.getResource("logo.png").toExternalForm()));
        // imageView1.setImage(new Image(getClass().getResource("Style/logo.png").toExternalForm()));
        setTop(anchorPane3);

        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(label0);
        anchorPane0.getChildren().add(label1);
        anchorPane0.getChildren().add(label2);
        anchorPane0.getChildren().add(userName);
        anchorPane0.getChildren().add(email);
        anchorPane0.getChildren().add(password);
        anchorPane0.getChildren().add(repassword);
        anchorPane0.getChildren().add(signUp_btn);
        anchorPane0.getChildren().add(goToLogin_btn);
        anchorPane0.getChildren().add(imageView);
        anchorPane0.getChildren().add(button1);
        anchorPane0.getChildren().add(imageView0);
        anchorPane3.getChildren().add(imageView1);
        

    }

    BorderPane getParentNode() {
        return this;
    }
}
