import java.awt.Point;
public class Ducati extends Motorrad{
    @Override
    void bewegen(int h, int v) {
        position = new Point(h, v);
    }

    void fahren(int h, int v) {
        bewegen(h, v);
    }
}
