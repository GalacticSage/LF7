/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package einfacheArrays;
import java.util.*;

/**
 *
 * @author INF3A_usenj
 */
public class Sparbuch {

    private Integer[] einzahlungsliste = new int[4];

    public Sparbuch(int geld0, int geld1, int geld2, int geld3) {
        einzahlungsliste[0] = geld0;
        einzahlungsliste[1] = geld1;
        einzahlungsliste[2] = geld2;
        einzahlungsliste[3] = geld3;
    }

    public int getElementIndex(int elementValue) {
        int index = Arrays.asList(einzahlungsliste).indexOf(elementValue);
        return index;
    }

    public int getFourthElementIndex() {
        return 3;
    }

    public int getAnzahlElementeImArray() {
        return einzahlungsliste.length;
    }

}
