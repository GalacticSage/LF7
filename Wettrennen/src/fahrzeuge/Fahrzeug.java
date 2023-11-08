package fahrzeuge;

import utils.ConsoleColors;

public class Fahrzeug {
    private double kmStand, geschwindigkeit;
    private double maxGeschwindigkeit = 0;
    private int anzahlRaeder = 0;


    // Constructor
    public Fahrzeug(double kmStand, double geschwindigkeit) {
        this.kmStand = kmStand;
        this.geschwindigkeit = geschwindigkeit;
    }


    // Fahrzeug methods
    public double fahren(double minuten) {
        if (minuten < 0) {
            System.out.println(ConsoleColors.RED + "Die Zeit kann nicht negativ sein!" + ConsoleColors.RESET);
            return 0;
        } else {
            if (geschwindigkeit == 0) {
                System.out.println(ConsoleColors.RED + "Das Fahrzeug steht und kann nicht fahren!" + ConsoleColors.RESET);
                return 0;
            } else {
                double strecke = (geschwindigkeit / 60) * minuten;
                kmStand += strecke;
                return Math.round(kmStand);
            }
        }
    }
    public double setzeGeschwindigkeit(double geschwindigkeit) {
        if (geschwindigkeit > maxGeschwindigkeit) {
            this.geschwindigkeit = maxGeschwindigkeit;
        } else {
            this.geschwindigkeit = geschwindigkeit;
        }
        return this.geschwindigkeit;
    }

    public void setMaxGeschwindigkeit(double maxGeschwindigkeit) {
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public void setAnzahlRaeder(int anzahlRaeder) {
        this.anzahlRaeder = anzahlRaeder;
    }

    public double getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

}
