/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.raumbuchung;

/**
 *
 * @author INF3A_usenj
 */
public class Raum {

    private int raumnummer, sitzplaetze;

    private boolean gebucht = false;

    private Kunde kunde = null;

    public Raum(int Raumnummer, int Sitzplaetze) {
        this.raumnummer = Raumnummer;
        this.sitzplaetze = Sitzplaetze;
    }

    public int getRaumnummer() {
        return raumnummer;
    }

    public void setRaumnummer(int raumnummer) {
        this.raumnummer = raumnummer;
    }

    public int getSitzplaetze() {
        return sitzplaetze;
    }

    public void setSitzplaetze(int sitzplaetze) {
        this.sitzplaetze = sitzplaetze;
    }

    public boolean getGebucht() {
        return gebucht;
    }

    public void setGebucht(Kunde kunde) {
        this.gebucht = true;
        this.kunde = kunde;
    }

    public void resetGebucht() {
        this.gebucht = false;
        this.kunde = null;
    }

    @Override
    public String toString() {
        String str = "Raumnummer: " + raumnummer + " Sitzplaetze: " + sitzplaetze;
        if (gebucht == true) {
            str += " Gebucht von: " + kunde.toString() + "\n";
        } else {
            str += "\n";
        }

        return str;
    }

}
