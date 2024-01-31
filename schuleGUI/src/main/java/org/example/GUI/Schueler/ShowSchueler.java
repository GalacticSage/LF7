package org.example.GUI.Schueler;

import javax.swing.*;

public class ShowSchueler extends JPanel {
    private JLabel label1, label2;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JButton btn_anzeigen;

    public ShowSchueler() {
        setLayout(null);
        setBounds(0, 0, 500, 500);
        label1 = new JLabel("Schueler Anzeigen");
        label1.setBounds(210, 10, 480, 20);
        label2 = new JLabel("Matrikelnummer Vorname Nachname");
        label2.setBounds(10, 30, 500, 20);
        textArea = new JTextArea();
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 50, 480, 400);
        btn_anzeigen = new JButton("Refresh");
        btn_anzeigen.setBounds(10, 450, 100, 20);
        add(label1);
        add(label2);
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
