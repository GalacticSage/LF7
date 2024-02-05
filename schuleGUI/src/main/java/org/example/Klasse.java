package org.example;

import java.util.ArrayList;

public class Klasse {
    private String klassenname;
    private Lehrer klassenlehrer;
    private ArrayList<Schueler> schuelerListe = new ArrayList<>();

    public Klasse(String Klassenname, Lehrer Klassenlehrer) {
        this.klassenname = Klassenname;
        this.klassenlehrer = Klassenlehrer;
    }

    public void addSchueler(Schueler schueler) {
        schuelerListe.add(schueler);
    }

    public void removeSchueler(Schueler schueler) {
        schuelerListe.remove(schueler);
    }

    public String getKlassenname() {
        return klassenname;
    }

    public void setKlassenname(String Klassenname) {
        this.klassenname = Klassenname;
    }

    public Lehrer getKlassenlehrer() {
        return klassenlehrer;
    }

    public void setKlassenlehrer(Lehrer Klassenlehrer) {
        this.klassenlehrer = Klassenlehrer;
    }

    public String getSchuelerListe() {
        String str = "";
        for (Schueler schueler : schuelerListe) {
            str += schueler.toString() + "\n";
        }
        return str;
    }

    public Schueler getSchueler(int matrikelnummer) {
        for (Schueler schueler : schuelerListe) {
            if (schueler.getMatrikelnummer() == matrikelnummer) {
                return schueler;
            }
        }
        return null;
    }

    public ArrayList<Schueler> getSchuelerListeArray() {
        return schuelerListe;
    }

    @Override
    public String toString() {
        String str = "";
        str += klassenname + " " + klassenlehrer.getVornameNachname() + "\n";
        str += getSchuelerListe();
        return str;
    }
}