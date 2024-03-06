package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongGame extends JPanel implements MouseMotionListener {
    private int windowWidth = 800;
    private int windowHeight = 600;
    private Ball ball;
    private Paddle playerPaddle, comPaddle;
    private int playerMouseY;
    public PongGame() {
        setPreferredSize(new Dimension(windowWidth, windowHeight));
        ball = new Ball(400, 300, 3, 3, 3, 15, Color.WHITE);
        playerPaddle = new Paddle(10, 250, 15, 100, Color.BLUE);
        comPaddle = new Paddle(775, 250, 15, 100, Color.RED);

        playerMouseY = 0;

        addMouseMotionListener(this);
    }

    public void gameLoop() {
        ball.move();
        ball.bounceOfFrame(windowWidth, windowHeight);
        playerPaddle.moveTowards(playerMouseY);
        comPaddle.moveTowards(ball.getY());
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, windowWidth, windowHeight);
        ball.paint(g);
        playerPaddle.paint(g);
        comPaddle.paint(g);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        playerMouseY = e.getY();
    }
}
