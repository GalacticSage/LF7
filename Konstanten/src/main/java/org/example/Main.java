package org.example;

public class Main {
    public static void main(String[] args) {
        Kleidung hose = new Kleidung(Groessen.KLEIN);
        hose.bestelleKleidung();

        System.out.println(Groessen.GROSS.getGroessen());

        //Position des Enums
        System.out.println("Konstantenposition: "+ Groessen.GROSS.ordinal());    //ordinal ordnet/findet die Position

        //Enums vergleichen
        System.out.println("Konstantevergleich: " + Groessen.GROSS.compareTo(Groessen.EXTRAGROSS)); // erstenwert minus den zwiten wert

//----------------------------------------------------------------------------------------------------------------------------------------------------

        Monat m = Monat.NOVEMBER;
        System.out.println(m.name() + " hat " + m.getAnzahlTage() + " Tage");

        System.out.print(Monat.NOVEMBER);
        if (m.inJahreszeit(Jahreszeit.WINTER)) {
            System.out.println(" ist ein Wintermonat");

        }else if(m.inJahreszeit(Jahreszeit.FRUEHLING)){
            System.out.println(" ist ein Frühlingsmonat");

        }else if (m.inJahreszeit(Jahreszeit.SOMMER)) {
            System.out.println(" ist ein Sommermonat");

        }else{
            System.out.println(" ist ein Herbstmonat");
        }
    }
}