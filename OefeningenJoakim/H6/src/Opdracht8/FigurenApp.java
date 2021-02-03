package Opdracht8;

public class FigurenApp {
    public static void main(String[] args) {

        Cirkel c1 = new Cirkel(1,2,3);

        System.out.printf("Omtrek: %.2f, opp: %.2f%n", c1.getOmtrek(), c1.getOppervlakte());


        if(c1 instanceof GrafischElement){
            System.out.println("Joepie");
        }

        if(c1 instanceof Object){
            System.out.println("Object joepie");
        }
    }
}
