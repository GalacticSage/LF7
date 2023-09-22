/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tanken;

/**
 *
 * @author INF3A_usenj
 */
public class start {
    public static void main(String[] args) {
        String kfzKennzeichen;
        int kilometerstand, tankvolumen, minKraftstoffmenge;
        double kraftstoffverbrauch, kraftstoffmenge;
        
        //kfzKennzeichen = "EZ180TX";
        kilometerstand = 180;
        tankvolumen = 80;
        minKraftstoffmenge = 5;
        kraftstoffverbrauch = 0.0493;
        kraftstoffmenge = 10;
        
        Auto a1 = new Auto(kilometerstand, tankvolumen, minKraftstoffmenge, kraftstoffverbrauch, kraftstoffmenge);
        a1.tanken(5);
        a1.fahren(500);
        System.out.println(a1.getKraftstoffmenge() +" " + a1.getKilometerstand());
    }
}
