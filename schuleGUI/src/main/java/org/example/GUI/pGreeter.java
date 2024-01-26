package org.example.GUI;

import javax.swing.*;

public class pGreeter extends JPanel {
    private JLabel label;
    public pGreeter() {
        setLayout(null);
        setBounds(0, 0, 500, 500);
        label = new JLabel("Willkommen");
        label.setBounds(10, 10, 480, 480);
        add(label);
    }
}
