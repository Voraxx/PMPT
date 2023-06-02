package pmpt_aufg6_gatter;

/**
 * BinaeresGatterOder
 * Version 1.0
 * 2023/05/20
 * <p>
 * BinaeresGatterOder erweitert die abstrakte Klasse BinaeresGatter und implementiert das Gatter-Interface.
 * Diese Klasse repräsentiert das logische ODER und gibt genau dann false zurück, wenn beide Eingänge false sind.
 * <p>
 * Attribution
 * CC BY
 * <a href="https://creativecommons.org/licenses/by/4.0/">...</a>
 * <p>
 * Adrian Morgenthal
 * <a href="https://github.com/Voraxx">...</a>
 */
public class BinaeresGatterOder extends BinaeresGatter implements Gatter {
    public static final String INFO_BINAERES_GATTER_ODER = " ODER ";
    private final boolean output;
    private final Gatter[] eingaenge;

    public BinaeresGatterOder(Gatter eingangA, Gatter eingangB){
        this.eingaenge = new Gatter[2];
        this.eingaenge[0] = eingangA;
        this.eingaenge[1] = eingangB;
        this.output = this.eingaenge[0].getOutput() || this.eingaenge[1].getOutput();
    }

    @Override
    public boolean getOutput(){
        return output;
    }

    @Override
    public String toString(){
        return "(" + this.eingaenge[0].toString() + INFO_BINAERES_GATTER_ODER + this.eingaenge[1].toString() + ")";
    }
}
