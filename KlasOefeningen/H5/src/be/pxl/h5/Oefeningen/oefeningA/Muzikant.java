package be.pxl.h5.Oefeningen.oefeningA;

public class Muzikant {

    private String naam;
    private Instrument instrument;

    public Muzikant(){
        this("onbekend", new Instrument());
    }
    public Muzikant(String naam, Instrument instrument){
        this.naam = naam;
        setInstrument(instrument);
    }
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    public void speel(){

        instrument.speel();
    }
    public String toString(){
        String resultaat = String.format("%s [%s]", naam, instrument.toString());
        return resultaat;
    }
}
