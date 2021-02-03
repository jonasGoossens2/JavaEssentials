package be.pxl.h2.opdrachten.voorbeeld1;

import javax.crypto.ShortBufferException;

public class Rechthoek {
    private int x;
    private int y;
    private int hoogte;
    private int breedte;
    public static final int HOEKEN = 4;
    private static int tel = 0;
    //constructors
    public Rechthoek(){
        this(1,1);
    }
    public Rechthoek(int breedte, int hoogte){
        this(0,0,breedte, hoogte);
    }
    public Rechthoek(int x, int y, int breedte, int hoogte){
        setHoogte(hoogte);
        setBreedte(breedte);
        setX(x);
        setY(y);
        tel++;
    }
    //copy constructor
    public Rechthoek(Rechthoek kopie){
        this(kopie.x, kopie.y, kopie.breedte, kopie.hoogte);
    }
    // set & gets
    public void setPositie(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setBreedte(int breedte){
        if (breedte < 0){
            this.breedte = -breedte;
        } else {
            this.breedte = breedte;
        }
    }
    public void setHoogte(int hoogte){
        this.hoogte =   Math.abs(hoogte); // een mogelijkheid
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    //methods
    public void groei(int dw, int dh){
        setBreedte(breedte + dw);
        setHoogte(hoogte + dh);
    }
    public void groei(int groei){
        groei(groei, groei);
    }
    public double getOppervlakte(){
        return breedte * hoogte;
    }
    public double getOmtrek(){
        return 2 * (breedte + hoogte);
    }
    public void print(){
        System.out.printf("%d, %d, %d, %d(%d hoeken)%n", x, y, breedte, hoogte, HOEKEN);
    }
    public int getTel(){
        return tel;
    }
}
