package be.pxl.h2;

public class Rechthoek {
    private int x = 18;
    private int y;
    private int breedte;
    private int hoogte;

    public int getBreedte(){
        return breedte;
    }
    public void setBreedte(int breedte){
        if(breedte < 0){
            this.breedte = -breedte;
        }
        else{
            this.breedte = breedte;
        }

    }
    public int getHoogte(){
        return hoogte;
    }
    public void setHoogte(int hoogte){
        if(hoogte < 0){
            this.hoogte = -hoogte;
        }
        else {
            this.hoogte = hoogte;
        }
    }
    public int getX(){

        return x;
    }

    public int getY(){
        return y;
    }

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

    public void groei(int dw, int dh){
        setBreedte(breedte + dw);
        setHoogte(hoogte + dh);
    }

    public int getOmtrek(){
        return(breedte+hoogte) * 2;
    }

    public int getOppervlakte(){
        return breedte * hoogte;
    }
    public void print(){
        System.out.printf("%d, %d, %d, %d", x, y, hoogte, breedte);
    }

    public void groei(int getal){
        groei(getal, getal);
    }
    //contructors
    public Rechthoek(){

    }
    public Rechthoek(int breedte, int hoogte){
        setHoogte(hoogte);
        setBreedte(breedte);

    }
    public Rechthoek(int x, int y, int breedte, int hoogte){
        setHoogte(hoogte);
        setBreedte(breedte);
        setX(x);
        setY(y);
    }
    public Rechthoek(Rechthoek kopie){
        this.breedte = kopie.getBreedte();
        this.hoogte = kopie.getHoogte();
        this.x = kopie.getX();
        this.y = kopie.getY();
    }
}

