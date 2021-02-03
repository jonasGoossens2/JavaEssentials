package Oefening1;

public class WerknemerApp {


    public static void main(String[] args) {
        Werknemer w1 = new Werknemer("Joakim", "Libioulle");
        Werknemer w2 = new Werknemer("Jos", "Libioulle");
        Manager m = new Manager("Leo", "Libioulle",500, "Patron");

        System.out.println("Aantal werknemers: " + Werknemer.getAantalW());
        System.out.println("Aantal managers:" + m.getProcAandeelManager() + "%");
    }
}
