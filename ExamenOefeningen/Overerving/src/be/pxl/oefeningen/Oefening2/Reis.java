package be.pxl.oefeningen.Oefening2;

public abstract class Reis{
    private String bestemming;
    private double prijs;
    private static double MINIMUM_PRIJS;

    public Reis(String bestemming, double prijs) {
        setBestemming(bestemming);
        setPrijs(prijs);
    }

    public Reis(String bestemming){
        this(bestemming, getMinimumPrijs());
    }

    public String getBestemming() {
        return bestemming;
    }

    public void setBestemming(String bestemming) {
        if(Character.isDigit(bestemming.charAt(0))){
            this.bestemming = bestemming.substring(1);
        }else{
            this.bestemming = bestemming;
        }
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        if(prijs < getMinimumPrijs()){
            this.prijs = getMinimumPrijs();
        }else{
            this.prijs = prijs;
        }
    }

    public static double getMinimumPrijs() {
        return MINIMUM_PRIJS;
    }

    //Reis met bestemming Brussel kost 12.50 euro.
    public String toString(){
        return String.format("Reis met bestemming %s kost %.2f euro.", getBestemming(), getPrijs());
    }
}
