package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame implements ActionListener {
    JPanel panel;
    JButton btn_showMitarbeiter;
    JLabel lbl_vorname, lbl_nachname;
    JTextField txt_vorname, txt_nachname;
    public gui() {
        this.setTitle("Mitarbeiterliste");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        lbl_vorname = new JLabel("Vorname:");
        lbl_vorname.setBounds(10, 20, 80, 25);
        panel.add(lbl_vorname);

        txt_vorname = new JTextField();
        txt_vorname.setBounds(100, 20, 165, 25);
        panel.add(txt_vorname);

        lbl_nachname = new JLabel("Nachname:");
        lbl_nachname.setBounds(10, 50, 80, 25);
        panel.add(lbl_nachname);

        txt_nachname = new JTextField();
        txt_nachname.setBounds(100, 50, 165, 25);
        panel.add(txt_nachname);

        btn_showMitarbeiter = new JButton("Mitarbeiter anzeigen");
        btn_showMitarbeiter.setBounds(10, 80, 165, 25);
        btn_showMitarbeiter.addActionListener(this);
        panel.add(btn_showMitarbeiter);

        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("test");
    }
}
