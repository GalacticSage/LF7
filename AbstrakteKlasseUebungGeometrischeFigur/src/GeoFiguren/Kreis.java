package GeoFiguren;

public class Kreis extends GeometrischeFigur{
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

}
