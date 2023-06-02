package pmpt_aufg6_gatter;

/**
 * Schaltung
 * Version 1.0
 * 2023/05/20
 * <p>
 * Diese Klasse repräsentiert eine Schaltung aus diversen Gatter-Objekten.
 * Gibt die Schaltung aus dem Beispiel der Praktikumsaufgabe 6 aus.
 * Mit folgendem Befehl gibt man die Schaltung in der Konsole aus:
 * System.out.println(letztesGatterObjekt);
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
        // Schaltung aus dem Beispiel in Aufgabe 6
        Gatter falsch = new Eingang(false);
        Gatter wahr = new Eingang(true);
        Gatter und = new BinaeresGatterUnd(falsch, wahr);
        Gatter oder = new BinaeresGatterOder(und, wahr);
        Gatter nicht = new GatterNicht(oder);
        //System.out.println(nicht.toString());
        System.out.println("Schaltung: " + nicht);
        System.out.println("Output: " + nicht.getOutput());

        // Leere Zeile
        System.out.println();

        // Neue Schaltung
        falsch = new Eingang(false);
        wahr = new Eingang(true);
        und = new BinaeresGatterUnd(wahr,falsch);
        oder = new BinaeresGatterOder(und, wahr);
        Gatter oder2 = new BinaeresGatterOder(und, falsch);
        nicht = new GatterNicht(oder);
        Gatter nicht2 = new GatterNicht(oder2);
        Gatter oder3 = new BinaeresGatterOder(nicht, nicht2);
        System.out.println("Schaltung: " + oder3);
        System.out.println("Output: " + oder3.getOutput());
    }
}
