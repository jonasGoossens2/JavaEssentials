package be.pxl.h1.Opdrachten;

import java.util.Scanner;

public class Variabelen {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int sum = a + b;
        System.out.println("De som is " + sum);
        boolean boel = true;
        char stoel = 's';
        int erin = 5;
        long lang = 5000;
        double kommagetal = 4.5;
        int resultaat = 5 / 7; // gehele deling

        /* Scanner input = new Scanner(System.in);
        System.out.println("Geef je naam");
        String naam = input.next();
        input.close();
        System.out.println(naam); */

        Scanner input = new Scanner(System.in);
        System.out.println("Wat is je voornaam?");
        String firstName = input.next();
        System.out.println("Wat is je achternaam");
        String LastName = input.next();
        String Naam = firstName + LastName;
        System.out.println(Naam);
    }
}
