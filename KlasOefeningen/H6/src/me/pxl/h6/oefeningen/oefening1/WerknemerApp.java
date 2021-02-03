package me.pxl.h6.oefeningen.oefening1;

public class WerknemerApp {
    public static void main(String[] args) {
        Werknemer werknemer1 = new Werknemer("Jos", "jossens", 1300, "slaaf");
        Werknemer werknemer2 = new Werknemer("Jan", "jansens", 1500, "slaaf");
        Werknemer werknemer3 = new Werknemer("peter", "goossens", 2000, "kok");
        Manager manager = new Manager("Jonas", "Goossens", 2500, "baas", 300);

        Werknemer werknemer = new Manager("Jonas", "Goossens", 2500, "baas", 300);

        werknemer1.print();
        System.out.println(manager.getProcAandeelManagers());
    }
}
