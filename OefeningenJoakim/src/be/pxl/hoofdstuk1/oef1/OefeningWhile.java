package be.pxl.hoofdstuk1.oef1;

import java.util.Scanner;

public class OefeningWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef je inschrijvingsnummer in: ");
        int inschrijvingsnummer = scanner.nextInt();

        int snelste = 99999999;
        double aantalLanger = 0;
        double aantal = 0;
        while (inschrijvingsnummer> 0){
            aantal ++;
            System.out.println("Geef de tijd in (in seconden): ");
            int tijd = scanner.nextInt();

            if (tijd < snelste){
                snelste = inschrijvingsnummer;
            }
            if (tijd > 3600){
                aantalLanger ++;
            }
            System.out.println("Geef je inschrijvingsnummer in: ");
            inschrijvingsnummer = scanner.nextInt();

        }

        System.out.println("Snelste renner is de renner met inschrijvingsnummer: " + inschrijvingsnummer);
        System.out.println("Het percentage van de renners dat er langer dan 1 uur over doet: " + (aantalLanger/aantal)*100);
    }
}
