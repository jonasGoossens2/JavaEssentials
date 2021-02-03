package voorbeeldPersoon;

public class Persoon {
    private String naam;
    private String voornaam;

    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public String getVolledigeNaam() {

        return vraagtekenIndienNull(voornaam) + " " + vraagtekenIndienNull(naam);
    }

    //checken ofdat iets null is.
    public String vraagtekenIndienNull(String naam){
        if (naam == null){
            return "?";
        } else {
            return naam;
        }
    }




}
