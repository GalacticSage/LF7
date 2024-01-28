package org.example;

import org.example.GUI.mFrame;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Klasse> klassenListe = new ArrayList<>();
        ArrayList<Lehrer> lehrerListe = new ArrayList<>();
        ArrayList<Schueler> schuelerListe = new ArrayList<>();

        Lehrer lehrer1 = new Lehrer("Max", "Mustermann", 1, "Mathe");
        Lehrer lehrer2 = new Lehrer("Maria", "Mustermann", 2, "Italienisch");
        lehrerListe.add(lehrer1);
        lehrerListe.add(lehrer2);
        mFrame frame = new mFrame(klassenListe, lehrerListe, schuelerListe);
    }
}