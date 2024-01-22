package org.example;

public class main {
    public static void main(String[] args) {
        MitarbeiterListe mListe = new MitarbeiterListe();
        Mitarbeiter m1 = new Mitarbeiter("Max", "Mustermann");
        Mitarbeiter m2 = new Mitarbeiter("Maximilian", "Posada");
        Mitarbeiter m3 = new Mitarbeiter("Johann", "Senoner");
        mListe.hinzufuegenObjektZurListe(m1);
        mListe.hinzufuegenObjektZurListe(m2);
        mListe.hinzufuegenObjektZurListe(m3);

        gui g = new gui(mListe);
    }
}
