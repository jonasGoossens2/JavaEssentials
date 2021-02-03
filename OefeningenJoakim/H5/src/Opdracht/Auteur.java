package Opdracht;

public class Auteur {
    private String naam;
    private String voornaam;

    public String toString(){
        String toString = this.voornaam + " " + this.naam;
        return toString;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }
}
