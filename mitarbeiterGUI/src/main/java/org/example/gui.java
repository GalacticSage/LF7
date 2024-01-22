package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame implements ActionListener {
    MenuLeiste menuLeiste = new MenuLeiste();
    PanelDisplayMitarbeiter panelDisplayMitarbeiter = new PanelDisplayMitarbeiter();
    PanelHinzufuegenMitarbeiter panelHinzufuegenMitarbeiter = new PanelHinzufuegenMitarbeiter();
    private MitarbeiterListe mListe;
    private int index = 0;

    public gui(MitarbeiterListe mListe) {
        this.mListe = mListe;
        this.setTitle("Mitarbeiterliste");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        showMenuLeiste();
        showPanelDisplayMitarbeiter();
        this.setVisible(true);
    }

    public void showMenuLeiste() {
        menuLeiste.getMitarbeiterAnzeigen().addActionListener(this);
        menuLeiste.getMitarbeiterHinzufuegen().addActionListener(this);
        this.add(menuLeiste);
    }

    private void showPanelHinzufuegenMitarbeiter() {
        panelHinzufuegenMitarbeiter.getBtn_hinzufuegen().addActionListener(this);
        this.add(panelHinzufuegenMitarbeiter);
    }

    private void showPanelDisplayMitarbeiter() {
        panelDisplayMitarbeiter.getBtn_displayMitarbeiter().addActionListener(this);
        panelDisplayMitarbeiter.getBtn_next().addActionListener(this);
        panelDisplayMitarbeiter.getBtn_previous().addActionListener(this);
        this.add(panelDisplayMitarbeiter);
    }

    public void showMitarbeiter(int index) {
        String vorname;
        String nachname;

        vorname = mListe.getMitarbeiterAnPosition(index).getVorname();
        nachname = mListe.getMitarbeiterAnPosition(index).getNachname();
        panelDisplayMitarbeiter.setTxt_vorname(vorname);
        panelDisplayMitarbeiter.setTxt_nachname(nachname);
    }

    private void addMitarbeiter(String vorname, String nachname) {
        Mitarbeiter m = new Mitarbeiter(vorname, nachname);
        mListe.hinzufuegenObjektZurListe(m);
    }

    private int indexCheck(int index) {
        if (index < 0) {
            index = mListe.getErsteNichtInitialisiertePositionImArray();
        } else if (index > mListe.getErsteNichtInitialisiertePositionImArray()) {
            index = 0;
        }
        return index;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelDisplayMitarbeiter.getBtn_displayMitarbeiter()) {
            this.index = 0;
            showMitarbeiter(this.index);
        } else if (e.getSource() == panelDisplayMitarbeiter.getBtn_next()) {
            this.index = indexCheck(this.index + 1);
            showMitarbeiter(this.index);
        } else if (e.getSource() == panelDisplayMitarbeiter.getBtn_previous()) {
            this.index = indexCheck(this.index - 1);
            showMitarbeiter(this.index);
        } else if (e.getSource() == menuLeiste.getMitarbeiterAnzeigen()) {
            try {
                this.remove(panelDisplayMitarbeiter);
            } catch (Exception exception) {
                System.out.println("Kein Panel zum entfernen");
            }
            try {
                this.remove(panelHinzufuegenMitarbeiter);
            } catch (Exception exception) {
                System.out.println("Kein Panel zum entfernen");
            }
            this.add(panelDisplayMitarbeiter);
            this.repaint();
            this.revalidate();
        } else if (e.getSource() == menuLeiste.getMitarbeiterHinzufuegen()) {
            try {
                this.remove(panelDisplayMitarbeiter);
            } catch (Exception exception) {
                System.out.println("Kein Panel zum entfernen");
            }
            try {
                this.remove(panelHinzufuegenMitarbeiter);
            } catch (Exception exception) {
                System.out.println("Kein Panel zum entfernen");
            }
            showPanelHinzufuegenMitarbeiter();
            this.repaint();
            this.revalidate();
        } else if (e.getSource() == panelHinzufuegenMitarbeiter.getBtn_hinzufuegen()) {
            String vorname = panelHinzufuegenMitarbeiter.getTxt_vorname();
            String nachname = panelHinzufuegenMitarbeiter.getTxt_nachname();
            addMitarbeiter(vorname, nachname);
            panelHinzufuegenMitarbeiter.setLbl_meldung("Mitarbeiter " + vorname + " " + nachname + " hinzugefügt");
            panelHinzufuegenMitarbeiter.clearTxtFields();
        }
    }
}