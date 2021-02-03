package be.pxl.h1.Opdrachten;

import java.util.Scanner;

public class ControleBBAN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Laatste 12 cijfers:");
        long invoer = scanner.nextLong();
        scanner.nextLine();
        long resultaat = invoer * 1000000;
        resultaat += 111400;
        resultaat %= 97;
        resultaat = 98 - resultaat;
        System.out.println(resultaat);

    }
}
