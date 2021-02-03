package me.pxl.h6.opdrachten.Opdracht5;

public abstract class GrafischElement {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPositie(int x, int y){
        setX(x);
        setY(y);
    }

    public GrafischElement(int x, int y){
        setX(x);
        setY(y);
    }

    public abstract double getOppervlakte();

    public abstract double getOmtrek();
}
