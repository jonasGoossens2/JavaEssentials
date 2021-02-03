package Opdracht8;

public class Cirkel extends GrafischElement {

    private double straal;



    public Cirkel(int x, int y, double straal){
        super(x,y);
        this.straal = straal;

    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public double getStraal() {
        return straal;
    }

    @Override
    public double getOppervlakte() {
        return Math.PI * straal;
    }

    @Override
    public double getOmtrek() {
        return 2 * Math.PI * straal;
    }
}
