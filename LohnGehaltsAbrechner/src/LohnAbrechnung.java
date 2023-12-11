public class LohnAbrechnung extends Abrechnung {

    private double stundeLohn;
    private double anzahlStunden;

    public LohnAbrechnung(int periode, Mitarbeiter mitarbeiter, double stundeLohn, double anzahlStunden) {
        super(periode, mitarbeiter);
        this.stundeLohn = stundeLohn;
        this.anzahlStunden = anzahlStunden;
    }

    public double getVerdienst() {

        return stundeLohn * anzahlStunden;

    }

    public double getStundeLohn() {
        return stundeLohn;
    }

    public void setStundeLohn(double stundeLohn) {
        this.stundeLohn = stundeLohn;
    }

    public double getAnzahlStunden() {
        return anzahlStunden;
    }

    public void setAnzahlStunden(double anzahlStunden) {
        this.anzahlStunden = anzahlStunden;
    }

    public String toString() {
        return super.toString() + " StundeLohn: " + stundeLohn + " AnzahlStunden: " + anzahlStunden;
    }
}