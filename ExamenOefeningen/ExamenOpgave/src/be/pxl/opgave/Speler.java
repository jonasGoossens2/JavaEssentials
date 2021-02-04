package be.pxl.opgave;
/* naam: Goossens Jonas*/

public final class Speler extends Persoon{
    private Sport sport;

    public Speler(String id, String naam, Sport sport){
        super(id, naam);
        this.sport = sport;
    }

    public Speler(String id){
        this(id, "", null);
    }

    public Sport getSport() {
        return sport;
    }

    public String toString(){
        return String.format("[%s] %s (%s)", getId(), getNaam(), getSport());
    }
}

