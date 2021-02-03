package be.pxl.h2.oefeningen.Oefening2;

public class Tijdstip {

    private int seconden;
    private int minuten;
    private int uren;

    public Tijdstip(int seconden){
    }
    public Tijdstip(int uren, int minuten, int seconden){
    }
    public Tijdstip(Tijdstip tijdstip){
    }
    public int bepaalSeconden() {
        return seconden;
    }
    public void wijzigSeconden(int seconden) {
        while(seconden > 86399){
            seconden -= 86399;
        }
        this.seconden = seconden;
    }
    public int bepaalMinuten() {
        return minuten;
    }
    public void wijzigMinuten(int minuten) {
        this.minuten = minuten;
    }
    public int bepaalUren() {
        return uren;
    }
    public void wijzigUren(int uren) {
        this.uren = uren;
    }
    public void voegUrenToe(int uren){
        wijzigUren(this.uren + uren);
    }
    public void voegMinutenToe(int minuten){
        wijzigMinuten(this.minuten + minuten);
    }
    public void voegSecondenToe(int seconden){
        wijzigSeconden(this.seconden + seconden);
    }
    public void voegUrentoe(){
        voegUrenToe(1);
    }
    public String toStringTijd(boolean notatie){
        if(notatie) {
            return "";
        }else{
            return "";
        }
    }
}
