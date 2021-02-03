package Oefening3;

public class Oefening3 {

    public static void main(String[] args) {
        double getal =0;
        System.out.printf("%20s %-20s %20s %20s%n1", "gewoon 2",  "links 3", " rechts (met nul)","4.  3 dec");
        for(int i=1; i<10;i++){
            getal = (getal * 10) + i; // omdat het vorige getal 1 plek moet opschuiven.
            System.out.printf("%20f %-20f  %020f %20.3f %n", getal, getal, getal, getal);
        }

    }
}
