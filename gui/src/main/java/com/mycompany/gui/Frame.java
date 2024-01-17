package com.mycompany.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Mein Titel");
        jframe.setSize(500, 400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JMenuBar und seine Elemente JMenu
        JMenuBar menuBar = new JMenuBar();
        JMenu elementA = new JMenu("Element A");
        JMenu elementB = new JMenu("Element B");
        menuBar.add(elementA);
        menuBar.add(elementB);


        //TextArea
        JTextArea textArea = new JTextArea();

        //JPanel - JLabel - JTextField - JButton
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JTextField textField = new JTextField(20);
        JButton btn_senden = new JButton("Senden");
        JButton btn_reset = new JButton("Reset");

        // Elemente dem Container Panel hinzufügen
        panel.add(label);
        panel.add(textField);
        panel.add(btn_senden);
        panel.add(btn_reset);

        btn_senden.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textAuslesen = textField.getText();
                textArea.setText(textAuslesen);
            }
        });

        // Elemente dem Frame hinzufügen
        jframe.getContentPane().add(BorderLayout.SOUTH, panel);
        jframe.getContentPane().add(BorderLayout.NORTH, menuBar);
        jframe.getContentPane().add(BorderLayout.CENTER, textArea);
        jframe.setVisible(true);
    }
}
