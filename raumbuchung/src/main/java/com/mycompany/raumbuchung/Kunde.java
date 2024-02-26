/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.raumbuchung;

/**
 *
 * @author INF3A_usenj
 */
public class Kunde {

    private String vorname, nachname;

    public Kunde(String Vorname, String Nachname) {
        this.vorname = Vorname;
        this.nachname = Nachname;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname;
    }
}
