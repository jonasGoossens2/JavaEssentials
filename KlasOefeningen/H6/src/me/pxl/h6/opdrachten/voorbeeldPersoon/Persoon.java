package me.pxl.h6.opdrachten.voorbeeldPersoon;

public class Persoon {
    private String naam;
    private String voornaam;
    private static int aantal;

    public static int getAantal() {
        return aantal;
    }

    public Persoon(){
        this("onbekend", "onbekend");
    }
    public Persoon(String naam, String voornaam){
        setNaam(naam);
        setVoornaam(voornaam);
        aantal++;
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
