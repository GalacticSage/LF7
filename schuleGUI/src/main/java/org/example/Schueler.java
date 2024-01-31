package org.example;

public class Schueler extends Person {
    Klasse klasse;
    public Schueler(String vorname, String nachname,int matrikelnummer, Klasse klasse) {
        super(vorname, nachname, matrikelnummer);
        this.klasse = klasse;
        klasse.addSchueler(this);
    }

    @Override
    public String toString() {
        String str = "";
        str += getMatrikelnummer() + " " + getVorname() + " " + getNachname() + " " + klasse.getKlassenname();
        return str;
    }
}