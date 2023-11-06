package com.mycompany.vererbung;

public class Schueler extends Person{
    private int schuelerNummer, maturaJahr;
    private String klasse;

    public Schueler(int schuelerNummer, String klasse, String vn, String nn, int alter, int maturaJahr) {
        super(vn, nn, alter);
        this.schuelerNummer = schuelerNummer;
        this.klasse = klasse;
        this.maturaJahr = maturaJahr;
    }

    public String nameSchuelerNummer() {
        return ganzeNamen() + " " + schuelerNummer;
    }

    public String alleDatenSchueler() {
        return alleDaten() + " " + schuelerNummer + " " + klasse + " " + maturaJahr;
    }
}
