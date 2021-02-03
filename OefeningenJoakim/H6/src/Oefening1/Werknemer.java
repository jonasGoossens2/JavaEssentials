package Oefening1;

public class Werknemer extends Persoon{
    private String functie;
    private double salaris;
    private double min_salaris = 1000;
    private static int aantalW;

    public static int getAantalW() {
        return aantalW;
    }

    public void setMin_salaris(double min_salaris) {
        this.min_salaris = min_salaris;
    }

    public double getMin_salaris() {
        return min_salaris;
    }

    public Werknemer(String naam, String voornaam){
        this(naam, voornaam, 1800, "algemene bediende");
    }

    public Werknemer(String naam, String voornaam, double salaris, String functie) {
        super(naam,voornaam);
        setFunctie(functie);
        setSalaris(salaris);
        aantalW++;
    }

    public void print(){
        System.out.printf("Voornaam: %s \nNaam: %s\nSalaris: %d\nFunctie: %s", getVoornaam(), getNaam(), getSalaris(), getFunctie());
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public void setSalaris(double salaris) {
        if(salaris < min_salaris){
            this.salaris = min_salaris;
        }else{
            this.salaris = salaris;
        }
    }

    public String getFunctie() {
        return functie;
    }

    public double getSalaris() {
        return salaris;
    }
}
