import java.util.ArrayList;

public class PersonalVerwaltung {

    private ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<Mitarbeiter>();

    public void addMitarbeiter(Mitarbeiter m) {
        mitarbeiterListe.add(m);
    }

    public void removeMitarbeiter(Mitarbeiter m) {
        mitarbeiterListe.remove(m);
    }

    public void listMitarbeiter() {
        for (Mitarbeiter m : mitarbeiterListe) {
            System.out.println(m.toString());
        }
    }

    // Bubblesort
    public void sortMitarbeiter() {
        int n = mitarbeiterListe.size();
        Mitarbeiter temp = null;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (mitarbeiterListe.get(j - 1).compareTo(mitarbeiterListe.get(j)) > 0) {
                    temp = mitarbeiterListe.get(j - 1);
                    mitarbeiterListe.set(j - 1, mitarbeiterListe.get(j));
                    mitarbeiterListe.set(j, temp);
                }
            }
        }
    }


    private ArrayList<Abrechnung> abrechnungListe = new ArrayList<Abrechnung>();

    public void addAbrechnung(Abrechnung a) {
        abrechnungListe.add(a);
    }

    public void removeAbrechnung(Abrechnung a) {
        abrechnungListe.remove(a);
    }

    public void listAbrechnungen(int periode) {
        for (Abrechnung a : abrechnungListe) {
            if (a.getPeriode() == periode) {
                System.out.println(a.toString());
            }
        }
    }

    public ArrayList<Mitarbeiter> getMitarbeiterListe() {
        return mitarbeiterListe;
    }

    public void setMitarbeiterListe(ArrayList<Mitarbeiter> mitarbeiterListe) {
        this.mitarbeiterListe = mitarbeiterListe;
    }

    public ArrayList<Abrechnung> getAbrechnungListe() {
        return abrechnungListe;
    }

    public void setAbrechnungListe(ArrayList<Abrechnung> abrechnungListe) {
        this.abrechnungListe = abrechnungListe;
    }

    public String toString() {
        return "MitarbeiterListe: " + mitarbeiterListe.toString() + " AbrechnungListe: " + abrechnungListe.toString();
    }
}