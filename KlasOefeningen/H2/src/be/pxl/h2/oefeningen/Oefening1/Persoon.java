package be.pxl.h2.oefeningen.Oefening1;

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
        if (lengte > 2.40){
            this.lengte = 2.40;
        }else {
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
    public int getLeeftijd(){return 2020 - geboorteJaar;}
    public Persoon(String voornaam, String naam, double lengte, double gewicht, int geboorteJaar){
        setVoornaam(voornaam);
        setNaam(naam);
        setLengte(lengte);
        setGewicht(gewicht);
        setGeboorteJaar(geboorteJaar);
    }
    public String toString(){
        String resultaat = String.format("Deze persoon is %s %s%n" +
                "%15s: %.2f%n" +
                "%15s: %.2f%n" +
                "%15s: %d"
                ,getVoornaam(), getNaam(), "gewicht", getGewicht(), "lengte", getLengte(), "geboorteaar", getGeboorteJaar());
        return resultaat;
    }
    public double berekenBmi(){
        return gewicht / (Math.pow(lengte, 2));
    }
    public String geefOmshrijving(){
        double berekenBMI = berekenBmi();
        if (berekenBMI < 18) {
            return "ondergewicht";
        }else if(berekenBMI < 25) {
            return "normaal";
        }else if(berekenBMI < 30){
            return "overgewicht";
        }else if(berekenBMI < 40){
            return "obesitas";
        }else{ return "morbide obesitas";}
    }
    public void voegVoornamenToe(String extraNaam){
        voornaam += " " + extraNaam;
    }
    public void groei(){
        setLengte(this.lengte + 0.01);
    }
    public void groei(int cm){
        setLengte(this.lengte + cm);
    }
    public Persoon(){
        this("onbekend", "onbekend");
    }
    public Persoon(String voornaam, String naam){
        setVoornaam(voornaam);
        setNaam(naam);
    }
    public Persoon(Persoon persoon){
        setVoornaam(persoon.voornaam);
        setNaam(persoon.naam);
        setLengte(persoon.lengte);
        setGewicht(persoon.gewicht);
        setGeboorteJaar(persoon.geboorteJaar);
    }
}
