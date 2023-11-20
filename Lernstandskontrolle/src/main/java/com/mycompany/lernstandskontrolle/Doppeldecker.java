/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lernstandskontrolle;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author INF3A_usenj
 */
public final class Doppeldecker extends Flugzeug {
    
    private final int loopingSPeed = 320;
    private boolean offenesCockpit;
    
    public Doppeldecker(String hersteller, int immatNummer, int maxSpeed, boolean offenesCockpit) {
        super(hersteller, maxSpeed, 2);
        this.offenesCockpit = offenesCockpit;
        String tempImmatNummer = String.valueOf(immatNummer);
        setImmatNummer(tempImmatNummer);
    }
    
    public Doppeldecker(String hersteller, String immatNummer, int maxSpeed) {
        super(hersteller, maxSpeed, 2);
        this.offenesCockpit = true;
        setImmatNummer(immatNummer);
    }
    
    public boolean isOffenesCockpit() {
        return this.offenesCockpit;
    }
    
    @Override
    public boolean getLooping() {
        if (getMaxSpeed() >= loopingSPeed) {
            return true;
        } else {
            return false;
        }
    }
}
