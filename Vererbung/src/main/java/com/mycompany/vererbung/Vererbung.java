/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vererbung;

/**
 * @author INF3A_usenj
 */
public class Vererbung {
    public static void main(String[] args) {
        Person p1 = new Person("Max", "Mustermann");
        System.out.println("Person: " + p1.ganzeNamen());
        Mitarbeiter m1 = new Mitarbeiter(123456, "Max", "Mustermann", 25);
        System.out.println("Mitarbeiter: " + m1.nameMatrikelnummer());
        System.out.println("Mitarbeiter: " + m1.alleDatenMitarbeiter());
    }
}
