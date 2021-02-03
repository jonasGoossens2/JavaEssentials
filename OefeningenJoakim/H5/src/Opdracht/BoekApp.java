package Opdracht;

import java.util.Scanner;

public class BoekApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Auteur a = new Auteur();

        System.out.println("Geef de voornaam van de auteur in: ");
        String voornaam = s.nextLine();
        a.setVoornaam(voornaam);

        System.out.println("Geef de naam van de auteur in: ");
        String naam = s.nextLine();
        a.setNaam(naam);


        System.out.println("Geef de ISBN in: ");
        String ISBN = s.nextLine();

        System.out.println("Geef de titel in: ");
        String titel = s.nextLine();

        System.out.println("Geef het aantal bladzijdes in: ");
        int bladzijde = s.nextInt();
        Boek boek = new Boek(ISBN, titel, bladzijde, a.toString());

        boek.toonBoekGegevens();
    }

}
