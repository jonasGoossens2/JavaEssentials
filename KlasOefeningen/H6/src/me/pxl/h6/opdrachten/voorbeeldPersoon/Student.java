package me.pxl.h6.opdrachten.voorbeeldPersoon;

public class Student extends Persoon{

    private int leerkrediet;
    private String studentnummer;
    private String opleiding;

    public static int getAantal() {
        return aantal;
    }

    private static int aantal;

    public Student(){
        this("onbekend", "onbekend");
    }
    public Student(String naam, String voornaam){
        this(naam, voornaam, "15999999" , "XXX");
    }
    public Student(String naam, String voornaam, String studentnummer, String opleiding){
        super(naam, voornaam);
        setStudentnummer(studentnummer);
        setOpleiding(opleiding);
        setLeerkrediet(140);
        aantal++;
    }
    public Student(Student student){
        this(student.getNaam(), student.getVoornaam(), student.getStudentnummer(), student.getOpleiding());
        setLeerkrediet(student.getLeerkrediet());
    }

    public int getLeerkrediet() {
        return leerkrediet;
    }

     public void setLeerkrediet(int leerkrediet) {
        if(leerkrediet <= 0){
            this.leerkrediet = 0;
        }else if(leerkrediet >= 140){
            this.leerkrediet = 140;
        }else{
            this.leerkrediet = leerkrediet;
        }
    }

    public String getStudentnummer() {
        return studentnummer;
    }

    public void setStudentnummer(String studentnummer) {
        this.studentnummer = studentnummer;
    }

    public String getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }
    public void wijzigLeerkrediet(int leerkrediet){
            setLeerkrediet(getLeerkrediet() + leerkrediet);
    }

}
