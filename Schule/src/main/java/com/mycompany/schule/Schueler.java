/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schule;

/**
 *
 * @author INF3A_usenj
 */
public class Schueler {
    
    String vorname;
    String nachname;
    String klasse;
    Lehrer lehrer;
    public static int objektZähler=0;
    
    //Defaultkonstruktor
    public Schueler(){}

    public Schueler(String vorname, String nachname, String klasse){
    
        this.vorname = vorname;
        this.nachname = nachname;
        this.klasse = klasse;
    
    }
    
    public Schueler(String vorname, String nachname, Lehrer lehrer){
        
        this.vorname = vorname;
        this.nachname = nachname;
        this.lehrer = lehrer;
        this.klasse = lehrer.getKlasse();
        
    }
    
    public Schueler(String vorname, String nachname){
        
        objektZähler++;
        this.vorname = vorname;
        this.nachname = nachname;
    
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
    
        @Override
    public String toString(){
        
        return vorname + " " + nachname + " " + klasse;
        
    }
    
    public String display(){
        
        return vorname + " " + nachname + " " + objektZähler;
        
    }
}
