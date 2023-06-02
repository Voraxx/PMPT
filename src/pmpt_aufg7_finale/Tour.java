package pmpt_aufg7_finale;

public class Tour {
    public Liste getPfad() {
        Verbindungsdaten.Staedte[] staedte = Verbindungsdaten.Staedte.values();
        Verbindungsdaten.Staedte stadt = staedte[0];
        getPfad(stadt);
        System.out.println(stadt);
        return null;
    }

    public Liste getPfad(Verbindungsdaten.Staedte stadt) {

        return null;
    }
}
