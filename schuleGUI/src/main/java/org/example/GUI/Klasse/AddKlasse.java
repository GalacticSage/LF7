package org.example.GUI.Klasse;

import org.example.Lehrer;

import javax.swing.*;
import java.util.ArrayList;

public class AddKlasse extends JPanel {
    private JLabel lbl_klassenname, lbl_lehrer ,lbl_info;
    private JTextField txt_klassenname;

    private JComboBox<String> cb_lehrer;
    private JButton btn_add;

    public AddKlasse() {
        setLayout(null);
        lbl_klassenname = new JLabel("Klassenname");
        txt_klassenname = new JTextField();
        lbl_lehrer = new JLabel("Lehrer");
        cb_lehrer = new JComboBox<>();
        btn_add = new JButton("Add");
        lbl_info = new JLabel("");

        //set bounds
        lbl_klassenname.setBounds(10, 10, 100, 25);
        txt_klassenname.setBounds(120, 10, 300, 25);
        lbl_lehrer.setBounds(10, 40, 100, 25);
        cb_lehrer.setBounds(120, 40, 300, 25);
        btn_add.setBounds(10, 70, 150, 25);
        lbl_info.setBounds(10, 100, 300, 25);


        add(lbl_klassenname);
        add(txt_klassenname);
        add(lbl_lehrer);
        add(cb_lehrer);
        add(btn_add);
        add(lbl_info);
    }

    public String getTxt_klassenname() {
        return txt_klassenname.getText();
    }

    public void updateLehrerListe( ArrayList<Lehrer> lehrer) {
        cb_lehrer.removeAllItems();
        for (Lehrer l : lehrer) {
            cb_lehrer.addItem(l.getVornameNachname());
        }
    }

    public String getSelectedLehrer() {
        return cb_lehrer.getSelectedItem().toString();
    }

    public JButton getBtn_add() {
        return btn_add;
    }

    public void setLbl_info_error(String text) {
        lbl_info.setText(text);
        lbl_info.setForeground(java.awt.Color.RED);
    }

    public void setLbl_info(String text) {
        lbl_info.setText(text);
        lbl_info.setForeground(java.awt.Color.GREEN);
    }
}
