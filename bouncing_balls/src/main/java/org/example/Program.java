package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Program {

    private JFrame mainFrame;
    private java.util.List<Ball> balls;
    private DrawPanel drawPanel;
    private int windowWidth = 640;
    private int windowHeight = 480;
    private String windowLabel = "Bounce Program";

    public void run() {

        balls = new ArrayList<>();

        /* Generate balls */
        for (int i = 0; i < 50; i++) {
            //random velocity from -5 to 5 but not 0
            int vx = (int) Math.floor(Math.random() * 10) - 5;
            if (vx == 0) {
                vx = 1;
            }
            int vy = (int) Math.floor(Math.random() * 10) - 5;
            if (vy == 0) {
                vy = 1;
            }

            Ball ball = new Ball(
                    /* Random positions from 0 to windowWidth or windowHeight */
                    (int) Math.floor(Math.random() * windowWidth),
                    (int) Math.floor(Math.random() * windowHeight),
                    /* Random size from 10 to 30 */
                    (int) Math.floor(Math.random() * 20) + 10,
                    /* Random RGB colors*/
                    new Color(
                            (int) Math.floor((Math.random() * 256)),
                            (int) Math.floor((Math.random() * 256)),
                            (int) Math.floor((Math.random() * 256))
                    ),
                    /* Random velocity from -5 to 5 */
                    vx,
                    vy
            );

            balls.add(ball);
        }

        /* Initialize program */
        mainFrame = new JFrame();
        drawPanel = new DrawPanel(balls);
        mainFrame.getContentPane().add(drawPanel);
        mainFrame.setTitle(windowLabel);
        mainFrame.setSize(windowWidth, windowHeight);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            for (Ball b : balls) {
                b.update(mainFrame);
            }

            /* Give Swing 10 milliseconds to see the update! */
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mainFrame.repaint();
        }
    }
}