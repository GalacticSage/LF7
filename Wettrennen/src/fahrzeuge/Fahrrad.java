package fahrzeuge;

public class Fahrrad extends Fahrzeug{
    public Fahrrad(double kmStand, double geschwindigkeit) {
        super(kmStand, geschwindigkeit);
        setMaxGeschwindigkeit(30);
        setAnzahlRaeder(2);
    }
}
