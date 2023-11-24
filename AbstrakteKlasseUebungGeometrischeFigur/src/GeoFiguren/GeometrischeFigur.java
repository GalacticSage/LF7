package GeoFiguren;
import java.awt.*;
public abstract class GeometrischeFigur {
    private Color farbe;

    public Color getColor() {
        return farbe;
    }

    public void setColor(Color color) {
        this.farbe = color;
    }

    public abstract double berechneFlaeche();
}
