public abstract class Abrechnung {

    public int periode;
    public Mitarbeiter mitarbeiter;

    public Abrechnung(int periode, Mitarbeiter mitarbeiter) {
        this.periode = periode;
        this.mitarbeiter = mitarbeiter;

    }

    public int getPeriode() {
        return periode;

    }

    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;

    }

    public void setPeriode(int periode) {
        this.periode = periode;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public abstract double getVerdienst();


    // To String

    public String toString() {
        return "Periode: " + periode + " Mitarbeiter: " + mitarbeiter.toString();
    }
}