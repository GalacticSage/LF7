package com.mycompany.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {

    JPanel p;
    JButton btn_b1;
    JTextField textField;

    public Gui() {
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p = new JPanel();
        btn_b1 = new JButton("Test");
        btn_b1.setBounds(200, 200, 100, 50);
        p.setLayout(null);
        this.add(p);
        p.add(btn_b1);
        btn_b1.addActionListener(this);
        textField = new JTextField();
        textField.setBounds(100, 100, 100, 50);
        p.add(textField);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_b1) {
            textField.setText("Test");
        }
    }
}