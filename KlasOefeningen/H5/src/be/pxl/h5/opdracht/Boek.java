package be.pxl.h5.opdracht;

public class Boek {

    private String isbn;
    private String titel;
    private int bladzijden;
    private Auteur auteur;

    public Boek(){
        this(new Auteur(), "onbekend", "onbekend", 0);
    }
    public Boek(Auteur auteur, String isbn, String titel, int bladzijden){
        setAuteur(auteur);
        setIsbn(isbn);
        setTitel(titel);
        setBladzijden(bladzijden);

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getBladzijden() {
        return bladzijden;
    }

    public void setBladzijden(int bladzijden) {
        this.bladzijden = bladzijden;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public String toonBoekGegevens(){
        StringBuilder builder = new StringBuilder();
        builder.append("Isbn: ");
        builder.append(isbn).append("\n");
        builder.append("Titel: ");
        builder.append(titel).append("\n");
        builder.append("Aantal bladzijden");
        builder.append(bladzijden).append("\n");
        builder.append("Auteur: ");
        builder.append(auteur.toString()).append("\n");
        return builder.toString();
    }
}
