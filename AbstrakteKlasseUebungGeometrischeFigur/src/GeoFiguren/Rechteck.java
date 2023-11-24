package GeoFiguren;

public class Rechteck extends GeometrischeFigur{
    private double hoehe;
    private double breite;

    public Rechteck(double length, double width) {
        this.hoehe = length;
        this.breite = width;
    }

    @Override
    public double berechneFlaeche() {
        return hoehe * breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public double getBreite() {
        return breite;
    }
}
