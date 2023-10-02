/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.schule;

import java.util.Scanner;

/**
 *
 * @author INF3A_usenj
 */
public class Schule {

    public static void main(String[] args) {

        int ersteNichtInitalisiertePosition = 0;

        Scanner sc = new Scanner(System.in);

        Schueler s1 = new Schueler();

        String lehrervorname = "Alexander";

        String lehrernachname = "Raffl";

        String lehrerklasse = "INF3A";

        String schuelervorname = "Thomas";

        String schuelernachname = "The Tank";

        Lehrer Lehrer1 = new Lehrer(lehrervorname, lehrernachname, lehrerklasse);

        Schueler Schueler1 = new Schueler(schuelervorname, schuelernachname, Lehrer1);

        Schueler[] schuelerArray = new Schueler[10];
        schuelerArray[2] = Schueler1;

        schuelerArray[0] = new Schueler("Johann", "Senoner");
        System.out.println(schuelerArray[0].display());

        schuelerArray[1] = s1;
        schuelerArray[1].setVorname("Martin");
        schuelerArray[1].setNachname("Mair");
        System.out.println(schuelerArray[1].display());

        //finden aller initialisierten und nicht initalisierten Positionen im Array
        for (int i = 0; i <= schuelerArray.length - 1; i++) {
            if (schuelerArray[i] != null) {
                System.out.println("Not Null");
            } else {
                System.out.println("null");
            }
        }

        // finden der ersten nicht initalisierten Position im Array
        for (int i = 0; i <= schuelerArray.length - 1; i++) {
            if (schuelerArray[i] == null) {
                ersteNichtInitalisiertePosition = i;
                System.out.println("Erste freie Position: " + ersteNichtInitalisiertePosition);
            }
        }

        // Ausgabe aller Schüler
        for (int i = 0; i <= schuelerArray.length - 1; i++) {
            if (schuelerArray[i] != null) {
                System.out.println(schuelerArray[i].toString());
            }
        }

        //Switch Auswahlverfahren - Menü
        System.out.println("1-Schüleranzeigen \n2-Schüler hinzufügen \n3-Programm beenden");
        boolean progLaeuft = true;
        while (progLaeuft) {
            int benutzerWahl = sc.nextInt();
            switch (benutzerWahl) {
                case 1:
                    System.out.println("Schülerliste");
                    for (int i = 0; i <= schuelerArray.length - 1; i++) {
                        if (schuelerArray[i] != null) {
                            System.out.println(schuelerArray[i].toString());
                        }
                    }       
                    break;
                case 2:
                    System.out.println("Vorname :");
                    String vorname = sc.next();
                    sc.nextLine();
                    System.out.println("Nachname :");
                    String nachname = sc.nextLine();
                    schuelerArray[ersteNichtInitalisiertePosition] = new Schueler(vorname, nachname);
                    System.out.println("Schüler hinzugefügt");
                    break;
                case 3:
                    System.out.println("Programm beendet");
                    progLaeuft = false;
                    break;
                default:
                    System.out.println("Programm beendet");
            }
        }
    }
}
