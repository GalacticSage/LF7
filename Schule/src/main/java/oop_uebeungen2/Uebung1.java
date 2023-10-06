/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_uebeungen2;

import java.util.Scanner;

/**
 *
 * @author INF3A_usenj
 */
public class Uebung1 {

    private String wochentage[] = new String[7];
    
    Scanner sc = new Scanner(System.in);
    

    public Uebung1() {
        this.wochentage[0]= "Montag";
        this.wochentage[1]= "Dienstag";
        this.wochentage[2]= "Mittwoch";
        this.wochentage[3]= "Donnerstag";
        this.wochentage[4]= "Freitag";
        this.wochentage[5]= "Samstag";
        this.wochentage[6]= "Sonntag";
    }
    
    public String getWochentagFromNumber(){
        System.out.println("----------------------");
        System.out.println("Geben Sie die gewünchte Wochentagnummer ein: ");
        String number = sc.next();
        String ausgabe;
        switch (number) {
            case "1":
                ausgabe = this.wochentage[0];
                break;
            case "2":
                ausgabe = this.wochentage[1];
                break;
            case "3":
                ausgabe = this.wochentage[2];
                break;
            case "4":
                ausgabe = this.wochentage[3];
                break;
            case "5":
                ausgabe = this.wochentage[4];
                break;
            case "6":
                ausgabe = this.wochentage[5];
                break;    
            case "7":
                ausgabe = this.wochentage[6];
                break;
            default:
                throw new AssertionError();
        }
        return ausgabe;
    }
}
