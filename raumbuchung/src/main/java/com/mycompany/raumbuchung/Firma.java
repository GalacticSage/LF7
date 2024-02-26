/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.raumbuchung;

/**
 *
 * @author INF3A_usenj
 */
public class Firma {

    private String name, adresse;
    private Raum[] raumliste = new Raum[100];

    public Firma(String Name, String Adresse) {
        this.name = Name;
        this.adresse = Adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Raum[] getRaumliste() {
        return raumliste;
    }

    public void setRaumliste(Raum[] raumliste) {
        this.raumliste = raumliste;
    }

    public void addRaum(int Raumnummer, int Sitzplaetze) {
        Raum raum = new Raum(Raumnummer, Sitzplaetze);
        raumliste[Raumnummer] = raum;
    }

    public Raum getRaum(int Raumnummer) {
        return raumliste[Raumnummer];
    }

    public int freieRaume() {
        int nr = 0;
        for (int i = 0; i < raumliste.length; i++) {
            if (raumliste[i] != null && raumliste[i].getGebucht() != true) {
                nr++;
            }
        }
        return nr;
    }

    public String sucheRaum(int Sitzplaetze) {
        String str = "";
        for (int i = 0; i < raumliste.length; i++) {
            if (raumliste[i] != null && raumliste[i].getSitzplaetze() >= Sitzplaetze && raumliste[i].getGebucht() != true) {
                str += raumliste[i].toString();
            }
        }

        if (str == "") {
            return "Kein Raum verfuegbar";
        }
        return "Verfuegbare Raume:\n" + str;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < raumliste.length; i++) {
            if (raumliste[i] != null) {
                str += raumliste[i].toString();
            }
        }
        return str;
    }

}
