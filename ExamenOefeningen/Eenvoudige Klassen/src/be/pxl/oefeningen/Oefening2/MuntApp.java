package be.pxl.oefeningen.Oefening2;

public class MuntApp {
    public static void main(String[] args) {
        Munt[] munten = {new Munt("Amerikaanse dollar", 1.287), new Munt("euro", 1.142),
                            new Munt("russische roebel", 68.950)};
        System.out.println("Overzicht koersen tov Briste pond: 1 Briste pond = ");
        for(Munt munt: munten){
            System.out.println(munt.getKoers() + " " + munt.getNaam());
        }
    }
}
