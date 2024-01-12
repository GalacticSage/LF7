package org.example;

public enum Monat {
    JANUAR(31, Jahreszeit.WINTER),
    FEBRAUR(28, Jahreszeit.WINTER),
    MAERZ(31, Jahreszeit.FRUEHLING),
    APRIL(30, Jahreszeit.FRUEHLING),
    MAI(31, Jahreszeit.FRUEHLING),
    JUNI(30, Jahreszeit.SOMMER),
    JULI(31, Jahreszeit.SOMMER),
    AUGUST(31, Jahreszeit.SOMMER),
    SEPTEMBER(30, Jahreszeit.HERBST),
    OKTOBER(31, Jahreszeit.HERBST),
    NOVEMBER(30, Jahreszeit.HERBST),
    DEZEMBER(31, Jahreszeit.WINTER);

    private int mTage;
    private Jahreszeit mJahreszeit;

    Monat(int Tage, Jahreszeit jahreszeit) {
        mTage = Tage;
        mJahreszeit = jahreszeit;
    }

    int getAnzahlTage() {
        return mTage;

    }

    boolean inJahreszeit(Jahreszeit j) {
        return j == mJahreszeit;
    }
}