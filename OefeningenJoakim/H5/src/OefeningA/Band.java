package OefeningA;

import java.util.Random;

public class Band {
    private String naam;
    private Muzikant[] leden;

    public Band(String naam, Muzikant[] muzikant){
        setNaam(naam);
        setLeden(muzikant);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Muzikant[] getLeden() {
        return leden;
    }

    public void setLeden(Muzikant[] leden) {
        this.leden = leden;
    }
    public void speel(int lengte){
        System.out.println("PXL-Digital in concert!");
        Random rnd = new Random();
        for(int i=0; i<lengte; i++){
            leden[rnd.nextInt(leden.length)].speel();
        }
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Pxl-Digital\n");
        for(int i=0; i<leden.length; i++){
            builder.append(leden[i]).append("\n");
        }
        return builder.toString();
    }
}
