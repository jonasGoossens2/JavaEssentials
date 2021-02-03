package be.pxl.h1.oefeningen.Oefening5;

import java.util.Scanner;

public class Oefening5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hotelcode: ");
        String hotelCode = scanner.nextLine();
        scanner.nextLine();
        double prijs = 0.0;
        while (!hotelCode.contains("/")) {
            System.out.println("Aantal sterren: ");
            int aantalSterren = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kindercode: ");
            char kindercode = scanner.next().charAt(0);
            while ((kindercode > 'Z') || (kindercode < 'A')) {
                System.out.println("Verkeerde invoer probeer opnieuw.");
                kindercode = scanner.next().charAt(0);
            }
            if (aantalSterren == 4 || aantalSterren == 5) {
                prijs = 60;
            } else if (aantalSterren == 3) {
                if (hotelCode.contains("BR") || hotelCode.contains("AN")) {
                    prijs = 60;
                } else {
                    prijs = 56;
                }
            } else {
                prijs = 48;
            }
            if (hotelCode.contains("HI")) {
                prijs = 70;
            }
            if (kindercode == 'A' || hotelCode == "HA") {
                prijs = 0;
            } else {
                prijs = prijs * 0.50;
            }
            System.out.println(hotelCode + aantalSterren + prijs);

        }
    }
}

