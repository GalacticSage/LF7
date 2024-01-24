package org.example;

public class Lehrer extends Person {
    private String fach;

    public Lehrer(String vorname, String nachname,String matrikelnummer, String fach) {
        super(vorname, nachname, matrikelnummer);
        this.fach = fach;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }
}