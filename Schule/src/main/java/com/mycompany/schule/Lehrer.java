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
public class Lehrer {
    
    private String vorname;
    private String nachname;
    private String klasse;
    private final String konsolentextvorname = "Gib den Vornamen ein: ";
    private final String konsolentextnachname = "Gib den Nachnamen ein: ";
    
    public static int objektZähler=0;
    //Schlüsselwort static: keine Bindung an ein Objekt
    
    public Lehrer(){}
    
    public Lehrer(String vorname, String nachname, String klasse){
        
        objektZähler++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.klasse = klasse;
    
    }
    
    public String konsolenausgabevorname(){
        return konsolentextvorname;
    }
    
    public String konsolenausgabenachname(){
        return konsolentextnachname;
    }
    
    public String einlesenschuelerdaten(){
        return konsolenausgabevorname() + " " + konsolenausgabenachname();
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
    
    public String display(){
        
         return vorname + " " + nachname + " " + objektZähler;
        
    }
    
}
