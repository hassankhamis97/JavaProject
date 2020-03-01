package Connect4New;

//package Connect4App;
import clientapp.Main;
import clientapp.SharedData;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @author Awad
 */
public class ConnectFour {

    Scene currentScene;
    private static final int DISC_SIZE = 80;
    private static final int COLUMNS = 7;
    private static final int ROWS = 6;
    private boolean colorBool = true;
    private boolean isFinished = false;
    private Disc[][] grid = new Disc[COLUMNS][ROWS];
    PrintStream ps;
    DataInputStream dis;
    DataOutputStream dos;
    String status;
    Alert alert;
//    Socket socket;
    Socket client;
    private Pane discRoot = new Pane();

    public ConnectFour(Socket client) {
        Main.showNewScene(retScene(), "/Connect4/main.css");
    }

    private Parent drawContent() {
        Pane root = new Pane();
        root.getChildren().add(discRoot);
        Shape gridShape = setGrid();
        root.getChildren().add(gridShape);
        root.getChildren().addAll(setColumns());
        try {
            //client = new Socket("127.0.0.1",5000);
            dis = new DataInputStream(SharedData.client.getInputStream());
            dos = new DataOutputStream(SharedData.client.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(Connect4New.ConnectFour.class.getName()).log(Level.SEVERE, null, ex);
        }
        Thread th = new Thread(() -> {
            while (true) {

                try {
                    String data = dis.readUTF();
                    String[] msg = data.split("-");
                    switch (msg[0]) {
                        case "0":
                            status = msg[1];
                            break;
                        case "true":
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    playDisc(new Disc(true), Integer.parseInt(msg[1]));
                                }
                            });
                            break;
                        case "false":
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    playDisc(new Disc(false), Integer.parseInt(msg[1]));
                                }
                            });
                            break;
                    }

//                    dos.writeUTF(Integer.toString(column));
                } catch (IOException ex) {
                    Logger.getLogger(Connect4New.ConnectFour.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        th.start();
        return root;

    }

    private Shape setGrid() {
        Shape shape = new Rectangle((COLUMNS + 1) * DISC_SIZE, (ROWS + 1) * DISC_SIZE);
        for (int y = 0; y < ROWS; y++) {
            for (int x = 0; x < COLUMNS; x++) {
                Circle circle = new Circle(DISC_SIZE / 2);
                circle.setCenterX(DISC_SIZE / 2);
                circle.setCenterY(DISC_SIZE / 2);
                circle.setTranslateX(x * (DISC_SIZE + 5) + DISC_SIZE / 4);
                circle.setTranslateY(y * (DISC_SIZE + 5) + DISC_SIZE / 4);
                shape = Shape.subtract(shape, circle);
            }
        }

        Light.Distant light = new Light.Distant();
        light.setAzimuth(45.0);
        light.setElevation(30.0);
        Lighting lighting = new Lighting();
        lighting.setLight(light);
        lighting.setSurfaceScale(5.0);
        shape.setFill(Color.CYAN);
        shape.setEffect(lighting);
        return shape;
    }

    private List<Rectangle> setColumns() {
        List<Rectangle> list = new ArrayList<>();

        for (int x = 0; x < COLUMNS; x++) {
            Rectangle rect = new Rectangle(DISC_SIZE, (ROWS + 1) * DISC_SIZE);
            rect.setTranslateX(x * (DISC_SIZE + 5) + DISC_SIZE / 4);
            rect.setFill(Color.TRANSPARENT);
            rect.setOnMouseEntered(e -> rect.setFill(Color.rgb(245, 238, 237, 0.3)));
            rect.setOnMouseExited(e -> rect.setFill(Color.TRANSPARENT));
            final int column = x;
            //System.out.println(column);
            //One player

            rect.setOnMouseClicked(e -> {
                try {
                    // playDisc(new Disc(colorBool), column);
                    if (status.equals("start")) {
                        System.out.println("col-" + column);
                        dos.writeUTF("col-" + column);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Connect4New.ConnectFour.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            // Player VS CPU
            /*      rect.setOnMouseClicked(new EventHandler<MouseEvent>(){
             @Override
             public void handle(MouseEvent event){
             if (!isFinished){
             playDisc(new Disc(colorBool), column);
             if (!isFinished){
             int randomInt = (int)(Math.random() * (COLUMNS ) + 0);
             System.out.println(randomInt);
             playDisc(new Disc(colorBool), randomInt);}}
             else{System.out.println("We have a winner, you can't play");}
             }
             });
             */
            list.add(rect);
        }

        return list;
    }

    public void playDisc(Disc disc, int column) {
        System.out.println(column);
        if (!isFinished) {
            int row = ROWS - 1;
            do {
                if (!getDisc(column, row).isPresent()) {
                    break;
                }

                row--;
            } while (row >= 0);

            if (row < 0) {
                return;
            }

            grid[column][row] = disc;
            discRoot.getChildren().add(disc);
            disc.setTranslateX(column * (DISC_SIZE + 5) + DISC_SIZE / 4);

            final int currentRow = row;
            if (gameEnded(column, currentRow)) {
                gameOver();
                isFinished = !isFinished;
            }

            TranslateTransition animation = new TranslateTransition(Duration.seconds(0.5), disc);
            animation.setToY(row * (DISC_SIZE + 5) + DISC_SIZE / 4);
            colorBool = !colorBool;
            animation.play();
        } else {
            System.out.println("We have a winner, champ!");
        }
    }

    private boolean gameEnded(int column, int row) {
        List<Point2D> vertical = IntStream.rangeClosed(row - 3, row + 3)
                .mapToObj(r -> new Point2D(column, r))
                .collect(Collectors.toList());

        List<Point2D> horizontal = IntStream.rangeClosed(column - 3, column + 3)
                .mapToObj(c -> new Point2D(c, row))
                .collect(Collectors.toList());

        Point2D topLeft = new Point2D(column - 3, row - 3);
        List<Point2D> diagonal1 = IntStream.rangeClosed(0, 6)
                .mapToObj(i -> topLeft.add(i, i))
                .collect(Collectors.toList());

        Point2D botLeft = new Point2D(column - 3, row + 3);
        List<Point2D> diagonal2 = IntStream.rangeClosed(0, 6)
                .mapToObj(i -> botLeft.add(i, -i))
                .collect(Collectors.toList());

        return checkRange(vertical) || checkRange(horizontal)
                || checkRange(diagonal1) || checkRange(diagonal2);
    }

    private boolean checkRange(List<Point2D> points) {
        int chain = 0;

        for (Point2D p : points) {
            int column = (int) p.getX();
            int row = (int) p.getY();

            Disc disc = getDisc(column, row).orElse(new Disc(!colorBool));
            if (disc.red == colorBool) {
                chain++;
                if (chain == 4) {
                    return true;
                }
            } else {
                chain = 0;
            }
        }

        return false;
    }

    private void gameOver() {
        System.out.println("Winner: " + (colorBool ? "RED" : "YELLOW"));
    }

    private Optional<Disc> getDisc(int column, int row) {
        if (column < 0 || column >= COLUMNS
                || row < 0 || row >= ROWS) {
            return Optional.empty();
        }

        return Optional.ofNullable(grid[column][row]);
    }

    static class Disc extends Circle {

        
        private final boolean red;
        public Disc(boolean red) {
            super(DISC_SIZE / 2, red ? Color.RED : Color.GREENYELLOW);
            this.red = red;
            setCenterX(DISC_SIZE / 2);
            setCenterY(DISC_SIZE / 2);
        }
    }

    protected Scene retScene() {
        currentScene = new Scene(drawContent());
        return currentScene;
    }

}
