package org.jesperancinha.java11.mastery4dot2;

import javax.swing.*;
import java.awt.*;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Jetuber extends JFrame {

    public static void main(String args[]) {
        Jetuber browser = new Jetuber();
        browser.setVisible(true);
    }

    Jetuber() {
        super("Bandido (álbum)\n");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        add(new JScrollPane(pane));
        setSize(new Dimension(400, 600));
        setResizable(false);
        try {
            pane.setPage("https://es.wikipedia.org/wiki/Bandido_(%C3%A1lbum)");
        } catch (Throwable e) {
            RED.printThrowableAndExit(e);
        }

    }
}