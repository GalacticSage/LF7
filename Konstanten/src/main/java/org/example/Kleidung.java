package org.example;

public class Kleidung {
    Groessen kleidergroessen;

    public Kleidung(Groessen g) {
        kleidergroessen = g;
    }

    public void bestelleKleidung() {
        switch (kleidergroessen) {
            case KLEIN:
                System.out.println("Kleines Kleidungsstück wurde bestellt");
                break;
            case MITTEL:
                System.out.println("Mittleres Kleidungsstück wurde bestellt");
                break;
            case GROSS:
                System.out.println("Grosses Kleidungsstück wurde bestellt");
                break;
            case EXTRAGROSS:
                System.out.println("Extragrosses Kleidungsstück wurde bestellt");
                break;

            default:
                System.out.println("Fehlerhafte Bestellung");
                break;
        }
    }
}

