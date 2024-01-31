package org.example.GUI;

import org.example.GUI.Lehrer.AddLehrer;
import org.example.GUI.Lehrer.ShowLehrer;
import org.example.GUI.Schueler.AddSchueler;
import org.example.GUI.Schueler.ShowSchueler;
import org.example.Klasse;
import org.example.Lehrer;
import org.example.Schueler;

import java.util.ArrayList;

public class Util {
    private ArrayList<Klasse> klassen;
    private ArrayList<Lehrer> lehrer;

    public Util(ArrayList<Klasse> klassen, ArrayList<Lehrer> lehrer) {
        this.klassen = klassen;
        this.lehrer = lehrer;
    }

    public Klasse getKlasse(String klassenname) {
        for (Klasse klasse : klassen) {
            if (klasse.getKlassenname().equals(klassenname)) {
                return klasse;
            }
        }
        return null;
    }

    public ArrayList<Klasse> getKlassen() {
        return klassen;
    }

    public String getKlassenListe() {
        String str = "";
        for (Klasse klasse : klassen) {
            str += klasse.getKlassenname() + "\n";
        }
        return str;
    }

    public void action_Lehrer_btn_anzeigen(ShowLehrer pShowLehrer) {
        String str = "";
        for (Lehrer lehrer : lehrer) {
            str += lehrer.toString() + "\n";
        }
        pShowLehrer.setTextArea(str);
    }

    public void action_Schueler_btn_anzeigen(ShowSchueler pShowSchueler) {
        String str = "";
        for (Klasse klasse : klassen) {
            str += klasse.getSchuelerListe();
        }
        pShowSchueler.setTextArea(str);
    }

    public void action_Lehrer_btn_add(AddLehrer pAddLehrer) {
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

    public void action_Schueler_btn_add(AddSchueler pAddSchueler) {
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
        for (Klasse klasse : klassen) {
            for (Schueler schueler : klasse.getSchuelerListeArray()) {
                if (schueler.getMatrikelnummer() == matrikelnummer) {
                    pAddSchueler.setLbl_info_error("Matrikelnummer bereits vergeben!");
                    return;
                }
            }
        }
        Schueler schueler = new Schueler(vorname, nachname, matrikelnummer, null);
        pAddSchueler.setLbl_info("Schueler " + vorname + " " + nachname + " hinzugefügt!");
    }
}
