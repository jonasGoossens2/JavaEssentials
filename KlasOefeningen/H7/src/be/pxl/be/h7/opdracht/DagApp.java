package be.pxl.be.h7.opdracht;

public class DagApp {
    public static void main(String[] args) {
//        for(Dag dag : Dag.values()){
//            System.out.println(dag.name());
//            System.out.println(dag.ordinal());
//            System.out.println(dag.isWeekdag());
//        }

        Dag dag1 = Dag.WOENSDAG;
        Dag dag2 = Dag.VRIJDAG;

        if(dag1 == dag2){
            System.out.println("De 2 dagen zijn gelijk.");
        }else if(dag1.ordinal() < dag2.ordinal()){
            System.out.println(dag1.name() + " komt eerder dan " + dag2.name());
            System.out.println("Er liggen " + (dag2.ordinal() - dag1.ordinal()) + " dagen tusen.");
        }else{
            System.out.println(dag2.name() + " komt eerder dan " + dag1.name());
            System.out.println("Er liggen " + (dag1.ordinal() - dag2.ordinal()) + " dagen tusen.");
        }


    }
}
