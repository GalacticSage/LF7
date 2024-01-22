package org.example;

import javax.swing.*;

public class PanelHinzufuegenMitarbeiter extends JPanel {
    JButton btn_hinzufuegen;
    JLabel lbl_vorname, lbl_nachname, lbl_meldung;
    JTextField txt_vorname, txt_nachname;

    PanelHinzufuegenMitarbeiter() {
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

        lbl_meldung = new JLabel("");
        lbl_meldung.setBounds(10, 80, 300, 25);
        this.add(lbl_meldung);

        btn_hinzufuegen = new JButton("Mitarbeiter hinzufügen");
        btn_hinzufuegen.setBounds(10, 110, 200, 25);
        this.add(btn_hinzufuegen);
    }

    public JButton getBtn_hinzufuegen() {
        return btn_hinzufuegen;
    }

    public String getTxt_vorname() {
        return txt_vorname.getText();
    }

    public String getTxt_nachname() {
        return txt_nachname.getText();
    }

    public void setLbl_meldung(String meldung) {
        lbl_meldung.setText(meldung);
    }

    public void clearTxtFields() {
        txt_vorname.setText("");
        txt_nachname.setText("");
    }

    public void clearLbl_meldung() {
        lbl_meldung.setText("");
    }
}
