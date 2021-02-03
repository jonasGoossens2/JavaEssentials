import java.util.Scanner;

public class Opdracht8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de artikelcode in: ");
        String artikelcode = scanner.nextLine();


        boolean isGeldig = true;
        for(int i=0; i<=3; i++){
            char Karakter = artikelcode.charAt(i);
            if(i<=1){

                if(!Character.isLetter(Karakter)){
                    isGeldig = false;
                    break;
                }

            }else{
                if(!Character.isDigit(Karakter)){
                    isGeldig = false;
                    break;
                }
            }
        }
        if(!isGeldig){
            System.out.println("Geen geldige code!");
        }else{
            System.out.println("Geldige code!");
        }
    }
    double getal = 12.45676;

}
