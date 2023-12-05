import java.util.ArrayList;

public class PersonalVerwaltung {
    private ArrayList<Mitarbeiter> mitarbeiterListe;

    public PersonalVerwaltung() {
        this.mitarbeiterListe = new ArrayList<Mitarbeiter>();
    }

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiterListe.add(mitarbeiter);
    }

    public void removeMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiterListe.remove(mitarbeiter);
    }

    public void sortMitarbeiter() {
        // Bubblesort
        int n = mitarbeiterListe.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (mitarbeiterListe.get(j).istKleiner(mitarbeiterListe.get(j + 1))) {
                    // Tausche die Mitarbeiterpositionen
                    Mitarbeiter temp = mitarbeiterListe.get(j);
                    mitarbeiterListe.set(j, mitarbeiterListe.get(j + 1));
                    mitarbeiterListe.set(j + 1, temp);
                }
            }
        }
    }

    public String listMitarbeiter() {
        String output = "";
        for (Mitarbeiter mitarbeiter : this.mitarbeiterListe) {
            output += mitarbeiter.toString() + "\n";
        }
        return output;
    }
}
