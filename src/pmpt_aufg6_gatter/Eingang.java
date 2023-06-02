package pmpt_aufg6_gatter;

/**
 * Eingang
 * Version 1.0
 * 2023/05/05
 * <p>
 * Am Beginn jeder Schaltung steht zunächst der Gattertyp "Eingang".
 * Der Eingang selbst besitzt keine Eingänge, der Wert seines Ausgangs ist durch eine Konstante bestimmt.
 * Diese wird im Konstruktor gesetzt.
 * <p>
 * Attribution
 * CC BY
 * <a href="https://creativecommons.org/licenses/by/4.0/">...</a>
 * <p>
 * Adrian Morgenthal
 * <a href="https://github.com/Voraxx">...</a>
 */
public class Eingang implements Gatter {
    private final boolean output;

    public Eingang(boolean input){
        this.output = input;
    }

    @Override
    public boolean getOutput() {
        return output;
    }

    @Override
    public String toString(){
        return output? "WAHR": "FALSCH";
    }


}
