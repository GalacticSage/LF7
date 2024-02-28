package org.example;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;


public class Oberflaeche extends JFrame {
    Rechteck spieler;
    Rechteck gegner;
    boolean gameOver;

    public Oberflaeche() {
        spieler = new Rechteck(10, 10, 50, 50, Color.yellow);
        gegner = new Rechteck(200, 300, 50, 50, Color.red);
        gameOver = false;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
        this.addKeyListener(new AL());
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);

        spieler.zeichne(g);
        gegner.zeichne(g);

//        if(gameOver){
//
//        }
    }

    public void kollisionsKontrolle() {
        if (spieler.intersects(gegner)) {
            gameOver = true;
            System.out.println("Gameover");
        }
    }

    public void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
        }
    }

    public class AL extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            spieler.inputKontrolle(e, gameOver);
            kollisionsKontrolle();
            render();
            repaint();
        }
    }
}