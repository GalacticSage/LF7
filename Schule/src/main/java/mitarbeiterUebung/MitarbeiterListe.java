/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitarbeiterUebung;

import java.util.Scanner;

/**
 *
 * @author INF3A_usenj
 */
public class MitarbeiterListe {

    private int n = 2;
    private int ersteNichtInitalisiertePosition = -1;
    Mitarbeiter[] mitarbeiterListe = new Mitarbeiter[n];
    Scanner sc = new Scanner(System.in);

    public void findenInitialisierterUndNichtInitialisierterPositionen() {
        for (int i = 0; i < mitarbeiterListe.length - 1; i++) {
            if (mitarbeiterListe[i] != null) {
                System.out.println("Indexposition " + i + " enthält ein Objekt - not null");
            } else {
                System.out.println("Indexposition " + i + " enthält kein Objekt - null");
            } 
        }
    } // end of findenInitialisierterUndNichtinitialisierterPositionen
    
    public int findenDerErstenNichtIniialiesiertenPosition(){
        return 0;
    }
}
