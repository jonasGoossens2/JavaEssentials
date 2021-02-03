package be.pxl.h2.Oefening1;

public class Persoon {
    private String Voornaam;
    private String Naam;
    private double lengte;
    private double gewicht;
    private int geboortejaar;

    public String getVoornaam() {
        return Voornaam;
    }

    public String getNaam() {
        return Naam;
    }

    public double getLengte() {
        return lengte;
    }

    public double getGewicht() {
        return gewicht;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public void setVoornaam(String voornaam) {
        Voornaam = voornaam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public void setLengte(double lengte) {
        if(lengte > 2.40){
            lengte = 2.40;
            this.lengte = lengte;
        }
        else{
            this.lengte = lengte;
        }
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }

    public String Persoon(){
        String resultaat = String.format("Deze persoon is %s %s%n%" +
                "%15: %.2f%" +
                "%15s: %.2f%n" +
                getVoornaam(),getNaam(),"gewicht", getGewicht(),"lengte", getLengte(), "geboortedatum", getGeboortejaar());
        return resultaat;
    }

    public double BerekenBmi(){
        double BMI = gewicht / Math.pow(lengte, 2);
        return BMI;
    }

    public void geefOmschrijving(){
        if(BerekenBmi() < 18){
            System.out.println("Ondergewicht");
        } else if(BerekenBmi() > 18 && BerekenBmi() < 25){
            System.out.println("Normaal");
        } else if(BerekenBmi() > 25 && BerekenBmi() < 30){
            System.out.println("Overgewicht");
        } else if(BerekenBmi() > 30 && BerekenBmi() < 40){
            System.out.println("Obesitas");
        } else{
            System.out.println("Morbide obesitas");
        }
    }

    public void voegVoornaamToe(String extraNaam){
        Voornaam += " " + extraNaam;
    }

    public void Groei(){
        this.lengte += 1;
    }
    public void Groei(double lengte){
        setLengte(lengte);
    }
    public Persoon(Persoon persoon){
        setVoornaam(persoon.Voornaam);
        setNaam(persoon.Naam);
        setLengte(persoon.lengte);
        setGewicht(persoon.gewicht);
        setGeboortejaar(persoon.geboortejaar);
    }
}

