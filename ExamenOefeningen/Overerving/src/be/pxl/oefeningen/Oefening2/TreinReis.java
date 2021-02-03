package be.pxl.oefeningen.Oefening2;

public class TreinReis  extends Reis{
    private boolean nationaal;
    private static String[] NATIONALE_RITTEN = {"IC", "IR", "L", "P"};
    public String specificatie;

    public TreinReis(String bestemming, double prijs, boolean nationaal, String specificatie){
        super(bestemming, prijs);
        setNationaal(nationaal);
        setSpecificatie(specificatie);
    }

    public TreinReis(String bestemming){
        super(bestemming);
        setNationaal(true);
        setSpecificatie("IC");
    }

    public boolean isNationaal() {
        return nationaal;
    }

    public void setNationaal(boolean nationaal) {
        this.nationaal = nationaal;
    }

    public String getSpecificatie() {
        return specificatie;
    }

    public void setSpecificatie(String specificatie) {
        if(isNationaal()){
            for(String rit: NATIONALE_RITTEN){
                if(rit.equals(specificatie)) {
                    this.specificatie = specificatie;
                    break;
                }
                this.specificatie = "IC";
            }
        }else {
            this.specificatie = specificatie;
        }
    }
}
