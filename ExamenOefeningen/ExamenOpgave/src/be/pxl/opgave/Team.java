package be.pxl.opgave;
/* naam: Goossens Jonas*/

import java.util.ArrayList;

public class Team{
    private final Sport sport;
    private final ArrayList<Speler> spelers;

    public Team(Sport sport){
        this.sport = sport;
        this.spelers = new ArrayList<>(sport.getAantalSpelers());
    }

    private Boolean spelerKomtVoorSpeler(Speler speler){
        return true;
    }

    public void voegSpelerToe(Speler speler){
        //check if speler sport equals team sport and check if id is unique.
        if(speler.getSport() != speler.getSport() && !spelerIdKomtVoor(speler.getId())){
            System.out.println("Foutieve ingave.");
            return;
        }
        //check if there is any space in array.
        int legeIndex = vindVrijePositie();
        if(legeIndex != -1){
            spelers.set(legeIndex, speler);
        }else{
            System.out.println("Geen plaats meer vrij in het team.");
        }
    }

    private int vindVrijePositie(){
        if(spelers.size() < sport.getAantalSpelers()){
            return spelers.size();
        }else {
            return -1;
        }
    }

    public boolean spelerIdKomtVoor(String id){
        Speler speler = new Speler(id);
        for(Speler player: spelers) {
            if (speler.equals(player)) {
                return false;
            }
        }
        return true;
    }

    public String toString()
    {
        if(vindVrijePositie() == -1){
            return "Onvolledig team.";
        }else{
            StringBuilder builder = new StringBuilder();
            for(Speler speler: spelers) {
                builder.append(speler.toString()).append("\n");
            }
            return builder.toString();
        }
    }
}

