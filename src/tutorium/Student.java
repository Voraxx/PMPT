package tutorium;
public class Student {
    public static void main(String[] args) {
        Student student01 = new Student("Adrian", "Morgenthal", 31);
        Student student02 = new Student("Valeria", "Lotz", 30);
        System.out.println(student01.equals(student02));
    }



    private String vorname;
    private String nachname;
    private int alter;
    private boolean istImmatrikuliert;

    public Student(String vorname, String nachname, int alter){
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.istImmatrikuliert = false;
    }

    public void initialisiere(String vorname, String nachname, int alter){
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public void immatrikuliere(){
        this.istImmatrikuliert = true;
    }

    public void exmatrikuliere(){
        this.istImmatrikuliert = false;
    }

    public void aendereAlter(int alter){
        this.alter = alter;
    }

    public boolean selbePerson(Student student){
        return this.equals(student);
    }

    @Override
    public boolean equals(Object obj){
        if(this == null){
            return false;
        }
        return true;
    }
}