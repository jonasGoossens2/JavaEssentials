package be.pxl.h1.oefeningen.Oefening2;

import java.util.Scanner;

public class Oefening2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Naam speler: ");
        String naam = scanner.next();
        System.out.println("Prijs vorig seizoen: ");
        double PrijsVorigSeizoen = scanner.nextInt();
        scanner.nextLine();
        System.out.println("leeftijd: ");
        int leeftijd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Beoordelingscijfer: ");
        int beoordeling = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Functie");
        String functie = scanner.next();
        System.out.println("aantal doelpunten: ");
        int aantalDoelpunten = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        double basisprijs = PrijsVorigSeizoen;
        if (leeftijd < 25){
            basisprijs += basisprijs * 0.10;
        }
        else if (leeftijd > 30){
            basisprijs -= basisprijs * 0.05;
        }
        if (functie.equals("aanvaller")){
            if (aantalDoelpunten <=5){
                basisprijs += aantalDoelpunten * 10000;
            } else{
                basisprijs += 50000;
                aantalDoelpunten -= 5;
                basisprijs += aantalDoelpunten * 20000;
            }
        }
        else if (functie.equals("doelman")){
            if (aantalDoelpunten > 20){
                basisprijs -= 9000;
            }
        } else {
            basisprijs += beoordeling * 10000;
        }
        System.out.println("Naam: "+ naam);
        System.out.println("Prijs vorig seizoen: " + PrijsVorigSeizoen);
        System.out.println("Nieuwe prijs: " + basisprijs);
    }
}
