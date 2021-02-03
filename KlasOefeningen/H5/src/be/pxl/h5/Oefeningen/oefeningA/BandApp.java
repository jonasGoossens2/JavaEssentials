package be.pxl.h5.Oefeningen.oefeningA;

public class BandApp {

    public static void main(String[] args) {
    Instrument gitaar = new Instrument("Gitaar", "pling plong plong");
    Instrument drum = new Instrument("Drum", "Badum tss");
    Instrument bas = new Instrument("Bas", "Bow bow bow");
    Instrument klarinet = new Instrument("Klarinet", "Wawaaw");
    Instrument triangel = new Instrument("Triangel", "pling pling");
    Muzikant sam = new Muzikant("Sam", gitaar);
    Muzikant heidi = new Muzikant("Heidi", drum);
    Muzikant ingrid = new Muzikant("Ingrid", bas);
    Muzikant nele = new Muzikant("Nele", klarinet);
    Muzikant francis = new Muzikant("francis", triangel);
    Muzikant[] leden = {sam, heidi, ingrid, nele, francis};
    Band degeilepoffertjes = new Band("DeGeilePoffertjes", leden);

    System.out.println(degeilepoffertjes.toString());

    degeilepoffertjes.speel(20);
    }
}
