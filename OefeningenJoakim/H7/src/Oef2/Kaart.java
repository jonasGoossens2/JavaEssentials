package Oef2;

public class Kaart {
    private Soort soort;
    private Ranking ranking;

    public Kaart(Soort soort, Ranking ranking) {
        this.soort = soort;
        this.ranking = ranking;
    }

    public void setSoort(Soort soort) {
        this.soort = soort;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    public Soort getSoort() {
        return soort;
    }

    public Ranking getRanking() {
        return ranking;
    }
    @Override
    public String toString(){
        return soort + " " + ranking;
    }
}
