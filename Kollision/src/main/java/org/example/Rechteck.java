package org.example;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;


public class Rechteck extends Rectangle {
    Color color;

    public Rechteck(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void zeichne(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }

    public void inputKontrolle(KeyEvent e, boolean gameOver) {
        if (!gameOver) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                this.y -= 5;
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                this.y += 5;
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                this.x -= 5;
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                this.x += 5;
            }
        }
    }
}