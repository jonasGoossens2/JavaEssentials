package Oefening1;

import java.util.Random;

public class PersoonApp {
    public static void main(String[] args) {
        Random rn = new Random();
        int getal = 5 + rn.nextInt(10 - 5 + 1);
        System.out.println(getal);

        Persoon persoon = new Persoon();
        persoon.setNaam("Libioulle");
        persoon.setVoornaam("Joakim");
        System.out.println(persoon.geefInitiaal());
    }
}
