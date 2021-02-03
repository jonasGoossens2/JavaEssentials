package be.pxl.be.h7.opdracht;

public enum Dag {
    MAANDAG(true), DINSAG(true), WOENSDAG(true), DONDERDAG(true), VRIJDAG(true), ZATERDAG(false), ZONDAG(false);

    private boolean isWeekdag;

    private Dag(boolean isWeekdag) {
        this.isWeekdag = isWeekdag;
    }

    public boolean isWeekdag() {
        return isWeekdag;
    }
}
