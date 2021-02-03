package be.pxl.oefeningen.Oefening1;

public class Persoon {

    private String voornaam;
    private String naam;
    private double lengte;
    private double gewicht;
    private int geboortejaar;


    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getNaam() {
        return naam;
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

    public String toString(){
        return String.format("Deze persoon is %s %s\n%15s: %.2f\n%15s: %.2f\n%15s: %d", getVoornaam(), getNaam(),
                "gewicht", getGewicht(), "lengte", getLengte(), "geboortejaar", getGeboortejaar());
    }
    public double berekenBMI(){
        return getGewicht() / Math.pow(getLengte(), 2);
    }
    public String geefOmschrijving(){
        double BMI = berekenBMI();
        if(BMI < 18){
            return "ondergewicht";
        }else if(BMI < 25){
            return "normaal";
        }else if(BMI < 30){
            return "overgewicht";
        }else if(BMI < 40){
            return "obesitas";
        }else{
            return "morbide obesitas";
        }
    }
    public void voegVoornamenToe(String invoer){
        setVoornaam(getVoornaam() + invoer);
    }
}
