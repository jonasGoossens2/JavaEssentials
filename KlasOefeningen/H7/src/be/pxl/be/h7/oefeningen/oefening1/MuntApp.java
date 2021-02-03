package be.pxl.be.h7.oefeningen.oefening1;

public class MuntApp {
    public static void main(String[] args) {
        int[] aantallen = new int[8];
        double bedrag = 8.75;
        int resterendeBedrag = (int) bedrag * 100;
        for(int i=0; i< Munt.values().length; i++){
            aantallen[i] = resterendeBedrag / Munt.values()[i].getWaarde();
            resterendeBedrag %= Munt.values()[i].getWaarde();
        }
        for(int i=0; i<Munt.values().length; i++){
            System.out.printf("%d van %s\n", aantallen[i], Munt.values()[i].name());
        }
    }
}
