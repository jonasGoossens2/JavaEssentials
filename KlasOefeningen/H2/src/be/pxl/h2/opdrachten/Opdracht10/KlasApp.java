package be.pxl.h2.opdrachten.Opdracht10;

public class KlasApp {

    public static void main(String[] args) {

        Klas k1 = new Klas("1TINh", 55);
        System.out.println(Klas.getTel());
        Klas k2 = new Klas("1TINi", 10);
        Klas k3 = new Klas("1TINj", 25);
        Klas k4 = new Klas();
        Klas k5 = new Klas("1TINk", 17);
        System.out.println(Klas.getTel());

        Klas[] lijst = {k1, k2, k3, k4, k5};

        System.out.println(Klas.getTel() + " klassen");
        System.out.println(Klas.getTotaalAantalStudenten() + " studenten");
        k5.setAantalStudenten(18);
        System.out.println(Klas.getTotaalAantalStudenten() + " studenten");
        for(Klas klas : lijst) {
            System.out.printf("%s: %d studenten%n", klas.getKlas(), klas.getAantalStudenten()); // printF omdat ge dan kunt formateren en bij ln niet.
        }

        double gemiddelde = (double) Klas.getTotaalAantalStudenten() / Klas.getTel(); // dobule moet omdat je anders geen kommagetal krijgt als resultaat.
        System.out.printf("Gemiddelde: %.1f%n", gemiddelde);


    }
}
