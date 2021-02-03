package be.pxl.h1.Opdrachten;

import java.util.Scanner;

public class CelsiusNaarFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Celcius = scanner.nextInt();
        scanner.nextLine();
        Double fahrenheit = 9.0 / 5 * Celcius + 32;
        System.out.println(fahrenheit);

        //afronden | Math.round() rond af tot een int.
        double rounded = Math.round(fahrenheit * 10) / 10.0;
    }
}
