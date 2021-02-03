package Oefening4;

public class Gondelbaan {
    private String naam;
    private String land;
    private int hoogteDalstation;
    private int hoogteBergstation;
    private double lengte;
    private int snelheid;
    private int passagiersGondels;
    private int aantalGondels;

    public static final String[] GELDIGE_LANDEN = { "Frankrijk", "Oostenrijk", "Zwitserland", "Italië"};

    public Gondelbaan(String naam, String land, double lengte, int snelheid) {
        this.naam = naam;
        setLand(land);
        this.lengte = lengte;
        setSnelheid(snelheid);
    }

    public Gondelbaan(String naam, String land) {
        this(naam, land, 2, 6);
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLand(String land) {
        for(String geldigLand : GELDIGE_LANDEN){
            if(land.equals(geldigLand)){
                this.land = land;
                return;
            }
        }
        this.land = "Onbekend";
    }

    public void setHoogteDalstation(int hoogteDalstation) {
        this.hoogteDalstation = hoogteDalstation;
    }

    public void setHoogteBergstation(int hoogteBergstation) {
        this.hoogteBergstation = hoogteBergstation;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setSnelheid(int snelheid) {
        snelheid = Math.max(3, snelheid);
        snelheid = Math.min(8, snelheid);

        this.snelheid = snelheid;
    }

    public void setPassagiersGondels(int passagiersGondels) {
        this.passagiersGondels = passagiersGondels;
    }

    public void setAantalGondels(int aantalGondels) {
        this.aantalGondels = aantalGondels;
    }

    public String getNaam() {
        return naam;
    }

    public String getLand() {
        return land;
    }

    public int getHoogteDalstation() {
        return hoogteDalstation;
    }

    public int getHoogteBergstation() {
        return hoogteBergstation;
    }

    public int getHoogteverschil(){
        return hoogteBergstation - hoogteDalstation;
    }

    public void setHoogte(int a, int b){
        hoogteDalstation = Math.min(a,b);
        hoogteBergstation = Math.max(a,b);
    }

    public double getLengte() {
        return lengte;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public int getPassagiersGondels() {
        return passagiersGondels;
    }

    public int getAantalGondels() {
        return aantalGondels;
    }


}
