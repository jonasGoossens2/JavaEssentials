package Opdracht1;

import java.util.Objects;

public class Cirkel extends GrafischElement {
    private double straal;

    public Cirkel(int x, int y, double r) {
        super(x, y);
        straal = r;
    }

    public Cirkel(double straal) {
        super(0, 0);
        this.straal = straal;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    @Override
    public double getOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public double getOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override // opdracht 9.3
    public String toString() {
        return String.format("Cirkel met straal %.1f op plaats (%d,%d)", straal, getX(), getY());
    }

    @Override // opdracht 10.3
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cirkel)) return false;
        Cirkel cirkel = (Cirkel) o;
        return (cirkel.getStraal() == getStraal()) && (cirkel.getX() == this.getX()) &&  (cirkel.getY() == this.getY());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getStraal());
    }

    @Override
    public void herschaal(int factor){
        setStraal(straal * factor / 100);
    }
}
