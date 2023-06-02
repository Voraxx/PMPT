package pmpt_kap19_werte_referenz_object;

import java.util.Objects;

public class Person {
    private String vorname;
    private String nachname;
    private int alter;

    public Person(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname + ", " + alter;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return vorname.equals(person.vorname)
                && nachname.equals(person.nachname)
                && alter == person.alter;
    }

    @Override
    public int hashCode(){
        return Objects.hash(vorname, nachname, alter);
    }

    public static void main(String[] args) {
        Person person = new Person("Anna", "Hansen", 44);
        System.out.println(person);
        Person person2 = new Person("Urs", "Liebermann", 23);
        System.out.println(person2);
    }
}
