package Opdracht8;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Opdracht {


    public static void main(String[] args) {
        LocalDate datum = LocalDate.of(2002, 07, 30);
        System.out.println("Dag van de week " + datum.getDayOfWeek());
        System.out.println("Dag van het jaar " + datum.getDayOfYear());
        System.out.println("Schrikkel? " + datum.isLeapYear());
    }
}
