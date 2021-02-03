package Opdracht4;

import java.util.ArrayList;

public class ArrayListOefening {
    public static void main(String[] args) {
        ArrayList<String> lijst = new ArrayList<>();

        lijst.add("Voorbeeld1");
        lijst.add("Voorbeeld2");
        lijst.add("Voorbeeld3");

        System.out.println(lijst.get(1));

        lijst.add(1, "voorbeeld4");

        for(String s: lijst){
            System.out.println(s);
        }
    }
}
