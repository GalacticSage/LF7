/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_uebeungen2;

/**
 *
 * @author INF3A_usenj
 */
public class Uebung2 {

    public Uebung2() {
    }

    public boolean checkFirstChar(char word) {
        boolean selbstlaut;
        char tempWord = Character.toLowerCase(word);
        char tempChar = tempWord.next().charAt(0);
        switch (tempChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                selbstlaut = true;
                break;
            default:
                selbstlaut = false;
        }
        return selbstlaut; // Added return statement
    }
}
