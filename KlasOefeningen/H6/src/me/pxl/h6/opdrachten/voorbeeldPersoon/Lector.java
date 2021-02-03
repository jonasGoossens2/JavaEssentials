package me.pxl.h6.opdrachten.voorbeeldPersoon;

public class Lector {
    private String personeelNummer;
    private int aanstelinstellingsPercentage;
    private double salaris;
    private static int aantal;

    public Lector(String naam, String voornaam, int aanstelinstellingsPercentage, double salaris, String personeelNummer){
        super();
        aantal++;
    }

    public static int getAantal() {

        return aantal;
    }

    public String getPersoneelNummer() {
        return personeelNummer;
    }

    public void setPersoneelNummer(String personeelNummer) {
        this.personeelNummer = personeelNummer;
    }

    public int getAanstelinstellingsPercentage() {
        return aanstelinstellingsPercentage;
    }

    public void setAanstelinstellingsPercentage(int aanstelinstellingsPercentage) {
        if(aanstelinstellingsPercentage < 0){
            aanstelinstellingsPercentage = 0;
        }
        if(aanstelinstellingsPercentage > 100){
            aanstelinstellingsPercentage = 100;
        }

        if(this.aanstelinstellingsPercentage > 0 && this.salaris > 0){
            double tussenWaarde = this.salaris / this.aanstelinstellingsPercentage;
            setSalaris(tussenWaarde * aanstelinstellingsPercentage);
        }
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }
}
