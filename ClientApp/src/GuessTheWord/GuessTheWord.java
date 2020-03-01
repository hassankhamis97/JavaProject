package guesstheword;

import Stack.NavigationStack;
import clientapp.SharedData;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.Character.isUpperCase;
import java.net.Socket;
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

/**
 *
 *
 * @author Ahmed Awad
 */
public class GuessTheWord extends GuessTheWordUI {

    private Scene currentScene;
    private PrintStream ps;
    private DataInputStream dis;
    private DataOutputStream dos;
    private String receivedWord;
    private String isFinished;
    private ArrayList<Integer> indexes = new ArrayList<>();
    private char charArray[] = new char[100];

    public GuessTheWord(Socket client) {
        isFinished = "false";
        NavigationStack nsObj = new NavigationStack();
        nsObj.root = this;
        nsObj.pageName = "GuessTheWord";
        nsObj.cssStyle = "";
        nsObj.isNew = true;
        SharedData.nsList.add(nsObj);
//        GuessTheWord.showNewScene(retScene());

        /* TO DO 
         Get a random word from the DB
        
         */
        try {

            dis = new DataInputStream(SharedData.client.getInputStream());
            dos = new DataOutputStream(SharedData.client.getOutputStream());
        } catch (IOException ex) {
            System.out.println("Error connecting the server!");
        }
        //String word = "thisisasample";

        Thread th = new Thread(() -> {

            while (true) {
                //Data is like letter-a-123-word-status
                try {
                    String data = dis.readUTF();
                    String[] divided = data.split("-");
                    if (divided[0].equals("InitLetter")) {

                        // divided[1];
                        drawDashes(divided[1]);
                        receivedWord = divided[1];

                    } else {

                        //Data is like letter-a-123-word-status
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                //
                                playLetter(data);
                            }
                        });
                    }
                } catch (IOException ex) {
                    System.out.println("Error in received!");
                }
            }
        });
        th.start();
