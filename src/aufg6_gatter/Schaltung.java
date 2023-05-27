package aufg6_gatter;

/**
 * Schaltung
 * Version 1.0
 * 2023/05/20
 * <p>
 * Diese Klasse repräsentiert eine Schaltung aus diversen Gatter-Objekten.
 * Gibt die Schaltung aus dem Beispiel der Praktikumsaufgabe 6 aus.
 * <p>
 * Attribution
 * CC BY
 * <a href="https://creativecommons.org/licenses/by/4.0/">...</a>
 * <p>
 * Adrian Morgenthal
 * <a href="https://github.com/Voraxx">...</a>
 */
public class Schaltung {
        public static void main(String[] args) {
        Gatter falsch = new Eingang(false);
        Gatter wahr = new Eingang(true);
        Gatter und = new BinaeresGatterUnd(falsch, wahr);
        Gatter oder = new BinaeresGatterOder(wahr, und);
        Gatter nicht = new GatterNicht(oder);

        //System.out.println(nicht.toString());   // Wieso liefert die untere Zeile automatisch die toString()-Methode?
        System.out.println(nicht);                // <--- diese Zeile
    }
}
