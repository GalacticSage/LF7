package org.example;

import javax.swing.*;

public class MenuLeiste extends JMenuBar {
    JMenu start;
    JMenuItem mitarbeiterAnzeigen, mitarbeiterHinzufuegen;

    public MenuLeiste() {
        this.setBounds(0, 0, 500, 20);
        start = new JMenu("Start");
        mitarbeiterAnzeigen = new JMenuItem("Mitarbeiter anzeigen");
        mitarbeiterHinzufuegen = new JMenuItem("Mitarbeiter hinzufügen");
        start.add(mitarbeiterAnzeigen);
        start.add(mitarbeiterHinzufuegen);
        this.add(start);
    }

    public JMenuItem getMitarbeiterAnzeigen() {
        return mitarbeiterAnzeigen;
    }

    public JMenuItem getMitarbeiterHinzufuegen() {
        return mitarbeiterHinzufuegen;
    }
}
