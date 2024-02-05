package org.example.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Greeter extends JPanel {
    private JLabel label;
    private BufferedImage image;
    public Greeter() {
        setLayout(null);
        label = new JLabel("Willkommen im Schulverwaltungsprogramm");
        label.setForeground(java.awt.Color.BLUE);
        label.setBounds(10, 10, 480, 20);
        add(label);
        try {
	           image = ImageIO.read(new File("schule.png"));
               paintComponent(image.getGraphics());
	        } catch (IOException ex) {
	             // handle exception...
	        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 100, 83, this);
    }
}
