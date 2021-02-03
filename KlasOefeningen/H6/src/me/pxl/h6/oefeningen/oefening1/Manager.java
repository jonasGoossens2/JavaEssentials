package me.pxl.h6.oefeningen.oefening1;

public class Manager extends Werknemer{
    private int bonus;
    private static int aantal;

    public Manager(String voornaam, String naam, int salaris, String functie){
        this(voornaam, naam, salaris, functie, 50);
    }

    public Manager(String voornaam, String naam, int salaris, String functie, int bonus){
        super(voornaam, naam, salaris, functie);
        setBonus(50);
        aantal++;

    }
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public static int getAantal() {
        return aantal;
    }

    @Override
    public int getSalaris(){
        return getSalaris() + getBonus();
    }

    public double getProcAandeelManagers(){
        return getAantal() / (double) super.getAantal() * 100;
    }
}
