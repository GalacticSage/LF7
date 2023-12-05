import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mitarbeiter> mitarbeiterliste = new ArrayList<Mitarbeiter>();
        Mitarbeiter m1 = new Mitarbeiter(1, 20, "Max");
        Mitarbeiter m2 = new Mitarbeiter(2, 30, "Moritz");
        Mitarbeiter m3 = new Mitarbeiter(3, 40, "Peter");
        Mitarbeiter m4 = new Mitarbeiter(4, 50, "Hans");
        Mitarbeiter m5 = new Mitarbeiter(5, 60, "Klaus");
        Mitarbeiter m6 = new Mitarbeiter(6, 70, "Dieter");
        Mitarbeiter m7 = new Mitarbeiter(7, 20, "Max");

        mitarbeiterliste.add(m1);
        mitarbeiterliste.add(m2);
        mitarbeiterliste.add(m3);
        mitarbeiterliste.add(m4);
        mitarbeiterliste.add(m5);
        mitarbeiterliste.add(m6);
        mitarbeiterliste.add(m7);

        System.out.println("Unsortiert: " + mitarbeiterliste);
        Collections.sort(mitarbeiterliste);
        System.out.println("Sortiert: " + mitarbeiterliste);

    }
}