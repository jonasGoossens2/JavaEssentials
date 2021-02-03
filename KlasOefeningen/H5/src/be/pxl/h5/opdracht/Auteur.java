package be.pxl.h5.opdracht;

public class Auteur {

    private String naam;
    private String voornaam;

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
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(getVoornaam());
        builder.append(getNaam());
        return builder.toString();
    }
    public Auteur(){
        this("onbekend", "onbekend");
    }
    public Auteur(String naam, String voornaam){
        setNaam(naam);
        setVoornaam(voornaam);
    }
}
