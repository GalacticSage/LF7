package org.example.GUI;

import org.example.GUI.Lehrer.pShowLehrer;
import org.example.Klasse;
import org.example.Lehrer;
import org.example.Schueler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class mFrame extends JFrame implements ActionListener {
    private menuLeiste menuLeiste = new menuLeiste();
    private org.example.GUI.Lehrer.pShowLehrer pShowLehrer = new pShowLehrer();
    private pGreeter pGreeter = new pGreeter();

    private ArrayList<Klasse> klassen;
    private ArrayList<Lehrer> lehrer;
    private ArrayList<Schueler> schueler;

    public mFrame(ArrayList<Klasse> klassen, ArrayList<Lehrer> lehrer, ArrayList<Schueler> schueler) {
        this.klassen = klassen;
        this.lehrer = lehrer;
        this.schueler = schueler;
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

    private void removePanels() {
        try {
            remove(pGreeter);
            remove(pShowLehrer);
        } catch (Exception e) {
            System.out.println("Keine Panels zum entfernen");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuLeiste.getStartExit()){
            System.exit(0);
        }
        if (e.getSource() == menuLeiste.getKlasseShow()){
            System.out.println("Klasse anzeigen");
        }
        if (e.getSource() == menuLeiste.getKlasseAdd()){
            System.out.println("Klasse hinzufuegen");
        }
        if (e.getSource() == menuLeiste.getKlasseDelete()){
            System.out.println("Klasse loeschen");
        }
        if (e.getSource() == menuLeiste.getLehrerShow()){
            removePanels();
            showLehrer();
            this.repaint();
            this.revalidate();
        }
        if (e.getSource() == menuLeiste.getLehrerAdd()){
            System.out.println("Lehrer hinzufuegen");
        }
        if (e.getSource() == menuLeiste.getLehrerDelete()){
            System.out.println("Lehrer loeschen");
        }
        if (e.getSource() == menuLeiste.getSchuelerShow()){
            System.out.println("Schueler anzeigen");
        }
        if (e.getSource() == menuLeiste.getSchuelerAdd()){
            System.out.println("Schueler hinzufuegen");
        }
        if (e.getSource() == menuLeiste.getSchuelerDelete()){
            System.out.println("Schueler loeschen");
        }
        if (e.getSource() == pShowLehrer.getBtn_anzeigen()){
            String str = "";
            for (Lehrer lehrer : lehrer) {
                str += lehrer.toString() + "\n";
            }
            pShowLehrer.setTextArea(str);
        }
    }
}
