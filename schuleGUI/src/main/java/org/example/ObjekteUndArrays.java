package org.example;

import java.util.Scanner;

public class ObjekteUndArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String benutzerEingabe = "";
        boolean proglaeuft = true;

        MitarbeiterListe sekretariatsMitarbeiterListe = new MitarbeiterListe();

        while (proglaeuft) {
            System.out.println("1-Mitarbeiterliste \n2-Mitarbeiter hinzufügen \n3-Logout");
            System.out.println("--------------------------------");
            benutzerEingabe = sc.nextLine();
            switch (benutzerEingabe) {
                case "1":
                    sekretariatsMitarbeiterListe.ausgebenDerMitarbeiterListe();
                    break;
                case "2":
                    Mitarbeiter m = new Mitarbeiter();
                    System.out.println("Eingabe Vorname");
                    m.setVorname(sc.nextLine());
                    System.out.println("Eingabe Nachname");
                    m.setNachname(sc.nextLine());
                    sekretariatsMitarbeiterListe.hinzufügenObjektZurListe(m);
                    break;
                case "3":
                    System.out.println("Programm beendet");
                    proglaeuft = false;
                    break;
                default:
                    System.out.println("Falsche Eingabe");
            }
        }//end while
    }
}
