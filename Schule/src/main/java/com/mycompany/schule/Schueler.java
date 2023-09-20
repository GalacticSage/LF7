/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schule;

import java.util.Scanner;

/**
 *
 * @author INF3A_usenj
 */
public class Schueler {

    private String vorname;
    private String nachname;
    private String klasse;
    // Schlüssel final variable ist unveränderbar
    private final String KonsolenTextVorname = "Gebe bitte den Vornamen ein: ";
    private final String KonsolenTextNachname = "Gebe bitte den Nachnamen ein: ";
    Lehrer lehrer;
    Scanner sc;

    // Standartkonstruktor
    public Schueler() {
    }

    public Schueler(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Schueler(String vorname, String nachname, String klase) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.klasse = klasse;
    }

    public Schueler(String vorname, String nachname, Lehrer lehrer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.lehrer = lehrer;
    }

    public String konsolenAusgabenVorname(){
        return KonsolenTextVorname;
    }
    
    public String einlesenSchuelerDaten(){
        return konsolenAusgabenVorname() + " " + konsolenAusgabenNachname();
    }
    
    public String konsolenAusgabenNachname(){
        return KonsolenTextNachname;
    }
    
    public void setKlasse() {
        this.klasse = lehrer.getKlasse();
    }

    public void setKlasse(Lehrer lehrer) {
        this.klasse = lehrer.getKlasse();
    }

//    public Schueler(String vorname, String nachname){
//        this.vorname = vorname;
//        this.nachname = nachname;
//        this.klasse = useScanner("Gebe die Klasse ein: ");
//    }
    @Override
    public String toString() {
        return vorname + " " + nachname + " " + klasse;
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
