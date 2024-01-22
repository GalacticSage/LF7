package org.example;

import javax.swing.*;

public class showMitarbeiterPanel extends JPanel {
    private JButton btn_showMitarbeiter, btn_next, btn_previous;
    private JLabel lbl_vorname, lbl_nachname;
    private JTextField txt_vorname, txt_nachname;

    showMitarbeiterPanel() {
        this.setLayout(null);

        lbl_vorname = new JLabel("Vorname:");
        lbl_vorname.setBounds(10, 20, 80, 25);
        showMitarbeiterPanel.add(lbl_vorname);

        txt_vorname = new JTextField();
        txt_vorname.setBounds(100, 20, 165, 25);
        showMitarbeiterPanel.add(txt_vorname);

        lbl_nachname = new JLabel("Nachname:");
        lbl_nachname.setBounds(10, 50, 80, 25);
        showMitarbeiterPanel.add(lbl_nachname);

        txt_nachname = new JTextField();
        txt_nachname.setBounds(100, 50, 165, 25);
        showMitarbeiterPanel.add(txt_nachname);

        btn_showMitarbeiter = new JButton("Mitarbeiter anzeigen");
        btn_showMitarbeiter.setBounds(10, 80, 165, 25);
        showMitarbeiterPanel.add(btn_showMitarbeiter);

        btn_next = new JButton("Nächster Mitarbeiter");
        btn_next.setBounds(10, 110, 165, 25);
        showMitarbeiterPanel.add(btn_next);

        btn_previous = new JButton("Vorheriger Mitarbeiter");
        btn_previous.setBounds(10, 140, 165, 25);
        showMitarbeiterPanel.add(btn_previous);
    }

    public JButton getBtn_showMitarbeiter() {
        return btn_showMitarbeiter;
    }

    public void setBtn_showMitarbeiter(JButton btn_showMitarbeiter) {
        this.btn_showMitarbeiter = btn_showMitarbeiter;
    }

    public JButton getBtn_next() {
        return btn_next;
    }

    public void setBtn_next(JButton btn_next) {
        this.btn_next = btn_next;
    }

    public JButton getBtn_previous() {
        return btn_previous;
    }

    public void setBtn_previous(JButton btn_previous) {
        this.btn_previous = btn_previous;
    }

    public JLabel getLbl_vorname() {
        return lbl_vorname;
    }

    public void setLbl_vorname(JLabel lbl_vorname) {
        this.lbl_vorname = lbl_vorname;
    }

    public JLabel getLbl_nachname() {
        return lbl_nachname;
    }

    public void setLbl_nachname(JLabel lbl_nachname) {
        this.lbl_nachname = lbl_nachname;
    }

    public JTextField getTxt_vorname() {
        return txt_vorname;
    }

    public void setTxt_vorname(JTextField txt_vorname) {
        this.txt_vorname = txt_vorname;
    }

    public JTextField getTxt_nachname() {
        return txt_nachname;
    }

    public void setTxt_nachname(JTextField txt_nachname) {
        this.txt_nachname = txt_nachname;
    }
}
