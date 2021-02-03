package me.pxl.h6.oefeningen.oefening1;

public class Persoon {
    private String naam;
    private String voornaam;

    public Persoon(String voornaam, String naam){
        setNaam(naam);
        setVoornaam(voornaam);
    }
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
}
