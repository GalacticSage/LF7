package org.example;

import java.awt.*;

public class Ball {

    //declare instance variables
    private int x, y, cx, cy, speed, size;
    private Color color;

    //ball constructor assigns values to instance variables
    public Ball(int x, int y, int cx, int cy, int speed, Color color, int size) {
        this.x = x;
        this.y = y;
        this.cx = cx;
        this.cy = cy;
        this.speed = speed;
        this.color = color;
        this.size = size;
    }

    public void moveBall() {
        x += cx;
        y += cy;
    }

    /**
     * Detect collision with screen borders and reverse direction
     *
     * @param top    - the y value of the top of the screen
     * @param bottom - the y value of the bottom of the screen
     */
    public void bounceOffEdges(int top, int bottom) {

        //if the y value is at the bottom of the screen
        if (y > bottom - size) {
            reverseY();
        }
        //if y value is at top of screen
        else if (y < top) {
            reverseY();
        }

        //if x value is at left or right side
        //hard-coded values, we will delete this section later
        if (x < 0) {
            reverseX();
        } else if (x > 640 - size) {
            reverseX();
        }

    }

    /**
     * Reverse's the ball's change in x value
     */
    public void reverseX() {
        cx *= -1;
    }

    /**
     * Reverse's the ball's change in y value
     */
    public void reverseY() {
        cy *= -1;
    }

    public void paint(Graphics g) {

        //set the brush color to the ball color
        g.setColor(color);

        //paint the ball at x, y with a width and height of the ball size
        g.fillOval(x, y, size, size);

    }
}
