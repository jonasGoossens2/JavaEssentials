package Oefening4;

import java.util.Scanner;

public class Oefening4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vertegenwoordiger nr: ");
        int vertegenwoordigerNummer = scanner.nextInt();
        scanner.nextLine();
        int aantalDeelnemers = 0;
        int aantal75K = 0;
        boolean gedaan = false;
        while (vertegenwoordigerNummer != 9){
            gedaan = true;
            int loon = 25000;
            aantalDeelnemers++;
            System.out.println("verkocht bedrag vorig jaar: ");
            double vorigeBedrag = scanner.nextDouble();
            scanner.nextLine();
            if (vorigeBedrag < 50000){
                loon += vorigeBedrag * 0.05;
            }else if (vorigeBedrag <= 75000){
                loon += vorigeBedrag * 0.10;
            }else {
                aantal75K++;
                loon += vorigeBedrag * 0.15;
            }
            System.out.println("Vertegenwoordiger nr: "+ vertegenwoordigerNummer);
            System.out.println("Verkochte bedrag vorig jaar: " + vorigeBedrag);
            System.out.println("Loon: " + loon);
            System.out.println("Vertegenwoordiger nr: ");
            vertegenwoordigerNummer = scanner.nextInt();
            scanner.nextLine();
        }
        if(gedaan){
            System.out.println("Percentage die meer dan 75000 hebben: "+ (aantalDeelnemers / aantal75K * 100));
        }else{
            System.out.println("Geen invoer.");
        }
        scanner.close();
    }
}
