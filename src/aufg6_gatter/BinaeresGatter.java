package aufg6_gatter;

/**
 * BinaeresGatter
 * Version 1.0
 * 2023/05/20
 * <p>
 * BinaeresGatter ist eine abstrakte Klasse, die das Gatter-Interface implementiert.
 * Sie enthält die abstrakte Methode getOutput() und die Methode toString() und wird von den Klassen
 * BinaeresGatterUnd und BinaeresGatterOder erweitert.
 * <p>
 * Attribution
 * CC BY
 * <a href="https://creativecommons.org/licenses/by/4.0/">...</a>
 * <p>
 * Adrian Morgenthal
 * <a href="https://github.com/Voraxx">...</a>
 */

public abstract class BinaeresGatter implements Gatter {
    public static final String INFO_BINAERES_GATTER = "Binaeres Gatter";

    public abstract boolean getOutput();

    @Override
    public String toString(){
        return INFO_BINAERES_GATTER;
    }
}
