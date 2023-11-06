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
        System.out.println(ConsoleColors.CYAN +"Person: " + p1.ganzeNamen() + ConsoleColors.RESET);
        Mitarbeiter m1 = new Mitarbeiter(123456, "Max", "Mustermann", 25);
        System.out.println("Mitarbeiter: " + m1.nameMatrikelnummer());
        System.out.println("Mitarbeiter: " + m1.alleDatenMitarbeiter());
        Schueler s1 = new Schueler(123456, "3AHIF", "Max", "Mustermann", 25, 2021);
        System.out.println("Schueler: " + s1.nameSchuelerNummer());
        System.out.println("Schueler: " + s1.alleDatenSchueler());
        Lehrer l1 = new Lehrer(123456, "Java", "Max", "Mustermann", 25);
        System.out.println("Lehrer: " + l1.nameLehrerNummer());
        System.out.println("Lehrer: " + l1.alleDatenLehrer());
    }
}
