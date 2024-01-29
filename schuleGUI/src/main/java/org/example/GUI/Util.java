package org.example.GUI;

import org.example.GUI.Lehrer.pAddLehrer;
import org.example.GUI.Lehrer.pShowLehrer;
import org.example.GUI.Schueler.pAddSchueler;
import org.example.GUI.Schueler.pShowSchueler;
import org.example.Klasse;
import org.example.Lehrer;
import org.example.Schueler;

import java.util.ArrayList;

public class Util {
    private ArrayList<Klasse> klassen;
    private ArrayList<Lehrer> lehrer;
    private ArrayList<Schueler> schueler;

    public Util(ArrayList<Klasse> klassen, ArrayList<Lehrer> lehrer, ArrayList<Schueler> schueler) {
        this.klassen = klassen;
        this.lehrer = lehrer;
        this.schueler = schueler;
    }

    public void action_Lehrer_btn_anzeigen(pShowLehrer pShowLehrer) {
        String str = "";
        for (Lehrer lehrer : lehrer) {
            str += lehrer.toString() + "\n";
        }
        pShowLehrer.setTextArea(str);
    }

    public void action_Schueler_btn_anzeigen(pShowSchueler pShowSchueler) {
        String str = "";
        for (Schueler schueler : schueler) {
            str += schueler.toString() + "\n";
        }
        pShowSchueler.setTextArea(str);
    }

    public void action_Lehrer_btn_add(pAddLehrer pAddLehrer) {
        String vorname = pAddLehrer.getTxt_vorname();
        String nachname = pAddLehrer.getTxt_nachname();
        int matrikelnummer = 0;
        //check if matrikelnummer is a number
        try {
            matrikelnummer = Integer.parseInt(pAddLehrer.getTxt_matrikelnummer());
        } catch (NumberFormatException e) {
            pAddLehrer.setLbl_info_error("Matrikelnummer muss eine Zahl sein!");
            return;
        }
        //check if all fields are filled
        if (vorname.equals("") || nachname.equals("") || matrikelnummer == 0) {
            pAddLehrer.setLbl_info_error("Bitte alle Felder ausfüllen!");
            return;
        }
        //check if matrikelnummer is already in use
        for (Lehrer lehrer : lehrer) {
            if (lehrer.getMatrikelnummer() == matrikelnummer) {
                pAddLehrer.setLbl_info_error("Matrikelnummer bereits vergeben!");
                return;
            }
        }
        String fach = pAddLehrer.getTxt_fach();
        Lehrer lehrer = new Lehrer(vorname, nachname, matrikelnummer, fach);
        this.lehrer.add(lehrer);
        pAddLehrer.setLbl_info("Lehrer " + vorname + " " + nachname + " hinzugefügt!");
    }

    public void action_Schueler_btn_add(pAddSchueler pAddSchueler) {
        String vorname = pAddSchueler.getTxt_vorname();
        String nachname = pAddSchueler.getTxt_nachname();
        int matrikelnummer = 0;
        //check if matrikelnummer is a number
        try {
            matrikelnummer = Integer.parseInt(pAddSchueler.getTxt_matrikelnummer());
        } catch (NumberFormatException e) {
            pAddSchueler.setLbl_info_error("Matrikelnummer muss eine Zahl sein!");
            return;
        }
        //check if all fields are filled
        if (vorname.equals("") || nachname.equals("") || matrikelnummer == 0) {
            pAddSchueler.setLbl_info_error("Bitte alle Felder ausfüllen!");
            return;
        }
        //check if matrikelnummer is already in use
        for (Schueler schueler : schueler) {
            if (schueler.getMatrikelnummer() == matrikelnummer) {
                pAddSchueler.setLbl_info_error("Matrikelnummer bereits vergeben!");
                return;
            }
        }
        Schueler schueler = new Schueler(vorname, nachname, matrikelnummer);
        this.schueler.add(schueler);
        pAddSchueler.setLbl_info("Schueler " + vorname + " " + nachname + " hinzugefügt!");
    }
}
