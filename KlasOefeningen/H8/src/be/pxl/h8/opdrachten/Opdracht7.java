package be.pxl.h8.opdrachten;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Opdracht7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef een dag (1-7)");
        int nummer = scanner.nextInt();
        scanner.nextLine();

        DayOfWeek dag = DayOfWeek.values()[nummer -1]; // mogelijkheid 1
        DayOfWeek zelfde = DayOfWeek.of(nummer); // mogelijkheid 2

        System.out.println(dag);
        System.out.println(zelfde);

        System.out.println("Hoeveel dagen moeten er worden bijgeteld?: ");
        int aantal = scanner.nextInt();

        DayOfWeek nieuwe = dag.plus(aantal);
        System.out.println(nieuwe);

        scanner.close();
    }
}
