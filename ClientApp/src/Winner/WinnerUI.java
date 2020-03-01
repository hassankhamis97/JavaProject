package Winner;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public abstract class WinnerUI extends AnchorPane {

    protected final BorderPane imageBorderPanePick;
    protected final ImageView gifImage;
    protected final Image gifImage_Img;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final BorderPane mainBorder_pane;
    protected final AnchorPane anchorPane0;
    protected final Button playAgain_Btn;
    protected final ImageView Header_image;
    protected final Button mainMenu_Btn;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;

    public WinnerUI() {

        imageBorderPanePick = new BorderPane();
        gifImage = new ImageView();
        gifImage_Img = new Image(WinnerUI.class.getResource("win.gif").toExternalForm());
        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        mainBorder_pane = new BorderPane();
        anchorPane0 = new AnchorPane();
        playAgain_Btn = new Button();
        Header_image = new ImageView();
        mainMenu_Btn = new Button();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        AnchorPane.setBottomAnchor(imageBorderPanePick, 0.0);
        AnchorPane.setLeftAnchor(imageBorderPanePick, 0.0);
        AnchorPane.setRightAnchor(imageBorderPanePick, 0.0);
        AnchorPane.setTopAnchor(imageBorderPanePick, 0.0);
        imageBorderPanePick.setId("imageBorderPanePick");
        imageBorderPanePick.setPrefHeight(400.0);
        imageBorderPanePick.setPrefWidth(600.0);

        BorderPane.setAlignment(gifImage, javafx.geometry.Pos.CENTER);
//        gifImage.setFitHeight(399.0);
//        gifImage.setFitWidth(601.0);
        gifImage.setId("gifImage");
        gifImage.setPickOnBounds(true);
        gifImage.setPreserveRatio(true);
        gifImage.setImage(gifImage_Img);
        imageBorderPanePick.setCenter(gifImage);

        AnchorPane.setBottomAnchor(borderPane, 0.0);
        AnchorPane.setLeftAnchor(borderPane, 0.0);
        AnchorPane.setRightAnchor(borderPane, 0.0);
        AnchorPane.setTopAnchor(borderPane, 0.0);
        borderPane.setLayoutX(10.0);
        borderPane.setLayoutY(10.0);
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

        BorderPane.setAlignment(mainBorder_pane, javafx.geometry.Pos.CENTER);
        mainBorder_pane.setId("mainBorder_pane");
        mainBorder_pane.setMaxHeight(USE_PREF_SIZE);
        mainBorder_pane.setMaxWidth(USE_PREF_SIZE);
        mainBorder_pane.setPrefHeight(260.0);
        mainBorder_pane.setPrefWidth(300.0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        playAgain_Btn.setId("playAgain_Btn");
        playAgain_Btn.setLayoutX(39.0);
        playAgain_Btn.setLayoutY(246.0);
        playAgain_Btn.setMnemonicParsing(false);
        playAgain_Btn.setPrefHeight(31.0);
        playAgain_Btn.setPrefWidth(114.0);
        playAgain_Btn.setText("Play Again");
        playAgain_Btn.setFont(new Font(16.0));

        Header_image.setFitHeight(64.0);
        Header_image.setFitWidth(407.0);
        Header_image.setId("Header_image");
        Header_image.setLayoutX(0.0);
        Header_image.setLayoutY(113.0);
        Header_image.setImage(new Image(WinnerUI.class.getResource("Header.png").toExternalForm()));

//        mainMenu_Btn.setFont(javafx.scene.text.Font.$x1);
        mainMenu_Btn.setId("mainMenu_Btn");
        mainMenu_Btn.setLayoutX(279.0);
        mainMenu_Btn.setLayoutY(245.0);
        mainMenu_Btn.setMnemonicParsing(false);
        mainMenu_Btn.setPrefHeight(31.0001220703125);
        mainMenu_Btn.setPrefWidth(114.0);
        mainMenu_Btn.setText("Main Menu");
        mainBorder_pane.setCenter(anchorPane0);
        borderPane.setCenter(mainBorder_pane);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(220.0);
        anchorPane1.setPrefWidth(150.0);
        borderPane.setLeft(anchorPane1);

        BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
        anchorPane2.setPrefHeight(220.0);
        anchorPane2.setPrefWidth(150.0);
        borderPane.setRight(anchorPane2);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setPrefHeight(52.0);
        anchorPane3.setPrefWidth(600.0);
        borderPane.setTop(anchorPane3);

        getChildren().add(imageBorderPanePick);
        anchorPane0.getChildren().add(playAgain_Btn);
        anchorPane0.getChildren().add(Header_image);
        anchorPane0.getChildren().add(mainMenu_Btn);
        getChildren().add(borderPane);

    }
}
