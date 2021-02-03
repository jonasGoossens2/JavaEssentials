package Opdracht;

public class Boek {
    private String ISBN;
    private String titel;
    private int bladzijde;
    private String auteur;

    public Boek(String auteur) {
        setAuteur(auteur);
    }

    public Boek(String ISBN, String titel, int bladzijde, String auteur) {
        setISBN(ISBN);
        setTitel(titel);
        setBladzijde(bladzijde);
        setAuteur(auteur);
    }

    public void toonBoekGegevens(){
        System.out.println("Auteur: " + getAuteur());
        System.out.println("Titel: " + getTitel());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Aantal bladzijdes: " + getBladzijde());
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setBladzijde(int bladzijde) {
        this.bladzijde = bladzijde;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitel() {
        return titel;
    }

    public int getBladzijde() {
        return bladzijde;
    }

    public String getAuteur() {
        return auteur;
    }
}
