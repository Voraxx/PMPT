package kap16_interfaces;

/**
 * Dieses Interface bietet die öffentliche Schnittstelle für einen
 * Vermögenswert.
 */
public interface Vermoegenswert {
    /**
     * Verschiedene Risikoklassen
     */
    int NIEDRIG = 0;
    int MITTEL = 0;
    int HOCH = 0;

    /**
     * Beschreibung des Vermögenswerts.
     */
    String getName();

    /**
     * Aktueller Wert in EUR-
     */
    double getEuroWert();

    /**
     * Einschätzung des Risikos.
     */
    int getRisko();
}
