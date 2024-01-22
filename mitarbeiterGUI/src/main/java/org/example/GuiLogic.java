package org.example;

public class GuiLogic {
    private MitarbeiterListe mListe;
    private int index = 0;
    public GuiLogic(MitarbeiterListe mListe) {
        this.mListe = mListe;
    }
    public void resetIndex() {
        this.index = 0;
    }
    public void nextIndex() {
        index++;
    }
    public void previousIndex() {
        index--;
    }
    public void displayMitarbeiter(PanelDisplayMitarbeiter panelDisplayMitarbeiter) {
        String vorname;
        String nachname;
        int tempIndex = indexCheck(this.index);
        vorname = mListe.getMitarbeiterAnPosition(tempIndex).getVorname();
        nachname = mListe.getMitarbeiterAnPosition(tempIndex).getNachname();
        panelDisplayMitarbeiter.setTxt_vorname(vorname);
        panelDisplayMitarbeiter.setTxt_nachname(nachname);
    }

    public void addMitarbeiter(PanelHinzufuegenMitarbeiter  panelHinzufuegenMitarbeiter) {
        String vorname = panelHinzufuegenMitarbeiter.getTxt_vorname();
        String nachname = panelHinzufuegenMitarbeiter.getTxt_nachname();
        Mitarbeiter m = new Mitarbeiter(vorname, nachname);
        mListe.hinzufuegenObjektZurListe(m);
        panelHinzufuegenMitarbeiter.setLbl_meldung("Mitarbeiter " + vorname + " " + nachname + " hinzugefügt");
        panelHinzufuegenMitarbeiter.clearTxtFields();
    }

    private int indexCheck(int index) {
        if (index < 0) {
            index = mListe.getErsteNichtInitialisiertePositionImArray();
        } else if (index > mListe.getErsteNichtInitialisiertePositionImArray()) {
            index = 0;
        }
        return index;
    }
}