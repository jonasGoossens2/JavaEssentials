package Oefening1;

public class Manager extends Werknemer{
    private double bonus;
    private static int aantal;

    public static int getAantal() {
        return aantal;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public Manager(String naam, String voornaam, double salaris, String functie) {
        this(naam,voornaam,salaris, functie, 50);
    }

    public Manager(String naam, String voornaam, double salaris, String functie, double bonus) {
        super(naam, voornaam, salaris, functie);
        setBonus(bonus);
        aantal++;
    }

    @Override
    public double getSalaris() {
        return super.getSalaris() + getBonus();
    }

    public double getProcAandeelManager(){
        double percentage = (double) Manager.getAantal() / Werknemer.getAantalW() * 100;
        return Math.round(percentage * 100.0) / 100.0;
    }
}
