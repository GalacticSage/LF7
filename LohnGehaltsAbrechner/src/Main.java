public class Main {
    public static void main(String[] args) {
        // Create a PersonalVerwaltung instance
        PersonalVerwaltung personalVerwaltung = new PersonalVerwaltung();

        // Add some employees
        personalVerwaltung.addMitarbeiter(new Mitarbeiter("John Doe"));
        personalVerwaltung.addMitarbeiter(new Mitarbeiter("Alice Smith"));
        personalVerwaltung.addMitarbeiter(new Mitarbeiter("Bob Johnson"));

        // Print the unsorted list
        System.out.println("Unsorted Mitarbeiter:");
        System.out.println(personalVerwaltung.listMitarbeiter());

        // Sort the employees
        personalVerwaltung.sortMitarbeiter();

        // Print the sorted list
        System.out.println("Sorted Mitarbeiter:");
        System.out.println(personalVerwaltung.listMitarbeiter());
    }
}
