package be.pxl.opgave;
/* naam: Goossens Jonas*/

public enum Sport{
    VOETBAL(11), VOLLEYBAL(8), TENNIS(2);

    private int aantalSpelers;

    Sport(int aantalSpelers) {
        this.aantalSpelers = aantalSpelers;
    }

    public int getAantalSpelers() {
        return aantalSpelers;
    }

    public String toString()
    {
        return name().substring(0,3).toLowerCase();
    }
}

