/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package einfacheArrays;

/**
 *
 * @author INF3A_usenj
 */
public class EinfcheArrays {

    public static void main(String[] args) {
        int geld0, geld1, geld2, geld3;
        geld0 = 1000;
        geld1 = 1000;
        geld2 = 800;
        geld3 = 1300;

        Glaskugel g1 = new Glaskugel();
        Sparbuch s1 = new Sparbuch(geld0, geld1, geld2, geld3);
        System.out.println("Anzahl der Elemente im Array: " + s1.getAnzahlElementeImArray());
        System.out.println("Anzahl der Elemente im Array: " + s1.getElementIndex(geld3));
        
        g1.lottozahlenErzeugen(1, 49);
        g1.lottzahlenAusgeben();
        
    }
}
