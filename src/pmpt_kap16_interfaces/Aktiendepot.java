package pmpt_kap16_interfaces;

/**
 * Repräsentation eines Vermögenswerts vom Typ Aktiendepot.
 */
public class Aktiendepot implements Vermoegenswert {

  /**
   * Name des Unternehmen
   */
  private final String unternehmen;

  /**
   * Anzahl der Aktien in diesem Depot.
   */
  private final int anzahlAktien;

  /**
   * Aktueller Wert einer Aktie in EUR.
   */
  private final double aktuellerWert;

  /**
   * Konstruktor.
   */
  public Aktiendepot(String unternehmen, int anzahlAktien, double aktuellerWert) {
    this.unternehmen = unternehmen;
    this.anzahlAktien = anzahlAktien;
    this.aktuellerWert = aktuellerWert;

  }

  @Override
  public String getName() {
    return unternehmen;
  }

  @Override
  public double getEuroWert() {
    return anzahlAktien * aktuellerWert;
  }

  @Override
  public int getRisko() {
    return HOCH;
  }
}
