package org.example.GUI.Klasse;

import javax.swing.*;

public class ShowKlasse extends JPanel {

    private JTextArea txt_klassen;
    private JLabel lbl_klassen, lbl_title;
    private JScrollPane scrollPane;

    public ShowKlasse() {
        setLayout(null);
        lbl_title = new JLabel("Klassen Anzeigen");
        lbl_klassen = new JLabel("Klasse | Lehrer");
        txt_klassen = new JTextArea();
        txt_klassen.setEditable(false);
        scrollPane = new JScrollPane(txt_klassen);

        lbl_title.setBounds(210, 10, 480, 20);
        lbl_klassen.setBounds(10, 30, 500, 20);
        scrollPane.setBounds(10, 50, 480, 400);

        add(lbl_title);
        add(lbl_klassen);
        add(scrollPane);
    }

    public void setTxt_klassen(String text) {
        txt_klassen.setText(text);
    }
}
