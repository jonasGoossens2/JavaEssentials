package Oefening.Hoofdstuk1;

import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef je nummer in: (9 om te stoppen)");
        int nummer = scanner.nextInt();
        int aantal75 = 0;
        int aantalTot = 0;
        while (nummer != 9){
            aantalTot ++;
            double bedrag = 0;
            System.out.println("Geef het bedrag in: ");
            bedrag = scanner.nextDouble();

            double totaalBedrag = 25000 + bedrag;
            if (totaalBedrag <50000){
                totaalBedrag *= 1.05;
            } else{
                if(totaalBedrag < 75000){
                    totaalBedrag *= 1.1;
                } else{
                    totaalBedrag *= 1.15;
                }
            }
            if (totaalBedrag> 75000){
                aantal75 ++;
            }
            System.out.println("Nummer vertegenwoordiger: " + nummer);
            System.out.println("Totaal bedrag: " + totaalBedrag);
            System.out.println("Geef je nummer in: (9 om te stoppen)");
            nummer = scanner.nextInt();
        }
        double gemiddelde = (aantal75 / aantalTot)*100;
        System.out.println("% boven 75: " + gemiddelde);
    }
}
