package be.pxl.hoofdstuk1.oef1;

import java.util.Scanner;

public class Opdracht9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de leeftijd in: ");
        int leeftijd = scanner.nextInt();

        System.out.println("Geef het aansluitingsjaar in: ");
        int aansluitingsjaar = scanner.nextInt();
        double bedrag = 100;
        if (leeftijd < 21 || leeftijd > 60){
            bedrag -= 14.5;
        }
        int aantalJaar = 2020 - aansluitingsjaar;
        bedrag -= (aansluitingsjaar * 2.5);

        if(bedrag < 62.5){
            bedrag = 62.5;
        }
        System.out.println("Het bedrag is: " + bedrag);
    }
}
