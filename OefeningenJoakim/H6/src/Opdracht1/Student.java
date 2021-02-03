package Opdracht1;

public class Student extends persoon{
    private int leerkrediet;
    private String studentnummer;
    private String opleiding;
    private static int aantal;

    private static int getAantal(){
        return aantal;
    }

    public void setLeerkrediet(int leerkrediet) {
        if(leerkrediet < 0){
            this.leerkrediet = 0;
        }else if(leerkrediet > 140){
            this.leerkrediet = 140;
        }else{
            this.leerkrediet = leerkrediet;
        }
    }

    public Student(){
        this("onbekend","onbekend");
    }

    public Student(String naam, String voorNaam){
        this(naam, voorNaam,"15999999","XXX");
    }

    public Student(String naam, String voorNaam, String studentnummer, String opleiding){
        super(naam, voorNaam);
        this.studentnummer = studentnummer;
        this.opleiding = opleiding;
        this.leerkrediet = 140;
    }

    public Student(Student student){
        this(student.getNaam(), student.getVoornaam(), student.getStudentnummer(), student.getOpleiding());
        setLeerkrediet(student.getLeerkrediet());
    }
    public void wijzigLeerkrediet(int leerkrediet){
            setLeerkrediet(getLeerkrediet() + leerkrediet);
    }
    public void setStudentnummer(String studentnummer) {
        this.studentnummer = studentnummer;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }

    public int getLeerkrediet() {
        return leerkrediet;
    }

    public String getStudentnummer() {
        return studentnummer;
    }

    public String getOpleiding() {
        return opleiding;
    }
}
