package fahrzeuge;

public class Auto extends Fahrzeug{
    public Auto(double kmStand, double geschwindigkeit) {
        super(kmStand, geschwindigkeit);
        setMaxGeschwindigkeit(140);
        setAnzahlRaeder(4);
    }
}
