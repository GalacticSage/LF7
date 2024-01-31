package org.example.GUI;

import org.example.Klasse;
import org.example.Lehrer;
import org.example.GUI.Klasse.*;
import org.example.GUI.Lehrer.*;
import org.example.GUI.Schueler.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class mFrame extends JFrame implements ActionListener {
    private MenuLeiste menuLeiste = new MenuLeiste();
    private Util util;
    private RemoveKlasse pRemoveKlasse = new RemoveKlasse("Noch nicht verfuegbar");
    private ShowLehrer pShowLehrer = new ShowLehrer();
    private AddLehrer pAddLehrer = new AddLehrer();
    private RemoveLehrer pRemoveLehrer = new RemoveLehrer("Noch nicht verfuegbar");
    private ShowSchueler pShowSchueler = new ShowSchueler();
    private AddSchueler pAddSchueler;
    private RemoveSchueler pRemoveSchueler = new RemoveSchueler("Noch nicht verfuegbar");
    private pGreeter pGreeter = new pGreeter();


    public mFrame(ArrayList<Klasse> klassen, ArrayList<Lehrer> lehrer) {
        this.util = new Util(klassen, lehrer);
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

    private void removeKlasse() {
        add(BorderLayout.CENTER, pRemoveKlasse);
        //pRemoveKlasse.getBtn_remove().addActionListener(this);
        pRemoveKlasse.setVisible(true);
    }

    private void showLehrer() {
        add(BorderLayout.CENTER, pShowLehrer);
        pShowLehrer.getBtn_anzeigen().addActionListener(this);
        pShowLehrer.setVisible(true);
        util.action_Lehrer_btn_anzeigen(pShowLehrer);
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
        util.action_Schueler_btn_anzeigen(pShowSchueler);
    }

    private void addSchueler() {
        pAddSchueler = new AddSchueler(util);
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
            remove(pRemoveKlasse);
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
            removePanels();
            removeKlasse();
            this.repaint();
            this.revalidate();
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