package aufg6_gatter;

/**
 * BinaeresGatterUnd
 * Version 1.0
 * 2023/05/20
 * <p>
 * BinaeresGatterUnd erweitert die abstrakte Klasse BinaeresGatter und implementiert das Gatter-Interface.
 * Diese Klasse repräsentiert das logische UND und gibt genau dann true zurück, wenn beide Eingänge true sind.
 * <p>
 * Attribution
 * CC BY
 * <a href="https://creativecommons.org/licenses/by/4.0/">...</a>
 * <p>
 * Adrian Morgenthal
 * <a href="https://github.com/Voraxx">...</a>
 */
public class BinaeresGatterUnd extends BinaeresGatter implements Gatter{
    private final boolean output;
    private final Gatter[] eingaenge;
    public static final String INFO_BINAERES_GATTER_UND = " UND ";

    public BinaeresGatterUnd(Gatter eingangA, Gatter eingangB){
        this.eingaenge = new Gatter[2];
        this.eingaenge[0] = eingangA;
        this.eingaenge[1] = eingangB;
        this.output = this.eingaenge[0].getOutput() && this.eingaenge[1].getOutput();
    }

    @Override
    public boolean getOutput(){
        return output;
    }

    @Override
    public String toString(){
        return "(" + this.eingaenge[0].toString() + INFO_BINAERES_GATTER_UND + this.eingaenge[1].toString() + ")";
    }
}
