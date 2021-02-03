package Opdracht8;

import java.time.LocalDate;
import java.time.LocalTime;

public class LokaleDingen {
    public static void main(String[] args) {
        LocalDate datum = LocalDate.now();
        System.out.println("Now >> " + datum);

        LocalDate datum2 = LocalDate.of(2002, 2, 15);
        System.out.println("datum 2 >> " + datum2);

        LocalTime tijd = LocalTime.now();
        System.out.println("Uur >> " + tijd);
    }
}
