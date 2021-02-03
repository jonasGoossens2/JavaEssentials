package Oefening.Hoofdstuk1;

public class Oefening3 {
    public static void main(String[] args) {

        double getal = 0;

        System.out.printf("%20s %-20s %20s %20s%n", "1. gewoon", "2. links", "3. rechts (met nul)", "4. 3 dec");
        for(int i=1;i<=9;i++) {
            getal = (getal * 10) + i;

            System.out.printf("%20f %-20f %020f %20.3f%n", getal, getal, getal, getal);
        }
    }
}
