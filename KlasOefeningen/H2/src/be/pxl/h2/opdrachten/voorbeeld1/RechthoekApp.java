package be.pxl.h2.opdrachten.voorbeeld1;

public class RechthoekApp {

    public static void main(String[] args) {
        System.out.println("Dit programma maakt een rechthoek");
        Rechthoek rechthoek = new Rechthoek();
        rechthoek.setBreedte(5);
        rechthoek.setHoogte(5);
        rechthoek.setX(3);
        rechthoek.setY(3);
        rechthoek.groei(5, 10);
        System.out.println(rechthoek.getOppervlakte());
    }
}
