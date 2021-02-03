package be.pxl.h1.Opdrachten;

import java.util.Scanner;

public class Wielrenners {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inschrijvingsnummer: ");
        int inschrijvingsnummer = scanner.nextInt();
        scanner.nextLine();
        int snelste = 999999, snelsterenner = 0;
        int totaalRenners = 0, trageRenners = 0;

        while (inschrijvingsnummer >= 0){
            totaalRenners++;
            System.out.println("Tijd: ");
            int tijd = scanner.nextInt(); // second
            if (tijd < snelste) {
                snelste = tijd;
                snelsterenner = inschrijvingsnummer;
            }
            if(tijd > 3600){
                trageRenners++;
            }
            System.out.println("Inschrijvingsnummer: ");
            inschrijvingsnummer = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Snelste renner" + snelsterenner);
        System.out.println("Percentage renners: "+ ((double) trageRenners /totaalRenners * 100));
    }
}
