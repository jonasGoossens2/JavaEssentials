package Oefening.Hoofdstuk1;

import java.util.Scanner;

public class Oefening6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] karakters = {'z', 'b', 'r', 'o', 'g', 'G', 'B', 'V', 'L', 'W'};
        char[] code = new char[3]; // ['r', 'b', 'X']
        int[] waardes = {-1, -1, -1};// [2 , 1, 3] ==> [a, b, c]

        System.out.println("Eerste letter");
        code[0] = scanner.nextLine().charAt(0);

        System.out.println("Tweede letter");
        code[1] = scanner.nextLine().charAt(0);

        System.out.println("Derde letter");
        code[2] = scanner.nextLine().charAt(0);

        for(int i=0;i<code.length;i++) {
            for(int j=0;j<karakters.length;j++) {
                if(code[i] == karakters[j]) {
                    waardes[i] = j;
                }
            }
        }

        boolean geldig = true;
        for(int w : waardes) {
            if(w == -1) {
                geldig = false;
            }
        }

        if(geldig) {
            double r = (10 * waardes[0] + waardes[1]) * Math.pow(10, waardes[2]);
            System.out.println("Weerstand: " + r);
        } else {
            System.out.println("Er is een ongeldig karakter ingevuld...");
        }
    }
}
