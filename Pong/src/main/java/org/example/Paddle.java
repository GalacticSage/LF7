package org.example;

import java.awt.*;

public class Paddle {
    private int height, x, y, speed;
    private Color color;
    private final int paddle_width = 15;

    public Paddle(int x, int y, int speed, int height, Color color) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.height = height;
        this.color = color;
    }

    public void moveTowards(int moveToY) {
        // Find the location of the center of the paddle
        int centerY = y + height / 2;

        // Determine if we need to move more than the speed away from where we are now
        if (Math.abs(centerY - moveToY) > speed) {
            // If the center of the paddle is too far down
            if (centerY > moveToY) {
                // Move the paddle up by the speed
                y -= speed;
            }
            // If the center of the paddle is too far up
            if (centerY < moveToY) {
                // Move the paddle down by speed
                y += speed;
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, paddle_width, height);
    }
}
