package be.pxl.oefeningen.Oefening2;

public class Kaart {
    private Ranking waarde;
    private Soort soort;

    public Kaart(Soort soort, Ranking ranking){
        setSoort(soort);
        setWaarde(ranking);
    }

    public Ranking getWaarde() {
        return waarde;
    }

    public void setWaarde(Ranking waarde) {
        this.waarde = waarde;
    }

    public Soort getSoort() {
        return soort;
    }

    public void setSoort(Soort soort) {
        this.soort = soort;
    }

    @Override
    public String toString(){
        return getWaarde() + " " + getSoort();
    }
}
