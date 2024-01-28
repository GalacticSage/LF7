package org.example.GUI.Lehrer;

import javax.swing.*;

public class pRemoveLehrer extends JPanel {
    private JComboBox comboBoxLehrer;
    private JButton btn_remove;
    private JLabel lbl_info;

    public pRemoveLehrer() {
        comboBoxLehrer = new JComboBox();
        btn_remove = new JButton("Entfernen");
        lbl_info = new JLabel("Lehrer entfernen");
        add(lbl_info);
        add(comboBoxLehrer);
        add(btn_remove);
    }

    public pRemoveLehrer(String[] entries) {
        comboBoxLehrer = new JComboBox();
        btn_remove = new JButton("Entfernen");
        lbl_info = new JLabel("Lehrer entfernen");
        add(lbl_info);
        add(comboBoxLehrer);
        add(btn_remove);
        setEntries(entries);
    }

    public pRemoveLehrer(String yetToBeImplemented) {
        lbl_info = new JLabel(yetToBeImplemented);
        lbl_info.setBounds(0, 0, 200, 200);
        lbl_info.setForeground(java.awt.Color.RED);
        lbl_info.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        add(lbl_info);
    }

    public void setEntries(String[] entries) {
        comboBoxLehrer.removeAllItems();
        for (String entry : entries) {
            comboBoxLehrer.addItem(entry);
        }
    }

    public JButton getBtn_remove() {
        return btn_remove;
    }
}
