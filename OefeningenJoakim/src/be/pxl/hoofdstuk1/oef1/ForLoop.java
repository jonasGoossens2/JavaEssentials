package be.pxl.hoofdstuk1.oef1;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=0; i<=100; i+=10){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Aantal lijnen?");
        int lijnen = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Beginletter");
        String Beginletter = scanner.nextLine();
        char letter = Beginletter.charAt(0);

        for(int i=0; i<lijnen; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(letter + "\t");

                if(letter == 'Z'){
                    letter = 'A';
                }else{
                    letter++;
                }

            }
            System.out.println();
        }
    }
}
