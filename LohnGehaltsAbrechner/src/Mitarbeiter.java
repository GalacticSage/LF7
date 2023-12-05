public class Mitarbeiter {
    private static int idCounter = 0;
    private int id;
    private String name;


    public Mitarbeiter(String name) {
        this.id = ++idCounter;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mitarbeiter ID: " + id + ", Name: " + name;
    }

    public boolean istKleiner(Mitarbeiter m) {
        // Vergleiche die Namen der Mitarbeiter alphabetisch
        return this.getName().compareTo(m.getName()) < 0;
    }
}
