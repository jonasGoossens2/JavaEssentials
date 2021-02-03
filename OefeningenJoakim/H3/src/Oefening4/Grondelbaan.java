package Oefening4;

public class Grondelbaan {
    private String naam;
    private String land;
    private int hoogteDalstation;
    private int hoogteBergstation;
    private double lengte;
    private int snelheid;
    private int passagiersPerGondel;
    private int aantalGondels;

    public static final String[] GELDIGE_LANDEN = {"Frankrijk", "Oostenrijk", "Zwitserland", "Italië"};

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        for(String geldigland: GELDIGE_LANDEN){
            if(land.equals(geldigland)){
                this.land = land;
                break;
            }
        }
        this.land = "onbekend";
    }

    public int getHoogteDalstation() {
        return hoogteDalstation;
    }

    public int getHoogteBergstation() {
        return hoogteBergstation;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(int snelheid) {
        snelheid = Math.max(3, snelheid); // minimaal 3 groot
        snelheid = Math.min(8, snelheid); // maximaal 8 groot
        this.snelheid = snelheid;
    }

    public int getPassagiersPerGondel() {
        return passagiersPerGondel;
    }

    public void setPassagiersPerGondel(int passagiersPerGondel) {
        this.passagiersPerGondel = passagiersPerGondel;
    }

    public int getAantalGondels() {
        return aantalGondels;
    }

    public void setAantalGondels(int aantalGondels) {
        this.aantalGondels = aantalGondels;
    }
    public int getHoogteVerschil(){
        return hoogteBergstation - hoogteDalstation;
    }
    public void setHoogte(int a, int b){
        hoogteDalstation = Math.min(a, b); // om te kijken of het een dalstation is
        hoogteBergstation = Math.max(a, b);
    }

    public Grondelbaan(String naam, String land, double lengte, int snelheid) {
        this.naam = naam;
        this.land = land;
        setLand(land);
        setSnelheid(snelheid);
    }

    public Grondelbaan(String naam, String land) {
        this(naam, land, 2, 6);
    }
}
