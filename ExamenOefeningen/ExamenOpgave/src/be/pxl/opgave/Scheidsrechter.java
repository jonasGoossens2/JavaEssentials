package be.pxl.opgave;
/* naam: Goossens Jonas*/

public final class Scheidsrechter extends Persoon{
    public Scheidsrechter(String id, String naam){
        super(id, naam);
    }

    public String toString(){
        return String.format("[%s] %s <ref>", getId(), getNaam());
    }
}
