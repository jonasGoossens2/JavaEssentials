package be.pxl.h3.oefeningen.oefening1;


import java.util.Random;

public class PersoonApp {
    public static void main(String[] args) {
        Persoon persoon = new Persoon();

        Random rnd = new Random();
        int getal = rnd.nextInt(361);
        persoon.setGewicht(getal + 40);
    }
}
