package org.example;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private java.util.List<Ball> balls;

    public DrawPanel(java.util.List<Ball> balls) {
        this.balls = balls;
    }
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);

        for (Ball b : balls) {
            b.draw(graphics);
        }

    }
}
