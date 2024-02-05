package org.example.GUI;

import org.example.GUI.Klasse.AddKlasse;
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

    public Lehrer getLehrer(String vornameNachname) {
        for (Lehrer lehrer : lehrer) {
            if (lehrer.getVornameNachname().equals(vornameNachname)) {
                return lehrer;
            }
        }
        return null;
    }

    public ArrayList<Lehrer> getLehrer() {
        return lehrer;
    }

    public ArrayList<Klasse> getKlassen() {
        return klassen;
    }

    public String getKlassenListe() {
        String str = "";
        for (Klasse klasse : klassen) {
            str += klasse.toString() + "\n";
        }
        return str;
    }

    public void action_Lehrer_anzeigen(ShowLehrer ShowLehrer) {
        String str = "";
        for (Lehrer lehrer : lehrer) {
            str += lehrer.toString() + "\n";
        }
        ShowLehrer.setTextArea(str);
    }

    public void action_Klasse_btn_add(AddKlasse AddKlasse) {
        String klassenname = AddKlasse.getTxt_klassenname();
        Lehrer lehrer = getLehrer(AddKlasse.getSelectedLehrer());

        if (klassenname.equals("") || lehrer == null) {
            AddKlasse.setLbl_info_error("Bitte alle Felder ausfüllen!");
            return;
        }
        for (Klasse klasse : klassen) {
            if (klasse.getKlassenname().equals(klassenname)) {
                AddKlasse.setLbl_info_error("Klassenname bereits vergeben!");
                return;
            }
        }
        Klasse klasse = new Klasse(klassenname, lehrer);
        klassen.add(klasse);
        AddKlasse.setLbl_info("Klasse " + klassenname + " hinzugefügt!");
    }

    public void action_Schueler_anzeigen(ShowSchueler ShowSchueler) {
        String str = "";
        for (Klasse klasse : klassen) {
            str += klasse.getSchuelerListe();
        }
        ShowSchueler.setTextArea(str);
    }

    public void action_Lehrer_btn_add(AddLehrer AddLehrer) {
        String vorname = AddLehrer.getTxt_vorname();
        String nachname = AddLehrer.getTxt_nachname();
        int matrikelnummer = 0;
        //check if matrikelnummer is a number
        try {
            matrikelnummer = Integer.parseInt(AddLehrer.getTxt_matrikelnummer());
        } catch (NumberFormatException e) {
            AddLehrer.setLbl_info_error("Matrikelnummer muss eine Zahl sein!");
            return;
        }
        //check if all fields are filled
        if (vorname.equals("") || nachname.equals("") || matrikelnummer == 0) {
            AddLehrer.setLbl_info_error("Bitte alle Felder ausfüllen!");
            return;
        }
        //check if matrikelnummer is already in use
        for (Lehrer lehrer : lehrer) {
            if (lehrer.getMatrikelnummer() == matrikelnummer) {
                AddLehrer.setLbl_info_error("Matrikelnummer bereits vergeben!");
                return;
            }
        }
        String fach = AddLehrer.getTxt_fach();
        Lehrer lehrer = new Lehrer(vorname, nachname, matrikelnummer, fach);
        this.lehrer.add(lehrer);
        AddLehrer.setLbl_info("Lehrer " + vorname + " " + nachname + " hinzugefügt!");
    }

    public void action_Schueler_btn_add(AddSchueler AddSchueler) {
        String vorname = AddSchueler.getTxt_vorname();
        String nachname = AddSchueler.getTxt_nachname();
        int matrikelnummer = 0;
        //check if matrikelnummer is a number
        try {
            matrikelnummer = Integer.parseInt(AddSchueler.getTxt_matrikelnummer());
        } catch (NumberFormatException e) {
            AddSchueler.setLbl_info_error("Matrikelnummer muss eine Zahl sein!");
            return;
        }
        //check if all fields are filled
        if (vorname.equals("") || nachname.equals("") || matrikelnummer == 0) {
            AddSchueler.setLbl_info_error("Bitte alle Felder ausfüllen!");
            return;
        }
        //check if matrikelnummer is already in use
        for (Klasse klasse : klassen) {
            for (Schueler schueler : klasse.getSchuelerListeArray()) {
                if (schueler.getMatrikelnummer() == matrikelnummer) {
                    AddSchueler.setLbl_info_error("Matrikelnummer bereits vergeben!");
                    return;
                }
            }
        }
        //check if a class is selected
        if (AddSchueler.getSelectedKlasse() == null) {
            AddSchueler.setLbl_info_error("Bitte eine Klasse auswählen!");
            return;
        }
        Klasse klasse = getKlasse(AddSchueler.getSelectedKlasse());
        Schueler schueler = new Schueler(vorname, nachname, matrikelnummer, klasse);
        AddSchueler.setLbl_info("Schueler " + vorname + " " + nachname + " hinzugefügt!");
    }
}
