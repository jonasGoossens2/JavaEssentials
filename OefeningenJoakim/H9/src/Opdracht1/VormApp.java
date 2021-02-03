package Opdracht1;

import java.util.ArrayList;

public class VormApp {
    public static void main(String[] args) {
        ArrayList<GrafischElement> lijst = new ArrayList<>();
        lijst.add(new Cirkel(3.2));
        lijst.add(new Driehoek(1,2,3,4,5));
        lijst.add(new Rechthoek(4,5));
        lijst.add(new Vierkant(3));

        for(GrafischElement element : lijst){
            double oude = element.getOppervlakte();
            element.herschaal(200);
            double nieuwe = element.getOppervlakte();

            System.out.printf("%.2f => %.2f%n", oude, nieuwe);
        }
    }
}
