package org.example.GUI;

import org.example.GUI.Lehrer.pShowLehrer;
import org.example.Klasse;
import org.example.Lehrer;
import org.example.Schueler;

import javax.swing.*;
import java.awt.*;
import org.example.GUI.Lehrer.*;
import org.example.GUI.Schueler.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class mFrame extends JFrame implements ActionListener {
    private menuLeiste menuLeiste = new menuLeiste();
    private Util util;
    private pShowLehrer pShowLehrer = new pShowLehrer();
    private pAddLehrer pAddLehrer = new pAddLehrer();
    private pRemoveLehrer pRemoveLehrer = new pRemoveLehrer("Noch nicht verfuegbar");
    private pShowSchueler pShowSchueler = new pShowSchueler();
    private pAddSchueler pAddSchueler = new pAddSchueler();
    private pRemoveSchueler pRemoveSchueler = new pRemoveSchueler("Noch nicht verfuegbar");
    private pGreeter pGreeter = new pGreeter();


    public mFrame(ArrayList<Klasse> klassen, ArrayList<Lehrer> lehrer, ArrayList<Schueler> schueler) {
        this.util = new Util(klassen, lehrer, schueler);
        setTitle("Schulverwaltung");
        setSize(550, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pGreeter);
        showMenuBar();
        setVisible(true);
    }

    private void showMenuBar() {
        add(BorderLayout.NORTH, menuLeiste);
        menuLeiste.getKlasseAdd().addActionListener(this);
        menuLeiste.getKlasseDelete().addActionListener(this);
        menuLeiste.getKlasseShow().addActionListener(this);
        menuLeiste.getLehrerAdd().addActionListener(this);
        menuLeiste.getLehrerDelete().addActionListener(this);
        menuLeiste.getLehrerShow().addActionListener(this);
        menuLeiste.getSchuelerAdd().addActionListener(this);
        menuLeiste.getSchuelerDelete().addActionListener(this);
        menuLeiste.getSchuelerShow().addActionListener(this);
        menuLeiste.getStartExit().addActionListener(this);
        menuLeiste.setVisible(true);
    }

    private void showLehrer() {
        add(BorderLayout.CENTER, pShowLehrer);
        pShowLehrer.getBtn_anzeigen().addActionListener(this);
        pShowLehrer.setVisible(true);
    }

    private void addLehrer() {
        add(BorderLayout.CENTER, pAddLehrer);
        pAddLehrer.getBtn_add().addActionListener(this);
        pAddLehrer.setVisible(true);
    }

    private void removeLehrer() {
        add(BorderLayout.CENTER, pRemoveLehrer);
        //pRemoveLehrer.getBtn_remove().addActionListener(this);
        pRemoveLehrer.setVisible(true);
    }

    private void showSchueler() {
        add(BorderLayout.CENTER, pShowSchueler);
        pShowSchueler.getBtn_anzeigen().addActionListener(this);
        pShowSchueler.setVisible(true);
    }

    private void addSchueler() {
        add(BorderLayout.CENTER, pAddSchueler);
        pAddSchueler.getBtn_add().addActionListener(this);
        pAddSchueler.setVisible(true);
    }

    private void removeSchueler() {
        add(BorderLayout.CENTER, pRemoveSchueler);
        //pRemoveSchueler.getBtn_remove().addActionListener(this);
        pRemoveSchueler.setVisible(true);
    }

    private void removePanels() {
        try {
            remove(pGreeter);
            remove(pShowLehrer);
            remove(pAddLehrer);
            remove(pRemoveLehrer);
            remove(pShowSchueler);
            remove(pAddSchueler);
            remove(pRemoveSchueler);
        } catch (Exception e) {
            System.out.println("Keine Panels zum entfernen");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuLeiste.getStartExit()) {
            System.exit(0);
        }
        if (e.getSource() == menuLeiste.getKlasseShow()) {
            System.out.println("Klasse anzeigen");
        }
        if (e.getSource() == menuLeiste.getKlasseAdd()) {
            System.out.println("Klasse hinzufuegen");
        }
        if (e.getSource() == menuLeiste.getKlasseDelete()) {
            System.out.println("Klasse loeschen");
        }
        if (e.getSource() == menuLeiste.getLehrerShow()) {
            removePanels();
            showLehrer();
            this.repaint();
            this.revalidate();
        }
        if (e.getSource() == menuLeiste.getLehrerAdd()) {
            removePanels();
            addLehrer();
            this.repaint();
            this.revalidate();
        }
        if (e.getSource() == menuLeiste.getLehrerDelete()) {
            removePanels();
            removeLehrer();
            this.repaint();
            this.revalidate();
        }
        if (e.getSource() == menuLeiste.getSchuelerShow()) {
            removePanels();
            showSchueler();
            this.repaint();
            this.revalidate();
        }
        if (e.getSource() == menuLeiste.getSchuelerAdd()) {
            removePanels();
            addSchueler();
            this.repaint();
            this.revalidate();
        }
        if (e.getSource() == menuLeiste.getSchuelerDelete()) {
            removePanels();
            removeSchueler();
            this.repaint();
            this.revalidate();
        }
        if (e.getSource() == pShowLehrer.getBtn_anzeigen()) {
            util.action_Lehrer_btn_anzeigen(pShowLehrer);
        }
        if (e.getSource() == pAddLehrer.getBtn_add()) {
            util.action_Lehrer_btn_add(pAddLehrer);
        }
        if (e.getSource() == pShowSchueler.getBtn_anzeigen()) {
            util.action_Schueler_btn_anzeigen(pShowSchueler);
        }
        if (e.getSource() == pAddSchueler.getBtn_add()) {
            util.action_Schueler_btn_add(pAddSchueler);
        }
    }
}