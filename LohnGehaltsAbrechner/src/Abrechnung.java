public abstract class Abrechnung {
    private int periode;
    private Mitarbeiter mitarbeiter;

    public Abrechnung(int periode, Mitarbeiter m) { ...}

    public int getPeriode() { ...}

    public Mitarbeiter getMitarbeiter() { .}

    public abstract double getVerdienst();

    public String toString() { ...}
}
