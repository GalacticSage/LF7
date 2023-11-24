import java.awt.Point;

abstract class Raumschiff extends Fahrzeug {
    @Override
    void bewegen(int h, int v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Point fliege(int h, int v) {
        return new Point(getPosition().x + h, getPosition().y + v);
    }
}
