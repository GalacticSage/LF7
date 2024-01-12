package org.example;

enum Groessen {
    KLEIN, MITTEL, GROSS, EXTRAGROSS;
    public String getGroessen(){
        switch (this) {
            case KLEIN:
                return "Klein";
            case MITTEL:
                return "Mittel";
            case GROSS:
                return "Gross";
            case EXTRAGROSS:
                return "Extragross";
            default:
                return null;
        }
    }
}