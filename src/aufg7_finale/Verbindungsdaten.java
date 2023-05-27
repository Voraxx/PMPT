package aufg7_finale;

public class Verbindungsdaten {
    private static final int anzahlStaedte = 10;


    public static final String[][] VERBINDUNGEN = new String[anzahlStaedte][anzahlStaedte];

    enum Staedte {
        Hamburg, Berlin, Wien, Prag, Paris, Rom, Barcelona, Amsterdam, Budapest, Kopenhagen, Lissabon,
        Venedig, Athen, Stockholm, Mailand, Madrid, Riga, München, Dubrovnik, Krakau, Sevilla, Florenz,
        Helsinki, Warschau, Valencia, Dresden, Sofia, Manchester, Dublin, Tallinn, Marseille
    }
}
