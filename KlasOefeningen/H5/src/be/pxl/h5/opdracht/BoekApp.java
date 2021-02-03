package be.pxl.h5.opdracht;

public class BoekApp {

    public static void main(String[] args) {
        Boek boek = new Boek();
        boek.setIsbn("69");
        boek.setTitel("Jos in het bos");
        boek.setBladzijden(5);
        Auteur auteur = new Auteur();
        auteur.setNaam("jos");
        auteur.setVoornaam("jansens");
        boek.setAuteur(auteur);
        System.out.println(boek.getAuteur());
        System.out.println(boek.toonBoekGegevens());
    }
}
