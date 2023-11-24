import java.awt.*;

abstract class Fahrzeug {
    Point position = new Point(0, 0);

    abstract void bewegen(int h, int v);

    Point getPosition() {
        return position;
    }
}
