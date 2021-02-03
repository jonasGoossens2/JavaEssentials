package be.pxl.hoofdstuk1.oef1;

import java.util.Scanner;

public class CeliusNaarFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Graden in C?");
        int Celcius = scanner.nextInt();
        scanner.nextLine();

        double fahrenheit = (9.0 / 5) * Celcius + 32;
        double rounded = Math.round(fahrenheit * 10)/10.0;

        System.out.println(Celcius + " ==> " + rounded);
    }
}
