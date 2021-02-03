package Oef2;

import java.util.Arrays;
import java.util.Collections;

public class KaartApp {
    public static void main(String[] args) {

        Kaart[] kaartspel = new Kaart[52];

        //Plaatjes vullen met de kaarten => (door enum loopen)
        int i = 0;
        //soort kiezen
        for(Soort soort: Soort.values()){
            //Rank kiezen
            for(Ranking ranking : Ranking.values()){
                kaartspel[i] = new Kaart(soort, ranking);
                i++;
            }
        }
        //Door elkaar gooien
        Collections.shuffle(Arrays.asList(kaartspel));

        //Kaart uitdelen
        Kaart pcKaart = kaartspel[0];
        Kaart mijnKaart = kaartspel[1];

        System.out.println("PC: " + pcKaart);
        System.out.println("IK: " + mijnKaart);

        //Checken wie heeft gewonnen
        if(pcKaart.getRanking().ordinal() > mijnKaart.getRanking().ordinal()){
            System.out.println("Computer says hurray");
        }else if(pcKaart.getRanking().ordinal() < mijnKaart.getRanking().ordinal()){
            System.out.println("Ik heb gewonnen");
        }else{
            System.out.println("Gelijkspel");
        }
    }
}
