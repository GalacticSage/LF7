public class Lieferant extends Geschaeftskunde{

    private String firmenName, ansprechpartner;
    public Lieferant(String firmenName, String adresse, String email, String telefonnummer, String ansprechpartner) {
        super(firmenName, adresse, email, telefonnummer);
        this.firmenName = firmenName;
        this.ansprechpartner = ansprechpartner;
    }

    public String getFirmenName() {
        return firmenName;
    }

    public String getAnsprechpartner() {
        return ansprechpartner;
    }

    public void setAnsprechpartner(String ansprechpartner) {
        this.ansprechpartner = ansprechpartner;
    }
}
