import utils.ConsoleColors;
import fahrzeuge.*;

public class Main {
    public static void main(String[] args) {
        Fahrrad fahrrad = new Fahrrad(80);
        fahrrad.setzeGeschwindigkeit(20);
        Auto auto = new Auto(0);
        auto.setzeGeschwindigkeit(150);
        Rennwagen rennwagen = new Rennwagen(0);
        rennwagen.setzeGeschwindigkeit(200);
        Krankenwagen krankenwagen = new Krankenwagen(0);
        krankenwagen.setzeGeschwindigkeit(80);
        System.out.println("Das Fahrrad fährt nun " + ConsoleColors.GREEN + fahrrad.fahren(60) + " km" + ConsoleColors.RESET + " weit");
        System.out.println("Das Auto fährt nun " + ConsoleColors.BLUE + auto.fahren(60) + " km" + ConsoleColors.RESET + " weit");
        System.out.println("Der Rennwagen fährt nun " + ConsoleColors.CYAN + rennwagen.fahren(60) + " km" + ConsoleColors.RESET + " weit");
        System.out.println("Der Krankenwagen fährt nun " + ConsoleColors.PURPLE + krankenwagen.fahren(60) + " km" + ConsoleColors.RESET + " weit");

    }
}