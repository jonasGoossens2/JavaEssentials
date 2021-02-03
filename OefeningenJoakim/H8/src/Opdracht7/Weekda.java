package Opdracht7;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Weekda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de weekdag in (1-7): ");
        int nummer = scanner.nextInt();
        scanner.nextLine();

        DayOfWeek dag = DayOfWeek.values()[nummer-1];
        System.out.println(dag);

        System.out.println("Hoeveel dagen moet ik er bij tellen?");
        int aantal = scanner.nextInt();

        DayOfWeek nieuwe = dag.plus(aantal);
        System.out.println(">> "+ nieuwe);

        scanner.close();
    }
}
