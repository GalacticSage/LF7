import utils.ConsoleColors;

public class AbstractTest {
    public static void main(String[] args) {
        Ducati panigale = new Ducati();
        System.out.println(ConsoleColors.RED + panigale.getPosition().x + ConsoleColors.RESET);
        panigale.bewegen(100, 0);
        System.out.println(ConsoleColors.RED + panigale.getPosition().x + ConsoleColors.RESET);
        panigale.bewegen(100, 0);
        System.out.println(ConsoleColors.GREEN + panigale.getPosition().x + ConsoleColors.RESET);

        /* Raumschiff kann nicht instanziiert werden, da es abstrakt ist

        Raumschiff enterprise = new Raumschiff();
        System.out.println(ConsoleColors.RED + enterprise.getPosition().x + ConsoleColors.RESET);
        enterprise.bewegen(100, 0);
        System.out.println(ConsoleColors.RED + enterprise.getPosition().x + ConsoleColors.RESET);
        enterprise.bewegen(100, 0);
        System.out.println(ConsoleColors.GREEN + enterprise.getPosition().x + ConsoleColors.RESET);
        */
    }
}
