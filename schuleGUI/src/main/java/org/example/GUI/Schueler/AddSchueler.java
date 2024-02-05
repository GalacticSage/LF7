package org.example.GUI.Schueler;

import org.example.GUI.Util;
import org.example.Klasse;

import javax.swing.*;

public class AddSchueler extends JPanel {
    JLabel lbl_vorname, lbl_nachname, lbl_id, lbl_klasse ,lbl_info;
    JTextField txt_vorname, txt_nachname, txt_matrikelnummer;
    JComboBox comboBoxKlasse;
    JButton btn_add;

    public AddSchueler() {
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

        lbl_klasse = new JLabel("Klasse:");
        lbl_klasse.setBounds(10, 100, 100, 25);
        add(lbl_klasse);

        comboBoxKlasse = new JComboBox();
        comboBoxKlasse.setBounds(120, 100, 300, 25);
        add(comboBoxKlasse);

        btn_add = new JButton("Hinzufügen");
        btn_add.setBounds(10, 130, 150, 25);
        add(btn_add);

        lbl_info = new JLabel("");
        lbl_info.setBounds(10, 160, 300, 25);
        add(lbl_info);
    }


    public void updateKlassenCombobox(Util util){
        comboBoxKlasse.removeAllItems();
        for (Klasse klasse : util.getKlassen()) {
            comboBoxKlasse.addItem(klasse.getKlassenname());
        }
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

    public void setLbl_info(String str) {
        lbl_info.setText(str);
        lbl_info.setForeground(java.awt.Color.GREEN);
    }

    public void setLbl_info_error(String str) {
        lbl_info.setText(str);
        lbl_info.setForeground(java.awt.Color.RED);
    }

    //get selected Klasse
    public String getSelectedKlasse(){
        return comboBoxKlasse.getSelectedItem().toString();
    }



    public void clear() {
        txt_vorname.setText("");
        txt_nachname.setText("");
        txt_matrikelnummer.setText("");
    }
}
