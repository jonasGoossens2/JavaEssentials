package Opdracht;

public enum Dag {
    MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG(true), ZONDAG(true);

    private boolean weekendDag;

    private Dag(){
        this(false);
    }

    private Dag(boolean weekendDag){
        this.weekendDag = weekendDag;
    }

    public String getSoortDag(){
        if(weekendDag){
            return "Weekenddag";
        }else{
            return "Weekdag";
        }
    }
}
