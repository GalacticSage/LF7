/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitarbeiterUebung;

/**
 *
 * @author INF3A_usenj
 */
public class Mitarbeiter {
    String vorname;
    String nachname;
    
    
    public Mitarbeiter(){};
    
    public Mitarbeiter(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    
        @Override
    public String toString(){
        
        return vorname + " " + nachname;
        
    }
    
}
