/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package einfacheArrays;

import java.util.Random;

/**
 *
 * @author INF3A_usenj
 */
public class Glaskugel {

    Random zufallsgenerator = new Random();

    private int[] lottoListe = new int[6];

    public Glaskugel() {
    }

    public void lottozahlenErzeugen(int min, int max) {
        int temp_i;
        boolean wiederholung = true;
        for (int i = 0; i < lottoListe.length; i++) {
            temp_i = i - 1;
            while (wiederholung) {   
                int zufallszahl = this.zufallsgenerator.nextInt(max - min + 1) + min;
                if (i == 0){
                    wiederholung = false;
                    lottoListe[i] = zufallszahl;
                } else if (zufallszahl != lottoListe[temp_i])
                   wiederholung = false;
                    lottoListe[i] = zufallszahl; 
                }
                
            
        }
    }

    public void lottzahlenAusgeben() {
        int ausgabe_i;
        for (int i = 0; i < lottoListe.length; i++) {
            ausgabe_i = i + 1;
            System.out.println("Lottozahl " + ausgabe_i + ": " + this.lottoListe[i]);
        }
    }
}
