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
    private RemoveKlasse RemoveKlasse = new RemoveKlasse("Noch nicht verfuegbar");
    private AddKlasse AddKlasse = new AddKlasse();
    private ShowLehrer ShowLehrer = new ShowLehrer();
    private AddLehrer AddLehrer = new AddLehrer();
    private RemoveLehrer RemoveLehrer = new RemoveLehrer("Noch nicht verfuegbar");
    private ShowSchueler ShowSchueler = new ShowSchueler();
    private AddSchueler AddSchueler = new AddSchueler();
    private RemoveSchueler RemoveSchueler = new RemoveSchueler("Noch nicht verfuegbar");
    private pGreeter Greeter = new pGreeter();


    public mFrame(ArrayList<Klasse> klassen, ArrayList<Lehrer> lehrer) {
        this.util = new Util(klassen, lehrer);
        setTitle("Schulverwaltung");
        setSize(550, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(Greeter);
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

    private void AddKlasse(){
        add(BorderLayout.CENTER, AddKlasse);
        AddKlasse.updateLehrerListe(util.getLehrer());
        AddKlasse.getBtn_add().addActionListener(this);
        AddKlasse.setVisible(true);
    }

    private void removeKlasse() {
        add(BorderLayout.CENTER, RemoveKlasse);
        //pRemoveKlasse.getBtn_remove().addActionListener(this);
        RemoveKlasse.setVisible(true);
    }

    private void showLehrer() {
        add(BorderLayout.CENTER, ShowLehrer);
        ShowLehrer.getBtn_anzeigen().addActionListener(this);
        ShowLehrer.setVisible(true);
        util.action_Lehrer_btn_anzeigen(ShowLehrer);
    }

    private void addLehrer() {
        add(BorderLayout.CENTER, AddLehrer);
        AddLehrer.getBtn_add().addActionListener(this);
        AddLehrer.setVisible(true);
    }

    private void removeLehrer() {
        add(BorderLayout.CENTER, RemoveLehrer);
        //pRemoveLehrer.getBtn_remove().addActionListener(this);
        RemoveLehrer.setVisible(true);
    }

    private void showSchueler() {
        add(BorderLayout.CENTER, ShowSchueler);
        ShowSchueler.getBtn_anzeigen().addActionListener(this);
        ShowSchueler.setVisible(true);
        util.action_Schueler_btn_anzeigen(ShowSchueler);
    }

    private void addSchueler() {
        AddSchueler.updateKlassenCombobox(util);
        add(BorderLayout.CENTER, AddSchueler);
        AddSchueler.getBtn_add().addActionListener(this);
        AddSchueler.setVisible(true);
    }

    private void removeSchueler() {
        add(BorderLayout.CENTER, RemoveSchueler);
        //pRemoveSchueler.getBtn_remove().addActionListener(this);
        RemoveSchueler.setVisible(true);
    }

    private void removePanels() {
        try {
            remove(Greeter);
            remove(ShowLehrer);
            remove(AddLehrer);
            remove(RemoveLehrer);
            remove(ShowSchueler);
            remove(AddSchueler);
            remove(RemoveSchueler);
            remove(RemoveKlasse);
            remove(AddKlasse);
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
            removePanels();
            AddKlasse();
            this.repaint();
            this.revalidate();
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
        if (e.getSource() == ShowLehrer.getBtn_anzeigen()) {
            util.action_Lehrer_btn_anzeigen(ShowLehrer);
        }
        if (e.getSource() == AddLehrer.getBtn_add()) {
            util.action_Lehrer_btn_add(AddLehrer);
        }
        if (e.getSource() == ShowSchueler.getBtn_anzeigen()) {
            util.action_Schueler_btn_anzeigen(ShowSchueler);
        }
        if (e.getSource() == AddSchueler.getBtn_add()) {
            util.action_Schueler_btn_add(AddSchueler);
        }
        if (e.getSource() == AddKlasse.getBtn_add()) {
            util.action_Klasse_btn_add(AddKlasse);
        }
    }
}