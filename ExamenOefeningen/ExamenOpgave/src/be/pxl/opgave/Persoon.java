package be.pxl.opgave;
/* naam: Goossens Jonas*/

import java.util.Objects;

public abstract class Persoon{

    private String id;
    private String naam;

    public Persoon(String id, String naam){
        //Delete all symbols from id;
        StringBuilder result = new StringBuilder();
        for(int i=0; i < id.length(); i++){
            if(Character.isDigit(id.charAt(i))){
                result.append(id.charAt(i));
            }else if(Character.isLetter(id.charAt(i))){
                result.append(id.charAt(i));
            }
        }
        //if id > 3 => only first 3 => this.id;
        if(result.length() > 3){
            this.id = result.substring(0,3).toUpperCase();
        }else{
            this.id = result.toString().toUpperCase();
        }
        this.naam = naam;
    }

    public String getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public String toString(){
        return String.format("[%s] %s", this.id, this.naam);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return Objects.equals(id, persoon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

