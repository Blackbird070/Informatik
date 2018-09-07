package pa_Schach.gui;


import pa_Schach.Board;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Luecx on 08.08.2017.
 */
public class Frame extends JFrame {

    private GamePanel gamePanel;
    private Board b;

    public Frame(Board b) {
        super();

        gamePanel = new GamePanel(b);

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.add(gamePanel);


        this.setVisible(true);
    }

    public void update(){
        this.gamePanel.updateBackgrounds();
    }

    public static void main(String[] args) {
        Board b = new Board();
        b.start();
        Frame f = new Frame(b);
    }

}
