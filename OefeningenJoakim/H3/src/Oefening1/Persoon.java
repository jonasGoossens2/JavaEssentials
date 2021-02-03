package Oefening1;
import java.lang.Math;
import java.util.Random;

public class Persoon {
    private String voornaam;
    private String naam;
    private double lengte;
    private double gewicht;
    private int geboorteJaar;

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        if (lengte > 2.40) {
            this.lengte = 2.40;
        } else {
            this.lengte = lengte;
        }
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public int getGeboorteJaar() {
        return geboorteJaar;
    }

    public void setGeboorteJaar(int geboorteJaar) {
        this.geboorteJaar = geboorteJaar;
    }

    public int getLeeftijd() {
        return 2020 - geboorteJaar;
    }

    public Persoon(String voornaam, String naam, double lengte, double gewicht, int geboorteJaar) {
        setVoornaam(voornaam);
        setNaam(naam);
        setLengte(lengte);
        setGewicht(gewicht);
        setGeboorteJaar(geboorteJaar);
    }

    public String toString() {
        String resultaat = String.format("Deze persoon is %S %S%n" +
                        "%15s: %.2f%n" +
                        "%15s: %.2f%n" +
                        "%15s: %d"
                , getVoornaam().toUpperCase(), getNaam().toUpperCase(), "gewicht", getGewicht(), "lengte", getLengte(), "geboorteaar", getGeboorteJaar());
        return resultaat;
    }

    public double berekenBmi() {
        return Math.round((gewicht / (Math.pow(lengte, 2))) * 10);
    }

    public String geefOmshrijving() {
        double berekenBMI = berekenBmi();
        if (berekenBMI < 18) {
            return "ondergewicht";
        } else if (berekenBMI < 25) {
            return "normaal";
        } else if (berekenBMI < 30) {
            return "overgewicht";
        } else if (berekenBMI < 40) {
            return "obesitas";
        } else {
            return "morbide obesitas";
        }
    }

    public void voegVoornamenToe(String extraNaam) {
        voornaam += " " + extraNaam;
    }

    public void groei() {
        setLengte(this.lengte + 0.01);
    }

    public void groei(int cm) {
        setLengte(this.lengte + cm);
    }

    public Persoon() {
        this("onbekend", "onbekend");
    }

    public Persoon(String voornaam, String naam) {
        setVoornaam(voornaam);
        setNaam(naam);
    }

    public Persoon(Persoon persoon) {
        setVoornaam(persoon.voornaam);
        setNaam(persoon.naam);
        setLengte(persoon.lengte);
        setGewicht(persoon.gewicht);
        setGeboorteJaar(persoon.geboorteJaar);
    }

    public String GeefNaamAfgekort(){
        return this.voornaam.substring(0,1).toUpperCase() + "." + this.naam.substring(0, 1).toUpperCase() + this.naam.substring(1, this.naam.length());
    }

    public String geefInitiaal(){
        String initiaal;

        char teken;
        teken = this.naam.charAt(0);
        if(teken >= 'A' && teken <='Z' ) {
            initiaal = this.naam.substring(0, 2).toUpperCase() + this.voornaam.substring(0, 2).toUpperCase();
        }else{
            initiaal = this.naam.substring(0, 2).toLowerCase() + this.voornaam.substring(0,2).toLowerCase();
        }
        return initiaal;
    }
}
