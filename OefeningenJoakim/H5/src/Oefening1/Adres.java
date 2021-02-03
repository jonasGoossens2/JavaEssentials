package Oefening1;

public class Adres {
    private String straat;
    private String HuisNummer;
    private String Gemeente;
    private int Postcode;


    Gemeente g = new Gemeente();


    public Adres(String straat, String huisNummer, String gemeente,int Postcode) {
        setHuisNummer(huisNummer);
        setStraat(straat);
        g.setGemeenteNaam(gemeente);
        g.setPostcode(Postcode);
    }

    public void toString1(){
        System.out.println(getStraat() + " " +getHuisNummer());
        System.out.println(g.toString());
    }

    public String getStraat() {
        return straat;
    }

    public String getHuisNummer() {
        return HuisNummer;
    }

    public String getGemeente() {
        return g.getGemeenteNaam();
    }

    public int getPostcode() {
        return g.getPostcode();
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public void setHuisNummer(String huisNummer) {
        HuisNummer = huisNummer;
    }

}
