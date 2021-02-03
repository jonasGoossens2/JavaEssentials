package be.pxl.h1.Opdrachten;

import java.util.Scanner;

public class StringsVergelijken {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je naam: ");
        String naam1 = scanner.next();
        System.out.println("Geef je naam nog eens: ");
        String naam2 = scanner.next();
        if (naam1.equals(naam2)){
            System.out.println("Ze zijn hetzelfde");
        }
        else{
            System.out.println("Ze zijn nietzelfde");
        }
        scanner.close();
    }
}
