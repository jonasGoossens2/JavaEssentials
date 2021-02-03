package be.pxl.hoofdstuk1.oef1;

import java.util.Scanner;

public class OefeningBBAN {

    public static void main(String[] args) {
        long invoer = 539007547034L;
        System.out.println("Nummer: " + invoer);

        long resultaat = invoer * 1000000;
        resultaat += 111400;
        resultaat %= 97;
        resultaat = 98 - resultaat;
        System.out.println(resultaat);
    }
}
