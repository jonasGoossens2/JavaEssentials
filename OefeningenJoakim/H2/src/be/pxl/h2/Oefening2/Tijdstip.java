package be.pxl.h2.Oefening2;

public class Tijdstip {
    private int seconden;
    private int minuten;
    private int uren;

    public void setSeconden(int seconden) {
        while(seconden > 86399){
            seconden -= 86399;
        }
        this.seconden = seconden;
    }

    public int getSeconden() {
        return seconden;
    }

    public void Tijdstip(int seconden){
        uren = seconden % 3600;
        System.out.println(uren);
        minuten = uren % 60;
        System.out.println(minuten);
        seconden = uren % 60;
    }
}
