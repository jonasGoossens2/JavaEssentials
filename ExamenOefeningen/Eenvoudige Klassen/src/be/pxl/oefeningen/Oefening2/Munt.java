package be.pxl.oefeningen.Oefening2;

import java.sql.SQLOutput;

public class Munt {
    private String naam;
    private double koers;
    private static final int AFRONDING = 3;
    private static int aantal;

    public Munt() {
        this("euro", 1);
    }

    public Munt(String naam, double koers) {
        setNaam(naam);
        setKoers(koers);
    }

    public String getNaam() {
        return this.naam.toUpperCase();
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getKoers() {
        return koers;
    }

    public void setKoers(double koers) {

        double temp = Math.round(koers * 1000);
        this.koers = temp / 1000;
    }
}
