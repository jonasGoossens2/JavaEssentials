package be.pxl.be.h7.oefeningen.oefening1;

public enum Munt {
    TWEEEURO(200), EENEURO(100), VIJFTIGCENT(50), TWINTIGCENT(20), TIENCENT(10), VIJFCENT(5), TWEECENT(2), EENCENT(1);

    private int waarde;

    private Munt(int waarde){
        this.waarde = waarde;
    }

    public int getWaarde(){
        return waarde;
    }
}
