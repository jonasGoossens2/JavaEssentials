package Oefening1;

import java.util.Scanner;

public class Oefening1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lengte: ");
        double lengte = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Breedte: ");
        double breedte = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Diepte: ");
        double diepte = scanner.nextDouble();
        scanner.nextLine();
        double volume = lengte + breedte + diepte;
        System.out.println("aantal liter water: "+ (volume * 0.98) + "aantal liter ontsmettingsmiddel: " + (volume * 0.02));

    }
}
