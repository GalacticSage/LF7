package org.example;

import java.awt.*;

public class Ball {
    private int x, y, xSpeed, ySpeed, speed, size;
    private Color color;

    public Ball(int x, int y, int xSpeed, int ySpeed, int speed, int size,Color color) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.speed = speed;
        this.size = size;
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }

    public void move() {
        x += xSpeed * speed;
        y += ySpeed * speed;
    }

    public void bounceOfFrame(int windowWidth, int windowHeight) {
        if (x < 0 || x > windowWidth - size) {
            xSpeed *= -1;
        }
        if (y < 0 || y > windowHeight - size) {
            ySpeed *= -1;
        }
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

}
