package me.pxl.h6.opdrachten.voorbeeldPersoon;

public class SchoolApp {
    public static void main(String[] args) {
        Persoon persoon = new Persoon();
        Student student = new Student();

        student.setVoornaam("Jonas");
        student.setNaam("Goossens");
        System.out.println(student.getVoornaam() + " " + student.getNaam());

        student.wijzigLeerkrediet(5);
        System.out.println(student.getLeerkrediet());
        student.wijzigLeerkrediet(-10);
        System.out.println(student.getLeerkrediet());
    }
}
