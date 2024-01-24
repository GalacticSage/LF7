package org.example;

import java.util.ArrayList;

public class Klasse {
    private String Klassenname;
    private Lehrer Klassenlehrer;
    private ArrayList<Schueler> schuelerListe = new ArrayList<>();

    public Klasse(String Klassenname, Lehrer Klassenlehrer) {
        this.Klassenname = Klassenname;
        this.Klassenlehrer = Klassenlehrer;
    }

    public void addSchueler(Schueler schueler) {
        schuelerListe.add(schueler);
    }

    public void removeSchueler(Schueler schueler) {
        schuelerListe.remove(schueler);
    }

    public String getKlassenname() {
        return Klassenname;
    }

    public void setKlassenname(String Klassenname) {
        this.Klassenname = Klassenname;
    }

    public Lehrer getKlassenlehrer() {
        return Klassenlehrer;
    }

    public void setKlassenlehrer(Lehrer Klassenlehrer) {
        this.Klassenlehrer = Klassenlehrer;
    }

    public String getSchuelerListe() {
        String str = "";
        for (Schueler schueler : schuelerListe) {
            str += schueler.toString() + "\n";
        }
        return str;
    }

    @Override
    public String toString() {
        String str = "";
        str += "Klasse: " + Klassenname + "\nKlassenlehrer: " + Klassenlehrer.getVorname() + " " + Klassenlehrer.getNachname() + "\nSchueler:\nVorname | Nachname | Matrikelnummer \n";
        str += getSchuelerListe();
        return str;
    }
}