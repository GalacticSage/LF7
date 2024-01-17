/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.util.Arrays;

/**
 *
 * @author INF3A_usenj
 */
public class MitarbeiterListe {

    private int n = 2;
    Mitarbeiter[] mitarbeiterListe = new Mitarbeiter[n];
    private int ersteNichtInitialisiertePositionImArray = -1;

    public MitarbeiterListe() {
    }

    public void findenInitialisierterUndNichtInitialisierterPositionen() {
        for (int i = 0; i <= mitarbeiterListe.length - 1; i++) {
            if (mitarbeiterListe[i] != null) {
                System.out.println("Indexposition " + i + " enthält ein Objekt - not null");
            } else {
                System.out.println("Indexposition " + i + " enthält kein Objekt - null");
            }
        }
    }//end of findenInitialisierterUndNichtInitialisierterPositionen()

    //finden der ersten nicht intialisierten Position im Array um ein neues Objekt einzufügen
    public void findenDerErstenNichtInitialisiertenPositon() {
        for (int i = 0; i <= mitarbeiterListe.length - 1; i++) {
            if (mitarbeiterListe[i] == null) {
                ersteNichtInitialisiertePositionImArray++;
                break;
            }
        }
    }

    //Alle Objekte in einer MitarbeiterListe ausgeben
    public void ausgebenDerMitarbeiterListe() {
        for (int i = 0; i <= mitarbeiterListe.length - 1; i++) {
            if (mitarbeiterListe[i] != null) {
                System.out.println(mitarbeiterListe[i].toString());
            }
        }
    }//end of ausgebenDerMitarbeiterListe();

    //Überprüfen ob ein Array vollständig gefüllt ist, verhindert, dass weitere Objekte in ein volles Array eingefügt wird
    public boolean überprüfenAufFreienSpeicherPlatz() {
        if (mitarbeiterListe[n - 1] != null) {
            return false;
        } else {
            return true;
        }
    }

    //Mitarbeiter einer Liste hinzufügen
    public void hinzufügenObjektZurListe(Mitarbeiter m) {
        if (überprüfenAufFreienSpeicherPlatz() == true) {
            findenDerErstenNichtInitialisiertenPositon();
            mitarbeiterListe[ersteNichtInitialisiertePositionImArray] = m;
        } else {
            verdoppleArraySpeicherPlätze();
            findenDerErstenNichtInitialisiertenPositon();
            mitarbeiterListe[ersteNichtInitialisiertePositionImArray] = m;
        }
    }

    public void verdoppleArraySpeicherPlätze() {
        n = n * 2;
        Mitarbeiter[] tempMitarbeiterliste = Arrays.copyOf(mitarbeiterListe, n);
        mitarbeiterListe = tempMitarbeiterliste;
    }
}//end class