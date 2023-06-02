package pmpt_kap15_string_junit;

public class Person {
    private final String vorname;
    private final String nachname;
    private final int alter;
    private final float groesse;

    public Person(String personText) {
        String[] token = personText.split(",");
        if (token.length != 4) {
            throw new IllegalArgumentException("Falsche Eingabe.");
        }
        vorname = token[0].trim();
        nachname = token[1].trim();
        alter = Integer.parseInt(token[2].trim());
        groesse = Float.parseFloat(token[3].trim());
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public float getGroesse() {
        return groesse;
    }

    public int getAlter() {
        return alter;
    }

    @Override
    public String toString() {
        return String.format("%s %s (Alter: %d, Größe: %.2fm)", vorname, nachname, alter, groesse);
    }

    public static void main(String[] args) {
        Person person = new Person("Adrian,Morgenthal,31,1.80");
        System.out.println(person);

    }
}
