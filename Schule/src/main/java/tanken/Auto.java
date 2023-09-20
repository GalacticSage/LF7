/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tanken;

/**
 *
 * @author INF3A_usenj
 */
public class Auto {

    private String kfzKennzeichen;
    private int kilometerstand, tankvolumen, minKraftstoffmenge;
    private double kraftstoffverbrauch, kraftstoffmenge;

    public Auto() {}

    public Auto(String kfzKennzeichen, int kilometerstand, int tankvolumen, int minKraftstoffmenge, double kraftstoffverbrauch, double kraftstoffmenge) {
        this.kfzKennzeichen = kfzKennzeichen;
        this.kilometerstand = kilometerstand;
        this.tankvolumen = tankvolumen;
        this.minKraftstoffmenge = minKraftstoffmenge;
        this.kraftstoffverbrauch = kraftstoffverbrauch;
        this.kraftstoffmenge = kraftstoffmenge;
    }
    
    public void tanken(int literMenge){
        this.kraftstoffmenge = kraftstoffmenge + literMenge;
    }
    
    public void fahren(double kilometerStrecke){
        double verbrauch = this.kraftstoffverbrauch * kilometerStrecke;
        double tempKraftstoffmenge = kraftstoffmenge - verbrauch;
        if (checkTank(tempKraftstoffmenge)== false) {
            System.out.println("Nicht genügend Kraftstoff");
        }
        else {
            this.kraftstoffmenge = tempKraftstoffmenge;
        }
    }
    
    public boolean checkTank(double kraftstoffmenge){
        if (this.minKraftstoffmenge < kraftstoffmenge && kraftstoffmenge >= this.tankvolumen) {
            return true;
        }
        else {
            return false;
        }
        
    }

    public String getKfzKennzeichen() {
        return kfzKennzeichen;
    }

    public void setKfzKennzeichen(String kfzKennzeichen) {
        this.kfzKennzeichen = kfzKennzeichen;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int Kilometerstand) {
        this.kilometerstand = Kilometerstand;
    }

    public int getTankvolumen() {
        return tankvolumen;
    }

    public void setTankvolumen(int Tankvolumen) {
        this.tankvolumen = Tankvolumen;
    }

    public double getKraftstoffverbrauch() {
        return kraftstoffverbrauch;
    }

    public void setKraftstoffverbrauch(double Kraftstoffverbrauch) {
        this.kraftstoffverbrauch = Kraftstoffverbrauch;
    }

    public double getKraftstoffmenge() {
        return kraftstoffmenge;
    }

    public void setKraftstoffmenge(double Kraftstoffmenge) {
        this.kraftstoffmenge = Kraftstoffmenge;
    }
}
