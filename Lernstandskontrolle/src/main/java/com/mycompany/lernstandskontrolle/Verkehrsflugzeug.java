package com.mycompany.lernstandskontrolle;

import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author INF3A_usenj
 */
public class Verkehrsflugzeug extends Flugzeug {

    private int anzahlPasagiere;

    public Verkehrsflugzeug(String hersteller, int anzahlPassagiere, String immatNummer, int maxSpeed) {
        super(hersteller, maxSpeed, 1);
        setImmatNummer(immatNummer);
        this.anzahlPasagiere = anzahlPassagiere;
    }

    ;

    public int getAnzahlPasagiere() {
        return anzahlPasagiere;
    }

    public void setAnzahlPasagiere(int anzahlPasagiere) {
        this.anzahlPasagiere = anzahlPasagiere;
    }

    @Override
    boolean getLooping() {
        return false;
    }

}
