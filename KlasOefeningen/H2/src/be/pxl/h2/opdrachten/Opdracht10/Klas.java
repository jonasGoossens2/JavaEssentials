package be.pxl.h2.opdrachten.Opdracht10;

public class Klas {
    private String klas;
    private int aantalStudenten;
    public static final int MAX_STUDENTEN = 40;
    private static int tel = 0;
    private static int totaalAantalStudenten = 0;

    public Klas(){
        this("1Tinx", 0);
    }
    public Klas(String klas, int aantalStudenten){
        setKlas(klas);
        setAantalStudenten(aantalStudenten);
        tel++;
    }
    public String getKlas(){
        return klas;
    }
    public void setKlas(String klas) {
        this.klas = klas;
    }
    public int getAantalStudenten() {
        return aantalStudenten;
    }
    public void setAantalStudenten(int aantalStudenten) {
        totaalAantalStudenten -= this.aantalStudenten;
        this.aantalStudenten = Math.min(aantalStudenten, MAX_STUDENTEN);
        totaalAantalStudenten += this.aantalStudenten;
    }

    public static int getTel() {
        return tel;
    }

    public static int getTotaalAantalStudenten() {
        return totaalAantalStudenten;
    }
}
