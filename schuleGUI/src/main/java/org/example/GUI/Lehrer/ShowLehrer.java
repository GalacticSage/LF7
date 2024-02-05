package org.example.GUI.Lehrer;

import javax.swing.*;

public class ShowLehrer extends JPanel {
    private JLabel label1, label2;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ShowLehrer() {
        setLayout(null);
        setBounds(0, 0, 500, 500);
        label1 = new JLabel("Lehrer Anzeigen");
        label1.setBounds(210, 10, 480, 20);
        label2 = new JLabel("Matrikelnummer Vorname Nachname Fach");
        label2.setBounds(10, 30, 500, 20);
        textArea = new JTextArea();
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 50, 480, 400);
        add(label1);
        add(label2);
        add(scrollPane);
    }


    public void setTextArea(String text) {
        textArea.setText(text);
    }
}