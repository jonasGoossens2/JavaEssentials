package Oefening1;

public class Datum {
    private int dag;
    private int maand;
    private int jaar;
    private String[] maandNamen = {"Januari", "Februari", "Maart", "April", "Mei", "Juni", "Juli", "Augustus", "September", "Oktober", "November", "December"};

    public Datum() {
        System.out.println(getDag() + "/" + getMaand() + "/" + getJaar());
    }


    public void setDag(int dag) {
        this.dag = dag;
    }

    public void setMaand(int maand) {
        if(maand > 1 && maand < maandNamen.length){
            this.maand = maand;
        }else{
            if(maand < 1){
                this.maand = 1;
            }else{
                this.maand = 12;
            }
        }
    }

    public void toString3(){
        System.out.println(getDag() + " " + maandNamen[getMaand()] + " " + getJaar());
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public void setMaandNamen(String[] maandNamen) {
        this.maandNamen = maandNamen;
    }

    public int getDag() {
        return dag;
    }

    public int getMaand() {
        return maand;
    }

    public int getJaar() {
        return jaar;
    }

    public String[] getMaandNamen() {
        return maandNamen;
    }
}
