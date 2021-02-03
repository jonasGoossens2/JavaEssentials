package be.pxl.h1.Opdrachten;

import java.util.Scanner;

public class condities {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je leeftijd in: ");
        int leeftijd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Aansluitingsjaar: ");
        int aansluitingsjaar = scanner.nextInt();
        scanner.nextLine();
        double basisbedrag = 100.0;
        if ((leeftijd < 21) || (leeftijd > 60)){
            basisbedrag -= 14.5;
        }
        basisbedrag -= (2020 - aansluitingsjaar) * 2.5;
        if (basisbedrag < 62.5){
            basisbedrag = 62.5;
        }
        System.out.println(basisbedrag);

    }
}
