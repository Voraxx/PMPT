package aufg6_gatter;

/**
 * Gatter Interface
 * Version 1.0
 * 2023/05/20
 * <p>
 * Zu implementierende Methoden sind getOutput() und toString().
 * getOutput liefert den Wahrheitswert eines Gatter-Objekts.
 * toString ist eine überladene rekursive Methode, die eine Selbstbeschreibung liefert.
 * <p>
 * Attribution
 * CC BY
 * <a href="https://creativecommons.org/licenses/by/4.0/">...</a>
 * <p>
 * Adrian Morgenthal
 * <a href="https://github.com/Voraxx">...</a>
 */
public interface Gatter {
    boolean getOutput();
    String toString();
}
