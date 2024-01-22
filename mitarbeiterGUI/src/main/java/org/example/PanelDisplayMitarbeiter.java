package org.example;

import javax.swing.*;

public class PanelDisplayMitarbeiter extends JPanel {
    private JButton btn_displayMitarbeiter, btn_next, btn_previous;
    private JLabel lbl_vorname, lbl_nachname;
    private JTextField txt_vorname, txt_nachname;

    PanelDisplayMitarbeiter() {
        this.setLayout(null);

        lbl_vorname = new JLabel("Vorname:");
        lbl_vorname.setBounds(10, 20, 80, 25);
        this.add(lbl_vorname);

        txt_vorname = new JTextField();
        txt_vorname.setBounds(100, 20, 165, 25);
        this.add(txt_vorname);

        lbl_nachname = new JLabel("Nachname:");
        lbl_nachname.setBounds(10, 50, 80, 25);
        this.add(lbl_nachname);

        txt_nachname = new JTextField();
        txt_nachname.setBounds(100, 50, 165, 25);
        this.add(txt_nachname);

        btn_displayMitarbeiter = new JButton("Mitarbeiter anzeigen");
        btn_displayMitarbeiter.setBounds(10, 80, 165, 25);
        this.add(btn_displayMitarbeiter);

        btn_next = new JButton("Nächster Mitarbeiter");
        btn_next.setBounds(10, 110, 165, 25);
        this.add(btn_next);

        btn_previous = new JButton("Vorheriger Mitarbeiter");
        btn_previous.setBounds(10, 140, 165, 25);
        this.add(btn_previous);
    }

    public JButton getBtn_displayMitarbeiter() {
        return btn_displayMitarbeiter;
    }

    public JButton getBtn_next() {
        return btn_next;
    }

    public JButton getBtn_previous() {
        return btn_previous;
    }

    public void setTxt_vorname(String vorname) {
        txt_vorname.setText(vorname);
    }

    public void setTxt_nachname(String nachname) {
        txt_nachname.setText(nachname);
    }
}
