package Opdracht1;

public class Lector {
    private String personeelsNummer;
    private int aanstellingsPercentage;
    private double salaris;
    private static int aantal;

    private static int getAantal(){
        return aantal;
    }
    
    public Lector(){
        super();
    }

    public Lector(String personeelsNummer, int aanstellingsPercentage, double salaris) {
        this.personeelsNummer = personeelsNummer;
        this.aanstellingsPercentage = aanstellingsPercentage;
        this.salaris = salaris;
    }

    public String getPersoneelsNummer() {
        return personeelsNummer;
    }

    public int getAanstellingsPercentage() {
        return aanstellingsPercentage;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setPersoneelsNummer(String personeelsNummer) {
        this.personeelsNummer = personeelsNummer;
    }

    public void setAanstellingsPercentage(int aanstellingsPercentage) {
        if(aanstellingsPercentage <0){
            aanstellingsPercentage = 0;
        }
        if(aanstellingsPercentage >100){
            aanstellingsPercentage = 100;
        }

        if(this.aanstellingsPercentage > 0 && this.salaris > 0){
            double tussenWaarde = this.salaris / this.aanstellingsPercentage;
            setSalaris(tussenWaarde + aanstellingsPercentage);
        }

        this.aanstellingsPercentage = aanstellingsPercentage;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }
}
