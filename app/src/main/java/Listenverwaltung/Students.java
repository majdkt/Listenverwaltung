package Listenverwaltung;

import java.lang.reflect.Method;
import java.util.Scanner;



class Students {

    private String vorname;
    private String nachname;
    private String studiengang;
    private Integer martikelnummer;

    private static int idCounter = 0;

    public static int getUniqueID() {
        return idCounter;
    }


    public Students(String vorname, String nachname, String studiengang, Integer martikelnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.studiengang = studiengang;
        this.martikelnummer = martikelnummer;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public void setMartikelnummer(Integer martikelnummer) {
        this.martikelnummer = martikelnummer;
    }


    public String getNachname() {
        return nachname;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public Integer getMartikelnummer() {
        return martikelnummer;
    }

    public String getVorname() {
        return vorname;
    }

    public String toString() {
        return "ID: " + getUniqueID() + ", " + "Vorname: " + vorname + ", " +"Nachname: "+ nachname + ", "
                + "Studiengang: "+ studiengang + ", Martikelnummer: " + martikelnummer;
    }
}
