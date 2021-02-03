package Oefening1;

public class Gemeente {
    private int postcode;
    private String gemeenteNaam;

    public void ControlePostcode(){
        String PC = String.valueOf(this.postcode);
        if (PC.length() < 4) {
            for (int i = PC.length(); i < 4; i++) {
                PC += "0";
            }
        }
        this.postcode = Integer.parseInt(PC);
    }

    public String toString(){
        return this.postcode + " " + this.gemeenteNaam;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void setGemeenteNaam(String gemeenteNaam) {
        StringBuilder b = new StringBuilder();
        char vorige = '-';
        for(int i=0; i<=gemeenteNaam.length(); i++){
            char karakter = gemeenteNaam.charAt(i);
            if(!Character.isDigit(karakter)){
                if(b.length() == 0){
                    char up = Character.toUpperCase(karakter);
                    b.append(up);
                }else{
                    char lw = Character.toLowerCase(karakter);
                    b.append(lw);
                }
            }

            vorige = karakter;
        }
        this.gemeenteNaam = b.toString();
    }

    public int getPostcode() {
        return postcode;
    }

    public String getGemeenteNaam() {
        return gemeenteNaam;
    }

    public Gemeente() {
    }

    public Gemeente(int postcode, String gemeenteNaam) {
        this.postcode = postcode;
        this.gemeenteNaam = gemeenteNaam;
    }
}
