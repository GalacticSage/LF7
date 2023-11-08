package fahrzeuge;

public class Krankenwagen extends Auto{

    private boolean blaulicht = false;
    public Krankenwagen(double kmStand, double geschwindigkeit) {
        super(kmStand, geschwindigkeit);
    }

    public boolean setBlaulichtTrue(){
        blaulicht = true;
        return blaulicht;
    }

    public boolean setBlaulichtFalse(){
        blaulicht = false;
        return blaulicht;
    }

    public boolean getBlaulicht(){
        return blaulicht;
    }
}
