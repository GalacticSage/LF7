/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vererbung;

/**
 * @author INF3A_usenj
 */
public class Mitarbeiter extends Person {
    private int matrikelNummer;

    public Mitarbeiter(int matrikelNummer, String vn, String nn, int alter) {
        super(vn, nn, alter);
        this.matrikelNummer = matrikelNummer;
    }

    public String nameMatrikelnummer() {
        return ganzeNamen() + " " + matrikelNummer;
    }

    public String alleDatenMitarbeiter() {
        return alleDaten() + " " + matrikelNummer;
    }
}