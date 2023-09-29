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
    
//    int index;

    private Integer[] einzahlungsliste = new Integer[4];
    
    public Sparbuch() {}

    public Sparbuch(int geld0, int geld1, int geld2, int geld3) {
        einzahlungsliste[0] = geld0;
        einzahlungsliste[1] = geld1;
        einzahlungsliste[2] = geld2;
        einzahlungsliste[3] = geld3;
    }
    
//    public int getElementIndex(int x){
//        for (int i = 0; i < einzahlungsliste.length; i++) {
//            if(x == einzahlungsliste[i]){
//                //System.out.println(i);
//                this.index = i;
//                break;
//            }
//        }   
//        return this.index;
//    }

    public int getElementIndex(int elementValue) {
        Integer index = Arrays.asList(einzahlungsliste).indexOf(elementValue);
        return index;
    }

    public int getAnzahlElementeImArray() {
        return einzahlungsliste.length;
    }

}
