public class Kunde extends Geschaeftskunde{

    private int kundennummer, anzahlBestellungen;
    public Kunde(String name, String adresse, String email, String telefonnummer, int kundennummer, int anzahlBestellungen) {
        super(name, adresse, email, telefonnummer);
        this.kundennummer = kundennummer;
        this.anzahlBestellungen = anzahlBestellungen;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    public int getAnzahlBestellungen() {
        return anzahlBestellungen;
    }

    public void setAnzahlBestellungen(int anzahlBestellungen) {
        this.anzahlBestellungen = anzahlBestellungen;
    }
}
