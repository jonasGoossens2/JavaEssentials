package me.pxl.h6.oefeningen.oefening2;

public class TreinReis extends Reis{

    private boolean nationaal;
    private String speficiatie;
    private String[] ritten =  {"IC", "IR", "L", "P"};

    public TreinReis(String bestemming, double prijs, boolean nationaal, String speficiatie){
        super(bestemming, prijs);
        setNationaal(nationaal);
        setSpeficiatie(speficiatie);
    }
    public TreinReis(String bestemming){
        this(bestemming, Reis.getMinimumPrijs(), true, "IC");
    }

    public boolean isNationaal() {
        return nationaal;
    }

    public void setNationaal(boolean nationaal) {
        this.nationaal = nationaal;
    }

    public String getSpeficiatie() {
        return speficiatie;
    }

    public void setSpeficiatie(String speficiatie) {
        if(isNationaal()){
            for(String s : getRitten()){
                if(speficiatie.equals(s)){
                    this.speficiatie = speficiatie;
                    break;
                }else{
                    this.speficiatie = "IC";
                }
            }
        }else {
            this.speficiatie = speficiatie;
        }
    }

    public String[] getRitten() {
        return ritten;
    }

    public void setRitten(String[] ritten) {
        this.ritten = ritten;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        if(isNationaal()){
            builder.append(String.format("Nationale treinreis (%s)", getSpeficiatie()));
        }else{
            builder.append(String.format("Internationale treinreis (%s)", getSpeficiatie()));
        }
        return builder.toString();
    }
}
