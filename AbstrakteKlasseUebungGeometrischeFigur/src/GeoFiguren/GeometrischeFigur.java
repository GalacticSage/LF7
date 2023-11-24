package GeoFiguren;

public abstract class GeometrischeFigur {
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double berechneFlaeche();
}
