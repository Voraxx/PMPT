package pmpt_kap19_werte_referenz_object;

import java.util.Objects;

/**
 * Ein digitaler Impfpass ist einer Person (Vor- und Nachname, Geburtsjahr) zugeordnet.
 * Die einzelnen Impfungen können ergänzt werden.
 */
public class DigitalerImpfpass {

    /**
     * Vorname der Person.
     */
    private final String vorname;

    /**
     * Nachname der Person.
     */
    private final String nachname;

    /**
     * Geburtsjahrgang
     */
    private final int geburtsjahr;

    /**
     * In dieser Zeichenkette werden die Impfungen abgelegt.
     */
    private String impfungen;

    public DigitalerImpfpass(String vorname, String nachname, int geburtsjahr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
        this.impfungen = "";
    }

    public void addImpfung(String impfung) {
        impfungen += " " + impfung;
    }

    @Override
    public String toString() {
        return "DigitalerImpfpass von " + vorname + " " + nachname + "(" + geburtsjahr + "): " + impfungen;
    }

    @Override
    public boolean equals(Object o) {
        // Performance
        if (this == o) {
            return true;
        }
        // Gleicher Typ
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        // Inhaltiche Gleichheit
        DigitalerImpfpass that = (DigitalerImpfpass) o;
        return geburtsjahr == that.geburtsjahr &&
                vorname.equals(that.vorname) &&
                nachname.equals(that.nachname);
    }

    @Override
    public int hashCode() {
        // Auto-generiert
        return Objects.hash(vorname, nachname, geburtsjahr);

        // Alternative
        //return vorname.hashCode() + nachname.hashCode() + geburtsjahr
    }
}
