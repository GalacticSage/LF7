package org.example;

public class Schueler extends Person {
    public Schueler(String vorname, String nachname,int matrikelnummer) {
        super(vorname, nachname, matrikelnummer);
    }

    @Override
    public String toString() {
        String str = "";
        str += getVorname() + " " + getNachname() + " " + getMatrikelnummer();
        return str;
    }
}
