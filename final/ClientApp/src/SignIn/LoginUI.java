package SignIn;

import java.lang.*;
import java.util.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.paint.*;

public class LoginUI extends StackPane {

    Scene currentScene;

    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final BorderPane borderPane0;
    protected final AnchorPane anchorPane0;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final TextField email_txt;
    protected final PasswordField pass_txt;
    protected final Button login_btn;
    protected final Button btnReg;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final ImageView imageView1;

    public LoginUI() {

        borderPane = new BorderPane();
        //  borderPane.setId("pane");
        anchorPane = new AnchorPane();
        borderPane0 = new BorderPane();
        anchorPane0 = new AnchorPane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        email_txt = new TextField();
        pass_txt = new PasswordField();
        login_btn = new Button();
        btnReg = new Button();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        imageView1 = new ImageView();

        setId("pane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
//        setPrefHeight(400.0);
//        setPrefWidth(600.0);

        setPrefHeight(619.0);
        setPrefWidth(714.0);

        borderPane.setMaxHeight(USE_PREF_SIZE);
        borderPane.setMaxWidth(USE_PREF_SIZE);
        borderPane.setMinHeight(USE_PREF_SIZE);
        borderPane.setMinWidth(USE_PREF_SIZE);
        borderPane.setPrefHeight(400.0);
        borderPane.setPrefWidth(600.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(90.0);
        anchorPane.setPrefWidth(600.0);
        borderPane.setBottom(anchorPane);

        BorderPane.setAlignment(borderPane0, javafx.geometry.Pos.CENTER);
        borderPane0.setMaxHeight(USE_PREF_SIZE);
        borderPane0.setMaxWidth(USE_PREF_SIZE);
        borderPane0.setPrefHeight(260.0);
        borderPane0.setPrefWidth(300.0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setMinHeight(29.0);
        anchorPane0.setMinWidth(40.0);
        anchorPane0.setPrefHeight(29.0);
        anchorPane0.setPrefWidth(40.0);

        imageView.setFitHeight(30.0);
        imageView.setFitWidth(35.0);
        imageView.setId("user.png");
        imageView.setLayoutX(43.0);
        imageView.setLayoutY(54.0);
        imageView.setImage(new Image(LoginUI.class.getResource("/SignIn/user.png").toExternalForm()));
//        imageView.setImage(new Image(getClass().getResource("file:/D:/ITI%20COURSES/Java%20Project/Style/user.png").toExternalForm()));

        imageView0.setFitHeight(30.0);
        imageView0.setFitWidth(50.000099999997474);
        imageView0.setId("pass.png");
        imageView0.setLayoutX(36.0);
        imageView0.setLayoutY(93.0);
        imageView0.setImage(new Image(LoginUI.class.getResource("/SignIn/pass.png").toExternalForm()));
//        imageView0.setImage(new Image(getClass().getResource("file:/D:/ITI%20COURSES/Java%20Project/Style/pass.png").toExternalForm()));

        AnchorPane.setRightAnchor(email_txt, 36.0);
        email_txt.setLayoutY(57.0);
        email_txt.setPrefWidth(159.0);
        email_txt.setPromptText("e-mail");

        pass_txt.setLayoutX(105.0);
        pass_txt.setLayoutY(98.0);
        pass_txt.setPrefWidth(159.0);
        pass_txt.setPromptText("password");

//        checkBox.setLayoutX(36.0);
//        checkBox.setLayoutY(145.0);
//        checkBox.setMnemonicParsing(false);
//        checkBox.setText("Remember me");
//        checkBox.setTextFill(javafx.scene.paint.Color.valueOf("#1000cc"));
        login_btn.setId("btnLogin");
        login_btn.setLayoutX(100.0);
        login_btn.setLayoutY(179.0);
        login_btn.setMnemonicParsing(false);
        login_btn.setText("Login");
        login_btn.setId("log");

        btnReg.setId("btnReg");
        btnReg.setLayoutX(176.0);
        btnReg.setLayoutY(179.0);
        btnReg.setMnemonicParsing(false);
        btnReg.setText("Regestration");
        btnReg.setId("reg");
        borderPane0.setCenter(anchorPane0);
        borderPane.setCenter(borderPane0);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(220.0);
        anchorPane1.setPrefWidth(150.0);
        borderPane.setLeft(anchorPane1);

        BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
        anchorPane2.setPrefHeight(220.0);
        anchorPane2.setPrefWidth(150.0);
        borderPane.setRight(anchorPane2);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setPrefHeight(90.0);
        anchorPane3.setPrefWidth(600.0);

        AnchorPane.setBottomAnchor(imageView1, -30.0);
        AnchorPane.setLeftAnchor(imageView1, 650.0);
        AnchorPane.setRightAnchor(imageView1, 600.0);
        imageView1.setId("logo1.png");
        imageView1.setImage(new Image(LoginUI.class.getResource("/Resources/logo_1.png").toExternalForm()));
        borderPane.setTop(anchorPane3);
        anchorPane0.getChildren().add(imageView);
        anchorPane0.getChildren().add(imageView0);
        anchorPane0.getChildren().add(email_txt);
        anchorPane0.getChildren().add(pass_txt);
        anchorPane0.getChildren().add(login_btn);
        anchorPane0.getChildren().add(btnReg);
        anchorPane3.getChildren().add(imageView1);
        getChildren().add(borderPane);
        currentScene = new Scene(this);

    }

    public StackPane getStackPane() {
        return this;
    }

    public BorderPane getParentNode() {
        return borderPane;
    }

    public Scene retScene() {
        return currentScene;
    }
}