//       //Once you receive the word from DB
//        StringBuffer tempoStringBuffer = new StringBuffer();
//
//        /* Draw spaces in the wordField onscreen to replace with the letter */
//        for (int i1 = 0; i1 < word.length(); i1++) {
//            tempoStringBuffer.insert(i1, " ");
//        }
        //  wordField.setText(tempoStringBuffer.toString());
        a.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("a", receivedWord);
                a.setDisable(true);
            }
        });

        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("b", receivedWord);
                b.setDisable(true);
            }
        });

        c.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("c", receivedWord);
                c.setDisable(true);
            }
        });

        d.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("d", receivedWord);
                d.setDisable(true);
            }
        });

        e.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("e", receivedWord);
                e.setDisable(true);
            }
        });

        f.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("f", receivedWord);
                f.setDisable(true);
            }
        });

        g.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("g", receivedWord);
                g.setDisable(true);
            }
        });

        h.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("h", receivedWord);
                h.setDisable(true);
            }
        });

        i.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("i", receivedWord);
                i.setDisable(true);
            }
        });

        j.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("j", receivedWord);
                j.setDisable(true);
            }
        });

        k.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("k", receivedWord);
                k.setDisable(true);
            }
        });

        l.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("l", receivedWord);
                l.setDisable(true);
            }
        });

        m.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("m", receivedWord);
                m.setDisable(true);
            }
        });

        n.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("n", receivedWord);
                n.setDisable(true);
            }
        });

        o.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("o", receivedWord);
                o.setDisable(true);
            }
        });

        p.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("p", receivedWord);
                p.setDisable(true);
            }
        });

        q.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("r", receivedWord);
                q.setDisable(true);
            }
        });

        r.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("r", receivedWord);
                r.setDisable(true);
            }
        });

        s.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("s", receivedWord);
                s.setDisable(true);
            }
        });

        t.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("t", receivedWord);
                t.setDisable(true);
            }
        });

        u.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("u", receivedWord);
                u.setDisable(true);
            }
        });

        v.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("v", receivedWord);
                v.setDisable(true);
            }
        });

        w.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("w", receivedWord);
                w.setDisable(true);
            }
        });

        x.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("x", receivedWord);
                x.setDisable(true);
            }
        });

        y.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("y", receivedWord);
                y.setDisable(true);
            }
        });

        z.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                buttonClicked("z", receivedWord);
                z.setDisable(true);
            }
        });
    }

    void playLetter(String replyFromServer) {

        //---------------------------------------------------------
        // String breakdown
        //Data is like letter-a-123-word-status
        String data[] = replyFromServer.split("-");
        //letter to play
        String letter = data[1];
        //A string carrying indexes of the letter in the word.
        String indexString = data[2];
        /* The word itself transformed into Array of characters,
         to check whether its letters are upper or lower case */

        String word = data[3];

        char[] wordCharacters = data[3].toCharArray();

        if (indexString.equalsIgnoreCase("none")) {
            System.out.println("Letter doesn't exist!");
        } else {
            //--------------------------------------------------------
            // turn the indexes string into array of indexes to insert letter..
            ArrayList<Integer> arrayOfLetterIndexes = new ArrayList<Integer>();
            for (int j = 0; j < indexString.length(); j++) {
                arrayOfLetterIndexes.add(Integer.parseInt(indexString.substring(j, j + 1)));
            }
            //------------------------------------------------------
            //insert the letter into the wordField .. upper or lower case

            for (Integer indexe : arrayOfLetterIndexes) {
                if (isUpperCase(wordCharacters[indexe])) {

                    String letterUpper = letter.toUpperCase();
                    charArray[indexe] = letterUpper.charAt(0);
                } else {
                    charArray[indexe] = letter.charAt(0);
                }
            }
            //wordField.setText(stringInWordField.toString());

            wordField.setText(new String(charArray));

            if (isOver(word)) {
                isFinished = "true";
            }
        }
    }

    void drawDashes(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        //henna abl lamma ahandel el-white spaces
//        for (int i = 0; i < str.length(); i++) {
//            //isUpperCase(str.charAt(i))
//            
//            
//            stringBuilder.append("_");
//        }
        for (char charIterator : str.toCharArray()) {

            if (Character.isWhitespace(charIterator)) {
                stringBuilder.append(" ");
            } else {
                stringBuilder.append("_");
            }
        }
        dashesField.setText(stringBuilder.toString());
    }

    void buttonClicked(String clickedLetter, String word) {

        if (isFinished.equals("true")) {
            System.out.println("We already have a winner!");
        } else {
            String turnStatus;
            if (word.indexOf(clickedLetter) >= 0) {
                turnStatus = "ready";
            } else {
                turnStatus = "wait";
            }
            ArrayList<Integer> indexes = new ArrayList<Integer>();
            indexes.clear();
            for (int index = word.indexOf(clickedLetter); index >= 0; index = word.indexOf(clickedLetter, index + 1)) {
                indexes.add(index);
            }
            StringBuffer indexesToString = new StringBuffer();

            if (indexes.isEmpty()) {
                indexesToString.append("none");
            } else {
                for (Integer integer : indexes) {
                    indexesToString.append(integer);
                }
            }

            //String that holds indexes of the letter in the string from DB
            String letterOccurrence = indexesToString.toString();

            //Get ready and send to server
            String sendStringToServer = "letter-" + clickedLetter + "-"
                    + letterOccurrence + "-" + turnStatus + "-" + isFinished;
            try {
                dos.writeUTF(sendStringToServer);
            } catch (IOException ex) {
                System.out.println("Failed to send to server");
            }
        }
    }

    boolean isOver(String word) {

        //returns true if the game word equals the shown letters in the textbox (wordField)
        String checkString = wordField.getText().substring(0, word.length());

        return word.equals(checkString);
    }
}
