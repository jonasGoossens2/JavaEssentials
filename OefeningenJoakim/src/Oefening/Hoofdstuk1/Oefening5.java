package Oefening.Hoofdstuk1;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef het aantal volwassenen in: ");
        int aantalVolwassenen = scanner.nextInt();

        System.out.println("Geef het aantal kinderen in: ");
        int aantalKinderen = scanner.nextInt();

        System.out.println("Geef de hotelcode in: ");
        String hotelcode = scanner.nextLine();
        double totaalBedrag = 0;
        while (hotelcode != "/"){
            totaalBedrag = 0;
            System.out.println("Geef het aantal sterren in (1-5): ");
            int aantalSterren = scanner.nextInt();

            System.out.println("Geef de kindercode in: ");
            String kinderCode = scanner.nextLine();

            while((kinderCode.charAt(0) < 97) && (kinderCode.charAt(0) > 122)){
                System.out.println("Geef de kindercode in: ");
                kinderCode = scanner.nextLine();
            }
            if((aantalSterren == 4) || (aantalSterren == 5) || (hotelcode == "BR") || (hotelcode == "AN")){
                totaalBedrag = 60;
            } else{
                if(aantalSterren == 3){
                    totaalBedrag = 56;
                } else{
                    totaalBedrag = 48;
                }
            }
            if(hotelcode == "HI"){
                totaalBedrag = 70;
            }
            double eindbedrag = 0;
            double bedragVolwassenen = totaalBedrag * aantalVolwassenen;
            eindbedrag = totaalBedrag * aantalVolwassenen;
            double kindergeld = 0;
            if((kinderCode == "A") || (aantalSterren == 1) || (aantalSterren == 2)){
                eindbedrag = eindbedrag;
            } else{
                kindergeld = aantalKinderen * (totaalBedrag/2);
                eindbedrag += kindergeld;
            }
            String sterren = "";
            if(aantalSterren == 1){
                sterren = "*";
            }else if(aantalSterren ==2){
                sterren = "**";
            } else if(aantalSterren == 3){
                sterren = "***";
            } else if(aantalSterren == 4){
                sterren = "****";
            } else if(aantalSterren == 5){
                sterren = "*****";
            }

            System.out.println(hotelcode + sterren + bedragVolwassenen + kindergeld + eindbedrag);
        }
    }
}
