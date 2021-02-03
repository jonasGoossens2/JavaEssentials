package be.pxl.h2.oefeningen.Oefening3;

public class Bankrekening {
    private String rekeningnummer;
    private String naamEigenaar;
    private double saldo;
    private double rentePercentage;

    public void setNaam(String naamEigenaar) {
        this.naamEigenaar = naamEigenaar;
    }

    public void setRekeningnummer(String rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }

    public void setRentePercentage(double rentePercentage) {
        if(rentePercentage < 0){
            rentePercentage = 0;
        }else{this.rentePercentage = rentePercentage;}
    }

    public void setSaldo(double saldo) {
        if (saldo < 0){
            this.saldo = 0;
        }else{this.saldo = saldo;}
    }

    public double getSaldo() {
        return saldo;
    }
    public String neemOp(int bedrag){
        if(rekeningnummer != "geen") {
            String resultaat;
            if (bedrag > getSaldo()) {
                resultaat = "U mag enkel " + getSaldo() + " opnemen.";
                this.saldo -= getSaldo();
            } else if (getSaldo() == 0) {
                resultaat = "u kan geen geld opnemen.";
            } else {
                resultaat = "U heeft " + bedrag + " euro afgehaald.";
            }
            return resultaat;
        }else{
            return "Sorry, geen rekeningnummer";
        }
    }
    public String stort(double stortbedrag){
        if(rekeningnummer != "geen"){
            setSaldo(this.saldo + stortbedrag);
            return stortbedrag + "euro is gestort.";
        }
        else{
            return "Sorry, geen rekeningnummer";
        }
    }
    public Bankrekening(){
        this("geen", "onbekend", 0.0, 1.2);
    }
    public Bankrekening(String rekeningnummer, String naamEigenaar, double saldo, double rentePercentage){
        setRekeningnummer(rekeningnummer);
        setNaam(naamEigenaar);
        setSaldo(saldo);
        setRentePercentage(rentePercentage);
    }
    public void doeVerrichting(int[] bedragen){
        if(rekeningnummer != "geen") {
            for (int i = 0; i < bedragen.length; i++) {
                if (bedragen[i] < 0) {
                    neemOp(bedragen[i]);
                } else {
                    stort(bedragen[i]);
                }
            }
        }
    }
    public void schrijfRenteBij(){
         stort((saldo * rentePercentage/100));
    }
}
