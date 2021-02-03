package Oefening1;

public class Persoon {
    private String naam;
    private String voornaam;

    public Persoon(String naam, String voornaam) {
        setVoornaam(voornaam);
        setNaam(naam);
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
