package org.example.GUI.Lehrer;

import javax.swing.*;

public class AddLehrer extends JPanel {
    JLabel lbl_vorname, lbl_nachname, lbl_id, lbl_fach, lbl_info;
    JTextField txt_vorname, txt_nachname, txt_matrikelnummer, txt_fach;
    JButton btn_add;

    public AddLehrer() {
        setLayout(null);
        lbl_vorname = new JLabel("Vorname:");
        lbl_vorname.setBounds(10, 10, 100, 25);
        add(lbl_vorname);
        txt_vorname = new JTextField();
        txt_vorname.setBounds(120, 10, 300, 25);
        add(txt_vorname);
        lbl_nachname = new JLabel("Nachname:");
        lbl_nachname.setBounds(10, 40, 100, 25);
        add(lbl_nachname);
        txt_nachname = new JTextField();
        txt_nachname.setBounds(120, 40, 300, 25);
        add(txt_nachname);
        lbl_id = new JLabel("Matrikelnr:");
        lbl_id.setBounds(10, 70, 100, 25);
        add(lbl_id);
        txt_matrikelnummer = new JTextField();
        txt_matrikelnummer.setBounds(120, 70, 300, 25);
        add(txt_matrikelnummer);
        lbl_fach = new JLabel("Fach:");
        lbl_fach.setBounds(10, 100, 100, 25);
        add(lbl_fach);
        txt_fach = new JTextField();
        txt_fach.setBounds(120, 100, 300, 25);
        add(txt_fach);
        btn_add = new JButton("Hinzufügen");
        btn_add.setBounds(10, 130, 150, 25);
        add(btn_add);
        lbl_info = new JLabel("");
        lbl_info.setBounds(10, 160, 300, 25);
        add(lbl_info);
    }

    public JButton getBtn_add() {
        return btn_add;
    }

    public String getTxt_vorname() {
        return txt_vorname.getText();
    }

    public String getTxt_nachname() {
        return txt_nachname.getText();
    }

    public String getTxt_matrikelnummer() {
        return txt_matrikelnummer.getText();
    }

    public String getTxt_fach() {
        return txt_fach.getText();
    }

    public void setLbl_info(String str) {
        lbl_info.setText(str);
        lbl_info.setForeground(java.awt.Color.GREEN);
    }

    public void setLbl_info_error(String str) {
        lbl_info.setText(str);
        lbl_info.setForeground(java.awt.Color.RED);
    }

    public void clear() {
        txt_vorname.setText("");
        txt_nachname.setText("");
        txt_matrikelnummer.setText("");
        txt_fach.setText("");
    }
}
