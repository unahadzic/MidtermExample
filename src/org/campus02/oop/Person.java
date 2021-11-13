package org.campus02.oop;

public class Person {
    private String vorname;
    private String nachname;
    private int koerpergroesse;
    private byte aktivitaetslevel;

    public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.koerpergroesse = koerpergroesse;
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public String rechneBMI(int gewicht) {
        double bmi = gewicht / Math.pow(koerpergroesse / 100.0, 2);
        // Math.pow(basis, hochzahl) => führt eine Potenzierung durch => Basis hoch Hochzahl

        // Die if-Abfrage kann auch mit if-else geschrieben werden
        // in dem Fall bietet sich jedoch auch folgende Variante an
        if (bmi < 18.5)
            return "Untergewicht";
        if (bmi < 25)
            return "Normalgewicht";
        if (bmi < 30)
            return "Uebergewicht";

        return "Adipositas";
    }

    public void printPerson(int gewicht) {
        System.out.print(vorname + " " + nachname+ ", ");
        switch (aktivitaetslevel) {
            case 1:
                System.out.print("Couch Potato");
                break;
            case 2:
                System.out.print("Gelegenheitsportler");
                break;
            case 3:
                System.out.print("Sportler");
                break;
            case 4:
                System.out.print("Profisportler");
                break;
            default:
                System.out.print("not allowed value");

        }
        System.out.println(", " + rechneBMI(gewicht));
    }

    public void setKoerpergroesse(int koerpergroesse) {
        this.koerpergroesse = koerpergroesse;
    }

    public void setAktivitaetslevel(byte aktivitaetslevel) {
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getKoerpergroesse() {
        return koerpergroesse;
    }

    public byte getAktivitaetslevel() {
        return aktivitaetslevel;
    }
}
