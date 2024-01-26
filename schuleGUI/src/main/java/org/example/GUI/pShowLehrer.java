package org.example.GUI;

import javax.swing.*;

public class pShowLehrer extends JPanel {
    private JLabel label;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JButton btn_anzeigen;

    public pShowLehrer() {
        setLayout(null);
        setBounds(0, 0, 500, 500);
        label = new JLabel("Vorname Nachname Matrikelnummer Fach");
        label.setBounds(10, 10, 500, 20);
        textArea = new JTextArea();
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 40, 480, 400);
        btn_anzeigen = new JButton("Anzeigen");
        btn_anzeigen.setBounds(10, 450, 100, 20);
        add(label);
        add(scrollPane);
        add(btn_anzeigen);
    }

    public JButton getBtn_anzeigen() {
        return btn_anzeigen;
    }

    public void setTextArea(String text) {
        textArea.setText(text);
    }


}
