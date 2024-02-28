package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CollisionBalls extends JPanel {

    private final int SPIELFELD_BREITE = 600;
    private final int SPIELFELD_HOHE = 400;
    private static final int UPDATE_RATE = 120;

    private ArrayList<MyBall> myBalls = new ArrayList<>();


    public CollisionBalls(int ballCount){
        this.setPreferredSize(new Dimension(SPIELFELD_BREITE, SPIELFELD_HOHE));

        for(int i = 0; i < ballCount; i++){
            myBalls.add(new MyBall(this));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i = 0; i < myBalls.size(); i++){
            myBalls.get(i).draw(g);
        }

    }

    public int getSPIELFELD_BREITE() {
        return SPIELFELD_BREITE;
    }

    public int getSPIELFELD_HOHE() {
        return SPIELFELD_HOHE;
    }

    public int getUpdateRate() {
        return UPDATE_RATE;
    }
}