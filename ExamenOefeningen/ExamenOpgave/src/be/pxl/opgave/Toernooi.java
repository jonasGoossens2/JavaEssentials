package be.pxl.opgave;
/* naam: Goossens Jonas*/

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Toernooi{
    private ArrayList<Wedstrijd> wedstrijden;
    private static final int MAX_AANTAL_WEDSTRIJDEN = 10;

    public Toernooi(){
        wedstrijden = new ArrayList<Wedstrijd>(MAX_AANTAL_WEDSTRIJDEN);
    }

    public void voegWedstrijdToe(Wedstrijd wedstrijd){
        if(wedstrijden.contains(null)){
            wedstrijden.add(wedstrijd);
        }else{
            System.out.println("geen ruimte meer voor wedstrijden.");
        }
    }
    public LocalDateTime zoekDatumVolgendeWedstrijdVan(String spelerid){
        return null;
    }
}

