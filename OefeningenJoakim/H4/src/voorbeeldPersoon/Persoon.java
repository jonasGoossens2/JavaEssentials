package voorbeeldPersoon;

public class Persoon {
    private String naam;
    private String voornaam;

    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public String getVolledigeNaam() {
        return vraaktekenIndienNull(voornaam) + " " + vraaktekenIndienNull(naam);
    }

    public String vraaktekenIndienNull(String naam){
        if(naam == null){
            return "?";
        }
        return naam;
    }
}
