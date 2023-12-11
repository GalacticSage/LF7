public class GehaltsAbrechnung extends Abrechnung{

    private double gehalt;

    public GehaltsAbrechnung(int periode, Mitarbeiter mitarbeiter, double gehalt) {
        super(periode, mitarbeiter);
        this.gehalt = gehalt;

    }

    public double getVerdienst() {
        return gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public String toString() {
        return super.toString() + " Gehalt: " + gehalt;
    }
}