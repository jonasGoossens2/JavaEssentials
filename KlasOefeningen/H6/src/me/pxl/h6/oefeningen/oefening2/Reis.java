package me.pxl.h6.oefeningen.oefening2;

import javax.swing.*;
import java.text.Format;

public abstract class Reis {
    private String bestemming;
    private double prijs;
    private static final double MINIMUM_PRIJS = 5;

    public Reis(String bestemming){
        this(bestemming, MINIMUM_PRIJS);
    }

    public static double getMinimumPrijs() {
        return MINIMUM_PRIJS;
    }

    public Reis(String bestemming, double prijs){
        setBestemming(bestemming);
        setPrijs(prijs);
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        if(prijs < MINIMUM_PRIJS){
            this.prijs = MINIMUM_PRIJS;
        }else {
            this.prijs = prijs;
        }
    }

    public String getBestemming() {
        return bestemming;
    }

    public void setBestemming(String bestemming) {
        if(Character.isDigit(bestemming.charAt(0))){
            this.bestemming = bestemming.substring(1);
        }else {
            this.bestemming = bestemming;
        }
    }

    @Override
    public String toString(){
        return String.format("Reis met bestemming %s kost %f.2 euro.", bestemming, prijs);
    }
}
