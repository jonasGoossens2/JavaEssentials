package be.pxl.h2;

public class RechthoekApp {
    public static void main(String[] args) {
        System.out.println("Dit programma maakt een rechthoek");
        Rechthoek rechthoek = new Rechthoek();
        Rechthoek rechthoek2 = new Rechthoek();

        rechthoek.print();
        rechthoek.setX(10);
        rechthoek.setY(2);
        rechthoek.setHoogte(4);
        rechthoek.setBreedte(3);

        rechthoek.print();
        rechthoek2.print();

        System.out.println("Omtrek: " + rechthoek.getOmtrek());
        int opp = rechthoek.getOppervlakte();
        System.out.println("opp: " + opp);
    }
}
