import GeoFiguren.*;

public class Main {
    public static void main(String[] args) {
        GeometrischeFigur[] figuren = new GeometrischeFigur[2];
        figuren[0] = new Kreis(5);
        figuren[1] = new Rechteck(5, 10);

        for (GeometrischeFigur figur : figuren) {
            System.out.println(figur.berechneFlaeche());
        }
    }
}