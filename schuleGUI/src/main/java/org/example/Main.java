package org.example;

import org.example.GUI.mFrame;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Klasse> klassenListe = new ArrayList<>();
        ArrayList<Lehrer> lehrerListe = new ArrayList<>();

        Lehrer lehrer1 = new Lehrer("Max", "Mustermann", 1, "Mathe");
        Lehrer lehrer2 = new Lehrer("Maria", "Mustermann", 2, "Italienisch");
        lehrerListe.add(lehrer1);
        lehrerListe.add(lehrer2);
        Klasse klasse1 = new Klasse("INF3A", lehrer1);
        Klasse klasse2 = new Klasse("INF3B", lehrer2);
        klassenListe.add(klasse1);
        klassenListe.add(klasse2);
        Schueler schueler1 = new Schueler("Hans", "Muster", 1, klasse1);
        Schueler schueler2 = new Schueler("Peter", "Muster", 2 , klasse1);

        mFrame frame = new mFrame(klassenListe, lehrerListe);
    }
}