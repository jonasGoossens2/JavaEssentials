package Opdracht9;

import java.time.LocalDate;
import java.time.Period;

public class Duur {
    public static void main(String[] args) {
        LocalDate vroeger = LocalDate.of(2002,7,30);
        LocalDate nu = LocalDate.now();

        Period p = Period.between(vroeger, nu);
        System.out.printf("Er zitten %d jaar, %d maanden en %d dagen tussen%n", p.getYears(), p.getMonths(), p.getDays());
    }
}
