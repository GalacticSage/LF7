package org.example;

public class Lehrer extends Person {
    private String fach;

    public Lehrer(String vorname, String nachname,int matrikelnummer, String fach) {
        super(vorname, nachname, matrikelnummer);
        this.fach = fach;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public String getVornameNachname() {
        return getVorname() + " " + getNachname();
    }

    @Override
    public String toString() {
        String str = "";
        str += getMatrikelnummer() + " " + getVorname() + " " + getNachname() + " " + " " + getFach();
        return str;
    }
}