package OefeningA;

public class Instrument {
    private String naam;
    private String geluid;

    public Instrument(){
        this("onbekend", "onbekend");
    }
    public Instrument(String naam, String geluid){
        this.naam = naam;
        this.geluid = geluid;
    }
    public void speel(){
        System.out.println(geluid);
    }
    public String toString(){
        return naam;
    }
}
