/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.raumbuchung;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author INF3A_usenj
 */
public class FirmaView extends JPanel {

    private JTextArea textArea;
    private JLabel label;
    private JButton btn_1, btn_2;

    public FirmaView() {
        setLayout(null);
        
        textArea = new JTextArea();
        label = new JLabel("Liste aller Raume");
        btn_1 = new JButton("Alle Raume");
        btn_2 = new JButton("Freie Raume");
        
        label.setBounds(10, 10, 300, 20);
        
        add(label);
        add(textArea);
        add(btn_1);
        add(btn_2);
    }

}
