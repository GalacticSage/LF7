package fahrzeuge;

public class Rennwagen extends Auto{
    public Rennwagen(double kmStand, double geschwindigkeit) {
        super(kmStand, geschwindigkeit);
        setMaxGeschwindigkeit(220);
    }
}
