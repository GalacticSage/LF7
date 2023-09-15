/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schule;

/**
 *
 * @author INF3A_usenj
 */
public class Lehrer {

    String vorname;
    String nachname;
    String klasse;

    public Lehrer() {
    }

    public Lehrer(String vorname, String nachname, String klasse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.klasse = klasse;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

}
