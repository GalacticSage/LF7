package org.example.GUI.Schueler;

import javax.swing.*;

public class pRemoveSchueler extends JPanel {
    private JComboBox comboBoxSchueler;
    private JButton btn_remove;
    private JLabel lbl_info;

    public pRemoveSchueler() {
        comboBoxSchueler = new JComboBox();
        btn_remove = new JButton("Entfernen");
        lbl_info = new JLabel("Lehrer entfernen");
        add(lbl_info);
        add(comboBoxSchueler);
        add(btn_remove);
    }

    public pRemoveSchueler(String[] entries) {
        comboBoxSchueler = new JComboBox();
        btn_remove = new JButton("Entfernen");
        lbl_info = new JLabel("Lehrer entfernen");
        add(lbl_info);
        add(comboBoxSchueler);
        add(btn_remove);
        setEntries(entries);
    }

    public pRemoveSchueler(String yetToBeImplemented) {
        lbl_info = new JLabel(yetToBeImplemented);
        lbl_info.setBounds(0, 0, 200, 200);
        lbl_info.setForeground(java.awt.Color.RED);
        lbl_info.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        add(lbl_info);
    }

    public void setEntries(String[] entries) {
        comboBoxSchueler.removeAllItems();
        for (String entry : entries) {
            comboBoxSchueler.addItem(entry);
        }
    }

    public JButton getBtn_remove() {
        return btn_remove;
    }
}
