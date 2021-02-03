package be.pxl.h8.opdrachten;

import java.time.LocalDate;

public class Opdracht8 {

    public static void main(String[] args) {
        LocalDate geboortedatum = LocalDate.of(2002, 07, 3);
        System.out.println(geboortedatum.getDayOfYear());
        System.out.println(geboortedatum.getDayOfWeek());
        System.out.println(geboortedatum.isLeapYear());
    }
}
