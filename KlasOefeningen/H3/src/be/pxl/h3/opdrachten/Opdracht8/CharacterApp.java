package be.pxl.h3.opdrachten.Opdracht8;

import java.util.Scanner;

public class CharacterApp {

    public static void main(String[] args) {
        String artikelcode = "ab78";
        boolean geldigecode = true;
        for(int i=0;i < artikelcode.length(); i++){
            char karakter = artikelcode.charAt(i);

            if(i < 2){
                if(!Character.isLetter(karakter)){
                    geldigecode = false;
                    break;
                }
            } else {
                if(!Character.isDigit(karakter)){
                    geldigecode = false;
                    break;
                }
            }
        }
        if(!geldigecode){
            System.out.println("Ongeldige code");
        } else {
            System.out.println("Geldige code");
        }

/*        char eerste = Character.toUpperCase(artikelcode.charAt(0));
        System.out.println(eerste + artikelcode.substring(1));*/
        StringBuilder builder = new StringBuilder();
        builder.append(Character.toUpperCase(artikelcode.charAt(0)));
        builder.append(Character.toUpperCase(artikelcode.charAt(0)));
        builder.append(artikelcode.substring((2)));
        artikelcode = builder.toString();

        System.out.println(artikelcode);

    }

}
