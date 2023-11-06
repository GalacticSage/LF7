package com.mycompany.vererbung;

public class Lehrer extends Person{
    private int lehrerNummer;
    private String fach;

    public Lehrer(int lehrerNummer, String fach, String vn, String nn, int alter) {
        super(vn, nn, alter);
        this.lehrerNummer = lehrerNummer;
        this.fach = fach;
    }

    public String nameLehrerNummer() {
        return ganzeNamen() + " " + lehrerNummer;
    }

    public String alleDatenLehrer() {
        return alleDaten() + " " + lehrerNummer + " " + fach;
    }
}
