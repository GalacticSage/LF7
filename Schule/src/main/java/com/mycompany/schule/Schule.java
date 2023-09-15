/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.schule;
//import java.util.Scanner;


/**
 *
 * @author INF3A_usenj
 */
public class Schule {

    public static void main(String[] args) {
        /*System.out.println("Enter something: ");
        
        Scanner sc = new Scanner(System.in);
        String note = sc.nextLine();
        System.out.println("Print scanned content: " + note);
         */
//        String nachname = "Priet";
//        
//        Schueler s1 = new Schueler();
//        s1.vorname = "Johann";
//        s1.nachname = "Senoner";
//        s1.klasse = "INF3A";
//        
//        Schueler s2 = new Schueler("Hannes", nachname);
//        
//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
        String askVN, askNN, askK;
        askVN = "Gebe deinen Vornamen ein: ";
        askNN = "Gebe deinen Nachnamen ein: ";
        askK = "Gebe deinen Klasse ein: ";

        func func = new func();
        
        System.out.println("Gebe die Daten von s1 ein!!!");
        Schueler s1 = new Schueler(func.useScanner(askVN), func.useScanner(askNN));
        
        
        System.out.println("Gebe die Daten von l1 ein!!!");
        Lehrer l1 = new Lehrer(func.useScanner(askVN), func.useScanner(askNN), func.useScanner(askK));
        s1.setKlasse(l1);
        System.out.println(s1.toString());

        System.out.println("Gebe die Daten von l2 ein!!!");
        Lehrer l2 = new Lehrer(func.useScanner(askVN), func.useScanner(askNN), func.useScanner(askK));
        
        System.out.println("Gebe die Daten von s2 ein!!!");
        Schueler s2 = new Schueler(func.useScanner(askVN), func.useScanner(askNN), l2);
        s2.setKlasse();
        System.out.println(s2.toString());
    }
}
