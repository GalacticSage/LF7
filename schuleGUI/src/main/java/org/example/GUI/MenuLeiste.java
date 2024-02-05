package org.example.GUI;

import javax.swing.*;

public class MenuLeiste extends JMenuBar {
    private JMenu startMenu, klasseMenu, lehrerMenu, schuelerMenu;
    private JMenuItem startExit, klasseAdd, klasseDelete, klasseShow, lehrerAdd, lehrerDelete, lehrerShow, schuelerAdd, schuelerDelete, schuelerShow;

    public MenuLeiste() {
        setBounds(0, 0, 550, 100);
        startMenu = new JMenu("Start");
        klasseMenu = new JMenu("Klasse");
        lehrerMenu = new JMenu("Lehrer");
        schuelerMenu = new JMenu("Schueler");

        startExit = new JMenuItem("Exit");
        klasseShow = new JMenuItem("Anzeigen");
        klasseAdd = new JMenuItem("Hinzufuegen");
        klasseDelete = new JMenuItem("Loeschen");
        lehrerShow = new JMenuItem("Anzeigen");
        lehrerAdd = new JMenuItem("Hinzufuegen");
        lehrerDelete = new JMenuItem("Loeschen");
        schuelerShow = new JMenuItem("Anzeigen");
        schuelerAdd = new JMenuItem("Hinzufuegen");
        schuelerDelete = new JMenuItem("Loeschen");

        startMenu.add(startExit);
        klasseMenu.add(klasseShow);
        klasseMenu.add(klasseAdd);
        //klasseMenu.add(klasseDelete);
        lehrerMenu.add(lehrerShow);
        lehrerMenu.add(lehrerAdd);
        //lehrerMenu.add(lehrerDelete);
        schuelerMenu.add(schuelerShow);
        schuelerMenu.add(schuelerAdd);
        //schuelerMenu.add(schuelerDelete);

        add(startMenu);
        add(klasseMenu);
        add(lehrerMenu);
        add(schuelerMenu);
    }

    public JMenuItem getKlasseAdd() {
        return klasseAdd;
    }

    public JMenuItem getKlasseDelete() {
        return klasseDelete;
    }

    public JMenuItem getKlasseShow() {
        return klasseShow;
    }

    public JMenuItem getLehrerAdd() {
        return lehrerAdd;
    }

    public JMenuItem getLehrerDelete() {
        return lehrerDelete;
    }

    public JMenuItem getLehrerShow() {
        return lehrerShow;
    }

    public JMenuItem getSchuelerAdd() {
        return schuelerAdd;
    }

    public JMenuItem getSchuelerDelete() {
        return schuelerDelete;
    }

    public JMenuItem getSchuelerShow() {
        return schuelerShow;
    }

    public JMenuItem getStartExit() {
        return startExit;
    }
}
