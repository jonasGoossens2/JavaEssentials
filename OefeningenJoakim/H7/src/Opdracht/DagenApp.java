package Opdracht;

import java.util.Random;

public class DagenApp {
    public static void main(String[] args) {

        for(Dag dag: Dag.values()){
            System.out.printf("%s [%d] ==> %s%n", dag.name(), dag.ordinal(), dag.getSoortDag());
        }

        Random random = new Random();
        Dag [] dagen = Dag.values();
        int randomIndex = random.nextInt(dagen.length);
        Dag randomDag = dagen[randomIndex];
        int randomIndex2 = random.nextInt(dagen.length);
        Dag randomDag2 = dagen[randomIndex2];

        System.out.println(randomDag + " + " + randomDag2);

        if(randomDag == randomDag2){
            System.out.println("Gewonnen");
        }else if(randomDag.ordinal() < randomDag2.ordinal()){
            System.out.println(randomDag + " is eerst");
        }else{
            System.out.println(randomDag2 + " is eerst");
        }

        int verschil = Math.abs(randomDag.ordinal() - randomDag2.ordinal());
        System.out.println("Verschil: " + verschil);
    }
}
