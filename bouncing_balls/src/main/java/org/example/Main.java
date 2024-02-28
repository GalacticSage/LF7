package org.example;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CollisionBalls c = new CollisionBalls(10);

        frame.add(c);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        int updates = 60;
        double timePerUpdate = 1000000000/updates;
        long lastUpdate = System.nanoTime();


        while(true){
            if(System.nanoTime() - lastUpdate >= timePerUpdate ){
                c.repaint();
                lastUpdate = System.nanoTime();
            }
        }


    }

}