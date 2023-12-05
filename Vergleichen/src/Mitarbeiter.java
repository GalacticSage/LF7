public class Mitarbeiter implements Comparable<Mitarbeiter> {
    private int id, alter;
    private String name;

    public Mitarbeiter(int id, int alter, String name) {
        this.id = id;
        this.alter = alter;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Alter: " + alter + " Name: " + name;
    }

    /*@Override
    public int compareTo(Mitarbeiter andereMitarbeiter) {
        if (this.alter < andereMitarbeiter.alter){
            return -1;
        } else if (this.alter > andereMitarbeiter.alter){
            return 1;
        } else {
            return 0;
        }
    }*/

    /*@Override
    public int compareTo(Mitarbeiter andereMitarbeiter) {
        return this.name.compareTo(andereMitarbeiter.name);
    }*/
    @Override
    public int compareTo(Mitarbeiter andereMitarbeiter) {
        int vergleich = this.name.compareTo(andereMitarbeiter.name);
        if (vergleich == 0) {
            if (this.alter < andereMitarbeiter.alter) {
                return -1;
            } else if (this.alter > andereMitarbeiter.alter) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return vergleich;
        }
    }
}
