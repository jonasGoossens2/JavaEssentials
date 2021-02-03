package be.pxl.oefeningen.Oefening2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class KaartApp {
    public static void main(String[] args) {

        Kaart[] kaarten = new Kaart[52];

        int index = 0;
        for(Soort soort: Soort.values()){
            for(Ranking waarde: Ranking.values()){
                kaarten[index] = new Kaart(soort, waarde);
                index += 1;
            }
        }
        Collections.shuffle(Arrays.asList(kaarten));
        Kaart pckaart = kaarten[0];
        Kaart mijnKaart = kaarten[1];

        if (pckaart.getWaarde().ordinal() < mijnKaart.getWaarde().ordinal()) {
            System.out.println("Computer says hurray");
        }else if(pckaart.getWaarde().ordinal() > mijnKaart.getWaarde().ordinal()){
            System.out.println("Ik heb gewonnen");
        }else{
            System.out.println("Niemand heeft gewonnen");
        }
    }
}