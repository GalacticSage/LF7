package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
    GuiLogic guiLogic;
    MenuLeiste menuLeiste = new MenuLeiste();
    PanelDisplayMitarbeiter panelDisplayMitarbeiter = new PanelDisplayMitarbeiter();
    PanelHinzufuegenMitarbeiter panelHinzufuegenMitarbeiter = new PanelHinzufuegenMitarbeiter();

    public Gui(MitarbeiterListe mListe) {
        this.guiLogic = new GuiLogic(mListe);
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
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelDisplayMitarbeiter.getBtn_displayMitarbeiter()) {
            guiLogic.resetIndex();
            guiLogic.displayMitarbeiter(panelDisplayMitarbeiter);
        } else if (e.getSource() == panelDisplayMitarbeiter.getBtn_next()) {
            guiLogic.nextIndex();
            guiLogic.displayMitarbeiter(panelDisplayMitarbeiter);
        } else if (e.getSource() == panelDisplayMitarbeiter.getBtn_previous()) {
            guiLogic.previousIndex();
            guiLogic.displayMitarbeiter(panelDisplayMitarbeiter);
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

            guiLogic.addMitarbeiter(panelHinzufuegenMitarbeiter);


        }
    }
}