package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PongGame extends JPanel implements MouseMotionListener {
    static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;
    private Ball gameBall;
    private Paddle userPaddle, pcPaddle;

    private int userMouseY;

    public PongGame() {

        gameBall = new Ball(300, 200, 3, 3, 3, Color.YELLOW, 10);
        userPaddle = new Paddle(10, 200, 75, 3, Color.BLUE);
        pcPaddle = new Paddle(610, 200, 75, 3, Color.RED);

        //set to zero for now
        userMouseY = 0;

        //listen for motion events on this object
        addMouseMotionListener(this);

    }

    //all the code we wrote already should be here, followed by...

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        userMouseY = e.getY();
    }

    /**
     * Called once each frame to handle essential game operations
     */
    public void gameLogic() {
        //move the ball one frame
        gameBall.moveBall();

        //edge check/bounce
        gameBall.bounceOffEdges(0, WINDOW_HEIGHT);

        //move the paddle towards where the mouse is
        userPaddle.moveTowards(userMouseY);

        //move the PC paddle towards the ball y position
        pcPaddle.moveTowards(gameBall.getY());

    }


    /**
     * Updates and draws all the graphics on the screen
     */
    public void paintComponent(Graphics g) {

        //draw the background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

        //draw the ball
        gameBall.paint(g);

        //draw the paddles
        userPaddle.paint(g);
        pcPaddle.paint(g);

    }

}