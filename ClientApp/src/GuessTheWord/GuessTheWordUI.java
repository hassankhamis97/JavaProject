package guesstheword;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public abstract class GuessTheWordUI extends BorderPane {

    Scene currentScene;
    protected final AnchorPane anchorPane;
    protected final ToolBar toolBar;
    protected final Button a;
    protected final Button b;
    protected final Button c;
    protected final Button d;
    protected final Button e;
    protected final Button f;
    protected final Button g;
    protected final Button h;
    protected final Button i;
    protected final Button j;
    protected final ToolBar toolBar0;
    protected final Button k;
    protected final Button l;
    protected final Button m;
    protected final Button n;
    protected final Button o;
    protected final Button p;
    protected final Button q;
    protected final Button r;
    protected final Button s;
    protected final Button t;
    protected final ToolBar toolBar1;
    protected final Button u;
    protected final Button v;
    protected final Button w;
    protected final Button x;
    protected final Button y;
    protected final Button z;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane0;
    protected final Label wordField;
    protected final Label dashesField;

    public GuessTheWordUI() {

        anchorPane = new AnchorPane();
        toolBar = new ToolBar();
        a = new Button();
        b = new Button();
        c = new Button();
        d = new Button();
        e = new Button();
        f = new Button();
        g = new Button();
        h = new Button();
        i = new Button();
        j = new Button();
        toolBar0 = new ToolBar();
        k = new Button();
        l = new Button();
        m = new Button();
        n = new Button();
        o = new Button();
        p = new Button();
        q = new Button();
        r = new Button();
        s = new Button();
        t = new Button();
        toolBar1 = new ToolBar();
        u = new Button();
        v = new Button();
        w = new Button();
        x = new Button();
        y = new Button();
        z = new Button();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        wordField = new Label();
        dashesField = new Label();

        setPrefHeight(465.0);
        setPrefWidth(588.0);

        anchorPane.setPrefHeight(132.0);
        anchorPane.setPrefWidth(588.0);

        AnchorPane.setBottomAnchor(toolBar, 95.0);
        AnchorPane.setLeftAnchor(toolBar, 0.0);
        AnchorPane.setRightAnchor(toolBar, 0.0);

        a.setMaxHeight(Double.MAX_VALUE);
        a.setMaxWidth(Double.MAX_VALUE);
        a.setMinWidth(USE_PREF_SIZE);
        a.setMnemonicParsing(false);
        a.setPrefWidth(53.0);
        a.setText("A");

        b.setMaxHeight(Double.MAX_VALUE);
        b.setMaxWidth(Double.MAX_VALUE);
        b.setMinWidth(USE_PREF_SIZE);
        b.setMnemonicParsing(false);
        b.setPrefWidth(53.0);
        b.setText("B");

        c.setMaxHeight(Double.MAX_VALUE);
        c.setMaxWidth(Double.MAX_VALUE);
        c.setMinWidth(USE_PREF_SIZE);
        c.setMnemonicParsing(false);
        c.setPrefWidth(53.0);
        c.setText("C");

        d.setMaxHeight(Double.MAX_VALUE);
        d.setMaxWidth(Double.MAX_VALUE);
        d.setMinWidth(USE_PREF_SIZE);
        d.setMnemonicParsing(false);
        d.setPrefWidth(53.0);
        d.setText("D");

        e.setMaxHeight(Double.MAX_VALUE);
        e.setMaxWidth(Double.MAX_VALUE);
        e.setMinWidth(USE_PREF_SIZE);
        e.setMnemonicParsing(false);
        e.setPrefWidth(53.0);
        e.setText("E");

        f.setMaxHeight(Double.MAX_VALUE);
        f.setMaxWidth(Double.MAX_VALUE);
        f.setMinWidth(USE_PREF_SIZE);
        f.setMnemonicParsing(false);
        f.setPrefWidth(53.0);
        f.setText("F");

        g.setMaxHeight(Double.MAX_VALUE);
        g.setMaxWidth(Double.MAX_VALUE);
        g.setMinWidth(USE_PREF_SIZE);
        g.setMnemonicParsing(false);
        g.setPrefWidth(53.0);
        g.setText("G");

        h.setMaxHeight(Double.MAX_VALUE);
        h.setMaxWidth(Double.MAX_VALUE);
        h.setMinWidth(USE_PREF_SIZE);
        h.setMnemonicParsing(false);
        h.setPrefWidth(53.0);
        h.setText("H");

        i.setMaxHeight(Double.MAX_VALUE);
        i.setMaxWidth(Double.MAX_VALUE);
        i.setMinWidth(USE_PREF_SIZE);
        i.setMnemonicParsing(false);
        i.setPrefWidth(53.0);
        i.setText("I");

        j.setMaxHeight(Double.MAX_VALUE);
        j.setMaxWidth(Double.MAX_VALUE);
        j.setMinWidth(USE_PREF_SIZE);
        j.setMnemonicParsing(false);
        j.setPrefWidth(53.0);
        j.setText("J");

        AnchorPane.setBottomAnchor(toolBar0, 50.0);
        AnchorPane.setLeftAnchor(toolBar0, 0.0);
        AnchorPane.setRightAnchor(toolBar0, 0.0);
        toolBar0.setPrefWidth(588.0);

        k.setMaxWidth(Double.MAX_VALUE);
        k.setMinWidth(USE_PREF_SIZE);
        k.setMnemonicParsing(false);
        k.setPrefWidth(53.0);
        k.setText("K");

        l.setMaxWidth(Double.MAX_VALUE);
        l.setMinWidth(USE_PREF_SIZE);
        l.setMnemonicParsing(false);
        l.setPrefWidth(53.0);
        l.setText("L");

        m.setMaxWidth(Double.MAX_VALUE);
        m.setMinWidth(USE_PREF_SIZE);
        m.setMnemonicParsing(false);
        m.setPrefWidth(53.0);
        m.setText("M");

        n.setMaxWidth(Double.MAX_VALUE);
        n.setMinWidth(USE_PREF_SIZE);
        n.setMnemonicParsing(false);
        n.setPrefWidth(53.0);
        n.setText("N");

        o.setMaxWidth(Double.MAX_VALUE);
        o.setMinWidth(USE_PREF_SIZE);
        o.setMnemonicParsing(false);
        o.setPrefWidth(53.0);
        o.setText("O");

        p.setMaxWidth(Double.MAX_VALUE);
        p.setMinWidth(USE_PREF_SIZE);
        p.setMnemonicParsing(false);
        p.setPrefWidth(53.0);
        p.setText("P");

        q.setMaxWidth(Double.MAX_VALUE);
        q.setMinWidth(USE_PREF_SIZE);
        q.setMnemonicParsing(false);
        q.setPrefWidth(53.0);
        q.setText("Q");

        r.setMaxWidth(Double.MAX_VALUE);
        r.setMinWidth(USE_PREF_SIZE);
        r.setMnemonicParsing(false);
        r.setPrefWidth(53.0);
        r.setText("R");

        s.setMaxWidth(Double.MAX_VALUE);
        s.setMinWidth(USE_PREF_SIZE);
        s.setMnemonicParsing(false);
        s.setPrefWidth(53.0);
        s.setText("S");

        t.setMaxWidth(Double.MAX_VALUE);
        t.setMinWidth(USE_PREF_SIZE);
        t.setMnemonicParsing(false);
        t.setPrefWidth(53.0);
        t.setText("T");

        AnchorPane.setBottomAnchor(toolBar1, 10.0);
        AnchorPane.setLeftAnchor(toolBar1, 110.0);
        AnchorPane.setRightAnchor(toolBar1, 110.0);
        toolBar1.setPrefWidth(355.0);

        u.setMaxWidth(Double.MAX_VALUE);
        u.setMinWidth(USE_PREF_SIZE);
        u.setMnemonicParsing(false);
        u.setPrefWidth(53.0);
        u.setText("U");

        v.setMaxWidth(Double.MAX_VALUE);
        v.setMinWidth(USE_PREF_SIZE);
        v.setMnemonicParsing(false);
        v.setPrefWidth(53.0);
        v.setText("V");

        w.setMaxWidth(Double.MAX_VALUE);
        w.setMinWidth(USE_PREF_SIZE);
        w.setMnemonicParsing(false);
        w.setPrefWidth(53.0);
        w.setText("W");

        x.setMaxWidth(Double.MAX_VALUE);
        x.setMinWidth(USE_PREF_SIZE);
        x.setMnemonicParsing(false);
        x.setPrefWidth(53.0);
        x.setText("X");

        y.setMaxWidth(Double.MAX_VALUE);
        y.setMinWidth(USE_PREF_SIZE);
        y.setMnemonicParsing(false);
        y.setPrefWidth(53.0);
        y.setText("Y");

        z.setMaxWidth(Double.MAX_VALUE);
        z.setMinWidth(USE_PREF_SIZE);
        z.setMnemonicParsing(false);
        z.setPrefWidth(53.0);
        z.setText("Z");
        setBottom(anchorPane);

        borderPane.setPrefHeight(200.0);
        borderPane.setPrefWidth(200.0);

        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        wordField.setAlignment(javafx.geometry.Pos.CENTER);
        wordField.setId("resultField");
        wordField.setLayoutX(249.0);
        wordField.setLayoutY(151.0);
        wordField.setPrefWidth(89.0);
        wordField.setText("");
        wordField.setTextAlignment(javafx.scene.text.TextAlignment.JUSTIFY);

        dashesField.setAlignment(javafx.geometry.Pos.CENTER);
        dashesField.setContentDisplay(javafx.scene.control.ContentDisplay.LEFT);
        dashesField.setLayoutX(250.0);
        dashesField.setLayoutY(135.0);
        dashesField.setPrefWidth(89.0);
        dashesField.setText("");
        dashesField.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        dashesField.setWrapText(false);
        borderPane.setCenter(anchorPane0);
        setCenter(borderPane);

        toolBar.getItems().add(a);
        toolBar.getItems().add(b);
        toolBar.getItems().add(c);
        toolBar.getItems().add(d);
        toolBar.getItems().add(e);
        toolBar.getItems().add(f);
        toolBar.getItems().add(g);
        toolBar.getItems().add(h);
        toolBar.getItems().add(i);
        toolBar.getItems().add(j);
        anchorPane.getChildren().add(toolBar);
        toolBar0.getItems().add(k);
        toolBar0.getItems().add(l);
        toolBar0.getItems().add(m);
        toolBar0.getItems().add(n);
        toolBar0.getItems().add(o);
        toolBar0.getItems().add(p);
        toolBar0.getItems().add(q);
        toolBar0.getItems().add(r);
        toolBar0.getItems().add(s);
        toolBar0.getItems().add(t);
        anchorPane.getChildren().add(toolBar0);
        toolBar1.getItems().add(u);
        toolBar1.getItems().add(v);
        toolBar1.getItems().add(w);
        toolBar1.getItems().add(x);
        toolBar1.getItems().add(y);
        toolBar1.getItems().add(z);
        anchorPane.getChildren().add(toolBar1);
        anchorPane0.getChildren().add(wordField);
        anchorPane0.getChildren().add(dashesField);
        currentScene = new Scene(this);
    }

    protected Scene retScene() {
        return currentScene;
    }

}
