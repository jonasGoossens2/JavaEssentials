package me.pxl.h6.oefeningen.oefening1;

public class Werknemer extends Persoon{

    private String functie;
    private int salaris;
    private static int aantal;
    private static final int MINSALARY = 1000;
    public static int getAantal() {
        return aantal;
    }

    public Werknemer(String Voornaam, String naam, int salaris, String functie){
        super(Voornaam, naam);
        setSalaris(salaris);
        setFunctie(functie);
        aantal++;
    }
    public Werknemer(String voornaam, String naam){
        this(voornaam, naam, 1800, "algemeen bediende");
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public int getSalaris() {
        return salaris;
    }

    public static int getMINSALARY() {
        return MINSALARY;
    }

    public void setSalaris(int salaris) {
        if(salaris < MINSALARY){
            salaris = MINSALARY;
        }else {
            this.salaris = salaris;
        }
    }

    public void print(){
        System.out.printf("Voornaam: %s \nNaam: %s \nSalaris: %d\nFunctie: %s", getVoornaam(), getNaam(), getSalaris(), getFunctie());
    }
}
