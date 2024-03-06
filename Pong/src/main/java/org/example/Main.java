package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static JFrame frame = new JFrame("Pong");

    public static void main(String[] args) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        PongGame game = new PongGame();

        frame.setContentPane(game);
        frame.pack();

        frame.setVisible(true);

         //make a new Timer
        Timer timer = new Timer(33, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //game loop
                game.gameLoop();

                //repaint the screen
                game.repaint();

            }
        });

        //start the timer
        timer.start();
    }
}