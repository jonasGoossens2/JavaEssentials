package be.pxl.hoofdstuk1.oef1;

import java.util.Scanner;

public class Volledigenaam{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Uw voornaam: ");
        String voornaam = scanner.nextLine();

        System.out.println("Geef uw achternaam");
        String achternaam = scanner.nextLine();

        String volledigeNaam = voornaam + " " + achternaam;
        System.out.println("Volledige naam: " + volledigeNaam);
    }
}
