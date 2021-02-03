package Opdracht1;

public class persoon {
    private String naam;
    private String voornaam;
    private static int aantal;
    public persoon() {
        aantal++;
    }

    public persoon(String naam, String voornaam) {
        aantal++;
        this.naam = naam;
        this.voornaam = voornaam;
    }
    private static int getAantal(){
        return aantal;
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
