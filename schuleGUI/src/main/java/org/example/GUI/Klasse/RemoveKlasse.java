package org.example.GUI.Klasse;

import javax.swing.*;

public class RemoveKlasse extends JPanel {
    private JComboBox comboBoxKlassen;
    private JButton btn_remove;
    private JLabel lbl_info;

    public RemoveKlasse() {
        comboBoxKlassen = new JComboBox();
        btn_remove = new JButton("Entfernen");
        lbl_info = new JLabel("Lehrer entfernen");
        add(lbl_info);
        add(comboBoxKlassen);
        add(btn_remove);
    }

    public RemoveKlasse(String[] entries) {
        comboBoxKlassen = new JComboBox();
        btn_remove = new JButton("Entfernen");
        lbl_info = new JLabel("Lehrer entfernen");
        add(lbl_info);
        add(comboBoxKlassen);
        add(btn_remove);
        setEntries(entries);
    }

    public RemoveKlasse(String yetToBeImplemented) {
        lbl_info = new JLabel(yetToBeImplemented);
        lbl_info.setBounds(0, 0, 200, 200);
        lbl_info.setForeground(java.awt.Color.RED);
        lbl_info.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        add(lbl_info);
    }

    public void setEntries(String[] entries) {
        comboBoxKlassen.removeAllItems();
        for (String entry : entries) {
            comboBoxKlassen.addItem(entry);
        }
    }

    public JButton getBtn_remove() {
        return btn_remove;
    }

}
