package pmpt_aufg6_gatter;

/**
 * GatterNicht
 * Version 1.0
 * 2023/05/20
 * <p>
 * GatterNicht implementiert das Gatter-Interface.
 * Diese Klasse repräsentiert die logische Negation und gibt den umgekehrten Wahrheitswert des Eingangs zurück.
 * Aus true wird false bzw. aus false wird true.
 * <p>
 * Attribution
 * CC BY
 * <a href="https://creativecommons.org/licenses/by/4.0/">...</a>
 * <p>
 * Adrian Morgenthal
 * <a href="https://github.com/Voraxx">...</a>
 */
public class GatterNicht implements Gatter {

    private final Gatter eingang;
    private final boolean output;

    public static final String INFO_GATTER_NICHT = "NICHT ";
    public GatterNicht(Gatter eingang){
        this.eingang = eingang;
        this.output = !this.eingang.getOutput();
    }

    @Override
    public boolean getOutput() {
        return output;
    }

    @Override
    public String toString(){
        return "(" + INFO_GATTER_NICHT + eingang.toString() + ")";
    }
}
