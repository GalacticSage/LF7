package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame implements ActionListener {
    JPanel hinzufuegenMitarbeiterPanel;
    JMenuBar menuBar;
    JMenu start;
    JMenuItem mitarbeiterAnzeigen, mitarbeiterHinzufuegen;
    JButton btn_hinzufuegen;
    JLabel lbl_vorname, lbl_nachname, lbl_meldung;
    JTextField txt_vorname, txt_nachname;
    private MitarbeiterListe mListe;
    private int index = 0;

    public gui(MitarbeiterListe mListe) {
        this.mListe = mListe;
        this.setTitle("Mitarbeiterliste");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 500, 20);
        start = new JMenu("Start");
        mitarbeiterAnzeigen = new JMenuItem("Mitarbeiter anzeigen");
        mitarbeiterAnzeigen.addActionListener(this);
        mitarbeiterHinzufuegen = new JMenuItem("Mitarbeiter hinzufügen");
        mitarbeiterHinzufuegen.addActionListener(this);
        start.add(mitarbeiterAnzeigen);
        start.add(mitarbeiterHinzufuegen);
        menuBar.add(start);
        this.add(menuBar);
        showMitarbeiterPanel();
        this.setVisible(true);
    }

    public void showMitarbeiterPanel() {
        this.add(showMitarbeiterPanel);
        showMitarbeiterPanel.getBtn_showMitarbeiter().addActionListener(this);
        showMitarbeiterPanel.getBtn_next().addActionListener(this);
        showMitarbeiterPanel.getBtn_previous().addActionListener(this);
    }

    private void hinzufuegenMitarbeiterPanel() {
        hinzufuegenMitarbeiterPanel = new JPanel();
        hinzufuegenMitarbeiterPanel.setLayout(null);

        lbl_vorname = new JLabel("Vorname:");
        lbl_vorname.setBounds(10, 20, 80, 25);
        hinzufuegenMitarbeiterPanel.add(lbl_vorname);

        txt_vorname = new JTextField();
        txt_vorname.setBounds(100, 20, 165, 25);
        hinzufuegenMitarbeiterPanel.add(txt_vorname);

        lbl_nachname = new JLabel("Nachname:");
        lbl_nachname.setBounds(10, 50, 80, 25);
        hinzufuegenMitarbeiterPanel.add(lbl_nachname);

        txt_nachname = new JTextField();
        txt_nachname.setBounds(100, 50, 165, 25);
        hinzufuegenMitarbeiterPanel.add(txt_nachname);

        lbl_meldung = new JLabel("");
        lbl_meldung.setBounds(10, 80, 400, 25);
        hinzufuegenMitarbeiterPanel.add(lbl_meldung);

        btn_hinzufuegen = new JButton("Mitarbeiter hinzufügen");
        btn_hinzufuegen.setBounds(10, 110, 165, 25);
        btn_hinzufuegen.addActionListener(this);
        hinzufuegenMitarbeiterPanel.add(btn_hinzufuegen);

        this.add(hinzufuegenMitarbeiterPanel);
    }

    public void showMitarbeiter(int index) {
        String vorname;
        String nachname;

        vorname = mListe.getMitarbeiterAnPosition(index).getVorname();
        nachname = mListe.getMitarbeiterAnPosition(index).getNachname();
        txt_vorname.setText(vorname);
        txt_nachname.setText(nachname);
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
        if (e.getSource() == showMitarbeiterPanel.getBtn_showMitarbeiter()) {
            this.index = 0;
            showMitarbeiter(this.index);
        } else if (e.getSource() == showMitarbeiterPanel.getBtn_next()) {
            this.index = indexCheck(this.index + 1);
            showMitarbeiter(this.index);
        } else if (e.getSource() == showMitarbeiterPanel.getBtn_previous()) {
            this.index = indexCheck(this.index - 1);
            showMitarbeiter(this.index);
        } else if (e.getSource() == mitarbeiterAnzeigen) {
            try {
                this.remove(showMitarbeiterPanel);
            } catch (Exception exception) {
                System.out.println("Kein Panel zum entfernen");
            }
            try {
                this.remove(hinzufuegenMitarbeiterPanel);
            } catch (Exception exception) {
                System.out.println("Kein Panel zum entfernen");
            }
            this.add(showMitarbeiterPanel);
            this.repaint();
            this.revalidate();
        } else if (e.getSource() == mitarbeiterHinzufuegen) {
            try {
                this.remove(showMitarbeiterPanel);
            } catch (Exception exception) {
                System.out.println("Kein Panel zum entfernen");
            }
            try {
                this.remove(hinzufuegenMitarbeiterPanel);
            } catch (Exception exception) {
                System.out.println("Kein Panel zum entfernen");
            }
            hinzufuegenMitarbeiterPanel();
            this.repaint();
            this.revalidate();
        } else if (e.getSource() == btn_hinzufuegen) {
            addMitarbeiter(txt_vorname.getText(), txt_nachname.getText());
            lbl_meldung.setText("Mitarbeiter "+ txt_vorname.getText() + " " + txt_nachname.getText() +" hinzugefügt");
            txt_vorname.setText("");
            txt_nachname.setText("");
        }
    }
}