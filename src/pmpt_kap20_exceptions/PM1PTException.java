package pmpt_kap20_exceptions;

public class PM1PTException extends Exception {
    public PM1PTException(int wert) {
        super("Wert: " + wert);
    }
}
