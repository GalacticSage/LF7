/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vererbung;


/**
 * @author INF3A_usenj
 */
// übergerodnete Klasse für beliebiege Untergruppen
public class Person {
    private String vorname, nachname;
    private int alter;

    public Person(String vn, String nn) {
        this.vorname = vn;
        this.nachname = nn;
    }

    public Person(String vn, String nn, int alter) {
        this.vorname = vn;
        this.nachname = nn;
        this.alter = alter;
    }

    public String ganzeNamen() {
        return "Vorname: " + vorname + " Nachname: " + nachname;
    }

    public String alleDaten() {
        return ganzeNamen() + " Alter: " + alter;
    }
}
