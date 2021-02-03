package Oefening1;

public abstract class WereldObject {

    private Punt positie;

    public WereldObject(int x, int y){
        this.positie = new Punt(x,y);
    }
    public void setx(int x){
        this.positie.setX(x);
    }
    public void sety(int y){
        this.positie.setY(y);
    }
    public void getx(int x){
        this.positie.getX();
    }
    public void gety(int y){
        this.positie.getY();
    }
    //andere nog toevoegen

    public double berekenAfstand(WereldObject wereldObject){
        // x1, y1 this.positie
        // x2, y2 wereldObject.positie

        return this.positie.berekenAfstand(wereldObject.positie);
    }

    public abstract void beschrijf();
}
