package org.example.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mFrame extends JFrame implements ActionListener {

public mFrame() {
        setTitle("Schulverwaltung");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    org.example.GUI.menuBar menuBar = new org.example.GUI.menuBar();
    add(menuBar);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello World!");
    }
}
