package be.pxl.h1.Opdrachten;

import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aantal Lijnen: ");
        int lijnen = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Beginletter: ");
        String beginletter = scanner.next();
        char letter = beginletter.charAt(0);

        for (int i=0; i<lijnen; i++){
            for(int j=0; j<i + 1;j++){
                System.out.print(letter + "\t");
                if(letter == 'Z') {
                    letter = 'A';
                } else {
                    letter++;
                }
            }
            System.out.println();
        }
    }
}
