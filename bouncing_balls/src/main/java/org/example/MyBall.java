package org.example;

import java.awt.*;
import java.util.Random;

public class MyBall extends Rectangle {


    private int spielfeld_breite;
    private int spielfeld_hohe;
    private int SIZE = 40;
    private int speedX = 3;
    private int speedY = 3;
    Random random = new Random();
    Color color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));


    public MyBall(CollisionBalls collisionBalls){

        spielfeld_breite = collisionBalls.getSPIELFELD_BREITE();
        spielfeld_hohe = collisionBalls.getSPIELFELD_HOHE();

        width = SIZE;
        height = SIZE;

        x = random.nextInt(spielfeld_breite -100) + 50;
        y = random.nextInt(spielfeld_hohe -100) + 50;

    }


    public void draw(Graphics g){

        x += speedX;
        y += speedY;

        if(x <= 0){
            speedX = Math.abs(speedX);
            color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        }else if(x + SIZE >= spielfeld_breite){
            speedX = -Math.abs(speedX);
            color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        }

        if(y  <= 0){
            speedY = Math.abs(speedY);
            color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        }else if(y + SIZE >= spielfeld_hohe){
            color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
            speedY = -Math.abs(speedY);
        }

        g.setColor(color);
        g.fillOval(x,y,width,height);

    }


}
