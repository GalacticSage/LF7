/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raumbuchung;


/**
 *
 * @author INF3A_usenj
 */
public class Raumbuchung {

    public static void main(String[] args) {
        Firma firma1 = new Firma("Musterfirma", "Musteradresse");
        firma1.addRaum(1, 10);
        firma1.addRaum(2, 10);
        Kunde kunde1 = new Kunde("Max", "Mustermann");
        firma1.getRaum(2).setGebucht(kunde1);
        System.out.println(firma1.sucheRaum(5));
        Gui gui = new Gui();
    }
}
