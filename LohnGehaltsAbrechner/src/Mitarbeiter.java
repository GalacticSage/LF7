public class Mitarbeiter implements Comparable<Mitarbeiter> {

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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Mitarbeiter.idCounter = idCounter;
    }

    @Override
    public int compareTo(Mitarbeiter m) {
        return this.name.compareTo(m.getName());
    }

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name;
    }
}