import utils.ConsoleColors;
import fahrzeuge.*;

public class Main {
    public static void main(String[] args) {
//        Fahrzeug fahrzeug = new Fahrzeug(0, 0);
//        System.out.printf("Die Geschwindigkeit beträgt nun " + ConsoleColors.GREEN + fahrzeug.setzeGeschwindigkeit(100) + " km/h \n" + ConsoleColors.RESET);
//        System.out.println("Sie sind nun " + ConsoleColors.YELLOW + fahrzeug.fahren(100) + " km" + ConsoleColors.RESET + " gefahren");
//        System.out.println("Die maximale Geschwindigkeit des Fahrzeugs beträgt " + ConsoleColors.GREEN + fahrzeug.getMaxGeschwindigkeit() + " km/h \n" + ConsoleColors.RESET);
        Fahrrad fahrrad = new Fahrrad(0, 20);
        System.out.println("Das Fahrrad fährt nun " + ConsoleColors.GREEN + fahrrad.fahren(240) + " km" + ConsoleColors.RESET + " weit");

    }
}