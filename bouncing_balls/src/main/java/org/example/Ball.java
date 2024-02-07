package org.example;

import javax.swing.*;
import java.awt.*;

public class Ball {
    private int posX, posY, size;
    private Color color;

    private int vx = 5;
    private int vy = 5;

    public Ball(int posX, int posY, int size, Color color, int vx, int vy) {
        this.posX = posX;
        this.posY = posY;
        this.size = size;
        this.color = color;
        this.vx = vx;
        this.vy = vy;
    }

    void update(JFrame mainFrame) {
        this.posX += vx;
        this.posY += vy;

        int tempSize = size *2;
        int tempWidth = mainFrame.getWidth() - size;
        int tempHeight = mainFrame.getHeight() - tempSize;
        if (posX > tempWidth) {
            vx *= -1;
            posX = tempWidth;
        } else if (posX < 0) {
            vx *= -1;
            posX = 0;
        }

        if (posY > tempHeight) {
            vy *= -1;
            posY = tempHeight;
        } else if (posY < 0) {
            vy *= -1;
            posY = 0;
        }


    }

    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(posX, posY, size, size);
    }
}
